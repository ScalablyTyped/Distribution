package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected () extends SyntaxNode {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: Boolean) = this()
  var dotToken: ISyntaxToken = js.native
  var left: INameSyntax = js.native
  var right: ISyntaxToken = js.native
  def isName(): Boolean = js.native
  def isType(): Boolean = js.native
  def update(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
  def withDotToken(dotToken: ISyntaxToken): QualifiedNameSyntax = js.native
  def withLeft(left: INameSyntax): QualifiedNameSyntax = js.native
  def withRight(right: ISyntaxToken): QualifiedNameSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
object QualifiedNameSyntax extends js.Object {
  def create1(left: INameSyntax, right: ISyntaxToken): QualifiedNameSyntax = js.native
}

