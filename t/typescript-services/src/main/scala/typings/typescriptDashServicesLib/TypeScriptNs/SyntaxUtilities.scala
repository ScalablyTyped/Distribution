package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
class SyntaxUtilities () extends js.Object

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(
    list: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): scala.Boolean = js.native
  def getExportKeyword(moduleElement: typescriptDashServicesLib.TypeScriptNs.IModuleElementSyntax): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def getToken(
    list: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: typescriptDashServicesLib.TypeScriptNs.IModuleElementSyntax): scala.Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typescriptDashServicesLib.TypeScriptNs.PositionedNode): scala.Boolean = js.native
  def isAngleBracket(positionedElement: typescriptDashServicesLib.TypeScriptNs.PositionedElement): scala.Boolean = js.native
}

