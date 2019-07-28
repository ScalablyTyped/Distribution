package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Parser")
@js.native
object ParserNs extends js.Object {
  def incrementalParse(oldSyntaxTree: SyntaxTree, textChangeRange: TextChangeRange, newText: ISimpleText): SyntaxTree = js.native
  def parse(fileName: String, text: ISimpleText, isDeclaration: Boolean, options: ParseOptions): SyntaxTree = js.native
}

