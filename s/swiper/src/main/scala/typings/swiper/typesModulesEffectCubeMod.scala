package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesEffectCubeMod {
  
  trait CubeEffectEvents extends StObject
  
  trait CubeEffectMethods extends StObject
  
  trait CubeEffectOptions extends StObject {
    
    /**
      * Enables main slider shadow
      *
      * @default true
      */
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Main shadow offset in px
      *
      * @default 20
      */
    var shadowOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Main shadow scale ratio
      *
      * @default 0.94
      */
    var shadowScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables slides shadows
      *
      * @default true
      */
    var slideShadows: js.UndefOr[Boolean] = js.undefined
  }
  object CubeEffectOptions {
    
    inline def apply(): CubeEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CubeEffectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CubeEffectOptions] (val x: Self) extends AnyVal {
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      inline def setShadowScale(value: Double): Self = StObject.set(x, "shadowScale", value.asInstanceOf[js.Any])
      
      inline def setShadowScaleUndefined: Self = StObject.set(x, "shadowScale", js.undefined)
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
      
      inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
    }
  }
}
