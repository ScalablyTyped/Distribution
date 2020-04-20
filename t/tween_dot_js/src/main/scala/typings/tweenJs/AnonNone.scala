package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNone extends js.Object {
  def None(k: Double): Double
}

object AnonNone {
  @scala.inline
  def apply(None: Double => Double): AnonNone = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
    __obj.asInstanceOf[AnonNone]
  }
}

