package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionedSkippedToken")
@js.native
class PositionedSkippedToken protected () extends PositionedToken {
  def this(parentToken: PositionedToken, token: ISyntaxToken, fullStart: Double) = this()
  var _parentToken: js.Any = js.native
  def parentToken(): PositionedToken = js.native
}

