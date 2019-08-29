package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencedSymbolDefinitionInfo extends DefinitionInfo {
  var displayParts: js.Array[SymbolDisplayPart]
}

object ReferencedSymbolDefinitionInfo {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: String,
    displayParts: js.Array[SymbolDisplayPart],
    fileName: String,
    kind: ScriptElementKind,
    name: String,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: String = null,
    originalTextSpan: TextSpan = null
  ): ReferencedSymbolDefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind, containerName = containerName, displayParts = displayParts, fileName = fileName, kind = kind, name = name, textSpan = textSpan)
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan)
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[ReferencedSymbolDefinitionInfo]
  }
}

