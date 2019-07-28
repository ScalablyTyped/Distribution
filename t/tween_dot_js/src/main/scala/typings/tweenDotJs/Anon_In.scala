package typings.tweenDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  def In(k: Double): Double
  def InOut(k: Double): Double
  def Out(k: Double): Double
}

object Anon_In {
  @scala.inline
  def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): Anon_In = {
    val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
  
    __obj.asInstanceOf[Anon_In]
  }
}

