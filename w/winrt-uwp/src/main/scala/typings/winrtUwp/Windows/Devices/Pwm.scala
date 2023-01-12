package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pwm {
  
  trait PwmController extends StObject {
    
    /* unmapped type */
    var actualFrequency: Any
    
    /* unmapped type */
    var maxFrequency: Any
    
    /* unmapped type */
    var minFrequency: Any
    
    /* unmapped type */
    var openPin: Any
    
    /* unmapped type */
    var pinCount: Any
    
    /* unmapped type */
    var setDesiredFrequency: Any
  }
  object PwmController {
    
    inline def apply(
      actualFrequency: Any,
      maxFrequency: Any,
      minFrequency: Any,
      openPin: Any,
      pinCount: Any,
      setDesiredFrequency: Any
    ): PwmController = {
      val __obj = js.Dynamic.literal(actualFrequency = actualFrequency.asInstanceOf[js.Any], maxFrequency = maxFrequency.asInstanceOf[js.Any], minFrequency = minFrequency.asInstanceOf[js.Any], openPin = openPin.asInstanceOf[js.Any], pinCount = pinCount.asInstanceOf[js.Any], setDesiredFrequency = setDesiredFrequency.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwmController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PwmController] (val x: Self) extends AnyVal {
      
      inline def setActualFrequency(value: Any): Self = StObject.set(x, "actualFrequency", value.asInstanceOf[js.Any])
      
      inline def setMaxFrequency(value: Any): Self = StObject.set(x, "maxFrequency", value.asInstanceOf[js.Any])
      
      inline def setMinFrequency(value: Any): Self = StObject.set(x, "minFrequency", value.asInstanceOf[js.Any])
      
      inline def setOpenPin(value: Any): Self = StObject.set(x, "openPin", value.asInstanceOf[js.Any])
      
      inline def setPinCount(value: Any): Self = StObject.set(x, "pinCount", value.asInstanceOf[js.Any])
      
      inline def setSetDesiredFrequency(value: Any): Self = StObject.set(x, "setDesiredFrequency", value.asInstanceOf[js.Any])
    }
  }
  
  trait PwmPin extends StObject {
    
    var close: Any
    
    /* unmapped type */
    var controller: Any
    
    /* unmapped type */
    var getActiveDutyCyclePercentage: Any
    
    /* unmapped type */
    var isStarted: Any
    
    /* unmapped type */
    var polarity: Any
    
    /* unmapped type */
    var setActiveDutyCyclePercentage: Any
    
    /* unmapped type */
    var start: Any
    
    /* unmapped type */
    var stop: Any
  }
  object PwmPin {
    
    inline def apply(
      close: Any,
      controller: Any,
      getActiveDutyCyclePercentage: Any,
      isStarted: Any,
      polarity: Any,
      setActiveDutyCyclePercentage: Any,
      start: Any,
      stop: Any
    ): PwmPin = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], getActiveDutyCyclePercentage = getActiveDutyCyclePercentage.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], polarity = polarity.asInstanceOf[js.Any], setActiveDutyCyclePercentage = setActiveDutyCyclePercentage.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwmPin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PwmPin] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setGetActiveDutyCyclePercentage(value: Any): Self = StObject.set(x, "getActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      inline def setIsStarted(value: Any): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      inline def setPolarity(value: Any): Self = StObject.set(x, "polarity", value.asInstanceOf[js.Any])
      
      inline def setSetActiveDutyCyclePercentage(value: Any): Self = StObject.set(x, "setActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Any): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
}
