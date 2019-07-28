package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IModuleElementSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typings.typescriptDashServices.TypeScriptNs.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typings.typescriptDashServices.TypeScriptNs.PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: typings.typescriptDashServices.TypeScriptNs.PositionedElement): Boolean = js.native
}

