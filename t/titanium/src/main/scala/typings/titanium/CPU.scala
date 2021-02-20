package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding the data for a logical cpu.
  */
@js.native
trait CPU extends StObject {
  
  /**
    * General description of the CPU
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Speed of the CPU in MHz
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * A collection of timings for this logical CPU.
    */
  var times: js.UndefOr[CPUTimes] = js.native
}
object CPU {
  
  @scala.inline
  def apply(): CPU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPU]
  }
  
  @scala.inline
  implicit class CPUMutableBuilder[Self <: CPU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setTimes(value: CPUTimes): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
