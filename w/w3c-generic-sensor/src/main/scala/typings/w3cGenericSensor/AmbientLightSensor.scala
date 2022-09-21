package typings.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ambient Light Sensor: https://www.w3.org/TR/ambient-light/
@js.native
trait AmbientLightSensor
  extends StObject
     with Sensor {
  
  val illuminance: js.UndefOr[Double] = js.native
}
