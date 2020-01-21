package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IModuleElementSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typings.typescriptServices.TypeScript.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typings.typescriptServices.TypeScript.PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: typings.typescriptServices.TypeScript.PositionedElement): Boolean = js.native
}

