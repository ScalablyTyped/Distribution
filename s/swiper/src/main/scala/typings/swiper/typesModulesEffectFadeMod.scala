package typings.swiper

import typings.swiper.typesSharedMod.CSSSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesEffectFadeMod {
  
  trait FadeEffectEvents extends StObject
  
  trait FadeEffectMethods extends StObject
  
  trait FadeEffectOptions extends StObject {
    
    /**
      * Enables slides cross fade
      *
      * @default false
      */
    var crossFade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS selector of the element inside of the slide to transform instead of the slide itself. Useful to use with cssMode
      *
      * @default null
      */
    var transformEl: js.UndefOr[CSSSelector] = js.undefined
  }
  object FadeEffectOptions {
    
    inline def apply(): FadeEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeEffectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FadeEffectOptions] (val x: Self) extends AnyVal {
      
      inline def setCrossFade(value: Boolean): Self = StObject.set(x, "crossFade", value.asInstanceOf[js.Any])
      
      inline def setCrossFadeUndefined: Self = StObject.set(x, "crossFade", js.undefined)
      
      inline def setTransformEl(value: CSSSelector): Self = StObject.set(x, "transformEl", value.asInstanceOf[js.Any])
      
      inline def setTransformElUndefined: Self = StObject.set(x, "transformEl", js.undefined)
    }
  }
}
