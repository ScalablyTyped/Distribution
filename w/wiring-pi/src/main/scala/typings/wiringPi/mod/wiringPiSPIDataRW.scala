package typings.wiringPi.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wiring-pi", "wiringPiSPIDataRW")
@js.native
object wiringPiSPIDataRW extends js.Object {
  def apply(channel: Double, data: Buffer): Double = js.native
}

