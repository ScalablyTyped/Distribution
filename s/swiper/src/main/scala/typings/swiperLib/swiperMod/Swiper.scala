package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swiper extends js.Object {
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
  var a11y: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.A11y] = js.native
  /**
    * Index number of currently active slide.
    *
    * @note Note, that in loop mode active index value will be always shifted
    * on a number of looped/duplicated slides.
    */
  var activeIndex: scala.Double = js.native
  /**
    * Disable/enable ability to slide to the next slides by assigning false/true to this property
    *
    * @default true
    */
  var allowSlideNext: scala.Boolean = js.native
  /**
    * Disable/enable ability to slide to the previous slides by assigning false/true to this property
    *
    * @default true
    */
  var allowSlidePrev: scala.Boolean = js.native
  /**
    * Disable/enable ability move slider by grabbing it with
    * mouse or by touching it with finger (on touch screens)
    * by assigning false/true to this property
    *
    * @default true
    */
  var allowTouchMove: scala.Boolean = js.native
  /**
    * true if swiper is in transition
    */
  var animating: scala.Boolean = js.native
  /**
    * Swiper Autoplay module.
    */
  var autoplay: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Autoplay] = js.native
  /**
    * Set it to true (by default it is true) and all
    * custom styles will be removed from slides,
    * wrapper and container. Useful if you need to
    * destroy Swiper and to init again with new
    * options or in different direction
    */
  var cleanStyles: scala.Boolean = js.native
  /**
    * Index number of last clicked slide
    */
  var clickedIdex: scala.Double = js.native
  /**
    * Link to last clicked slide (HTMLElement)
    */
  var clickedSlide: stdLib.HTMLElement = js.native
  /**
    * Swiper Controller module.
    */
  var controller: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Controller] = js.native
  /**
    * Swiper CoverflowEffect module.
    */
  var coverflowEffect: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.EffectCoverflow] = js.native
  /**
    * Swiper CubeEffect module.
    */
  var cubeEffect: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.EffectCube] = js.native
  /**
    * Set it to false (by default it is true) to not to delete Swiper instance
    */
  var deleteInstance: scala.Boolean = js.native
  /**
    * Element with slider container.
    */
  var el: stdLib.HTMLElement = js.native
  /**
    * Swiper FadeEffect module.
    */
  var fadeEffect: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.EffectFade] = js.native
  /**
    * Swiper FlipEffect module.
    */
  var flipEffect: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.EffectFlip] = js.native
  /**
    * Swiper HashNavigation module.
    */
  var hashNavigation: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.HashNavigation] = js.native
  /**
    * Height of container
    */
  var height: scala.Double = js.native
  /**
    * Swiper History module.
    */
  var history: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.History] = js.native
  /**
    * true if slider on most "left"/"top" position
    */
  var isBeginning: swiperLib.swiperLibNumbers.`true` = js.native
  /**
    * true if slider on most "right"/"bottom" position
    */
  var isEnd: scala.Boolean = js.native
  /**
    * Swiper Keyboard module.
    */
  var keyboard: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Keyboard] = js.native
  /**
    * Swiper Lazy module.
    */
  var `lazy`: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Lazy] = js.native
  /**
    * Swiper Mousewheel module.
    */
  var mousewheel: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Mousewheel] = js.native
  // Components
  /**
    * Swiper Navigation module.
    */
  var navigation: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Navigation] = js.native
  /**
    * Swiper Pagination module.
    */
  var pagination: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Pagination] = js.native
  /**
    * Swiper Parallax module.
    */
  var parallax: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Parallax] = js.native
  /**
    * Object with passed initialization parameters
    */
  var params: SwiperOptions = js.native
  /**
    * Index number of previously active slide
    */
  var previousIndex: scala.Double = js.native
  /**
    * Current progress of wrapper translate (from 0 to 1)
    */
  var progress: scala.Double = js.native
  /**
    * Index number of currently active slide considering duplicated slides in loop mode
    */
  var realIndex: scala.Double = js.native
  /**
    * Swiper Scrollbar module.
    */
  var scrollbar: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Scrollbar] = js.native
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
  var touches: swiperLib.Anon_CurrentX = js.native
  /**
    * Current value of wrapper translate
    */
  var translate: scala.Double = js.native
  /**
    * Swiper Virtual module.
    */
  var virtual: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Virtual] = js.native
  /**
    * Width of container
    */
  var width: scala.Double = js.native
  /**
    * Slider wrapper HTML element.
    */
  var wrapperEl: stdLib.HTMLElement = js.native
  /**
    * Swiper Zoom module.
    */
  var zoom: js.UndefOr[swiperLib.distJsSwiperDotEsmMod.Zoom] = js.native
  def addSlide(index: scala.Double, slides: java.lang.String): scala.Unit = js.native
  def addSlide(index: scala.Double, slides: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Add new slides to the required index. slides could be HTMLElement or HTML string with new slide or array with such slides, for example:
    *
    * @example addSlide(1, '<div class="swiper-slide">Slide 10"</div>')
    * @example addSlide(1, [
    *  '<div class="swiper-slide">Slide 10"</div>',
    *  '<div class="swiper-slide">Slide 11"</div>'
    * ]);
    */
  def addSlide(index: scala.Double, slides: stdLib.HTMLElement): scala.Unit = js.native
  def appendSlide(slides: java.lang.String): scala.Unit = js.native
  def appendSlide(slides: js.Array[java.lang.String]): scala.Unit = js.native
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
  def appendSlide(slides: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Atach all events listeners again
    */
  def attachEvents(): scala.Unit = js.native
  /**
    * Destroy slider instance and detach all events listeners, where
    */
  def destroy(deleteInstance: scala.Boolean, cleanupStyles: scala.Boolean): scala.Unit = js.native
  /**
    * tach all events listeners
    */
  def detachEvents(): scala.Unit = js.native
  /**
    * Disable keyboard control
    */
  def disableKeyboardControl(): scala.Unit = js.native
  /**
    * Disable mousewheel control
    */
  def disableMousewheelControl(): scala.Unit = js.native
  /**
    * Enable keyboard control
    */
  def enableKeyboardControl(): scala.Unit = js.native
  /**
    * Enable mousewheel control
    */
  def enableMousewheelControl(): scala.Unit = js.native
  /**
    * Get current value of swiper wrapper css3 transform translate
    */
  def getTranslate(): js.Any = js.native
  /**
    * Remove event listener for specified event
    * If no handler specified, removes all listeners for specified event
    */
  def off(event: SwiperEvent): scala.Unit = js.native
  def off(event: SwiperEvent, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Add event listener
    */
  def on(event: SwiperEvent, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Add event listener that will be executed only once
    */
  def once(event: SwiperEvent, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def prependSlide(slides: java.lang.String): scala.Unit = js.native
  def prependSlide(slides: js.Array[java.lang.String]): scala.Unit = js.native
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
  def prependSlide(slides: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Remove all slides
    */
  def removeAllSlides(): scala.Unit = js.native
  def removeSlide(slideIndex: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Remove selected slides. slideIndex could be a number with slide index to remove or array with indexes.
    *
    * @example removeSlide(0); // remove first slide
    * @example removeSlide([0, 1]); // remove first and second slides
    * @example removeAllSlides();	// Remove all slides
    */
  def removeSlide(slideIndex: scala.Double): scala.Unit = js.native
  /**
    * Set grab cursor
    */
  def setGrabCursor(): scala.Unit = js.native
  /**
    * Set custom css3 transform's translate value for swiper wrapper
    */
  def setTranslate(translate: js.Any): scala.Unit = js.native
  // Methods
  /**
    * Run transition to next slide.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideNext(): scala.Unit = js.native
  def slideNext(speed: scala.Double): scala.Unit = js.native
  def slideNext(speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Run transition to previous slide.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slidePrev(): scala.Unit = js.native
  def slidePrev(speed: scala.Double): scala.Unit = js.native
  def slidePrev(speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Reset swiper position to currently active slide for the duration equal to 'speed'
    * parameter.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideReset(): scala.Unit = js.native
  def slideReset(speed: scala.Double): scala.Unit = js.native
  def slideReset(speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Run transition to the slide with index number equal to 'index' parameter for the
    *  duration equal to 'speed' parameter.
    *
    * @param index Index number of slide.
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideTo(index: scala.Double): scala.Unit = js.native
  def slideTo(index: scala.Double, speed: scala.Double): scala.Unit = js.native
  def slideTo(index: scala.Double, speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Reset swiper position to closest slide/snap point for the duration equal to 'speed' parameter.
    *
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideToClosest(): scala.Unit = js.native
  def slideToClosest(speed: scala.Double): scala.Unit = js.native
  def slideToClosest(speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Does the same as .slideTo but for the case when used with enabled loop. So this
    * method will slide to slides with realIndex matching to passed index
    *
    * @param index Index number of slide.
    * @param speed Transition duration (in ms).
    * @param runCallbacks Set it to false (by default it is true) and transition will
    *  not produce transition events.
    */
  def slideToLoop(index: scala.Double): scala.Unit = js.native
  def slideToLoop(index: scala.Double, speed: scala.Double): scala.Unit = js.native
  def slideToLoop(index: scala.Double, speed: scala.Double, runCallbacks: scala.Boolean): scala.Unit = js.native
  /**
    * Unset grab cursor
    */
  def unsetGrabCursor(): scala.Unit = js.native
  /**
    * You should call it after you add/remove slides
    * manually, or after you hide/show it, or do any
    * custom DOM modifications with Swiper
    * This method also includes subcall of the following
    * methods which you can use separately:
    */
  def update(): scala.Unit = js.native
  /**
    * Force swiper to update its height (when autoHeight enabled) for the duration equal to
    * 'speed' parameter
    *
    * @param speed Transition duration (in ms).
    */
  def updateAutoHeight(): scala.Unit = js.native
  def updateAutoHeight(speed: scala.Double): scala.Unit = js.native
  /**
    * recalculate swiper progress
    */
  def updateProgress(): scala.Unit = js.native
  /**
    * recalculate size of swiper container
    */
  def updateSize(): scala.Unit = js.native
  /**
    * recalculate number of slides and their offsets. Useful after you add/remove slides with JavaScript
    */
  def updateSlides(): scala.Unit = js.native
  /**
    * update active/prev/next classes on slides and bullets
    */
  def updateSlidesClasses(): scala.Unit = js.native
}

