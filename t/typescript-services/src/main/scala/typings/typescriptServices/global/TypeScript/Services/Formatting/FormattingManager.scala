package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.EditorOptions
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
}

