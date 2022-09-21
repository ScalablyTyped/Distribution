package typings.swiper

import typings.swiper.swiperClassMod.default
import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerMod {
  
  trait ControllerEvents extends StObject
  
  trait ControllerMethods extends StObject {
    
    /**
      * Pass here another Swiper instance or array with Swiper instances that should be controlled
      * by this Swiper
      */
    var control: js.UndefOr[default | js.Array[default]] = js.undefined
  }
  object ControllerMethods {
    
    inline def apply(): ControllerMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControllerMethods]
    }
    
    extension [Self <: ControllerMethods](x: Self) {
      
      inline def setControl(value: default | js.Array[default]): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setControlVarargs(value: default*): Self = StObject.set(x, "control", js.Array(value*))
    }
  }
  
  trait ControllerOptions extends StObject {
    
    /**
      * Defines a way how to control another slider: slide by slide
      * (with respect to other slider's grid) or depending on all slides/container
      * (depending on total slider percentage).
      *
      * @default 'slide'
      */
    var by: js.UndefOr[slide | container] = js.undefined
    
    /**
      * Pass here another Swiper instance or array with Swiper instances that should be controlled
      * by this Swiper
      */
    var control: js.UndefOr[default | js.Array[default]] = js.undefined
    
    /**
      * Set to `true` and controlling will be in inverse direction
      *
      * @default false
      */
    var inverse: js.UndefOr[Boolean] = js.undefined
  }
  object ControllerOptions {
    
    inline def apply(): ControllerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControllerOptions]
    }
    
    extension [Self <: ControllerOptions](x: Self) {
      
      inline def setBy(value: slide | container): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setControl(value: default | js.Array[default]): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setControlVarargs(value: default*): Self = StObject.set(x, "control", js.Array(value*))
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    }
  }
}
