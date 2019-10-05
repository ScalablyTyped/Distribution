package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
class SyntaxUtilities () extends js.Object

/* static members */
@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: PositionedElement): Boolean = js.native
}

