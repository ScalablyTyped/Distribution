package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISyntaxNodeOrToken extends ISyntaxElement {
  def accept(visitor: ISyntaxVisitor): js.Any
  def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken
  def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken
}

