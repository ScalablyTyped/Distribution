package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected () extends SyntaxNode {
  def this(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var greaterThanToken: ISyntaxToken = js.native
  var lessThanToken: ISyntaxToken = js.native
  var typeParameters: ISeparatedSyntaxList = js.native
  def update(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withLessThanToken(lessThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def withTypeParameter(typeParameter: TypeParameterSyntax): TypeParameterListSyntax = js.native
  def withTypeParameters(typeParameters: ISeparatedSyntaxList): TypeParameterListSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeParameterListSyntax")
@js.native
object TypeParameterListSyntax extends js.Object {
  def create(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax = js.native
}

