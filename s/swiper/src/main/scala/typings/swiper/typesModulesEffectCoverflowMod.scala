package typings.swiper

import typings.swiper.typesSharedMod.CSSSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesEffectCoverflowMod {
  
  trait CoverflowEffectEvents extends StObject
  
  trait CoverflowEffectMethods extends StObject
  
  trait CoverflowEffectOptions extends StObject {
    
    /**
      * Depth offset in px (slides translate in Z axis)
      *
      * @default 100
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Effect multiplier
      *
      * @default 1
      */
    var modifier: js.UndefOr[Double] = js.undefined
    
    /**
      * Slide rotate in degrees
      *
      * @default 50
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * Slide scale effect
      *
      * @default 1
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables slides shadows
      *
      * @default true
      */
    var slideShadows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stretch space between slides (in px)
      *
      * @default 0
      */
    var stretch: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS selector of the element inside of the slide to transform instead of the slide itself. Useful to use with cssMode
      *
      * @default null
      */
    var transformEl: js.UndefOr[CSSSelector] = js.undefined
  }
  object CoverflowEffectOptions {
    
    inline def apply(): CoverflowEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoverflowEffectOptions]
    }
    
    extension [Self <: CoverflowEffectOptions](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setModifier(value: Double): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
      
      inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
      
      inline def setStretch(value: Double): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setTransformEl(value: CSSSelector): Self = StObject.set(x, "transformEl", value.asInstanceOf[js.Any])
      
      inline def setTransformElUndefined: Self = StObject.set(x, "transformEl", js.undefined)
    }
  }
}
