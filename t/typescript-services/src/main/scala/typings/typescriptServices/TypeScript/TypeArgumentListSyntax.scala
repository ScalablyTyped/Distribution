package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeArgumentListSyntax extends SyntaxNode {
  
  var greaterThanToken: ISyntaxToken = js.native
  
  var lessThanToken: ISyntaxToken = js.native
  
  var typeArguments: ISeparatedSyntaxList = js.native
  
  def update(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  
  def withLessThanToken(lessThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  
  def withTypeArgument(typeArgument: ITypeSyntax): TypeArgumentListSyntax = js.native
  
  def withTypeArguments(typeArguments: ISeparatedSyntaxList): TypeArgumentListSyntax = js.native
}
