package typings.swiper

import typings.swiper.sharedMod.CSSSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectCardsMod {
  
  trait CardsEffectEvents extends StObject
  
  trait CardsEffectMethods extends StObject
  
  trait CardsEffectOptions extends StObject {
    
    /**
      * Offset distance per slide (in px)
      *
      * @default 8
      */
    var perSlideOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Rotate angle per slide (in degrees)
      *
      * @default 2
      */
    var perSlideRotate: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables cards rotation
      *
      * @default true
      */
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables slides shadows
      *
      * @default true
      */
    var slideShadows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS selector of the element inside of the slide to transform instead of the slide itself. Useful to use with cssMode
      *
      * @default null
      */
    var transformEl: js.UndefOr[CSSSelector] = js.undefined
  }
  object CardsEffectOptions {
    
    inline def apply(): CardsEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardsEffectOptions]
    }
    
    extension [Self <: CardsEffectOptions](x: Self) {
      
      inline def setPerSlideOffset(value: Double): Self = StObject.set(x, "perSlideOffset", value.asInstanceOf[js.Any])
      
      inline def setPerSlideOffsetUndefined: Self = StObject.set(x, "perSlideOffset", js.undefined)
      
      inline def setPerSlideRotate(value: Double): Self = StObject.set(x, "perSlideRotate", value.asInstanceOf[js.Any])
      
      inline def setPerSlideRotateUndefined: Self = StObject.set(x, "perSlideRotate", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
      
      inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
      
      inline def setTransformEl(value: CSSSelector): Self = StObject.set(x, "transformEl", value.asInstanceOf[js.Any])
      
      inline def setTransformElUndefined: Self = StObject.set(x, "transformEl", js.undefined)
    }
  }
}
