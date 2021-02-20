package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ClassDeclarationSyntax")
@js.native
class ClassDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.ClassDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typings.typescriptServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ClassDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ClassDeclarationSyntax.create")
  @js.native
  def create(
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ClassDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
}
