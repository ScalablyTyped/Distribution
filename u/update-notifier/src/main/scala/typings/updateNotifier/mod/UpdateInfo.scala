package typings.updateNotifier.mod

import typings.updateNotifier.updateNotifierStrings.build
import typings.updateNotifier.updateNotifierStrings.latest
import typings.updateNotifier.updateNotifierStrings.major
import typings.updateNotifier.updateNotifierStrings.minor
import typings.updateNotifier.updateNotifierStrings.patch
import typings.updateNotifier.updateNotifierStrings.prerelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  /** Current version */
  val current: String
  /** Latest version */
  val latest: String
  /** Package name */
  var name: String
  /** Type of current update */
  val `type`: typings.updateNotifier.updateNotifierStrings.latest | major | minor | patch | prerelease | build
}

object UpdateInfo {
  @scala.inline
  def apply(
    current: String,
    latest: String,
    name: String,
    `type`: latest | major | minor | patch | prerelease | build
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

