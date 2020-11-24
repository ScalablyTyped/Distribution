package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Accelerometer: https://www.w3.org/TR/accelerometer/
@js.native
trait Accelerometer extends Sensor {
  
  val x: js.UndefOr[Double] = js.native
  
  val y: js.UndefOr[Double] = js.native
  
  val z: js.UndefOr[Double] = js.native
}
