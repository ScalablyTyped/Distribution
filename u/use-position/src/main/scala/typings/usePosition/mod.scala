package typings.usePosition

import typings.usePosition.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-position", "usePosition")
  @js.native
  def usePosition(watch: Boolean): Accuracy = js.native
  @JSImport("use-position", "usePosition")
  @js.native
  def usePosition(watch: Boolean, settings: PositionOptions): Accuracy = js.native
  
  @js.native
  trait PositionOptions extends StObject {
    
    /**
      * Setting this to true will ask the browser to get the position with the best accuracy possible.
      * Enabling this feature could consume a lot of battery in handled devices.
      *
      * @default false
      */
    var enableHighAccuracy: Boolean = js.native
    
    /**
      * The maximum cached position age.
      *
      * @default Infinity
      */
    var maximumAge: Double = js.native
    
    /**
      * The amount of time before the error callback is invoked, if 0 it will never invoke.
      *
      * @default 0
      */
    var timeout: Double = js.native
  }
  object PositionOptions {
    
    @scala.inline
    def apply(enableHighAccuracy: Boolean, maximumAge: Double, timeout: Double): PositionOptions = {
      val __obj = js.Dynamic.literal(enableHighAccuracy = enableHighAccuracy.asInstanceOf[js.Any], maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionOptions]
    }
    
    @scala.inline
    implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
