package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionInfo extends DocumentSpan {
  var containerKind: ScriptElementKind
  var containerName: java.lang.String
  var kind: ScriptElementKind
  var name: java.lang.String
}

object DefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    kind: ScriptElementKind,
    name: java.lang.String,
    textSpan: TextSpan,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerKind")(containerKind)
    __obj.updateDynamic("containerName")(containerName)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("textSpan")(textSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[DefinitionInfo]
  }
}

