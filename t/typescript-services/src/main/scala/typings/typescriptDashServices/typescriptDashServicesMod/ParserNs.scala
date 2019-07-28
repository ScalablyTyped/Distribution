package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object ParserNs extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree,
    textChangeRange: typings.typescriptDashServices.TypeScriptNs.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptDashServices.TypeScriptNs.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptDashServices.TypeScriptNs.ParseOptions
  ): typings.typescriptDashServices.TypeScriptNs.SyntaxTree = js.native
}

