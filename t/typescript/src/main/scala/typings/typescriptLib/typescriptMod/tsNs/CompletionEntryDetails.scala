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

