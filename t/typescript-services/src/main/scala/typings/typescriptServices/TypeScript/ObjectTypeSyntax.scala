package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeSyntax extends SyntaxNode {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  def isType(): Boolean = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  var typeMembers: ISeparatedSyntaxList = js.native
  
  def update(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  
  def withTypeMember(typeMember: ITypeMemberSyntax): ObjectTypeSyntax = js.native
  
  def withTypeMembers(typeMembers: ISeparatedSyntaxList): ObjectTypeSyntax = js.native
}
