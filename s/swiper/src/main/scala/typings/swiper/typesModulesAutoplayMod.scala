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
      * Event will be fired on autoplay pause
      */
    def autoplayPause(swiper: default): Unit
    
    /**
      * Event will be fired on autoplay resume
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
    
    /**
      * Event triggers continuously while autoplay is enabled. It contains time left (in ms) before transition to next slide and percentage of that time related to autoplay delay
      */
    def autoplayTimeLeft(swiper: default, timeLeft: Double, percentage: Double): Unit
  }
  object AutoplayEvents {
    
    inline def apply(
      autoplay: default => Unit,
      autoplayPause: default => Unit,
      autoplayResume: default => Unit,
      autoplayStart: default => Unit,
      autoplayStop: default => Unit,
      autoplayTimeLeft: (default, Double, Double) => Unit
    ): AutoplayEvents = {
      val __obj = js.Dynamic.literal(autoplay = js.Any.fromFunction1(autoplay), autoplayPause = js.Any.fromFunction1(autoplayPause), autoplayResume = js.Any.fromFunction1(autoplayResume), autoplayStart = js.Any.fromFunction1(autoplayStart), autoplayStop = js.Any.fromFunction1(autoplayStop), autoplayTimeLeft = js.Any.fromFunction3(autoplayTimeLeft))
      __obj.asInstanceOf[AutoplayEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoplayEvents] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: default => Unit): Self = StObject.set(x, "autoplay", js.Any.fromFunction1(value))
      
      inline def setAutoplayPause(value: default => Unit): Self = StObject.set(x, "autoplayPause", js.Any.fromFunction1(value))
      
      inline def setAutoplayResume(value: default => Unit): Self = StObject.set(x, "autoplayResume", js.Any.fromFunction1(value))
      
      inline def setAutoplayStart(value: default => Unit): Self = StObject.set(x, "autoplayStart", js.Any.fromFunction1(value))
      
      inline def setAutoplayStop(value: default => Unit): Self = StObject.set(x, "autoplayStop", js.Any.fromFunction1(value))
      
      inline def setAutoplayTimeLeft(value: (default, Double, Double) => Unit): Self = StObject.set(x, "autoplayTimeLeft", js.Any.fromFunction3(value))
    }
  }
  
  trait AutoplayMethods extends StObject {
    
    /**
      * Pause autoplay
      */
    def pause(): Unit
    
    /**
      * Whether autoplay is paused
      */
    var paused: Boolean
    
    /**
      * Resume autoplay
      */
    def resume(): Unit
    
    /**
      * Whether autoplay enabled and running
      */
    var running: Boolean
    
    /**
      * Start autoplay
      */
    def start(): Boolean
    
    /**
      * Stop autoplay
      */
    def stop(): Boolean
    
    /**
      * If autoplay is paused, it contains time left (in ms) before transition to next slide
      */
    var timeLeft: Double
  }
  object AutoplayMethods {
    
    inline def apply(
      pause: () => Unit,
      paused: Boolean,
      resume: () => Unit,
      running: Boolean,
      start: () => Boolean,
      stop: () => Boolean,
      timeLeft: Double
    ): AutoplayMethods = {
      val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), running = running.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), timeLeft = timeLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoplayMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoplayMethods] (val x: Self) extends AnyVal {
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Boolean): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Boolean): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
    }
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
      * When enabled autoplay will be paused on pointer (mouse) enter over Swiper container.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoplayOptions] (val x: Self) extends AnyVal {
      
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
