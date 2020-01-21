package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonK extends js.Object {
  def None(k: Double): Double
}

object AnonK {
  @scala.inline
  def apply(None: Double => Double): AnonK = {
    val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
  
    __obj.asInstanceOf[AnonK]
  }
}

