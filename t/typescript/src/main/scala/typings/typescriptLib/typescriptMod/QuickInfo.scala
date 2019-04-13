package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickInfo extends js.Object {
  var displayParts: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.undefined
  var textSpan: TextSpan
}

object QuickInfo {
  @scala.inline
  def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    textSpan: TextSpan,
    displayParts: js.Array[SymbolDisplayPart] = null,
    documentation: js.Array[SymbolDisplayPart] = null,
    tags: js.Array[JSDocTagInfo] = null
  ): QuickInfo = {
    val __obj = js.Dynamic.literal(kind = kind, kindModifiers = kindModifiers, textSpan = textSpan)
    if (displayParts != null) __obj.updateDynamic("displayParts")(displayParts)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[QuickInfo]
  }
}

