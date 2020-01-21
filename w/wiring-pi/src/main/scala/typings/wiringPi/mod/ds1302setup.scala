package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wiring-pi", "ds1302setup")
@js.native
object ds1302setup extends js.Object {
  def apply(clockPin: Double, dataPin: Double, csPin: Double): Unit = js.native
}

