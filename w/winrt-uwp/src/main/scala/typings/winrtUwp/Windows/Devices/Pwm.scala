package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pwm {
  
  @js.native
  trait PwmController extends StObject {
    
    /* unmapped type */
    var actualFrequency: js.Any = js.native
    
    /* unmapped type */
    var maxFrequency: js.Any = js.native
    
    /* unmapped type */
    var minFrequency: js.Any = js.native
    
    /* unmapped type */
    var openPin: js.Any = js.native
    
    /* unmapped type */
    var pinCount: js.Any = js.native
    
    /* unmapped type */
    var setDesiredFrequency: js.Any = js.native
  }
  object PwmController {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PwmControllerMutableBuilder[Self <: PwmController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualFrequency(value: js.Any): Self = StObject.set(x, "actualFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFrequency(value: js.Any): Self = StObject.set(x, "maxFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFrequency(value: js.Any): Self = StObject.set(x, "minFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenPin(value: js.Any): Self = StObject.set(x, "openPin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinCount(value: js.Any): Self = StObject.set(x, "pinCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDesiredFrequency(value: js.Any): Self = StObject.set(x, "setDesiredFrequency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PwmPin extends StObject {
    
    var close: js.Any = js.native
    
    /* unmapped type */
    var controller: js.Any = js.native
    
    /* unmapped type */
    var getActiveDutyCyclePercentage: js.Any = js.native
    
    /* unmapped type */
    var isStarted: js.Any = js.native
    
    /* unmapped type */
    var polarity: js.Any = js.native
    
    /* unmapped type */
    var setActiveDutyCyclePercentage: js.Any = js.native
    
    /* unmapped type */
    var start: js.Any = js.native
    
    /* unmapped type */
    var stop: js.Any = js.native
  }
  object PwmPin {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PwmPinMutableBuilder[Self <: PwmPin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetActiveDutyCyclePercentage(value: js.Any): Self = StObject.set(x, "getActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStarted(value: js.Any): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolarity(value: js.Any): Self = StObject.set(x, "polarity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActiveDutyCyclePercentage(value: js.Any): Self = StObject.set(x, "setActiveDutyCyclePercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: js.Any): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
}
