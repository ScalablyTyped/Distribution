package typings
package tslintLib.libLanguageUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPosition extends js.Object {
  /** The end of the token */
  var end: scala.Double
  /** The start of the token including all trivia before it */
  var fullStart: scala.Double
  /** The start of the token */
  var tokenStart: scala.Double
}

object TokenPosition {
  @scala.inline
  def apply(end: scala.Double, fullStart: scala.Double, tokenStart: scala.Double): TokenPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fullStart")(fullStart)
    __obj.updateDynamic("tokenStart")(tokenStart)
    __obj.asInstanceOf[TokenPosition]
  }
}

