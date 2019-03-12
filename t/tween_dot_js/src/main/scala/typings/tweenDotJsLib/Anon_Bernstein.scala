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
    Bernstein: (scala.Double, scala.Double) => scala.Double,
    CatmullRom: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    Factorial: scala.Double => scala.Double,
    Linear: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): Anon_Bernstein = {
    val __obj = js.Dynamic.literal(Bernstein = js.Any.fromFunction2(Bernstein), CatmullRom = js.Any.fromFunction5(CatmullRom), Factorial = js.Any.fromFunction1(Factorial), Linear = js.Any.fromFunction3(Linear))
  
    __obj.asInstanceOf[Anon_Bernstein]
  }
}

