package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExtensionInfo extends js.Object {
  var extension: java.lang.String
  var isMixedContent: scala.Boolean
  var scriptKind: js.UndefOr[ScriptKind] = js.undefined
}

object FileExtensionInfo {
  @scala.inline
  def apply(extension: java.lang.String, isMixedContent: scala.Boolean, scriptKind: ScriptKind = null): FileExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("isMixedContent")(isMixedContent)
    if (scriptKind != null) __obj.updateDynamic("scriptKind")(scriptKind)
    __obj.asInstanceOf[FileExtensionInfo]
  }
}

