package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding the data for a logical cpu execution times.
  */
@js.native
trait CPUTimes extends StObject {
  
  /**
    * The number of milliseconds the CPU has spent in idle mode.
    */
  var idle: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds the CPU has spent in irq mode.
    */
  var irq: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds the CPU has spent in nice mode.
    */
  var nice: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds the CPU has spent in sys mode.
    */
  var sys: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds the CPU has spent in user mode.
    */
  var user: js.UndefOr[Double] = js.native
}
object CPUTimes {
  
  @scala.inline
  def apply(): CPUTimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUTimes]
  }
  
  @scala.inline
  implicit class CPUTimesMutableBuilder[Self <: CPUTimes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIrqUndefined: Self = StObject.set(x, "irq", js.undefined)
    
    @scala.inline
    def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setSys(value: Double): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    @scala.inline
    def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
