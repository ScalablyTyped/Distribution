package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsquash extends js.Object {
  def HLIM(x: Double, derivate: Boolean): Double
  def IDENTITY(x: Double, derivate: Boolean): Double
  def LOGISTIC(x: Double, derivate: Boolean): Double
  def ReLU(x: Double, derivate: Boolean): Double
  def TANH(x: Double, derivate: Boolean): Double
}

object Typeofsquash {
  @scala.inline
  def apply(
    HLIM: (Double, Boolean) => Double,
    IDENTITY: (Double, Boolean) => Double,
    LOGISTIC: (Double, Boolean) => Double,
    ReLU: (Double, Boolean) => Double,
    TANH: (Double, Boolean) => Double
  ): Typeofsquash = {
    val __obj = js.Dynamic.literal(HLIM = js.Any.fromFunction2(HLIM), IDENTITY = js.Any.fromFunction2(IDENTITY), LOGISTIC = js.Any.fromFunction2(LOGISTIC), ReLU = js.Any.fromFunction2(ReLU), TANH = js.Any.fromFunction2(TANH))
    __obj.asInstanceOf[Typeofsquash]
  }
}

