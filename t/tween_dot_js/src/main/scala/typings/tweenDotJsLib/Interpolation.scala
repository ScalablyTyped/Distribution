package typings
package tweenDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  var Utils: Anon_Bernstein
  def Bezier(v: js.Array[scala.Double], k: scala.Double): scala.Double
  def CatmullRom(v: js.Array[scala.Double], k: scala.Double): scala.Double
  def Linear(v: js.Array[scala.Double], k: scala.Double): scala.Double
}

object Interpolation {
  @scala.inline
  def apply(
    Bezier: (js.Array[scala.Double], scala.Double) => scala.Double,
    CatmullRom: (js.Array[scala.Double], scala.Double) => scala.Double,
    Linear: (js.Array[scala.Double], scala.Double) => scala.Double,
    Utils: Anon_Bernstein
  ): Interpolation = {
    val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils)
  
    __obj.asInstanceOf[Interpolation]
  }
}

