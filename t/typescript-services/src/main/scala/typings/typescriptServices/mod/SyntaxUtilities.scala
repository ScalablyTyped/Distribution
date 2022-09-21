package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IModuleElementSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
open class SyntaxUtilities ()
  extends StObject
     with typings.typescriptServices.TypeScript.SyntaxUtilities
object SyntaxUtilities {
  
  @JSImport("typescript-services", "SyntaxUtilities")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def containsToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsToken")(list.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getExportKeyword")(moduleElement.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  /* static member */
  inline def getToken(list: ISyntaxList, kind: typings.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(list.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  /* static member */
  inline def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasExportKeyword")(moduleElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isAmbientDeclarationSyntax(positionNode: typings.typescriptServices.TypeScript.PositionedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientDeclarationSyntax")(positionNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isAngleBracket(positionedElement: typings.typescriptServices.TypeScript.PositionedElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngleBracket")(positionedElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
