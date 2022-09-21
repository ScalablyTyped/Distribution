package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoOptions extends StObject {
  
  /**
    * An attribute to indicate that the _successCallback()_ method in the watch
    *
    * operation will be triggered only if the device property is a number and its value is greater than or equal to this number.
    * This attribute has no effect on the _get()_ method.
    */
  var highThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * An attribute to indicate that the _successCallback()_ method in the watch operation must be triggered only if the property is a number and its value is lower than or equal to this number.
    *
    * If both _highThreshold_ and _lowThreshold_ parameters are specified, the _successCallback()_ is triggered if and only if the property value is either lower than the value of _lowThreshold_ or higher than the value of _highThreshold_.
    * This attribute has no effect on the get method.
    */
  var lowThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds beyond which the operation must be interrupted.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object SystemInfoOptions {
  
  inline def apply(): SystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInfoOptions]
  }
  
  extension [Self <: SystemInfoOptions](x: Self) {
    
    inline def setHighThreshold(value: Double): Self = StObject.set(x, "highThreshold", value.asInstanceOf[js.Any])
    
    inline def setHighThresholdUndefined: Self = StObject.set(x, "highThreshold", js.undefined)
    
    inline def setLowThreshold(value: Double): Self = StObject.set(x, "lowThreshold", value.asInstanceOf[js.Any])
    
    inline def setLowThresholdUndefined: Self = StObject.set(x, "lowThreshold", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
