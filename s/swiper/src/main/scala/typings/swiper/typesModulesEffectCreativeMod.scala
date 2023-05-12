package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesEffectCreativeMod {
  
  trait CreativeEffectEvents extends StObject
  
  trait CreativeEffectMethods extends StObject
  
  trait CreativeEffectOptions extends StObject {
    
    /**
      * Limit progress/offset to amount of side slides. If `1`, then slides all slides after prev/next will have same state. If `2`, then all slides after 2nd before/after active will have same state, etc.
      *
      * @default 1
      */
    var limitProgress: js.UndefOr[Double] = js.undefined
    
    /**
      * Next slide transformations.
      *
      * @example
      * ```js
      * {
      *   // Array with translate X, Y and Z values
      *   translate: (string | number)[];
      *   // Array with rotate X, Y and Z values (in deg)
      *   rotate?: number[];
      *   // Slide opacity
      *   opacity?: number;
      *   // Slide scale
      *   scale?: number;
      *   // Enables slide shadow
      *   shadow?: boolean;
      *   // Transform origin, e.g. `left bottom`
      *   origin?: string;
      * }
      * ```
      *
      */
    var next: js.UndefOr[CreativeEffectTransform] = js.undefined
    
    /**
      * Enable this parameter if your custom transforms require 3D transformations (`translateZ`, `rotateX`, `rotateY` )
      *
      * @default true
      */
    var perspective: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Previous slide transformations. Accepts object of the following type:
      *
      * @example
      * ```js
      * {
      *   // Array with translate X, Y and Z values
      *   translate: (string | number)[];
      *   // Array with rotate X, Y and Z values (in deg)
      *   rotate?: number[];
      *   // Slide opacity
      *   opacity?: number;
      *   // Slide scale
      *   scale?: number;
      *   // Enables slide shadow
      *   shadow?: boolean;
      *   // Transform origin, e.g. `left bottom`
      *   origin?: string;
      * }
      * ```
      *
      */
    var prev: js.UndefOr[CreativeEffectTransform] = js.undefined
    
    /**
      * Allows to multiply slides transformations and opacity.
      *
      * @default 1
      */
    var progressMultiplier: js.UndefOr[Double] = js.undefined
    
    /**
      * Splits shadow "opacity" per slide based on `limitProgress` (only if transformation shadows enabled). E.g. setting `limitProgress: 2` and enabling `shadowPerProgress`, will set shadow opacity to `0.5` and `1` on two slides next to active. With this parameter disabled, all slides beside active will have shadow with `1` opacity
      *
      * @default false
      */
    var shadowPerProgress: js.UndefOr[Boolean] = js.undefined
  }
  object CreativeEffectOptions {
    
    inline def apply(): CreativeEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreativeEffectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreativeEffectOptions] (val x: Self) extends AnyVal {
      
      inline def setLimitProgress(value: Double): Self = StObject.set(x, "limitProgress", value.asInstanceOf[js.Any])
      
      inline def setLimitProgressUndefined: Self = StObject.set(x, "limitProgress", js.undefined)
      
      inline def setNext(value: CreativeEffectTransform): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPerspective(value: Boolean): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def setPrev(value: CreativeEffectTransform): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setProgressMultiplier(value: Double): Self = StObject.set(x, "progressMultiplier", value.asInstanceOf[js.Any])
      
      inline def setProgressMultiplierUndefined: Self = StObject.set(x, "progressMultiplier", js.undefined)
      
      inline def setShadowPerProgress(value: Boolean): Self = StObject.set(x, "shadowPerProgress", value.asInstanceOf[js.Any])
      
      inline def setShadowPerProgressUndefined: Self = StObject.set(x, "shadowPerProgress", js.undefined)
    }
  }
  
  trait CreativeEffectTransform extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[js.Array[Double]] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var translate: js.UndefOr[js.Array[String | Double]] = js.undefined
  }
  object CreativeEffectTransform {
    
    inline def apply(): CreativeEffectTransform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreativeEffectTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreativeEffectTransform] (val x: Self) extends AnyVal {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setRotate(value: js.Array[Double]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateVarargs(value: Double*): Self = StObject.set(x, "rotate", js.Array(value*))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setTranslate(value: js.Array[String | Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTranslateVarargs(value: (String | Double)*): Self = StObject.set(x, "translate", js.Array(value*))
    }
  }
}
