package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISyntaxToken extends IPrimaryExpressionSyntax {
  var tokenKind: SyntaxKind
  def hasLeadingComment(): scala.Boolean
  def hasLeadingNewLine(): scala.Boolean
  def hasLeadingSkippedText(): scala.Boolean
  def hasLeadingTrivia(): scala.Boolean
  def hasSkippedToken(): scala.Boolean
  def hasTrailingComment(): scala.Boolean
  def hasTrailingNewLine(): scala.Boolean
  def hasTrailingSkippedText(): scala.Boolean
  def hasTrailingTrivia(): scala.Boolean
  def text(): java.lang.String
  def value(): js.Any
  def valueText(): java.lang.String
}

