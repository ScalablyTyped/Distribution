package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitWriteFinishOptions extends StObject {
  
  /**
    * File size polling interval.
    */
  var pollInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Amount of time in milliseconds for a file size to remain constant before emitting its event.
    */
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}
object AwaitWriteFinishOptions {
  
  inline def apply(): AwaitWriteFinishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwaitWriteFinishOptions]
  }
  
  extension [Self <: AwaitWriteFinishOptions](x: Self) {
    
    inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    inline def setStabilityThreshold(value: Double): Self = StObject.set(x, "stabilityThreshold", value.asInstanceOf[js.Any])
    
    inline def setStabilityThresholdUndefined: Self = StObject.set(x, "stabilityThreshold", js.undefined)
  }
}
