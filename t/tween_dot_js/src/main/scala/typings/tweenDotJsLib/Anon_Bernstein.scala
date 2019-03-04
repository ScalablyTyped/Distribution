package typings
package tweenDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bernstein extends js.Object {
  def Bernstein(n: scala.Double, i: scala.Double): scala.Double
  def CatmullRom(p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double, t: scala.Double): scala.Double
  def Factorial(n: scala.Double): scala.Double
  def Linear(p0: scala.Double, p1: scala.Double, t: scala.Double): scala.Double
}

object Anon_Bernstein {
  @scala.inline
  def apply(
    Bernstein: js.Function2[scala.Double, scala.Double, scala.Double],
    CatmullRom: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    Factorial: js.Function1[scala.Double, scala.Double],
    Linear: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double]
  ): Anon_Bernstein = {
    val __obj = js.Dynamic.literal(Bernstein = Bernstein, CatmullRom = CatmullRom, Factorial = Factorial, Linear = Linear)
  
    __obj.asInstanceOf[Anon_Bernstein]
  }
}

