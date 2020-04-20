package typings.tslint.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPosition extends js.Object {
  /** The end of the token */
  var end: Double
  /** The start of the token including all trivia before it */
  var fullStart: Double
  /** The start of the token */
  var tokenStart: Double
}

object TokenPosition {
  @scala.inline
  def apply(end: Double, fullStart: Double, tokenStart: Double): TokenPosition = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fullStart = fullStart.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPosition]
  }
}

