package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntryDetails extends js.Object {
  var codeActions: js.UndefOr[js.Array[CodeAction]] = js.undefined
  var displayParts: js.Array[SymbolDisplayPart]
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var name: java.lang.String
  var source: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.undefined
}

object CompletionEntryDetails {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    name: java.lang.String,
    codeActions: js.Array[CodeAction] = null,
    documentation: js.Array[SymbolDisplayPart] = null,
    source: js.Array[SymbolDisplayPart] = null,
    tags: js.Array[JSDocTagInfo] = null
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(displayParts = displayParts, kind = kind, kindModifiers = kindModifiers, name = name)
    if (codeActions != null) __obj.updateDynamic("codeActions")(codeActions)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (source != null) __obj.updateDynamic("source")(source)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CompletionEntryDetails]
  }
}

