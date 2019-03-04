package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationLocation extends DocumentSpan {
  var displayParts: js.Array[SymbolDisplayPart]
  var kind: ScriptElementKind
}

object ImplementationLocation {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    fileName: java.lang.String,
    kind: ScriptElementKind,
    textSpan: TextSpan,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null
  ): ImplementationLocation = {
    val __obj = js.Dynamic.literal(displayParts = displayParts, fileName = fileName, kind = kind, textSpan = textSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[ImplementationLocation]
  }
}

