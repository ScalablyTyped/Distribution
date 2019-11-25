package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntryDetails extends js.Object {
  var codeActions: js.UndefOr[js.Array[CodeAction]] = js.undefined
  var displayParts: js.Array[SymbolDisplayPart]
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var kind: ScriptElementKind
  var kindModifiers: String
  var name: String
  var source: js.UndefOr[js.Array[SymbolDisplayPart]] = js.undefined
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.undefined
}

object CompletionEntryDetails {
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    kind: ScriptElementKind,
    kindModifiers: String,
    name: String,
    codeActions: js.Array[CodeAction] = null,
    documentation: js.Array[SymbolDisplayPart] = null,
    source: js.Array[SymbolDisplayPart] = null,
    tags: js.Array[JSDocTagInfo] = null
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (codeActions != null) __obj.updateDynamic("codeActions")(codeActions.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDetails]
  }
}

