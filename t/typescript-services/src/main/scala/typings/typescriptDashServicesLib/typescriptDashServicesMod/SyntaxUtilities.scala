package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
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

