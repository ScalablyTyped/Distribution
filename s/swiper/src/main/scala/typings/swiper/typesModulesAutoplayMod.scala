package typings.swiper

import typings.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesAutoplayMod {
  
  trait AutoplayEvents extends StObject {
    
    /**
      * Event will be fired when slide changed with autoplay
      */
    def autoplay(swiper: default): Unit
    
    /**
      * Event will be fired on autoplay pause (on mouse/pointer enter), when `pauseOnMouseEnter` enabled
      */
    def autoplayPause(swiper: default): Unit
    
    /**
      * Event will be fired on autoplay resume (on mouse/pointer leave), when `pauseOnMouseEnter` enabled
      */
    def autoplayResume(swiper: default): Unit
    
    /**
      * Event will be fired in when autoplay started
      */
    def autoplayStart(swiper: default): Unit
    
    /**
      * Event will be fired when autoplay stopped
      */
    def autoplayStop(swiper: default): Unit
  }
  object AutoplayEvents {
    
    inline def apply(
      autoplay: default => Unit,
      autoplayPause: default => Unit,
      autoplayResume: default => Unit,
      autoplayStart: default => Unit,
      autoplayStop: default => Unit
    ): AutoplayEvents = {
      val __obj = js.Dynamic.literal(autoplay = js.Any.fromFunction1(autoplay), autoplayPause = js.Any.fromFunction1(autoplayPause), autoplayResume = js.Any.fromFunction1(autoplayResume), autoplayStart = js.Any.fromFunction1(autoplayStart), autoplayStop = js.Any.fromFunction1(autoplayStop))
      __obj.asInstanceOf[AutoplayEvents]
    }
    
    extension [Self <: AutoplayEvents](x: Self) {
      
      inline def setAutoplay(value: default => Unit): Self = StObject.set(x, "autoplay", js.Any.fromFunction1(value))
      
      inline def setAutoplayPause(value: default => Unit): Self = StObject.set(x, "autoplayPause", js.Any.fromFunction1(value))
      
      inline def setAutoplayResume(value: default => Unit): Self = StObject.set(x, "autoplayResume", js.Any.fromFunction1(value))
      
      inline def setAutoplayStart(value: default => Unit): Self = StObject.set(x, "autoplayStart", js.Any.fromFunction1(value))
      
      inline def setAutoplayStop(value: default => Unit): Self = StObject.set(x, "autoplayStop", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AutoplayMethods extends StObject {
    
    /**
      * Pause autoplay
      */
    def pause(): Unit = js.native
    def pause(speed: Double): Unit = js.native
    
    /**
      * Whether autoplay is paused
      */
    var paused: Boolean = js.native
    
    /**
      * Run the autoplay logic
      */
    def run(): Unit = js.native
    
    /**
      * Whether autoplay enabled and running
      */
    var running: Boolean = js.native
    
    /**
      * Start autoplay
      */
    def start(): Boolean = js.native
    
    /**
      * Stop autoplay
      */
    def stop(): Boolean = js.native
  }
  
  trait AutoplayOptions extends StObject {
    
    /**
      * Delay between transitions (in ms). If this parameter is not specified, auto play will be disabled
      *
      * If you need to specify different delay for specific slides you can do it by using
      * `data-swiper-autoplay` (in ms) attribute on slide.
      *
      * @example
      * ```html
      * <!-- hold this slide for 2 seconds -->
      * <div class="swiper-slide" data-swiper-autoplay="2000">
      * ```
      *
      * @default 3000
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to `false` and autoplay will not be disabled after user interactions (swipes),
      * it will be restarted every time after interaction
      *
      * @default true
      */
    var disableOnInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled autoplay will be paused on mouse enter over Swiper container. If `disableOnInteraction` is also enabled, it will stop autoplay instead of pause
      *
      * @default false
      */
    var pauseOnMouseEnter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables autoplay in reverse direction
      *
      * @default false
      */
    var reverseDirection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this parameter and autoplay will be stopped when it reaches last slide (has no effect in loop mode)
      *
      * @default false
      */
    var stopOnLastSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled autoplay will wait for wrapper transition to continue.
      * Can be disabled in case of using Virtual Translate when your
      * slider may not have transition
      *
      * @default true
      */
    var waitForTransition: js.UndefOr[Boolean] = js.undefined
  }
  object AutoplayOptions {
    
    inline def apply(): AutoplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoplayOptions]
    }
    
    extension [Self <: AutoplayOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisableOnInteraction(value: Boolean): Self = StObject.set(x, "disableOnInteraction", value.asInstanceOf[js.Any])
      
      inline def setDisableOnInteractionUndefined: Self = StObject.set(x, "disableOnInteraction", js.undefined)
      
      inline def setPauseOnMouseEnter(value: Boolean): Self = StObject.set(x, "pauseOnMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setPauseOnMouseEnterUndefined: Self = StObject.set(x, "pauseOnMouseEnter", js.undefined)
      
      inline def setReverseDirection(value: Boolean): Self = StObject.set(x, "reverseDirection", value.asInstanceOf[js.Any])
      
      inline def setReverseDirectionUndefined: Self = StObject.set(x, "reverseDirection", js.undefined)
      
      inline def setStopOnLastSlide(value: Boolean): Self = StObject.set(x, "stopOnLastSlide", value.asInstanceOf[js.Any])
      
      inline def setStopOnLastSlideUndefined: Self = StObject.set(x, "stopOnLastSlide", js.undefined)
      
      inline def setWaitForTransition(value: Boolean): Self = StObject.set(x, "waitForTransition", value.asInstanceOf[js.Any])
      
      inline def setWaitForTransitionUndefined: Self = StObject.set(x, "waitForTransition", js.undefined)
    }
  }
}
