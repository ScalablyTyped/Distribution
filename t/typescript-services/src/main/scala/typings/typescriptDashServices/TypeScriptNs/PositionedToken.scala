package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedToken")
@js.native
class PositionedToken protected () extends PositionedNodeOrToken {
  def this(parent: PositionedElement, token: ISyntaxToken, fullStart: Double) = this()
  def nextToken(): PositionedToken = js.native
  def nextToken(includeSkippedTokens: Boolean): PositionedToken = js.native
  def previousToken(): PositionedToken = js.native
  def previousToken(includeSkippedTokens: Boolean): PositionedToken = js.native
  def token(): ISyntaxToken = js.native
}

