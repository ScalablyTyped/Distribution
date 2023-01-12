package typings.vegas

import typings.vegas.mod.AlignType
import typings.vegas.mod.Animation
import typings.vegas.mod.AnimationType
import typings.vegas.mod.Duration
import typings.vegas.mod.Settings
import typings.vegas.mod.Slide
import typings.vegas.mod.Transition
import typings.vegas.mod.TransitionType
import typings.vegas.vegasStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<vegas.vegas.Settings> */
  trait ReadonlySettings extends StObject {
    
    val align: js.UndefOr[AlignType] = js.undefined
    
    val animation: js.UndefOr[AnimationType] = js.undefined
    
    val animationDuration: js.UndefOr[Duration] = js.undefined
    
    val animationRegister: js.UndefOr[js.Array[String]] = js.undefined
    
    val autoplay: js.UndefOr[Boolean] = js.undefined
    
    val color: js.UndefOr[String] = js.undefined
    
    val cover: js.UndefOr[Boolean | repeat] = js.undefined
    
    val delay: js.UndefOr[Double] = js.undefined
    
    val end: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    val firstTransition: js.UndefOr[TransitionType] = js.undefined
    
    val firstTransitionDuration: js.UndefOr[Duration] = js.undefined
    
    val init: js.UndefOr[js.Function1[/* settings */ Settings, Unit]] = js.undefined
    
    val loop: js.UndefOr[Boolean] = js.undefined
    
    val overlay: js.UndefOr[Boolean | String] = js.undefined
    
    val pause: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    val play: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    val preload: js.UndefOr[Boolean] = js.undefined
    
    val preloadImage: js.UndefOr[Boolean] = js.undefined
    
    val shuffle: js.UndefOr[Boolean] = js.undefined
    
    val slide: js.UndefOr[Double] = js.undefined
    
    val slides: js.UndefOr[js.Array[Slide]] = js.undefined
    
    val slidesToKeep: js.UndefOr[Double] = js.undefined
    
    val timer: js.UndefOr[Boolean] = js.undefined
    
    val transition: js.UndefOr[TransitionType] = js.undefined
    
    val transitionDuration: js.UndefOr[Duration] = js.undefined
    
    val transitionRegister: js.UndefOr[js.Array[String]] = js.undefined
    
    val valign: js.UndefOr[AlignType] = js.undefined
    
    val walk: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
  }
  object ReadonlySettings {
    
    inline def apply(): ReadonlySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlySettings] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDuration(value: Duration): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationRegister(value: js.Array[String]): Self = StObject.set(x, "animationRegister", value.asInstanceOf[js.Any])
      
      inline def setAnimationRegisterUndefined: Self = StObject.set(x, "animationRegister", js.undefined)
      
      inline def setAnimationRegisterVarargs(value: String*): Self = StObject.set(x, "animationRegister", js.Array(value*))
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnimationVarargs(value: Animation*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCover(value: Boolean | repeat): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnd(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFirstTransition(value: TransitionType): Self = StObject.set(x, "firstTransition", value.asInstanceOf[js.Any])
      
      inline def setFirstTransitionDuration(value: Duration): Self = StObject.set(x, "firstTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setFirstTransitionDurationUndefined: Self = StObject.set(x, "firstTransitionDuration", js.undefined)
      
      inline def setFirstTransitionUndefined: Self = StObject.set(x, "firstTransition", js.undefined)
      
      inline def setFirstTransitionVarargs(value: Transition*): Self = StObject.set(x, "firstTransition", js.Array(value*))
      
      inline def setInit(value: /* settings */ Settings => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOverlay(value: Boolean | String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPause(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPlay(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadImage(value: Boolean): Self = StObject.set(x, "preloadImage", value.asInstanceOf[js.Any])
      
      inline def setPreloadImageUndefined: Self = StObject.set(x, "preloadImage", js.undefined)
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSlides(value: js.Array[Slide]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesToKeep(value: Double): Self = StObject.set(x, "slidesToKeep", value.asInstanceOf[js.Any])
      
      inline def setSlidesToKeepUndefined: Self = StObject.set(x, "slidesToKeep", js.undefined)
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setSlidesVarargs(value: Slide*): Self = StObject.set(x, "slides", js.Array(value*))
      
      inline def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Duration): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionRegister(value: js.Array[String]): Self = StObject.set(x, "transitionRegister", value.asInstanceOf[js.Any])
      
      inline def setTransitionRegisterUndefined: Self = StObject.set(x, "transitionRegister", js.undefined)
      
      inline def setTransitionRegisterVarargs(value: String*): Self = StObject.set(x, "transitionRegister", js.Array(value*))
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: Transition*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setValign(value: AlignType): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWalk(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "walk", js.Any.fromFunction2(value))
      
      inline def setWalkUndefined: Self = StObject.set(x, "walk", js.undefined)
    }
  }
}
