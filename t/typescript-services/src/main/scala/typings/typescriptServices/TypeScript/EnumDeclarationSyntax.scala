package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclarationSyntax extends SyntaxNode {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  var enumElements: ISeparatedSyntaxList = js.native
  
  var enumKeyword: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  def update(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax = js.native
  
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): EnumDeclarationSyntax = js.native
  
  def withEnumElement(enumElement: EnumElementSyntax): EnumDeclarationSyntax = js.native
  
  def withEnumElements(enumElements: ISeparatedSyntaxList): EnumDeclarationSyntax = js.native
  
  def withEnumKeyword(enumKeyword: ISyntaxToken): EnumDeclarationSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): EnumDeclarationSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): EnumDeclarationSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): EnumDeclarationSyntax = js.native
  
  def withOpenBraceToken(openBraceToken: ISyntaxToken): EnumDeclarationSyntax = js.native
}
