package typings.unimodulesCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentVersion extends js.Object {
  var currentVersion: js.UndefOr[String] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var versionToRemove: js.UndefOr[String] = js.undefined
}

object AnonCurrentVersion {
  @scala.inline
  def apply(currentVersion: String = null, replacement: String = null, versionToRemove: String = null): AnonCurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (versionToRemove != null) __obj.updateDynamic("versionToRemove")(versionToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentVersion]
  }
}

