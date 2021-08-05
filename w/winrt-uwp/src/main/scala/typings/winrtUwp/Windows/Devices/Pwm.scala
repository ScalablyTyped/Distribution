package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pwm {
  
  trait PwmController extends StObject {
    
    /* unmapped type */
    var actualFrequency: js.Any
    
    /* unmapped type */
    var maxFrequency: js.Any
    
    /* unmapped type */
    var minFrequency: js.Any
    
    /* unmapped type */
    var openPin: js.Any
    
    /* unmapped type */
    var pinCount: js.Any
    
    /* unmapped type */
    var setDesiredFrequency: js.Any
  }
  object PwmController {
    
    inline def apply(
      actualFrequency: js.Any,
      maxFrequency: js.Any,
      minFrequency: js.Any,
      openPin: js.Any,
      pinCount: js.Any,
      setDesiredFrequency: js.Any
    ): PwmController = {
      val __obj = js.Dynamic.literal(actualFrequency = actualFrequency.asInstanceOf[js.Any], maxFrequency = maxFrequency.asInstanceOf[js.Any], minFrequency = minFrequency.asInstanceOf[js.Any], openPin = openPin.asInstanceOf[js.Any], pinCount = pinCount.asInstanceOf[js.Any], setDesiredFrequency = setDesiredFrequency.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwmController]
    }
    
    extension [Self <: PwmController](x: Self) {
      
      inline def setActualFrequency(value: js.Any): Self = StObject.set(x, "actualFrequency", value.asInstanceOf[js.Any])
      
      inline def setMaxFrequency(value: js.Any): Self = StObject.set(x, "maxFrequency", value.asInstanceOf[js.Any])
      
      inline def setMinFrequency(value: js.Any): Self = StObject.set(x, "minFrequency", value.asInstanceOf[js.Any])
      
      inline def setOpenPin(value: js.Any): Self = StObject.set(x, "openPin", value.asInstanceOf[js.Any])
      
      inline def setPinCount(value: js.Any): Self = StObject.set(x, "pinCount", value.asInstanceOf[js.Any])
      
      inline def setSetDesiredFrequency(value: js.Any): Self = StObject.set(x, "setDesiredFrequency", value.asInstanceOf[js.Any])
    }
  }
  
  trait PwmPin extends StObject {
    
    var close: js.Any
    
    /* unmapped type */
    var controller: js.Any
    
    /* unmapped type */
    var getActiveDutyCyclePercentage: js.Any
    
    /* unmapped type */
    var isStarted: js.Any
    
    /* unmapped type */
    var polarity: js.Any
    
    /* unmapped type */
    var setActiveDutyCyclePercentage: js.Any
    
    /* unmapped type */
    var start: js.Any
    
    /* unmapped type */
    var stop: js.Any
  }
  object PwmPin {
    
    inline def apply(
      close: js.Any,
      controller: js.Any,
      getActiveDutyCyclePercentage: js.Any,
      isStarted: js.Any,
      polarity: js.Any,
      setActiveDutyCyclePercentage: js.Any,
      start: js.Any,
      stop: js.Any
    ): PwmPin = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], getActiveDutyCyclePercentage = getActiveDutyCyclePercentage.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], polarity = polarity.asInstanceOf[js.Any], setActiveDutyCyclePercentage = setActiveDutyCyclePercentage.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwmPin]
    }
    
    extension [Self <: PwmPin](x: Self) {
      
      inline def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setGetActiveDutyCyclePercentage(value: js.Any): Self = StObject.set(x, "getActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      inline def setIsStarted(value: js.Any): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      inline def setPolarity(value: js.Any): Self = StObject.set(x, "polarity", value.asInstanceOf[js.Any])
      
      inline def setSetActiveDutyCyclePercentage(value: js.Any): Self = StObject.set(x, "setActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStop(value: js.Any): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
}
