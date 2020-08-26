package typings.tweenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bernstein extends js.Object {
  def Bernstein(n: Double, i: Double): Double = js.native
  def CatmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
  def Factorial(n: Double): Double = js.native
  def Linear(p0: Double, p1: Double, t: Double): Double = js.native
}

object Bernstein {
  @scala.inline
  def apply(
    Bernstein: (Double, Double) => Double,
    CatmullRom: (Double, Double, Double, Double, Double) => Double,
    Factorial: Double => Double,
    Linear: (Double, Double, Double) => Double
  ): Bernstein = {
    val __obj = js.Dynamic.literal(Bernstein = js.Any.fromFunction2(Bernstein), CatmullRom = js.Any.fromFunction5(CatmullRom), Factorial = js.Any.fromFunction1(Factorial), Linear = js.Any.fromFunction3(Linear))
    __obj.asInstanceOf[Bernstein]
  }
  @scala.inline
  implicit class BernsteinOps[Self <: Bernstein] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBernstein(value: (Double, Double) => Double): Self = this.set("Bernstein", js.Any.fromFunction2(value))
    @scala.inline
    def setCatmullRom(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("CatmullRom", js.Any.fromFunction5(value))
    @scala.inline
    def setFactorial(value: Double => Double): Self = this.set("Factorial", js.Any.fromFunction1(value))
    @scala.inline
    def setLinear(value: (Double, Double, Double) => Double): Self = this.set("Linear", js.Any.fromFunction3(value))
  }
  
}

