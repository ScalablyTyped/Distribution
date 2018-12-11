package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GamepadHapticActuator extends js.Object {
  val `type`: GamepadHapticActuatorType
  def pulse(value: scala.Double, duration: scala.Double): js.Promise[scala.Boolean]
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator
  extends ScalablyTyped.runtime.Instantiable0[GamepadHapticActuator]

