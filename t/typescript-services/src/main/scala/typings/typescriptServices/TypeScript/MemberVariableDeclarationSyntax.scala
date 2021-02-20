package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberVariableDeclarationSyntax extends SyntaxNode {
  
  def isMemberDeclaration(): Boolean = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  
  var variableDeclarator: VariableDeclaratorSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): MemberVariableDeclarationSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): MemberVariableDeclarationSyntax = js.native
}
