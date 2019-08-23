package typings.atUnimodulesCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentVersion extends js.Object {
  var currentVersion: js.UndefOr[String] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var versionToRemove: js.UndefOr[String] = js.undefined
}

object Anon_CurrentVersion {
  @scala.inline
  def apply(currentVersion: String = null, replacement: String = null, versionToRemove: String = null): Anon_CurrentVersion = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion)
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    if (versionToRemove != null) __obj.updateDynamic("versionToRemove")(versionToRemove)
    __obj.asInstanceOf[Anon_CurrentVersion]
  }
}

