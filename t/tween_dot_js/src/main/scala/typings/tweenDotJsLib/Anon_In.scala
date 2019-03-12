package typings
package tweenDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  def In(k: scala.Double): scala.Double
  def InOut(k: scala.Double): scala.Double
  def Out(k: scala.Double): scala.Double
}

object Anon_In {
  @scala.inline
  def apply(
    In: scala.Double => scala.Double,
    InOut: scala.Double => scala.Double,
    Out: scala.Double => scala.Double
  ): Anon_In = {
    val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
  
    __obj.asInstanceOf[Anon_In]
  }
}

