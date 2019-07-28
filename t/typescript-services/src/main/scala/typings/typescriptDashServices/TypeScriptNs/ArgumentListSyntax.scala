package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected () extends SyntaxNode {
  def this(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
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

/* static members */
@JSGlobal("TypeScript.ArgumentListSyntax")
@js.native
object ArgumentListSyntax extends js.Object {
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): ArgumentListSyntax = js.native
  def create1(): ArgumentListSyntax = js.native
}

