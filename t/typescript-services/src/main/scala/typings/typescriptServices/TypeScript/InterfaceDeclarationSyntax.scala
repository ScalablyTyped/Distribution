package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceDeclarationSyntax extends SyntaxNode {
  
  var body: ObjectTypeSyntax = js.native
  
  var heritageClauses: ISyntaxList = js.native
  
  var identifier: ISyntaxToken = js.native
  
  var interfaceKeyword: ISyntaxToken = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var typeParameterList: TypeParameterListSyntax = js.native
  
  def update(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax = js.native
  
  def withBody(body: ObjectTypeSyntax): InterfaceDeclarationSyntax = js.native
  
  def withHeritageClause(heritageClause: HeritageClauseSyntax): InterfaceDeclarationSyntax = js.native
  
  def withHeritageClauses(heritageClauses: ISyntaxList): InterfaceDeclarationSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  
  def withInterfaceKeyword(interfaceKeyword: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): InterfaceDeclarationSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): InterfaceDeclarationSyntax = js.native
  
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): InterfaceDeclarationSyntax = js.native
}
