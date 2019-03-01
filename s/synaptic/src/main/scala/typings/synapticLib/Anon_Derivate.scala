package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Derivate extends js.Object {
  def HLIM(x: scala.Double, derivate: scala.Boolean): scala.Double
  def IDENTITY(x: scala.Double, derivate: scala.Boolean): scala.Double
  def LOGISTIC(x: scala.Double, derivate: scala.Boolean): scala.Double
  def ReLU(x: scala.Double, derivate: scala.Boolean): scala.Double
  def TANH(x: scala.Double, derivate: scala.Boolean): scala.Double
}

object Anon_Derivate {
  @scala.inline
  def apply(
    HLIM: js.Function2[scala.Double, scala.Boolean, scala.Double],
    IDENTITY: js.Function2[scala.Double, scala.Boolean, scala.Double],
    LOGISTIC: js.Function2[scala.Double, scala.Boolean, scala.Double],
    ReLU: js.Function2[scala.Double, scala.Boolean, scala.Double],
    TANH: js.Function2[scala.Double, scala.Boolean, scala.Double]
  ): Anon_Derivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HLIM")(HLIM)
    __obj.updateDynamic("IDENTITY")(IDENTITY)
    __obj.updateDynamic("LOGISTIC")(LOGISTIC)
    __obj.updateDynamic("ReLU")(ReLU)
    __obj.updateDynamic("TANH")(TANH)
    __obj.asInstanceOf[Anon_Derivate]
  }
}

