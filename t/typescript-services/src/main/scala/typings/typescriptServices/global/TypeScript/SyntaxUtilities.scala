package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IModuleElementSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typings.typescriptServices.TypeScript.SyntaxUtilities
object SyntaxUtilities {
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.containsToken")
  @js.native
  def containsToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.getExportKeyword")
  @js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.getToken")
  @js.native
  def getToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.hasExportKeyword")
  @js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.isAmbientDeclarationSyntax")
  @js.native
  def isAmbientDeclarationSyntax(positionNode: typings.typescriptServices.TypeScript.PositionedNode): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.isAngleBracket")
  @js.native
  def isAngleBracket(positionedElement: typings.typescriptServices.TypeScript.PositionedElement): Boolean = js.native
}
