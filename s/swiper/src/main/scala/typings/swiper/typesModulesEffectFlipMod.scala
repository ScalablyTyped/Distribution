package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesEffectFlipMod {
  
  trait FlipEffectEvents extends StObject
  
  trait FlipEffectMethods extends StObject
  
  trait FlipEffectOptions extends StObject {
    
    /**
      * Limit edge slides rotation
      *
      * @default true
      */
    var limitRotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables slides shadows
      *
      * @default true
      */
    var slideShadows: js.UndefOr[Boolean] = js.undefined
  }
  object FlipEffectOptions {
    
    inline def apply(): FlipEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipEffectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlipEffectOptions] (val x: Self) extends AnyVal {
      
      inline def setLimitRotation(value: Boolean): Self = StObject.set(x, "limitRotation", value.asInstanceOf[js.Any])
      
      inline def setLimitRotationUndefined: Self = StObject.set(x, "limitRotation", js.undefined)
      
      inline def setSlideShadows(value: Boolean): Self = StObject.set(x, "slideShadows", value.asInstanceOf[js.Any])
      
      inline def setSlideShadowsUndefined: Self = StObject.set(x, "slideShadows", js.undefined)
    }
  }
}
