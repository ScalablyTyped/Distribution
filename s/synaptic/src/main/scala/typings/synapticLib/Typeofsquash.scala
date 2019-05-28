package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsquash extends js.Object {
  def HLIM(x: scala.Double, derivate: scala.Boolean): scala.Double
  def IDENTITY(x: scala.Double, derivate: scala.Boolean): scala.Double
  def LOGISTIC(x: scala.Double, derivate: scala.Boolean): scala.Double
  def ReLU(x: scala.Double, derivate: scala.Boolean): scala.Double
  def TANH(x: scala.Double, derivate: scala.Boolean): scala.Double
}

object Typeofsquash {
  @scala.inline
  def apply(
    HLIM: (scala.Double, scala.Boolean) => scala.Double,
    IDENTITY: (scala.Double, scala.Boolean) => scala.Double,
    LOGISTIC: (scala.Double, scala.Boolean) => scala.Double,
    ReLU: (scala.Double, scala.Boolean) => scala.Double,
    TANH: (scala.Double, scala.Boolean) => scala.Double
  ): Typeofsquash = {
    val __obj = js.Dynamic.literal(HLIM = js.Any.fromFunction2(HLIM), IDENTITY = js.Any.fromFunction2(IDENTITY), LOGISTIC = js.Any.fromFunction2(LOGISTIC), ReLU = js.Any.fromFunction2(ReLU), TANH = js.Any.fromFunction2(TANH))
  
    __obj.asInstanceOf[Typeofsquash]
  }
}

