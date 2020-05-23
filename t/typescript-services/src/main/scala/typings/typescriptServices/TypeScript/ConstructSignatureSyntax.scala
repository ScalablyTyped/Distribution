package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructSignatureSyntax extends SyntaxNode {
  var callSignature: CallSignatureSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  def update(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ConstructSignatureSyntax = js.native
}

