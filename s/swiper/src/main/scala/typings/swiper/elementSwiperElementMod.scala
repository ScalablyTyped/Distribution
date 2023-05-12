package typings.swiper

import typings.std.AddEventListenerOptions
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.swiper.swiperStrings.abort
import typings.swiper.swiperStrings.activeindexchange
import typings.swiper.swiperStrings.afterinit
import typings.swiper.swiperStrings.animationcancel
import typings.swiper.swiperStrings.animationend
import typings.swiper.swiperStrings.animationiteration
import typings.swiper.swiperStrings.animationstart
import typings.swiper.swiperStrings.autoplay
import typings.swiper.swiperStrings.autoplaypause
import typings.swiper.swiperStrings.autoplayresume
import typings.swiper.swiperStrings.autoplaystart
import typings.swiper.swiperStrings.autoplaystop
import typings.swiper.swiperStrings.autoplaytimeleft
import typings.swiper.swiperStrings.auxclick
import typings.swiper.swiperStrings.beforedestroy
import typings.swiper.swiperStrings.beforeinit
import typings.swiper.swiperStrings.beforeinput
import typings.swiper.swiperStrings.beforeloopfix
import typings.swiper.swiperStrings.beforeresize
import typings.swiper.swiperStrings.beforeslidechangestart
import typings.swiper.swiperStrings.beforetransitionstart
import typings.swiper.swiperStrings.blur
import typings.swiper.swiperStrings.breakpoint
import typings.swiper.swiperStrings.cancel
import typings.swiper.swiperStrings.canplay
import typings.swiper.swiperStrings.canplaythrough
import typings.swiper.swiperStrings.change
import typings.swiper.swiperStrings.changedirection
import typings.swiper.swiperStrings.click
import typings.swiper.swiperStrings.close
import typings.swiper.swiperStrings.compositionend
import typings.swiper.swiperStrings.compositionstart
import typings.swiper.swiperStrings.compositionupdate
import typings.swiper.swiperStrings.contextmenu
import typings.swiper.swiperStrings.copy
import typings.swiper.swiperStrings.cuechange
import typings.swiper.swiperStrings.cut
import typings.swiper.swiperStrings.dblclick
import typings.swiper.swiperStrings.destroy
import typings.swiper.swiperStrings.doubleclick
import typings.swiper.swiperStrings.doubletap
import typings.swiper.swiperStrings.drag
import typings.swiper.swiperStrings.dragend
import typings.swiper.swiperStrings.dragenter
import typings.swiper.swiperStrings.dragleave
import typings.swiper.swiperStrings.dragover
import typings.swiper.swiperStrings.dragstart
import typings.swiper.swiperStrings.drop
import typings.swiper.swiperStrings.durationchange
import typings.swiper.swiperStrings.emptied
import typings.swiper.swiperStrings.ended
import typings.swiper.swiperStrings.error
import typings.swiper.swiperStrings.focus
import typings.swiper.swiperStrings.focusin
import typings.swiper.swiperStrings.focusout
import typings.swiper.swiperStrings.formdata
import typings.swiper.swiperStrings.fromedge
import typings.swiper.swiperStrings.fullscreenchange
import typings.swiper.swiperStrings.fullscreenerror
import typings.swiper.swiperStrings.gotpointercapture
import typings.swiper.swiperStrings.hashchange
import typings.swiper.swiperStrings.hashset
import typings.swiper.swiperStrings.init
import typings.swiper.swiperStrings.input
import typings.swiper.swiperStrings.invalid
import typings.swiper.swiperStrings.keydown
import typings.swiper.swiperStrings.keypress
import typings.swiper.swiperStrings.keyup
import typings.swiper.swiperStrings.load
import typings.swiper.swiperStrings.loadeddata
import typings.swiper.swiperStrings.loadedmetadata
import typings.swiper.swiperStrings.loadstart
import typings.swiper.swiperStrings.lock
import typings.swiper.swiperStrings.loopfix
import typings.swiper.swiperStrings.lostpointercapture
import typings.swiper.swiperStrings.momentumbounce
import typings.swiper.swiperStrings.mousedown
import typings.swiper.swiperStrings.mouseenter
import typings.swiper.swiperStrings.mouseleave
import typings.swiper.swiperStrings.mousemove
import typings.swiper.swiperStrings.mouseout
import typings.swiper.swiperStrings.mouseover
import typings.swiper.swiperStrings.mouseup
import typings.swiper.swiperStrings.navigationhide
import typings.swiper.swiperStrings.navigationnext
import typings.swiper.swiperStrings.navigationprev
import typings.swiper.swiperStrings.navigationshow
import typings.swiper.swiperStrings.observerupdate
import typings.swiper.swiperStrings.orientationchange
import typings.swiper.swiperStrings.paginationhide
import typings.swiper.swiperStrings.paginationrender
import typings.swiper.swiperStrings.paginationshow
import typings.swiper.swiperStrings.paginationupdate
import typings.swiper.swiperStrings.paste
import typings.swiper.swiperStrings.pause
import typings.swiper.swiperStrings.play
import typings.swiper.swiperStrings.playing
import typings.swiper.swiperStrings.pointercancel
import typings.swiper.swiperStrings.pointerdown
import typings.swiper.swiperStrings.pointerenter
import typings.swiper.swiperStrings.pointerleave
import typings.swiper.swiperStrings.pointermove
import typings.swiper.swiperStrings.pointerout
import typings.swiper.swiperStrings.pointerover
import typings.swiper.swiperStrings.pointerup
import typings.swiper.swiperStrings.progress
import typings.swiper.swiperStrings.ratechange
import typings.swiper.swiperStrings.reachbeginning
import typings.swiper.swiperStrings.reachend
import typings.swiper.swiperStrings.realindexchange
import typings.swiper.swiperStrings.reset
import typings.swiper.swiperStrings.resize
import typings.swiper.swiperStrings.scroll
import typings.swiper.swiperStrings.scrollbardragend
import typings.swiper.swiperStrings.scrollbardragmove
import typings.swiper.swiperStrings.scrollbardragstart
import typings.swiper.swiperStrings.securitypolicyviolation
import typings.swiper.swiperStrings.seeked
import typings.swiper.swiperStrings.seeking
import typings.swiper.swiperStrings.select
import typings.swiper.swiperStrings.selectionchange
import typings.swiper.swiperStrings.selectstart
import typings.swiper.swiperStrings.settransition
import typings.swiper.swiperStrings.settranslate
import typings.swiper.swiperStrings.slidechange
import typings.swiper.swiperStrings.slidechangetransitionend
import typings.swiper.swiperStrings.slidechangetransitionstart
import typings.swiper.swiperStrings.slidenexttransitionend
import typings.swiper.swiperStrings.slidenexttransitionstart
import typings.swiper.swiperStrings.slideprevtransitionend
import typings.swiper.swiperStrings.slideprevtransitionstart
import typings.swiper.swiperStrings.slideresettransitionend
import typings.swiper.swiperStrings.slideresettransitionstart
import typings.swiper.swiperStrings.sliderfirstmove
import typings.swiper.swiperStrings.slidermove
import typings.swiper.swiperStrings.slidesgridlengthchange
import typings.swiper.swiperStrings.slideslengthchange
import typings.swiper.swiperStrings.slotchange
import typings.swiper.swiperStrings.snapgridlengthchange
import typings.swiper.swiperStrings.snapindexchange
import typings.swiper.swiperStrings.stalled
import typings.swiper.swiperStrings.submit
import typings.swiper.swiperStrings.suspend
import typings.swiper.swiperStrings.tap
import typings.swiper.swiperStrings.timeupdate
import typings.swiper.swiperStrings.toedge
import typings.swiper.swiperStrings.toggle
import typings.swiper.swiperStrings.touchcancel
import typings.swiper.swiperStrings.touchend
import typings.swiper.swiperStrings.touchmove
import typings.swiper.swiperStrings.touchmoveopposite
import typings.swiper.swiperStrings.touchstart
import typings.swiper.swiperStrings.transitioncancel
import typings.swiper.swiperStrings.transitionend
import typings.swiper.swiperStrings.transitionrun
import typings.swiper.swiperStrings.transitionstart
import typings.swiper.swiperStrings.unlock
import typings.swiper.swiperStrings.update
import typings.swiper.swiperStrings.volumechange
import typings.swiper.swiperStrings.waiting
import typings.swiper.swiperStrings.webkitanimationend
import typings.swiper.swiperStrings.webkitanimationiteration
import typings.swiper.swiperStrings.webkitanimationstart
import typings.swiper.swiperStrings.webkittransitionend
import typings.swiper.swiperStrings.wheel
import typings.swiper.swiperStrings.zoomchange
import typings.swiper.typesMod.Swiper
import typings.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementSwiperElementMod {
  
  @JSImport("swiper/element/swiper-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  inline def register(injectStyles: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(injectStyles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait SwiperContainer
    extends StObject
       with HTMLElement
       with SwiperOptions {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var eventsPrefix: String = js.native
    
    def initialize(): Unit = js.native
    
    @JSName("injectStylesUrls")
    var injectStylesUrls_SwiperContainer: js.Array[String] = js.native
    
    @JSName("injectStyles")
    var injectStyles_SwiperContainer: js.Array[String] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_activeindexchange(
      `type`: activeindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_afterinit(
      `type`: afterinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplay(
      `type`: autoplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaypause(
      `type`: autoplaypause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplayresume(
      `type`: autoplayresume,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystart(
      `type`: autoplaystart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaystop(
      `type`: autoplaystop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_autoplaytimeleft(
      `type`: autoplaytimeleft,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforedestroy(
      `type`: beforedestroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinit(
      `type`: beforeinit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeloopfix(
      `type`: beforeloopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeresize(
      `type`: beforeresize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeslidechangestart(
      `type`: beforeslidechangestart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforetransitionstart(
      `type`: beforetransitionstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_breakpoint(
      `type`: breakpoint,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_changedirection(
      `type`: changedirection,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_destroy(
      `type`: destroy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubleclick(
      `type`: doubleclick,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_doubletap(
      `type`: doubletap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fromedge(
      `type`: fromedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashchange(
      `type`: hashchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_hashset(
      `type`: hashset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lock(
      `type`: lock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loopfix(
      `type`: loopfix,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_momentumbounce(
      `type`: momentumbounce,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationhide(
      `type`: navigationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationnext(
      `type`: navigationnext,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationprev(
      `type`: navigationprev,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_navigationshow(
      `type`: navigationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_observerupdate(
      `type`: observerupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_orientationchange(
      `type`: orientationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationhide(
      `type`: paginationhide,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationrender(
      `type`: paginationrender,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationshow(
      `type`: paginationshow,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paginationupdate(
      `type`: paginationupdate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachbeginning(
      `type`: reachbeginning,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reachend(
      `type`: reachend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_realindexchange(
      `type`: realindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragend(
      `type`: scrollbardragend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragmove(
      `type`: scrollbardragmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scrollbardragstart(
      `type`: scrollbardragstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settransition(
      `type`: settransition,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_settranslate(
      `type`: settranslate,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechange(
      `type`: slidechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionend(
      `type`: slidechangetransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidechangetransitionstart(
      `type`: slidechangetransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionend(
      `type`: slidenexttransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidenexttransitionstart(
      `type`: slidenexttransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionend(
      `type`: slideprevtransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideprevtransitionstart(
      `type`: slideprevtransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionend(
      `type`: slideresettransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideresettransitionstart(
      `type`: slideresettransitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_sliderfirstmove(
      `type`: sliderfirstmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidermove(
      `type`: slidermove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slidesgridlengthchange(
      `type`: slidesgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slideslengthchange(
      `type`: slideslengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapgridlengthchange(
      `type`: snapgridlengthchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_snapindexchange(
      `type`: snapindexchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_tap(
      `type`: tap,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toedge(
      `type`: toedge,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmoveopposite(
      `type`: touchmoveopposite,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlock(
      `type`: unlock,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_update(
      `type`: update,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CustomEvent[js.Array[/* swiper */ Swiper]], Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_zoomchange(
      `type`: zoomchange,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ CustomEvent[
            js.Tuple4[
              /* swiper */ Swiper, 
              /* scale */ Double, 
              /* imageEl */ HTMLElement, 
              /* slideEl */ HTMLElement
            ]
          ], 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    
    var swiper: Swiper = js.native
  }
  
  // prettier-ignore
  /* Inlined parent std.Omit<std.HTMLElementEventMap, 'click' | 'progress' | 'keypress' | 'resize' | 'touchstart' | 'touchmove' | 'touchend' | 'transitionend' | 'transitionstart'> */
  trait SwiperContainerEventMap extends StObject {
    
    var abort: UIEvent
    
    /**
      * !INTERNAL: Event will fired right before breakpoint change
      */
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper container element
      */
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
      */
    /**
      * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
      */
    /**
      * !INTERNAL: Event will fired as soon as swiper instance available (before init)
      */
    /**
      * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
      */
    /**
      * Event will fired on active index change
      */
    var activeindexchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired right after initialization
      */
    var afterinit: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var animationcancel: AnimationEvent
    
    var animationend: AnimationEvent
    
    var animationiteration: AnimationEvent
    
    var animationstart: AnimationEvent
    
    /**
      * Event will be fired when slide changed with autoplay
      */
    var autoplay: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on autoplay pause
      */
    var autoplaypause: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on autoplay resume
      */
    var autoplayresume: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired in when autoplay started
      */
    var autoplaystart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when autoplay stopped
      */
    var autoplaystop: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event triggers continuously while autoplay is enabled. It contains time left (in ms) before transition to next slide and percentage of that time related to autoplay delay
      */
    var autoplaytimeleft: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]]
    
    var auxclick: MouseEvent
    
    /**
      * Event will be fired right before Swiper destroyed
      */
    var beforedestroy: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired right before initialization
      */
    var beforeinit: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var beforeinput: InputEvent
    
    /**
      * Event will be fired right before "loop fix"
      */
    var beforeloopfix: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired before resize handler
      */
    var beforeresize: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired before slide change transition start
      */
    var beforeslidechangestart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired before transition start
      */
    var beforetransitionstart: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]]
    
    var blur: FocusEvent
    
    /**
      * Event will be fired on breakpoint change
      */
    var breakpoint: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]]
    
    var cancel: Event
    
    var canplay: Event
    
    var canplaythrough: Event
    
    var change: Event
    
    // what is internal?
    /**
      * Event will fired on direction change
      */
    var changedirection: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var click: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    var close: Event
    
    var compositionend: CompositionEvent
    
    var compositionstart: CompositionEvent
    
    var compositionupdate: CompositionEvent
    
    var contextmenu: MouseEvent
    
    var copy: ClipboardEvent
    
    var cuechange: Event
    
    var cut: ClipboardEvent
    
    var dblclick: MouseEvent
    
    /**
      * Event will be fired on swiper destroy
      */
    var destroy: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when user double click/tap on Swiper
      */
    var doubleclick: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
      */
    var doubletap: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    var drag: DragEvent
    
    var dragend: DragEvent
    
    var dragenter: DragEvent
    
    var dragleave: DragEvent
    
    var dragover: DragEvent
    
    var dragstart: DragEvent
    
    var drop: DragEvent
    
    var durationchange: Event
    
    var emptied: Event
    
    var ended: Event
    
    var error: ErrorEvent
    
    var focus: FocusEvent
    
    var focusin: FocusEvent
    
    var focusout: FocusEvent
    
    var formdata: FormDataEvent
    
    /**
      * Event will be fired when Swiper goes from beginning or end position
      */
    var fromedge: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var fullscreenchange: Event
    
    var fullscreenerror: Event
    
    var gotpointercapture: PointerEvent
    
    /**
      * Event will be fired on window hash change
      */
    var hashchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when swiper updates the hash
      */
    var hashset: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Fired right after Swiper initialization.
      * @note Note that with `swiper.on('init')` syntax it will
      * work only in case you set `init: false` parameter.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   init: CustomEvent<[false,
      *   // other parameters
      * }]>;
      * swiper.on('init', function() {
      *  // do something
      * });
      * // init Swiper
      * swiper.init();
      * ```
      *
      * @example
      * ```js
      * // Otherwise use it as the parameter:
      * const swiper = new Swiper('.swiper', {
      *   // other parameters
      *   on: CustomEvent<[{
      *     init: function  {
      *       // do something
      *     },
      *   }
      * })]>;
      * ```
      */
    var init: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var input: Event
    
    var invalid: Event
    
    var keydown: KeyboardEvent
    
    /**
      * Event will be fired on key press
      */
    var keypress: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]]
    
    var keyup: KeyboardEvent
    
    var load: Event
    
    var loadeddata: Event
    
    var loadedmetadata: Event
    
    var loadstart: Event
    
    /**
      * Event will be fired when swiper is locked (when `watchOverflow` enabled)
      */
    var lock: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired after "loop fix"
      */
    var loopfix: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var lostpointercapture: PointerEvent
    
    /**
      * Event will be fired on momentum bounce
      */
    var momentumbounce: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var mousedown: MouseEvent
    
    var mouseenter: MouseEvent
    
    var mouseleave: MouseEvent
    
    var mousemove: MouseEvent
    
    var mouseout: MouseEvent
    
    var mouseover: MouseEvent
    
    var mouseup: MouseEvent
    
    /**
      * Event will be fired on navigation hide
      */
    var navigationhide: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on navigation next button click
      */
    var navigationnext: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on navigation prev button click
      */
    var navigationprev: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on navigation show
      */
    var navigationshow: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired if observer is enabled and it detects DOM mutations
      */
    var observerupdate: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on orientation change (e.g. landscape -> portrait)
      */
    var orientationchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on pagination hide
      */
    var paginationhide: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired after pagination rendered
      */
    var paginationrender: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]]
    
    /**
      * Event will be fired on pagination show
      */
    var paginationshow: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when pagination updated
      */
    var paginationupdate: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]]
    
    var paste: ClipboardEvent
    
    var pause: Event
    
    var play: Event
    
    var playing: Event
    
    var pointercancel: PointerEvent
    
    var pointerdown: PointerEvent
    
    var pointerenter: PointerEvent
    
    var pointerleave: PointerEvent
    
    var pointermove: PointerEvent
    
    var pointerout: PointerEvent
    
    var pointerover: PointerEvent
    
    var pointerup: PointerEvent
    
    /**
      * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
      */
    var progress: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]]
    
    var ratechange: Event
    
    /**
      * Event will be fired when Swiper reach its beginning (initial position)
      */
    var reachbeginning: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when Swiper reach last slide
      */
    var reachend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired on real index change
      */
    var realindexchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var reset: Event
    
    /**
      * Event will be fired on window resize right before swiper's onresize manipulation
      */
    var resize: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired on mousewheel scroll
      */
    var scroll: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]]
    
    /**
      * Event will be fired on draggable scrollbar drag end
      */
    var scrollbardragend: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired on draggable scrollbar drag move
      */
    var scrollbardragmove: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired on draggable scrollbar drag start
      */
    var scrollbardragstart: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    var securitypolicyviolation: SecurityPolicyViolationEvent
    
    var seeked: Event
    
    var seeking: Event
    
    var select: Event
    
    var selectionchange: Event
    
    var selectstart: Event
    
    /**
      * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
      */
    var settransition: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]]
    
    /**
      * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
      */
    var settranslate: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]]
    
    /**
      * Event will be fired when currently active slide is changed
      */
    var slidechange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired after animation to other slide (next or previous).
      */
    var slidechangetransitionend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired in the beginning of animation to other slide (next or previous).
      */
    var slidechangetransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Same as "slideChangeTransitionEnd" but for "forward" direction only
      */
    var slidenexttransitionend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Same as "slideChangeTransitionStart" but for "forward" direction only
      */
    var slidenexttransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Same as "slideChangeTransitionEnd" but for "backward" direction only
      */
    var slideprevtransitionend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Same as "slideChangeTransitionStart" but for "backward" direction only
      */
    var slideprevtransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired in the end of animation of resetting slide to current one
      */
    var slideresettransitionend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired in the beginning of animation of resetting slide to current one
      */
    var slideresettransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired with first touch/drag move
      */
    var sliderfirstmove: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]]
    
    /**
      * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
      */
    var slidermove: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired when slides grid has changed
      */
    var slidesgridlengthchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when number of slides has changed
      */
    var slideslengthchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var slotchange: Event
    
    /**
      * Event will be fired when snap grid has changed
      */
    var snapgridlengthchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will fired on snap index change
      */
    var snapindexchange: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var stalled: Event
    
    var submit: SubmitEvent
    
    var suspend: Event
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var tap: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    var timeupdate: Event
    
    /**
      * Event will be fired when Swiper goes to beginning or end position
      */
    var toedge: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var toggle: Event
    
    var touchcancel: TouchEvent
    
    /**
      * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
      */
    var touchend: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
      */
    var touchmove: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
      */
    var touchmoveopposite: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    /**
      * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
      */
    var touchstart: CustomEvent[
        js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
      ]
    
    var transitioncancel: TransitionEvent
    
    /**
      * Event will be fired after transition.
      */
    var transitionend: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var transitionrun: TransitionEvent
    
    /**
      * Event will be fired in the beginning of transition.
      */
    var transitionstart: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
      */
    var unlock: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    /**
      * Event will be fired after swiper.update() call
      */
    var update: CustomEvent[js.Array[/* swiper */ Swiper]]
    
    var volumechange: Event
    
    var waiting: Event
    
    var webkitanimationend: Event
    
    var webkitanimationiteration: Event
    
    var webkitanimationstart: Event
    
    var webkittransitionend: Event
    
    var wheel: WheelEvent
    
    /**
      * Event will be fired on zoom change
      */
    var zoomchange: CustomEvent[
        js.Tuple4[
          /* swiper */ Swiper, 
          /* scale */ Double, 
          /* imageEl */ HTMLElement, 
          /* slideEl */ HTMLElement
        ]
      ]
  }
  object SwiperContainerEventMap {
    
    inline def apply(
      abort: UIEvent,
      activeindexchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      afterinit: CustomEvent[js.Array[/* swiper */ Swiper]],
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      autoplay: CustomEvent[js.Array[/* swiper */ Swiper]],
      autoplaypause: CustomEvent[js.Array[/* swiper */ Swiper]],
      autoplayresume: CustomEvent[js.Array[/* swiper */ Swiper]],
      autoplaystart: CustomEvent[js.Array[/* swiper */ Swiper]],
      autoplaystop: CustomEvent[js.Array[/* swiper */ Swiper]],
      autoplaytimeleft: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]],
      auxclick: MouseEvent,
      beforedestroy: CustomEvent[js.Array[/* swiper */ Swiper]],
      beforeinit: CustomEvent[js.Array[/* swiper */ Swiper]],
      beforeinput: InputEvent,
      beforeloopfix: CustomEvent[js.Array[/* swiper */ Swiper]],
      beforeresize: CustomEvent[js.Array[/* swiper */ Swiper]],
      beforeslidechangestart: CustomEvent[js.Array[/* swiper */ Swiper]],
      beforetransitionstart: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]],
      blur: FocusEvent,
      breakpoint: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]],
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      changedirection: CustomEvent[js.Array[/* swiper */ Swiper]],
      click: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      destroy: CustomEvent[js.Array[/* swiper */ Swiper]],
      doubleclick: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      doubletap: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fromedge: CustomEvent[js.Array[/* swiper */ Swiper]],
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      hashchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      hashset: CustomEvent[js.Array[/* swiper */ Swiper]],
      init: CustomEvent[js.Array[/* swiper */ Swiper]],
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]],
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lock: CustomEvent[js.Array[/* swiper */ Swiper]],
      loopfix: CustomEvent[js.Array[/* swiper */ Swiper]],
      lostpointercapture: PointerEvent,
      momentumbounce: CustomEvent[js.Array[/* swiper */ Swiper]],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      navigationhide: CustomEvent[js.Array[/* swiper */ Swiper]],
      navigationnext: CustomEvent[js.Array[/* swiper */ Swiper]],
      navigationprev: CustomEvent[js.Array[/* swiper */ Swiper]],
      navigationshow: CustomEvent[js.Array[/* swiper */ Swiper]],
      observerupdate: CustomEvent[js.Array[/* swiper */ Swiper]],
      orientationchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      paginationhide: CustomEvent[js.Array[/* swiper */ Swiper]],
      paginationrender: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]],
      paginationshow: CustomEvent[js.Array[/* swiper */ Swiper]],
      paginationupdate: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]],
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]],
      ratechange: Event,
      reachbeginning: CustomEvent[js.Array[/* swiper */ Swiper]],
      reachend: CustomEvent[js.Array[/* swiper */ Swiper]],
      realindexchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      reset: Event,
      resize: CustomEvent[js.Array[/* swiper */ Swiper]],
      scroll: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]],
      scrollbardragend: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      scrollbardragmove: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      scrollbardragstart: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      settransition: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]],
      settranslate: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]],
      slidechange: CustomEvent[js.Array[/* swiper */ Swiper]],
      slidechangetransitionend: CustomEvent[js.Array[/* swiper */ Swiper]],
      slidechangetransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]],
      slidenexttransitionend: CustomEvent[js.Array[/* swiper */ Swiper]],
      slidenexttransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]],
      slideprevtransitionend: CustomEvent[js.Array[/* swiper */ Swiper]],
      slideprevtransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]],
      slideresettransitionend: CustomEvent[js.Array[/* swiper */ Swiper]],
      slideresettransitionstart: CustomEvent[js.Array[/* swiper */ Swiper]],
      sliderfirstmove: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]],
      slidermove: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      slidesgridlengthchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      slideslengthchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      slotchange: Event,
      snapgridlengthchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      snapindexchange: CustomEvent[js.Array[/* swiper */ Swiper]],
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      tap: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      timeupdate: Event,
      toedge: CustomEvent[js.Array[/* swiper */ Swiper]],
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      touchmove: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      touchmoveopposite: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      touchstart: CustomEvent[
          js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
        ],
      transitioncancel: TransitionEvent,
      transitionend: CustomEvent[js.Array[/* swiper */ Swiper]],
      transitionrun: TransitionEvent,
      transitionstart: CustomEvent[js.Array[/* swiper */ Swiper]],
      unlock: CustomEvent[js.Array[/* swiper */ Swiper]],
      update: CustomEvent[js.Array[/* swiper */ Swiper]],
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent,
      zoomchange: CustomEvent[
          js.Tuple4[
            /* swiper */ Swiper, 
            /* scale */ Double, 
            /* imageEl */ HTMLElement, 
            /* slideEl */ HTMLElement
          ]
        ]
    ): SwiperContainerEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], activeindexchange = activeindexchange.asInstanceOf[js.Any], afterinit = afterinit.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], autoplaypause = autoplaypause.asInstanceOf[js.Any], autoplayresume = autoplayresume.asInstanceOf[js.Any], autoplaystart = autoplaystart.asInstanceOf[js.Any], autoplaystop = autoplaystop.asInstanceOf[js.Any], autoplaytimeleft = autoplaytimeleft.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforedestroy = beforedestroy.asInstanceOf[js.Any], beforeinit = beforeinit.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeloopfix = beforeloopfix.asInstanceOf[js.Any], beforeresize = beforeresize.asInstanceOf[js.Any], beforeslidechangestart = beforeslidechangestart.asInstanceOf[js.Any], beforetransitionstart = beforetransitionstart.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], breakpoint = breakpoint.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], changedirection = changedirection.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], doubleclick = doubleclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fromedge = fromedge.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], hashset = hashset.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], loopfix = loopfix.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], momentumbounce = momentumbounce.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], navigationhide = navigationhide.asInstanceOf[js.Any], navigationnext = navigationnext.asInstanceOf[js.Any], navigationprev = navigationprev.asInstanceOf[js.Any], navigationshow = navigationshow.asInstanceOf[js.Any], observerupdate = observerupdate.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], paginationhide = paginationhide.asInstanceOf[js.Any], paginationrender = paginationrender.asInstanceOf[js.Any], paginationshow = paginationshow.asInstanceOf[js.Any], paginationupdate = paginationupdate.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reachbeginning = reachbeginning.asInstanceOf[js.Any], reachend = reachend.asInstanceOf[js.Any], realindexchange = realindexchange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollbardragend = scrollbardragend.asInstanceOf[js.Any], scrollbardragmove = scrollbardragmove.asInstanceOf[js.Any], scrollbardragstart = scrollbardragstart.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], settransition = settransition.asInstanceOf[js.Any], settranslate = settranslate.asInstanceOf[js.Any], slidechange = slidechange.asInstanceOf[js.Any], slidechangetransitionend = slidechangetransitionend.asInstanceOf[js.Any], slidechangetransitionstart = slidechangetransitionstart.asInstanceOf[js.Any], slidenexttransitionend = slidenexttransitionend.asInstanceOf[js.Any], slidenexttransitionstart = slidenexttransitionstart.asInstanceOf[js.Any], slideprevtransitionend = slideprevtransitionend.asInstanceOf[js.Any], slideprevtransitionstart = slideprevtransitionstart.asInstanceOf[js.Any], slideresettransitionend = slideresettransitionend.asInstanceOf[js.Any], slideresettransitionstart = slideresettransitionstart.asInstanceOf[js.Any], sliderfirstmove = sliderfirstmove.asInstanceOf[js.Any], slidermove = slidermove.asInstanceOf[js.Any], slidesgridlengthchange = slidesgridlengthchange.asInstanceOf[js.Any], slideslengthchange = slideslengthchange.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], snapgridlengthchange = snapgridlengthchange.asInstanceOf[js.Any], snapindexchange = snapindexchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toedge = toedge.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchmoveopposite = touchmoveopposite.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomchange = zoomchange.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwiperContainerEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperContainerEventMap] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: UIEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setActiveindexchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "activeindexchange", value.asInstanceOf[js.Any])
      
      inline def setAfterinit(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "afterinit", value.asInstanceOf[js.Any])
      
      inline def setAnimationcancel(value: AnimationEvent): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      inline def setAnimationend(value: AnimationEvent): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationiteration(value: AnimationEvent): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationstart(value: AnimationEvent): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setAutoplay(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplaypause(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "autoplaypause", value.asInstanceOf[js.Any])
      
      inline def setAutoplayresume(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "autoplayresume", value.asInstanceOf[js.Any])
      
      inline def setAutoplaystart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "autoplaystart", value.asInstanceOf[js.Any])
      
      inline def setAutoplaystop(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "autoplaystop", value.asInstanceOf[js.Any])
      
      inline def setAutoplaytimeleft(value: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* timeLeft */ Double, /* percentage */ Double]]): Self = StObject.set(x, "autoplaytimeleft", value.asInstanceOf[js.Any])
      
      inline def setAuxclick(value: MouseEvent): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      inline def setBeforedestroy(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "beforedestroy", value.asInstanceOf[js.Any])
      
      inline def setBeforeinit(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "beforeinit", value.asInstanceOf[js.Any])
      
      inline def setBeforeinput(value: InputEvent): Self = StObject.set(x, "beforeinput", value.asInstanceOf[js.Any])
      
      inline def setBeforeloopfix(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "beforeloopfix", value.asInstanceOf[js.Any])
      
      inline def setBeforeresize(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "beforeresize", value.asInstanceOf[js.Any])
      
      inline def setBeforeslidechangestart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "beforeslidechangestart", value.asInstanceOf[js.Any])
      
      inline def setBeforetransitionstart(value: CustomEvent[js.Tuple3[/* swiper */ Swiper, /* speed */ Double, /* internal */ Any]]): Self = StObject.set(x, "beforetransitionstart", value.asInstanceOf[js.Any])
      
      inline def setBlur(value: FocusEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBreakpoint(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* breakpointParams */ SwiperOptions]]): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Event): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCanplay(value: Event): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      inline def setCanplaythrough(value: Event): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangedirection(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "changedirection", value.asInstanceOf[js.Any])
      
      inline def setClick(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCompositionend(value: CompositionEvent): Self = StObject.set(x, "compositionend", value.asInstanceOf[js.Any])
      
      inline def setCompositionstart(value: CompositionEvent): Self = StObject.set(x, "compositionstart", value.asInstanceOf[js.Any])
      
      inline def setCompositionupdate(value: CompositionEvent): Self = StObject.set(x, "compositionupdate", value.asInstanceOf[js.Any])
      
      inline def setContextmenu(value: MouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: ClipboardEvent): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCuechange(value: Event): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      inline def setCut(value: ClipboardEvent): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: MouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDoubleclick(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "doubleclick", value.asInstanceOf[js.Any])
      
      inline def setDoubletap(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
      
      inline def setDrag(value: DragEvent): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragend(value: DragEvent): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragenter(value: DragEvent): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      inline def setDragleave(value: DragEvent): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      inline def setDragover(value: DragEvent): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      inline def setDragstart(value: DragEvent): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setDrop(value: DragEvent): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDurationchange(value: Event): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      inline def setEmptied(value: Event): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: FocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusin(value: FocusEvent): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      inline def setFocusout(value: FocusEvent): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      inline def setFormdata(value: FormDataEvent): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
      
      inline def setFromedge(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "fromedge", value.asInstanceOf[js.Any])
      
      inline def setFullscreenchange(value: Event): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setFullscreenerror(value: Event): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setGotpointercapture(value: PointerEvent): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setHashchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
      
      inline def setHashset(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "hashset", value.asInstanceOf[js.Any])
      
      inline def setInit(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Event): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Event): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setKeydown(value: KeyboardEvent): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      inline def setKeypress(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* keyCode */ String]]): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setKeyup(value: KeyboardEvent): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: Event): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadeddata(value: Event): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      inline def setLoadedmetadata(value: Event): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setLoadstart(value: Event): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      inline def setLock(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLoopfix(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "loopfix", value.asInstanceOf[js.Any])
      
      inline def setLostpointercapture(value: PointerEvent): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setMomentumbounce(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "momentumbounce", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: MouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMouseenter(value: MouseEvent): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseleave(value: MouseEvent): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: MouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: MouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: MouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: MouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setNavigationhide(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "navigationhide", value.asInstanceOf[js.Any])
      
      inline def setNavigationnext(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "navigationnext", value.asInstanceOf[js.Any])
      
      inline def setNavigationprev(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "navigationprev", value.asInstanceOf[js.Any])
      
      inline def setNavigationshow(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "navigationshow", value.asInstanceOf[js.Any])
      
      inline def setObserverupdate(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "observerupdate", value.asInstanceOf[js.Any])
      
      inline def setOrientationchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
      
      inline def setPaginationhide(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "paginationhide", value.asInstanceOf[js.Any])
      
      inline def setPaginationrender(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]]): Self = StObject.set(x, "paginationrender", value.asInstanceOf[js.Any])
      
      inline def setPaginationshow(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "paginationshow", value.asInstanceOf[js.Any])
      
      inline def setPaginationupdate(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* paginationEl */ HTMLElement]]): Self = StObject.set(x, "paginationupdate", value.asInstanceOf[js.Any])
      
      inline def setPaste(value: ClipboardEvent): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPause(value: Event): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: Event): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlaying(value: Event): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPointercancel(value: PointerEvent): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointerdown(value: PointerEvent): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerenter(value: PointerEvent): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerleave(value: PointerEvent): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointermove(value: PointerEvent): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointerout(value: PointerEvent): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointerover(value: PointerEvent): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointerup(value: PointerEvent): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* progress */ Double]]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRatechange(value: Event): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      inline def setReachbeginning(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "reachbeginning", value.asInstanceOf[js.Any])
      
      inline def setReachend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "reachend", value.asInstanceOf[js.Any])
      
      inline def setRealindexchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "realindexchange", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Event): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResize(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ WheelEvent]]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollbardragend(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "scrollbardragend", value.asInstanceOf[js.Any])
      
      inline def setScrollbardragmove(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "scrollbardragmove", value.asInstanceOf[js.Any])
      
      inline def setScrollbardragstart(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "scrollbardragstart", value.asInstanceOf[js.Any])
      
      inline def setSecuritypolicyviolation(value: SecurityPolicyViolationEvent): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setSeeked(value: Event): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      inline def setSeeking(value: Event): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Event): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectionchange(value: Event): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      inline def setSelectstart(value: Event): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      inline def setSettransition(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* transition */ Double]]): Self = StObject.set(x, "settransition", value.asInstanceOf[js.Any])
      
      inline def setSettranslate(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* translate */ Double]]): Self = StObject.set(x, "settranslate", value.asInstanceOf[js.Any])
      
      inline def setSlidechange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidechange", value.asInstanceOf[js.Any])
      
      inline def setSlidechangetransitionend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidechangetransitionend", value.asInstanceOf[js.Any])
      
      inline def setSlidechangetransitionstart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidechangetransitionstart", value.asInstanceOf[js.Any])
      
      inline def setSlidenexttransitionend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidenexttransitionend", value.asInstanceOf[js.Any])
      
      inline def setSlidenexttransitionstart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidenexttransitionstart", value.asInstanceOf[js.Any])
      
      inline def setSlideprevtransitionend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slideprevtransitionend", value.asInstanceOf[js.Any])
      
      inline def setSlideprevtransitionstart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slideprevtransitionstart", value.asInstanceOf[js.Any])
      
      inline def setSlideresettransitionend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slideresettransitionend", value.asInstanceOf[js.Any])
      
      inline def setSlideresettransitionstart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slideresettransitionstart", value.asInstanceOf[js.Any])
      
      inline def setSliderfirstmove(value: CustomEvent[js.Tuple2[/* swiper */ Swiper, /* event */ TouchEvent]]): Self = StObject.set(x, "sliderfirstmove", value.asInstanceOf[js.Any])
      
      inline def setSlidermove(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "slidermove", value.asInstanceOf[js.Any])
      
      inline def setSlidesgridlengthchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slidesgridlengthchange", value.asInstanceOf[js.Any])
      
      inline def setSlideslengthchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "slideslengthchange", value.asInstanceOf[js.Any])
      
      inline def setSlotchange(value: Event): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
      
      inline def setSnapgridlengthchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "snapgridlengthchange", value.asInstanceOf[js.Any])
      
      inline def setSnapindexchange(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "snapindexchange", value.asInstanceOf[js.Any])
      
      inline def setStalled(value: Event): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      inline def setSubmit(value: SubmitEvent): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSuspend(value: Event): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setTap(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTimeupdate(value: Event): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      inline def setToedge(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "toedge", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: Event): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setTouchcancel(value: TouchEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchend(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchmoveopposite(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "touchmoveopposite", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(
        value: CustomEvent[
              js.Tuple2[/* swiper */ Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent]
            ]
      ): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTransitioncancel(value: TransitionEvent): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      inline def setTransitionend(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      inline def setTransitionrun(value: TransitionEvent): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      inline def setTransitionstart(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      inline def setUnlock(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: CustomEvent[js.Array[/* swiper */ Swiper]]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setVolumechange(value: Event): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Event): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationend(value: Event): Self = StObject.set(x, "webkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationiteration(value: Event): Self = StObject.set(x, "webkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationstart(value: Event): Self = StObject.set(x, "webkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setWebkittransitionend(value: Event): Self = StObject.set(x, "webkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: WheelEvent): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setZoomchange(
        value: CustomEvent[
              js.Tuple4[
                /* swiper */ Swiper, 
                /* scale */ Double, 
                /* imageEl */ HTMLElement, 
                /* slideEl */ HTMLElement
              ]
            ]
      ): Self = StObject.set(x, "zoomchange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwiperSlide
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var `lazy`: String | Boolean = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
