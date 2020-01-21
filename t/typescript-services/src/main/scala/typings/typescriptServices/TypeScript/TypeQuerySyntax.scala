package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeQuerySyntax")
@js.native
class TypeQuerySyntax protected () extends SyntaxNode {
  def this(typeOfKeyword: ISyntaxToken, name: INameSyntax, parsedInStrictMode: Boolean) = this()
  var name: INameSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
  def isType(): Boolean = js.native
  def update(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  def withName(name: INameSyntax): TypeQuerySyntax = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeQuerySyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeQuerySyntax")
@js.native
object TypeQuerySyntax extends js.Object {
  def create1(name: INameSyntax): TypeQuerySyntax = js.native
}

