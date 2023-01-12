package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesFreeModeMod {
  
  trait FreeModeEvents extends StObject
  
  trait FreeModeMethods extends StObject {
    
    def onTouchEnd(): Unit
    
    def onTouchMove(): Unit
  }
  object FreeModeMethods {
    
    inline def apply(onTouchEnd: () => Unit, onTouchMove: () => Unit): FreeModeMethods = {
      val __obj = js.Dynamic.literal(onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction0(onTouchMove))
      __obj.asInstanceOf[FreeModeMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FreeModeMethods] (val x: Self) extends AnyVal {
      
      inline def setOnTouchEnd(value: () => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction0(value))
      
      inline def setOnTouchMove(value: () => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction0(value))
    }
  }
  
  trait FreeModeOptions extends StObject {
    
    /**
      * Whether the free mode is enabled
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum touchmove-velocity required to trigger free mode momentum
      *
      * @default 0.02
      */
    var minimumVelocity: js.UndefOr[Double] = js.undefined
    
    /**
      * If enabled, then slide will keep moving for a while after you release it
      *
      * @default true
      */
    var momentum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` if you want to disable momentum bounce in free mode
      *
      * @default true
      */
    var momentumBounce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Higher value produces larger momentum bounce effect
      *
      * @default 1
      */
    var momentumBounceRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Higher value produces larger momentum distance after you release slider
      *
      * @default 1
      */
    var momentumRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Higher value produces larger momentum velocity after you release slider
      *
      * @default 1
      */
    var momentumVelocityRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to enabled to enable snap to slides positions in free mode
      *
      * @default false
      */
    var sticky: js.UndefOr[Boolean] = js.undefined
  }
  object FreeModeOptions {
    
    inline def apply(): FreeModeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreeModeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FreeModeOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMinimumVelocity(value: Double): Self = StObject.set(x, "minimumVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinimumVelocityUndefined: Self = StObject.set(x, "minimumVelocity", js.undefined)
      
      inline def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumBounce(value: Boolean): Self = StObject.set(x, "momentumBounce", value.asInstanceOf[js.Any])
      
      inline def setMomentumBounceRatio(value: Double): Self = StObject.set(x, "momentumBounceRatio", value.asInstanceOf[js.Any])
      
      inline def setMomentumBounceRatioUndefined: Self = StObject.set(x, "momentumBounceRatio", js.undefined)
      
      inline def setMomentumBounceUndefined: Self = StObject.set(x, "momentumBounce", js.undefined)
      
      inline def setMomentumRatio(value: Double): Self = StObject.set(x, "momentumRatio", value.asInstanceOf[js.Any])
      
      inline def setMomentumRatioUndefined: Self = StObject.set(x, "momentumRatio", js.undefined)
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      inline def setMomentumVelocityRatio(value: Double): Self = StObject.set(x, "momentumVelocityRatio", value.asInstanceOf[js.Any])
      
      inline def setMomentumVelocityRatioUndefined: Self = StObject.set(x, "momentumVelocityRatio", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
}
