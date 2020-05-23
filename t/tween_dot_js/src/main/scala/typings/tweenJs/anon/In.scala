package typings.tweenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  def In(k: Double): Double
  def InOut(k: Double): Double
  def Out(k: Double): Double
}

object In {
  @scala.inline
  def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): In = {
    val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
    __obj.asInstanceOf[In]
  }
}

