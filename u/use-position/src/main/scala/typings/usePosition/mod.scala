package typings.usePosition

import typings.usePosition.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePosition(watch: Boolean): Accuracy = ^.asInstanceOf[js.Dynamic].applyDynamic("usePosition")(watch.asInstanceOf[js.Any]).asInstanceOf[Accuracy]
  inline def usePosition(watch: Boolean, settings: PositionOptions): Accuracy = (^.asInstanceOf[js.Dynamic].applyDynamic("usePosition")(watch.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Accuracy]
  
  trait PositionOptions extends StObject {
    
    /**
      * Setting this to true will ask the browser to get the position with the best accuracy possible.
      * Enabling this feature could consume a lot of battery in handled devices.
      *
      * @default false
      */
    var enableHighAccuracy: Boolean
    
    /**
      * The maximum cached position age.
      *
      * @default Infinity
      */
    var maximumAge: Double
    
    /**
      * The amount of time before the error callback is invoked, if 0 it will never invoke.
      *
      * @default 0
      */
    var timeout: Double
  }
  object PositionOptions {
    
    inline def apply(enableHighAccuracy: Boolean, maximumAge: Double, timeout: Double): PositionOptions = {
      val __obj = js.Dynamic.literal(enableHighAccuracy = enableHighAccuracy.asInstanceOf[js.Any], maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
      
      inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
