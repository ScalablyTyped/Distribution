package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object ParserNs extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree,
    textChangeRange: typescriptDashServicesLib.TypeScriptNs.TextChangeRange,
    newText: typescriptDashServicesLib.TypeScriptNs.ISimpleText
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxTree = js.native
  def parse(
    fileName: java.lang.String,
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    isDeclaration: scala.Boolean,
    options: typescriptDashServicesLib.TypeScriptNs.ParseOptions
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxTree = js.native
}

