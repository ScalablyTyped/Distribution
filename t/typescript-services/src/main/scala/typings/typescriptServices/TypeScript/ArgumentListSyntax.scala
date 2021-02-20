package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentListSyntax extends SyntaxNode {
  
  var arguments: ISeparatedSyntaxList = js.native
  
  var closeParenToken: ISyntaxToken = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var typeArgumentList: TypeArgumentListSyntax = js.native
  
  def update(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken
  ): ArgumentListSyntax = js.native
  
  def withArgument(_argument: IExpressionSyntax): ArgumentListSyntax = js.native
  
  def withArguments(_arguments: ISeparatedSyntaxList): ArgumentListSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): ArgumentListSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): ArgumentListSyntax = js.native
  
  def withTypeArgumentList(typeArgumentList: TypeArgumentListSyntax): ArgumentListSyntax = js.native
}
