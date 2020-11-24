package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wiring-pi", "wiringPiISR")
@js.native
object wiringPiISR extends js.Object {
  
  def apply(pin: Double, edgeType: Double, callback: js.Function1[/* delta */ Double, Unit]): Unit = js.native
}
