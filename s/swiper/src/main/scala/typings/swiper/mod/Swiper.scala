package typings.swiper.mod

import typings.std.HTMLElement
import typings.swiper.anon.CurrentX
import typings.swiper.swiperBooleans.`true`
import typings.swiper.swiperEsmMod.A11y
import typings.swiper.swiperEsmMod.Autoplay
import typings.swiper.swiperEsmMod.Controller
import typings.swiper.swiperEsmMod.EffectCoverflow
import typings.swiper.swiperEsmMod.EffectCube
import typings.swiper.swiperEsmMod.EffectFade
import typings.swiper.swiperEsmMod.EffectFlip
import typings.swiper.swiperEsmMod.HashNavigation
import typings.swiper.swiperEsmMod.History
import typings.swiper.swiperEsmMod.Keyboard
import typings.swiper.swiperEsmMod.Lazy
import typings.swiper.swiperEsmMod.Mousewheel
import typings.swiper.swiperEsmMod.Navigation
import typings.swiper.swiperEsmMod.Pagination
import typings.swiper.swiperEsmMod.Parallax
import typings.swiper.swiperEsmMod.Scrollbar
import typings.swiper.swiperEsmMod.Virtual
import typings.swiper.swiperEsmMod.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swiper extends StObject {
  
  /**
    * Dom7 element with slider container HTML element. To get vanilla HTMLElement use el
    */
  @JSName("$el")
  var $el: DOM7Element = js.native
  
  /**
    * Dom7 element with slider wrapper HTML element. To get vanilla HTMLElement use wrapperEl
    */
  @JSName("$wrapperEl")
  var $wrapperEl: DOM7Element = js.native
  
  /**
    * Swiper A11y module.
    */
  var a11y: js.UndefOr[A11y] = js.native
  
  /**
    * Index number of currently active slide.
    *
    * @note Note, that in loop mode active index value will be always shifted
    * on a number of looped/duplicated slides.
    */
  var activeIndex: Double = js.native
  
  def addSlide(index: Double, slides: String): Unit = js.native
  def addSlide(index: Double, slides: js.Array[String]): Unit = js.native
  /**
    * Add new slides to the required index. slides could be HTMLElement or HTML string with new slide or array with such slides, for example:
    *
    * @example addSlide(1, '<div class="swiper-slide">Slide 10"</div>')
    * @example addSlide(1, [
    *  '<div class="swiper-slide">Slide 10"</div>',
    *  '<div class="swiper-slide">Slide 11"</div>'
    * ]);
    */
  def addSlide(index: Double, slides: HTMLElement): Unit = js.native
  
  /**
    * Disable/enable ability to slide to the next slides by assigning false/true to this property
    *
    * @default true
    */
  var allowSlideNext: Boolean = js.native
  
  /**
    * Disable/enable ability to slide to the previous slides by assigning false/true to this property
    *
    * @default true
    */
  var allowSlidePrev: Boolean = js.native
  
  /**
    * Disable/enable ability move slider by grabbing it with
    * mouse or by touching it with finger (on touch screens)
    * by assigning false/true to this property
    *
    * @default true
    */
  var allowTouchMove: Boolean = js.native
  
  /**
    * true if swiper is in transition
    */
  var animating: Boolean = js.native
  
  def appendSlide(slides: String): Unit = js.native
  def appendSlide(slides: js.Array[String]): Unit = js.native
  /**
    * Add new slides to the end. slides could be
    * HTMLElement or HTML string with new slide or
    * array with such slides, for example:
    *
    * @example appendSlide('<div class="swiper-slide">Slide 10"</div>')
    * @example
    * appendSlide([
    *  '<div class="swiper-slide">Slide 10"</div>',
    *  '<div class="swiper-slide">Slide 11"</div>'
    * ]);
    */
  def appendSlide(slides: HTMLElement): Unit = js.native
  
  /**
    * Atach all events listeners again
    */
  def attachEvents(): Unit = js.native
  
  /**
    * Swiper Autoplay module.
    */
  var autoplay: js.UndefOr[Autoplay] = js.native
  
  /**
    * Set it to true (by default it is true) and all
    * custom styles will be removed from slides,
    * wrapper and container. Useful if you need to
    * destroy Swiper and to init again with new
    * options or in different direction
    */
  var cleanStyles: Boolean = js.native
  
  /**
    * Index number of last clicked slide
    */
  var clickedIndex: Double = js.native
  
  /**
    * Link to last clicked slide (HTMLElement)
    */
  var clickedSlide: HTMLElement = js.native
  
  /**
    * Swiper Controller module.
    */
  var controller: js.UndefOr[Controller] = js.native
  
  /**
    * Swiper CoverflowEffect module.
    */
  var coverflowEffect: js.UndefOr[EffectCoverflow] = js.native
  
  /**
    * Swiper CubeEffect module.
    */
  var cubeEffect: js.UndefOr[EffectCube] = js.native
  
  /**
    * Set it to false (by default it is true) to not to delete Swiper instance
    */
  var deleteInstance: Boolean = js.native
  
  /**
    * Destroy slider instance and detach all events listeners, where
    */
  def destroy(deleteInstance: Boolean, cleanupStyles: Boolean): Unit = js.native
  
  /**
    * tach all events listeners
    */
  def detachEvents(): Unit = js.native
  
  /**
    * Disable keyboard control
    */
  def disableKeyboardControl(): Unit = js.native
  
  /**
    * Disable mousewheel control
    */
  def disableMousewheelControl(): Unit = js.native
  
  /**
    * Element with slider container.
    */
  var el: HTMLElement = js.native
  
  /**
    * Enable keyboard control
    */
  def enableKeyboardControl(): Unit = js.native
  
  /**
    * Enable mousewheel control
    */
  def enableMousewheelControl(): Unit = js.native
  
  /**
    * Swiper FadeEffect module.
    */
  var fadeEffect: js.UndefOr[EffectFade] = js.native
  
  /**
    * Swiper FlipEffect module.
    */
  var flipEffect: js.UndefOr[EffectFlip] = js.native
  
  /**
    * Get current value of swiper wrapper css3 transform translate
    */
  def getTranslate(): js.Any = js.native
  
  /**
    * Swiper HashNavigation module.
    */
  var hashNavigation: js.UndefOr[HashNavigation] = js.native
  
  /**
    * Height of container
    */
  var height: Double = js.native
  
  /**
    * Swiper History module.
    */
  var history: js.UndefOr[History] = js.native
  
  /**
    * true if slider on most "left"/"top" position
    */
  var isBeginning: `true` = js.native
  
  /**
    * true if slider on most "right"/"bottom" position
    */
  var isEnd: Boolean = js.native
  
  /**
    * Swiper Keyboard module.
    */
  var keyboard: js.UndefOr[Keyboard] = js.native
  
  /**
    * Swiper Lazy module.
    */
  var `lazy`: js.UndefOr[Lazy] = js.native
  
  /**
    * Swiper Mousewheel module.
    */
  var mousewheel: js.UndefOr[Mousewheel] = js.native
  
  // Components
  /**
    * Swiper Navigation module.
    */
  var navigation: js.UndefOr[Navigation] = js.native
  
  /**
    * Remove event listener for specified event
    * If no handler specified, removes all listeners for specified event
    */
  def off(event: SwiperEvent): Unit = js.native
  def off(event: SwiperEvent, handler: js.Function0[Unit]): Unit = js.native
  
  /**
    * Add event listener
    */
  def on(event: SwiperEvent, handler: js.Function0[Unit]): Unit = js.native
  
  /**
    * Add event listener that will be executed only once
    */
  def once(event: SwiperEvent, handler: js.Function0[Unit]): Unit = js.native
  
  /**
    * Swiper Pagination module.
    */
  var pagination: js.UndefOr[Pagination] = js.native
  
  /**
    * Swiper Parallax module.
    */
  var parallax: js.UndefOr[Parallax] = js.native
  
  /**
    * Object with passed initialization parameters
    */
  var params: SwiperOptions = js.native
  
  def prependSlide(slides: String): Unit = js.native
  def prependSlide(slides: js.Array[String]): Unit = js.native
  /**
    * Add new slides to the beginning. slides could be
    * HTMLElement or HTML string with new slide or array with such slides, for example:
    *
    * @example prependSlide('<div class="swiper-slide">Slide 0"</div>')
    * @example prependSlide([
    *  '<div class="swiper-slide">Slide 1"</div>',
    *  '<div class="swiper-slide">Slide 2"</div>'
    * ]);
    */
  def prependSlide(slides: HTMLElement): Unit = js.native
  
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
    * Remove all slides
    */
  def removeAllSlides(): Unit = js.native
  
  def removeSlide(slideIndex: js.Array[Double]): Unit = js.native
  /**
    * Remove selected slides. slideIndex could be a number with slide index to remove or array with indexes.
    *
    * @example removeSlide(0); // remove first slide
    * @example removeSlide([0, 1]); // remove first and second slides
    * @example removeAllSlides();    // Remove all slides
    */
  def removeSlide(slideIndex: Double): Unit = js.native
  
  /**
    * Swiper Scrollbar module.
    */
  var scrollbar: js.UndefOr[Scrollbar] = js.native
  
  /**
    * Set grab cursor
    */
  def setGrabCursor(): Unit = js.native
  
  /**
    * Set custom css3 transform's translate value for swiper wrapper
    */
  def setTranslate(translate: js.Any): Unit = js.native
  
  // Methods
  /**
    * Run transition to next slide.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideNext(): Unit = js.native
  def slideNext(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slideNext(speed: Double): Unit = js.native
  def slideNext(speed: Double, runCallbacks: Boolean): Unit = js.native
  
  /**
    * Run transition to previous slide.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slidePrev(): Unit = js.native
  def slidePrev(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slidePrev(speed: Double): Unit = js.native
  def slidePrev(speed: Double, runCallbacks: Boolean): Unit = js.native
  
  /**
    * Reset swiper position to currently active slide for the duration equal to 'speed'
    * parameter.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideReset(): Unit = js.native
  def slideReset(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slideReset(speed: Double): Unit = js.native
  def slideReset(speed: Double, runCallbacks: Boolean): Unit = js.native
  
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
  def slideTo(index: Double, speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slideTo(index: Double, speed: Double): Unit = js.native
  def slideTo(index: Double, speed: Double, runCallbacks: Boolean): Unit = js.native
  
  /**
    * Reset swiper position to closest slide/snap point for the duration equal to 'speed' parameter.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideToClosest(): Unit = js.native
  def slideToClosest(speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slideToClosest(speed: Double): Unit = js.native
  def slideToClosest(speed: Double, runCallbacks: Boolean): Unit = js.native
  
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
  def slideToLoop(index: Double, speed: js.UndefOr[scala.Nothing], runCallbacks: Boolean): Unit = js.native
  def slideToLoop(index: Double, speed: Double): Unit = js.native
  def slideToLoop(index: Double, speed: Double, runCallbacks: Boolean): Unit = js.native
  
  /**
    * Dom7 array-like collection of slides HTML elements. To get specific slide HTMLElement use slides[1]
    */
  var slides: js.Array[DOM7Element] = js.native
  
  /**
    * Swiper Thumbs module.
    */
  var thumbs: js.UndefOr[js.Object] = js.native
  
  /**
    * Object with the following touch event properties:
    */
  var touches: CurrentX = js.native
  
  /**
    * Current value of wrapper translate
    */
  var translate: Double = js.native
  
  /**
    * Animate custom css3 transform's translate value for swiper wrapper
    */
  def translateTo(translate: Double, speed: Double): js.Any = js.native
  def translateTo(
    translate: Double,
    speed: Double,
    runCallbacks: js.UndefOr[scala.Nothing],
    translateBounds: Boolean
  ): js.Any = js.native
  def translateTo(translate: Double, speed: Double, runCallbacks: Boolean): js.Any = js.native
  def translateTo(translate: Double, speed: Double, runCallbacks: Boolean, translateBounds: Boolean): js.Any = js.native
  
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
  
  /**
    * Swiper Virtual module.
    */
  var virtual: js.UndefOr[Virtual] = js.native
  
  /**
    * Width of container
    */
  var width: Double = js.native
  
  /**
    * Slider wrapper HTML element.
    */
  var wrapperEl: HTMLElement = js.native
  
  /**
    * Swiper Zoom module.
    */
  var zoom: js.UndefOr[Zoom] = js.native
}
