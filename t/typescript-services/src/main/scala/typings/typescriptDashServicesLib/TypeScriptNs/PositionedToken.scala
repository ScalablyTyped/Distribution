package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedToken")
@js.native
class PositionedToken protected () extends PositionedNodeOrToken {
  def this(parent: PositionedElement, token: ISyntaxToken, fullStart: scala.Double) = this()
  def nextToken(): PositionedToken = js.native
  def nextToken(includeSkippedTokens: scala.Boolean): PositionedToken = js.native
  def previousToken(): PositionedToken = js.native
  def previousToken(includeSkippedTokens: scala.Boolean): PositionedToken = js.native
  def token(): ISyntaxToken = js.native
}

