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
    In: js.Function1[scala.Double, scala.Double],
    InOut: js.Function1[scala.Double, scala.Double],
    Out: js.Function1[scala.Double, scala.Double]
  ): Anon_In = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("In")(In)
    __obj.updateDynamic("InOut")(InOut)
    __obj.updateDynamic("Out")(Out)
    __obj.asInstanceOf[Anon_In]
  }
}

