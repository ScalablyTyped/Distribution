package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTrivia extends js.Object {
  def fullText(): java.lang.String
  def fullWidth(): scala.Double
  def isComment(): scala.Boolean
  def isNewLine(): scala.Boolean
  def isSkippedToken(): scala.Boolean
  def isWhitespace(): scala.Boolean
  def kind(): SyntaxKind
  def skippedToken(): ISyntaxToken
}

