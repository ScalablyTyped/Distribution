package typings.tweenDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  var Utils: Anon_Bernstein
  def Bezier(v: js.Array[Double], k: Double): Double
  def CatmullRom(v: js.Array[Double], k: Double): Double
  def Linear(v: js.Array[Double], k: Double): Double
}

object Interpolation {
  @scala.inline
  def apply(
    Bezier: (js.Array[Double], Double) => Double,
    CatmullRom: (js.Array[Double], Double) => Double,
    Linear: (js.Array[Double], Double) => Double,
    Utils: Anon_Bernstein
  ): Interpolation = {
    val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Interpolation]
  }
}

