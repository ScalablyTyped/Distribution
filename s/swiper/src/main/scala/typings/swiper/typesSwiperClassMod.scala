package typings.swiper

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.dom7.mod.Dom7Array
import typings.std.HTMLElement
import typings.swiper.anon.CurrentX
import typings.swiper.swiperStrings.horizontal
import typings.swiper.swiperStrings.ltr
import typings.swiper.swiperStrings.rtl
import typings.swiper.swiperStrings.vertical
import typings.swiper.typesModulesA11yMod.A11yMethods
import typings.swiper.typesModulesAutoplayMod.AutoplayMethods
import typings.swiper.typesModulesControllerMod.ControllerMethods
import typings.swiper.typesModulesEffectCardsMod.CardsEffectMethods
import typings.swiper.typesModulesEffectCoverflowMod.CoverflowEffectMethods
import typings.swiper.typesModulesEffectCreativeMod.CreativeEffectMethods
import typings.swiper.typesModulesEffectCubeMod.CubeEffectMethods
import typings.swiper.typesModulesEffectFadeMod.FadeEffectMethods
import typings.swiper.typesModulesEffectFlipMod.FlipEffectMethods
import typings.swiper.typesModulesFreeModeMod.FreeModeMethods
import typings.swiper.typesModulesHashNavigationMod.HashNavigationMethods
import typings.swiper.typesModulesHistoryMod.HistoryMethods
import typings.swiper.typesModulesKeyboardMod.KeyboardMethods
import typings.swiper.typesModulesLazyMod.LazyMethods
import typings.swiper.typesModulesManipulationMod.ManipulationMethods
import typings.swiper.typesModulesMousewheelMod.MousewheelMethods
import typings.swiper.typesModulesNavigationMod.NavigationMethods
import typings.swiper.typesModulesPaginationMod.PaginationMethods
import typings.swiper.typesModulesParallaxMod.ParallaxMethods
import typings.swiper.typesModulesScrollbarMod.ScrollbarMethods
import typings.swiper.typesModulesThumbsMod.ThumbsMethods
import typings.swiper.typesModulesVirtualMod.VirtualMethods
import typings.swiper.typesModulesZoomMod.ZoomMethods
import typings.swiper.typesSharedMod.CSSSelector
import typings.swiper.typesSharedMod.SwiperModule
import typings.swiper.typesSwiperEventsMod.SwiperEvents
import typings.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSwiperClassMod {
  
  @JSImport("swiper/types/swiper-class", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Swiper {
    def this(container: HTMLElement) = this()
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: CSSSelector) = this()
    def this(container: HTMLElement, options: SwiperOptions) = this()
    def this(container: CSSSelector, options: SwiperOptions) = this()
  }
  object default {
    
    @JSImport("swiper/types/swiper-class", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Swiper default options
      */
    /* static member */
    @JSImport("swiper/types/swiper-class", "default.defaults")
    @js.native
    def defaults: SwiperOptions = js.native
    inline def defaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /**
      * Extend global Swiper defaults
      */
    /* static member */
    inline def extendDefaults(options: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Object with global Swiper extended options
      */
    /* static member */
    @JSImport("swiper/types/swiper-class", "default.extendedDefaults")
    @js.native
    def extendedDefaults: SwiperOptions = js.native
    inline def extendedDefaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedDefaults")(x.asInstanceOf[js.Any])
    
    /**
      * Installs modules on Swiper in runtime.
      */
    /* static member */
    inline def use(modules: js.Array[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait Swiper
    extends StObject
       with SwiperClass[SwiperEvents]
       with ManipulationMethods {
    
    /**
      * Dom7 element with slider container HTML element. To get vanilla HTMLElement use `swiper.el`
      */
    @JSName("$el")
    var $el: Dom7Array = js.native
    
    /**
      * Dom7 element with slider wrapper HTML element. To get vanilla HTMLElement use `swiper.wrapperEl`
      */
    @JSName("$wrapperEl")
    var $wrapperEl: Dom7Array = js.native
    
    var a11y: A11yMethods = js.native
    
    /**
      * Index number of currently active slide
      *
      * @note Note, that in loop mode active index value will be always shifted on a number of looped/duplicated slides
      */
    var activeIndex: Double = js.native
    
    /**
      * Disable / enable ability to slide to the next slides by assigning `false` / `true` to this property
      */
    var allowSlideNext: Boolean = js.native
    
    /**
      * Disable / enable ability to slide to the previous slides by assigning `false` / `true` to this property
      */
    var allowSlidePrev: Boolean = js.native
    
    /**
      * Disable / enable ability move slider by grabbing it with mouse or by touching it with finger (on touch screens) by assigning `false` / `true` to this property
      */
    var allowTouchMove: Boolean = js.native
    
    /**
      * `true` if swiper is in transition
      */
    var animating: Boolean = js.native
    
    /**
      * Attach all events listeners again
      */
    def attachEvents(): Unit = js.native
    
    var autoplay: AutoplayMethods = js.native
    
    var cardsEffect: CardsEffectMethods = js.native
    
    /**
      * Changes slider direction from horizontal to vertical and back.
      *
      * @param direction New direction. If not specified, then will automatically changed to opposite direction
      * @param needUpdate Will call swiper.update(). Default true
      */
    def changeDirection(): Unit = js.native
    def changeDirection(direction: horizontal | vertical): Unit = js.native
    def changeDirection(direction: horizontal | vertical, needUpdate: Boolean): Unit = js.native
    def changeDirection(direction: Unit, needUpdate: Boolean): Unit = js.native
    
    /**
      * Changes slider language
      *
      * @param direction New direction. Should be `rtl` or `ltr`
      */
    def changeLanguageDirection(direction: rtl | ltr): Unit = js.native
    
    /**
      * Index number of last clicked slide
      */
    var clickedIndex: Double = js.native
    
    /**
      * Link to last clicked slide (HTMLElement)
      */
    var clickedSlide: HTMLElement = js.native
    
    var controller: ControllerMethods = js.native
    
    var coverflowEffect: CoverflowEffectMethods = js.native
    
    var creativeEffect: CreativeEffectMethods = js.native
    
    var cubeEffect: CubeEffectMethods = js.native
    
    /**
      * !INTERNAL
      */
    var currentBreakpoint: Any = js.native
    
    /**
      * Destroy slider instance and detach all events listeners
      *
      * @param deleteInstance Set it to false (by default it is true) to not to delete Swiper instance
      * @param cleanStyles Set it to true (by default it is true) and all custom styles will be removed from slides, wrapper and container.
      * Useful if you need to destroy Swiper and to init again with new options or in different direction
      */
    def destroy(): Unit = js.native
    def destroy(deleteInstance: Boolean): Unit = js.native
    def destroy(deleteInstance: Boolean, cleanStyles: Boolean): Unit = js.native
    def destroy(deleteInstance: Unit, cleanStyles: Boolean): Unit = js.native
    
    /**
      * !INTERNAL
      */
    var destroyed: Boolean = js.native
    
    /**
      * Detach all events listeners
      */
    def detachEvents(): Unit = js.native
    
    /**
      * Disable Swiper (if it was enabled). When Swiper is disabled, it will hide all navigation elements and won't respond to any events and interactions
      *
      */
    def disable(): Unit = js.native
    
    /**
      * Slider container HTML element
      */
    var el: HTMLElement = js.native
    
    /**
      * Enable Swiper (if it was disabled)
      *
      */
    def enable(): Unit = js.native
    
    var fadeEffect: FadeEffectMethods = js.native
    
    var flipEffect: FlipEffectMethods = js.native
    
    var freeMode: FreeModeMethods = js.native
    
    /**
      * !INTERNAL
      */
    def getBreakpoint(): String = js.native
    def getBreakpoint(breakpoints: StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]): String = js.native
    
    /**
      * Get current value of swiper wrapper css3 transform translate
      */
    def getTranslate(): Any = js.native
    
    var hashNavigation: HashNavigationMethods = js.native
    
    /**
      * Height of container
      */
    var height: Double = js.native
    
    var history: HistoryMethods = js.native
    
    /**
      * Initialize slider
      */
    def init(): Swiper = js.native
    def init(el: HTMLElement): Swiper = js.native
    
    /**
      * `true` if slider on most "left"/"top" position
      */
    var isBeginning: Boolean = js.native
    
    /**
      * `true` if slider on most "right"/"bottom" position
      */
    var isEnd: Boolean = js.native
    
    /**
      * !INTERNAL
      */
    def isHorizontal(): Boolean = js.native
    
    /**
      * `true` if slide is "locked" (by `watchOverflow`) and slides can not be, e.g. when amount of slides is less that slides per view
      */
    var isLocked: Boolean = js.native
    
    var keyboard: KeyboardMethods = js.native
    
    var `lazy`: LazyMethods = js.native
    
    /**
      * !INTERNAL
      */
    def loopCreate(): Unit = js.native
    
    /**
      * !INTERNAL
      */
    def loopDestroy(): Unit = js.native
    
    /**
      * !INTERNAL
      */
    var loopedSlides: Double | Null = js.native
    
    /**
      * !INTERNAL
      */
    var modules: js.Array[SwiperModule] = js.native
    
    var mousewheel: MousewheelMethods = js.native
    
    var navigation: NavigationMethods = js.native
    
    /**
      * Remove event listener that will be fired on all events
      */
    def offAny(handler: js.Function2[/* eventName */ String, /* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * Add event listener that will be fired on all events
      */
    def onAny(handler: js.Function2[/* eventName */ String, /* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * Object with original initialization parameters
      */
    var originalParams: SwiperOptions = js.native
    
    var pagination: PaginationMethods = js.native
    
    var parallax: ParallaxMethods = js.native
    
    /**
      * Object with passed initialization parameters
      */
    var params: SwiperOptions = js.native
    
    /**
      * Index number of previously active slide
      */
    var previousIndex: Double = js.native
    
    /**
      * Current progress of wrapper translate (from 0 to 1)
      */
    var progress: Double = js.native
    
    /**
      * Index number of currently active slide considering duplicated slides in loop mode
      */
    var realIndex: Double = js.native
    
    /**
      * !INTERNAL
      */
    var rtlTranslate: Boolean = js.native
    
    var scrollbar: ScrollbarMethods = js.native
    
    /**
      * !INTERNAL
      */
    def setBreakpoint(): Unit = js.native
    
    /**
      * Set grab cursor
      */
    def setGrabCursor(): Unit = js.native
    
    /**
      * Set Swiper translate progress (from 0 to 1). Where 0 - its initial position (offset) on first slide, and 1 - its maximum position (offset) on last slide
      *
      * @param progress Swiper translate progress (from 0 to 1).
      * @param speed Transition duration (in ms).
      */
    def setProgress(progress: Double): Unit = js.native
    def setProgress(progress: Double, speed: Double): Unit = js.native
    
    /**
      * Set custom css3 transform's translate value for swiper wrapper
      */
    def setTranslate(translate: Any): Unit = js.native
    
    /**
      * Run transition to next slide.
      *
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slideNext(): Unit = js.native
    def slideNext(speed: Double): Unit = js.native
    def slideNext(speed: Double, runCallbacks: Boolean): Unit = js.native
    def slideNext(speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Run transition to previous slide.
      *
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slidePrev(): Unit = js.native
    def slidePrev(speed: Double): Unit = js.native
    def slidePrev(speed: Double, runCallbacks: Boolean): Unit = js.native
    def slidePrev(speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Reset swiper position to currently active slide for the duration equal to 'speed'
      * parameter.
      *
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slideReset(): Unit = js.native
    def slideReset(speed: Double): Unit = js.native
    def slideReset(speed: Double, runCallbacks: Boolean): Unit = js.native
    def slideReset(speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Run transition to the slide with index number equal to 'index' parameter for the
      *  duration equal to 'speed' parameter.
      *
      * @param index Index number of slide.
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slideTo(index: Double): Unit = js.native
    def slideTo(index: Double, speed: Double): Unit = js.native
    def slideTo(index: Double, speed: Double, runCallbacks: Boolean): Unit = js.native
    def slideTo(index: Double, speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Reset swiper position to closest slide/snap point for the duration equal to 'speed' parameter.
      *
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slideToClosest(): Unit = js.native
    def slideToClosest(speed: Double): Unit = js.native
    def slideToClosest(speed: Double, runCallbacks: Boolean): Unit = js.native
    def slideToClosest(speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Does the same as .slideTo but for the case when used with enabled loop. So this
      * method will slide to slides with realIndex matching to passed index
      *
      * @param index Index number of slide.
      * @param speed Transition duration (in ms).
      * @param runCallbacks Set it to false (by default it is true) and transition will
      *  not produce transition events.
      */
    def slideToLoop(index: Double): Unit = js.native
    def slideToLoop(index: Double, speed: Double): Unit = js.native
    def slideToLoop(index: Double, speed: Double, runCallbacks: Boolean): Unit = js.native
    def slideToLoop(index: Double, speed: Unit, runCallbacks: Boolean): Unit = js.native
    
    /**
      * Dom7 array-like collection of slides HTML elements. To get specific slide HTMLElement use `swiper.slides[1]`
      */
    var slides: Dom7Array = js.native
    
    /**
      * Slides snap grid
      */
    var snapGrid: js.Array[Double] = js.native
    
    /**
      * Index number of current snap in `snapGrid`
      */
    var snapIndex: Double = js.native
    
    var thumbs: ThumbsMethods = js.native
    
    /**
      * Object with the following touch event properties:
      *
      * - `swiper.touches.startX`
      * - `swiper.touches.startY`
      * - `swiper.touches.currentX`
      * - `swiper.touches.currentY`
      * - `swiper.touches.diff`
      */
    var touches: CurrentX = js.native
    
    /**
      * Current value of wrapper translate
      */
    var translate: Double = js.native
    
    /**
      * Animate custom css3 transform's translate value for swiper wrapper
      *
      * @param translate Translate value (in px)
      * @param speed Transition duration (in ms)
      * @param runCallbacks Set it to false (by default it is true) and transition will not produce  transition events
      * @param translateBounds Set it to false (by default it is true) and transition value can extend beyond min and max translate
      *
      */
    def translateTo(translate: Double, speed: Double): Any = js.native
    def translateTo(translate: Double, speed: Double, runCallbacks: Boolean): Any = js.native
    def translateTo(translate: Double, speed: Double, runCallbacks: Boolean, translateBounds: Boolean): Any = js.native
    def translateTo(translate: Double, speed: Double, runCallbacks: Unit, translateBounds: Boolean): Any = js.native
    
    /**
      * Unset grab cursor
      */
    def unsetGrabCursor(): Unit = js.native
    
    /**
      * You should call it after you add/remove slides
      * manually, or after you hide/show it, or do any
      * custom DOM modifications with Swiper
      * This method also includes subcall of the following
      * methods which you can use separately:
      */
    def update(): Unit = js.native
    
    /**
      * Force swiper to update its height (when autoHeight enabled) for the duration equal to
      * 'speed' parameter
      *
      * @param speed Transition duration (in ms).
      */
    def updateAutoHeight(): Unit = js.native
    def updateAutoHeight(speed: Double): Unit = js.native
    
    /**
      * recalculate swiper progress
      */
    def updateProgress(): Unit = js.native
    
    /**
      * recalculate size of swiper container
      */
    def updateSize(): Unit = js.native
    
    /**
      * recalculate number of slides and their offsets. Useful after you add/remove slides with JavaScript
      */
    def updateSlides(): Unit = js.native
    
    /**
      * update active/prev/next classes on slides and bullets
      */
    def updateSlidesClasses(): Unit = js.native
    
    var virtual: VirtualMethods = js.native
    
    /**
      * Width of container
      */
    var width: Double = js.native
    
    /**
      * Wrapper HTML element
      */
    var wrapperEl: HTMLElement = js.native
    
    var zoom: ZoomMethods = js.native
  }
  
  @js.native
  trait SwiperClass[Events] extends StObject {
    
    /** Fire event on instance */
    def emit[E /* <: /* keyof Events */ String */](event: E, args: Any*): Unit = js.native
    
    /** Remove all handlers for specified event */
    def off[E /* <: /* keyof Events */ String */](event: E): Unit = js.native
    /** Remove event handler */
    def off[E /* <: /* keyof Events */ String */](
      event: E,
      handler: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): Unit = js.native
    
    /** Add event handler */
    def on[E /* <: /* keyof Events */ String */](
      event: E,
      handler: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): Unit = js.native
    
    /** Add event handler that will be removed after it was fired */
    def once[E /* <: /* keyof Events */ String */](
      event: E,
      handler: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): Unit = js.native
  }
}
