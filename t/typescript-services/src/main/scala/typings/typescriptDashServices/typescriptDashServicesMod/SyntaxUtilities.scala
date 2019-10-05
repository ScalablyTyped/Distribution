package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IModuleElementSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typings.typescriptDashServices.TypeScript.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typings.typescriptDashServices.TypeScript.PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: typings.typescriptDashServices.TypeScript.PositionedElement): Boolean = js.native
}

