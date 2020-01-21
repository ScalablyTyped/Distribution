package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wiring-pi", "sr595Setup")
@js.native
object sr595Setup extends js.Object {
  def apply(pinBase: Double, numPins: Double, dataPin: Double, clockPin: Double, latchPin: Double): Double = js.native
}

