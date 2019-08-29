package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionInfo extends DocumentSpan {
  var containerKind: ScriptElementKind
  var containerName: String
  var kind: ScriptElementKind
  var name: String
}

object DefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: String,
    fileName: String,
    kind: ScriptElementKind,
    name: String,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: String = null,
    originalTextSpan: TextSpan = null
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind, containerName = containerName, fileName = fileName, kind = kind, name = name, textSpan = textSpan)
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan)
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[DefinitionInfo]
  }
}

