package typings.vegas.anon

import typings.vegas.mod.AlignType
import typings.vegas.mod.Animation
import typings.vegas.mod.AnimationType
import typings.vegas.mod.Duration
import typings.vegas.mod.Settings
import typings.vegas.mod.Slide
import typings.vegas.mod.Transition
import typings.vegas.mod.TransitionType
import typings.vegas.vegasStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<vegas.vegas.Settings> */
@js.native
trait ReadonlySettings extends js.Object {
  
  val align: js.UndefOr[AlignType] = js.native
  
  val animation: js.UndefOr[AnimationType] = js.native
  
  val animationDuration: js.UndefOr[Duration] = js.native
  
  val animationRegister: js.UndefOr[js.Array[String]] = js.native
  
  val autoplay: js.UndefOr[Boolean] = js.native
  
  val color: js.UndefOr[String] = js.native
  
  val cover: js.UndefOr[Boolean | repeat] = js.native
  
  val delay: js.UndefOr[Double] = js.native
  
  val end: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
  
  val firstTransition: js.UndefOr[TransitionType] = js.native
  
  val firstTransitionDuration: js.UndefOr[Duration] = js.native
  
  val init: js.UndefOr[js.Function1[/* settings */ Settings, Unit]] = js.native
  
  val loop: js.UndefOr[Boolean] = js.native
  
  val overlay: js.UndefOr[Boolean | String] = js.native
  
  val pause: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
  
  val play: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
  
  val preload: js.UndefOr[Boolean] = js.native
  
  val preloadImage: js.UndefOr[Boolean] = js.native
  
  val shuffle: js.UndefOr[Boolean] = js.native
  
  val slide: js.UndefOr[Double] = js.native
  
  val slides: js.UndefOr[js.Array[Slide]] = js.native
  
  val slidesToKeep: js.UndefOr[Double] = js.native
  
  val timer: js.UndefOr[Boolean] = js.native
  
  val transition: js.UndefOr[TransitionType] = js.native
  
  val transitionDuration: js.UndefOr[Duration] = js.native
  
  val transitionRegister: js.UndefOr[js.Array[String]] = js.native
  
  val valign: js.UndefOr[AlignType] = js.native
  
  val walk: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
}
object ReadonlySettings {
  
  @scala.inline
  def apply(): ReadonlySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlySettings]
  }
  
  @scala.inline
  implicit class ReadonlySettingsOps[Self <: ReadonlySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAnimationVarargs(value: Animation*): Self = this.set("animation", js.Array(value :_*))
    
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Duration): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationRegisterVarargs(value: String*): Self = this.set("animationRegister", js.Array(value :_*))
    
    @scala.inline
    def setAnimationRegister(value: js.Array[String]): Self = this.set("animationRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationRegister: Self = this.set("animationRegister", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCover(value: Boolean | repeat): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEnd(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = this.set("end", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFirstTransitionVarargs(value: Transition*): Self = this.set("firstTransition", js.Array(value :_*))
    
    @scala.inline
    def setFirstTransition(value: TransitionType): Self = this.set("firstTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstTransition: Self = this.set("firstTransition", js.undefined)
    
    @scala.inline
    def setFirstTransitionDuration(value: Duration): Self = this.set("firstTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstTransitionDuration: Self = this.set("firstTransitionDuration", js.undefined)
    
    @scala.inline
    def setInit(value: /* settings */ Settings => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean | String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPause(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = this.set("pause", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = this.set("play", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setPreloadImage(value: Boolean): Self = this.set("preloadImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadImage: Self = this.set("preloadImage", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
    
    @scala.inline
    def setSlide(value: Double): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setSlidesVarargs(value: Slide*): Self = this.set("slides", js.Array(value :_*))
    
    @scala.inline
    def setSlides(value: js.Array[Slide]): Self = this.set("slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    
    @scala.inline
    def setSlidesToKeep(value: Double): Self = this.set("slidesToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToKeep: Self = this.set("slidesToKeep", js.undefined)
    
    @scala.inline
    def setTimer(value: Boolean): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    
    @scala.inline
    def setTransitionVarargs(value: Transition*): Self = this.set("transition", js.Array(value :_*))
    
    @scala.inline
    def setTransition(value: TransitionType): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Duration): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionRegisterVarargs(value: String*): Self = this.set("transitionRegister", js.Array(value :_*))
    
    @scala.inline
    def setTransitionRegister(value: js.Array[String]): Self = this.set("transitionRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionRegister: Self = this.set("transitionRegister", js.undefined)
    
    @scala.inline
    def setValign(value: AlignType): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    
    @scala.inline
    def setWalk(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = this.set("walk", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWalk: Self = this.set("walk", js.undefined)
  }
}
