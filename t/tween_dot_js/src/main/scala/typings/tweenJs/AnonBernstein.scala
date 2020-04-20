package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBernstein extends js.Object {
  def Bernstein(n: Double, i: Double): Double
  def CatmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double
  def Factorial(n: Double): Double
  def Linear(p0: Double, p1: Double, t: Double): Double
}

object AnonBernstein {
  @scala.inline
  def apply(
    Bernstein: (Double, Double) => Double,
    CatmullRom: (Double, Double, Double, Double, Double) => Double,
    Factorial: Double => Double,
    Linear: (Double, Double, Double) => Double
  ): AnonBernstein = {
    val __obj = js.Dynamic.literal(Bernstein = js.Any.fromFunction2(Bernstein), CatmullRom = js.Any.fromFunction5(CatmullRom), Factorial = js.Any.fromFunction1(Factorial), Linear = js.Any.fromFunction3(Linear))
    __obj.asInstanceOf[AnonBernstein]
  }
}

