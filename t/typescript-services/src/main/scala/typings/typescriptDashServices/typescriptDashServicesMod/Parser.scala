package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object Parser extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typings.typescriptDashServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptDashServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptDashServices.TypeScript.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptDashServices.TypeScript.ParseOptions
  ): typings.typescriptDashServices.TypeScript.SyntaxTree = js.native
}

