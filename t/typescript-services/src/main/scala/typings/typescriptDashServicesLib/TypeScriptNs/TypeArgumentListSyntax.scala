package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected () extends SyntaxNode {
  def this(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var greaterThanToken: ISyntaxToken = js.native
  var lessThanToken: ISyntaxToken = js.native
  var typeArguments: ISeparatedSyntaxList = js.native
  def update(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  def withLessThanToken(lessThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  def withTypeArgument(typeArgument: ITypeSyntax): TypeArgumentListSyntax = js.native
  def withTypeArguments(typeArguments: ISeparatedSyntaxList): TypeArgumentListSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeArgumentListSyntax")
@js.native
object TypeArgumentListSyntax extends js.Object {
  def create(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax = js.native
}

