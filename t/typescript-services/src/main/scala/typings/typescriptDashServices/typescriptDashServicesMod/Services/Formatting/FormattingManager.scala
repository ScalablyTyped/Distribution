package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.TypeScript.Services.EditorOptions
import typings.typescriptDashServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptDashServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typings.typescriptDashServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
}

