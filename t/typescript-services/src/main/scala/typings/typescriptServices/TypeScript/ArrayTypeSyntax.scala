package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTypeSyntax extends SyntaxNode {
  var closeBracketToken: ISyntaxToken = js.native
  var openBracketToken: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  def isType(): Boolean = js.native
  def update(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def withType(`type`: ITypeSyntax): ArrayTypeSyntax = js.native
}

