package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesParallaxMod {
  
  trait ParallaxEvents extends StObject
  
  trait ParallaxMethods extends StObject
  
  trait ParallaxOptions extends StObject {
    
    /**
      * Enable, if you want to use "parallaxed" elements inside of slider
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object ParallaxOptions {
    
    inline def apply(): ParallaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallaxOptions]
    }
    
    extension [Self <: ParallaxOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
