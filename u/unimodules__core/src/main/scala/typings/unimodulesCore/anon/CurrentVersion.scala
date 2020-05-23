package typings.unimodulesCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentVersion extends js.Object {
  var currentVersion: js.UndefOr[String] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var versionToRemove: js.UndefOr[String] = js.undefined
}

object CurrentVersion {
  @scala.inline
  def apply(currentVersion: String = null, replacement: String = null, versionToRemove: String = null): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (versionToRemove != null) __obj.updateDynamic("versionToRemove")(versionToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentVersion]
  }
}

