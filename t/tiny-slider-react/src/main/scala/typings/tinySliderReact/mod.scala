package typings.tinySliderReact

import org.scalablytyped.runtime.NumberDictionary
import typings.react.mod.Component
import typings.std.Event
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.tinySliderReact.tinySliderReactBooleans.`false`
import typings.tinySliderReact.tinySliderReactStrings.backward
import typings.tinySliderReact.tinySliderReactStrings.carousel
import typings.tinySliderReact.tinySliderReactStrings.forward
import typings.tinySliderReact.tinySliderReactStrings.gallery
import typings.tinySliderReact.tinySliderReactStrings.horizontal
import typings.tinySliderReact.tinySliderReactStrings.inner
import typings.tinySliderReact.tinySliderReactStrings.outer
import typings.tinySliderReact.tinySliderReactStrings.page
import typings.tinySliderReact.tinySliderReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  class default ()
    extends Component[TinySliderProps, js.Object, js.Any]
  
  trait CommonOptions extends StObject {
    
    /**
      * Allows using arrow keys to switch slides.
      * @defaultValue false
      */
    var arrowKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of slider container changes according to each slide"s height.
      * @defaultValue false
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the automatic change of slides
      * @defaultValue false
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stops sliding on mouseover.
      * @defaultValue false
      */
    var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pauses the sliding when the page is invisiable and resumes it when the page become visiable again
      * @defaultValue true
      */
    var autoplayResetOnVisibility: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text or markup in the autoplay start/stop button.
      * @defaultValue ["start", "stop"]
      */
    var autoplayText: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Time between 2 autoplay slides change (in "ms").
      * @defaultValue 5000
      */
    var autoplayTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the display and functionalities of controls components (prev/next buttons). If true, display the controls and add all functionalities.
      * @defaultValue true
      */
    var controls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text or markup in the prev/next buttons
      * @defaultValue ["prev", "next"]
      */
    var controlsText: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Disable slider.
      * @defaultValue false
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Space on the outside (in "px").
      * @defaultValue 0
      */
    var edgePadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls width attribute of the slides.
      * @defaultValue false
      */
    var fixedWidth: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Space between slides (in "px").
      * @defaultValue 0
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of slides being displayed in the viewport.
      * @defaultValue 1
      */
    var items: js.UndefOr[Double] = js.undefined
    
    /**
      * Changing slides by dragging them.
      * @defaultValue false
      */
    var mouseDrag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the display and functionalities of nav components (dots). If true, display the nav and add all functionalities.
      * @defaultValue true
      */
    var nav: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of slides going on one "click".
      * @defaultValue 1
      */
    var slideBy: js.UndefOr[Double | page] = js.undefined
    
    /**
      * Speed of the slide animation (in "ms").
      * @defaultValue 300
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    /**
      * The initial index of the slider.
      * @defaultValue 0
      */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Activates input detection for touch devices.
      * @defaultValue true
      */
    var touch: js.UndefOr[Boolean] = js.undefined
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowKeys(value: Boolean): Self = StObject.set(x, "arrowKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowKeysUndefined: Self = StObject.set(x, "arrowKeys", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayHoverPauseUndefined: Self = StObject.set(x, "autoplayHoverPause", js.undefined)
      
      @scala.inline
      def setAutoplayResetOnVisibility(value: Boolean): Self = StObject.set(x, "autoplayResetOnVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayResetOnVisibilityUndefined: Self = StObject.set(x, "autoplayResetOnVisibility", js.undefined)
      
      @scala.inline
      def setAutoplayText(value: js.Array[String]): Self = StObject.set(x, "autoplayText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayTextUndefined: Self = StObject.set(x, "autoplayText", js.undefined)
      
      @scala.inline
      def setAutoplayTextVarargs(value: String*): Self = StObject.set(x, "autoplayText", js.Array(value :_*))
      
      @scala.inline
      def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayTimeoutUndefined: Self = StObject.set(x, "autoplayTimeout", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsText(value: js.Array[String]): Self = StObject.set(x, "controlsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsTextUndefined: Self = StObject.set(x, "controlsText", js.undefined)
      
      @scala.inline
      def setControlsTextVarargs(value: String*): Self = StObject.set(x, "controlsText", js.Array(value :_*))
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setEdgePadding(value: Double): Self = StObject.set(x, "edgePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgePaddingUndefined: Self = StObject.set(x, "edgePadding", js.undefined)
      
      @scala.inline
      def setFixedWidth(value: Double | `false`): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
      
      @scala.inline
      def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setSlideBy(value: Double | page): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideByUndefined: Self = StObject.set(x, "slideBy", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    }
  }
  
  type ResponsiveOptions = NumberDictionary[CommonOptions]
  
  type TinySlider = Component[TinySliderProps, js.Object, js.Any]
  
  trait TinySliderInfo extends StObject {
    
    var cloneCount: Double
    
    var container: HTMLElement
    
    var controlsContainer: js.UndefOr[Boolean] = js.undefined
    
    var hasControls: Boolean
    
    var index: Double
    
    var indexCached: Double
    
    var items: Double
    
    var navContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var navCurrentIndex: js.UndefOr[Double] = js.undefined
    
    var navCurrentIndexCached: js.UndefOr[Double] = js.undefined
    
    var navItems: js.UndefOr[HTMLCollection] = js.undefined
    
    var nextButton: js.UndefOr[HTMLElement] = js.undefined
    
    var prevButton: js.UndefOr[HTMLElement] = js.undefined
    
    var slideBy: Double
    
    var slideCount: Double
    
    var slideCountNew: Double
    
    var slideItems: HTMLCollection
    
    var visibleNavIndexes: js.UndefOr[Double] = js.undefined
    
    var visibleNavIndexesCached: js.UndefOr[Double] = js.undefined
  }
  object TinySliderInfo {
    
    @scala.inline
    def apply(
      cloneCount: Double,
      container: HTMLElement,
      hasControls: Boolean,
      index: Double,
      indexCached: Double,
      items: Double,
      slideBy: Double,
      slideCount: Double,
      slideCountNew: Double,
      slideItems: HTMLCollection
    ): TinySliderInfo = {
      val __obj = js.Dynamic.literal(cloneCount = cloneCount.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], hasControls = hasControls.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexCached = indexCached.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], slideBy = slideBy.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideCountNew = slideCountNew.asInstanceOf[js.Any], slideItems = slideItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinySliderInfo]
    }
    
    @scala.inline
    implicit class TinySliderInfoMutableBuilder[Self <: TinySliderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloneCount(value: Double): Self = StObject.set(x, "cloneCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsContainer(value: Boolean): Self = StObject.set(x, "controlsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsContainerUndefined: Self = StObject.set(x, "controlsContainer", js.undefined)
      
      @scala.inline
      def setHasControls(value: Boolean): Self = StObject.set(x, "hasControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexCached(value: Double): Self = StObject.set(x, "indexCached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainer(value: HTMLElement): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      @scala.inline
      def setNavCurrentIndex(value: Double): Self = StObject.set(x, "navCurrentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavCurrentIndexCached(value: Double): Self = StObject.set(x, "navCurrentIndexCached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavCurrentIndexCachedUndefined: Self = StObject.set(x, "navCurrentIndexCached", js.undefined)
      
      @scala.inline
      def setNavCurrentIndexUndefined: Self = StObject.set(x, "navCurrentIndex", js.undefined)
      
      @scala.inline
      def setNavItems(value: HTMLCollection): Self = StObject.set(x, "navItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavItemsUndefined: Self = StObject.set(x, "navItems", js.undefined)
      
      @scala.inline
      def setNextButton(value: HTMLElement): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      @scala.inline
      def setPrevButton(value: HTMLElement): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      @scala.inline
      def setSlideBy(value: Double): Self = StObject.set(x, "slideBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCountNew(value: Double): Self = StObject.set(x, "slideCountNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideItems(value: HTMLCollection): Self = StObject.set(x, "slideItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleNavIndexes(value: Double): Self = StObject.set(x, "visibleNavIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleNavIndexesCached(value: Double): Self = StObject.set(x, "visibleNavIndexesCached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleNavIndexesCachedUndefined: Self = StObject.set(x, "visibleNavIndexesCached", js.undefined)
      
      @scala.inline
      def setVisibleNavIndexesUndefined: Self = StObject.set(x, "visibleNavIndexes", js.undefined)
    }
  }
  
  trait TinySliderProps extends StObject {
    
    var onClick: js.UndefOr[
        js.Function3[/* slideClicked */ Double, /* info */ String, /* event */ Event, Unit]
      ] = js.undefined
    
    var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
    
    var settings: js.UndefOr[TinySliderSettings] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
  }
  object TinySliderProps {
    
    @scala.inline
    def apply(): TinySliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinySliderProps]
    }
    
    @scala.inline
    implicit class TinySliderPropsMutableBuilder[Self <: TinySliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnIndexChanged(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onIndexChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIndexChangedUndefined: Self = StObject.set(x, "onIndexChanged", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnTransitionStart(value: /* info */ TinySliderInfo => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      @scala.inline
      def setSettings(value: TinySliderSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    }
  }
  
  trait TinySliderSettings
    extends StObject
       with CommonOptions {
    
    /**
      * Time between each gallery animation (in "ms").
      * @defaultValue false
      */
    var animateDelay: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Name of intro animation class.
      * @defaultValue "tns-fadeIn"
      */
    var animateIn: js.UndefOr[String] = js.undefined
    
    /**
      * Name of default animation class.
      * @defaultValue "tns-normal"
      */
    var animateNormal: js.UndefOr[String] = js.undefined
    
    /**
      * Name of outro animation class.
      * @defaultValue "tns-fadeOut"
      */
    var animateOut: js.UndefOr[String] = js.undefined
    
    /**
      * The customized autoplay start/stop button or selector.
      * @defaultValue false
      */
    var autoplayButton: js.UndefOr[HTMLElement | String | `false`] = js.undefined
    
    /**
      * Output autoplayButton markup when autoplay is true but a customized autoplayButton is not provided.
      * @defaultValue true
      */
    var autoplayButtonOutput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Direction of slide movement (ascending/descending the slide index).
      * @defaultValue "forward"
      */
    var autoplayDirection: js.UndefOr[forward | backward] = js.undefined
    
    /**
      * The axis of the slider.
      * @defaultValue "horizontal"
      */
    var axis: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The container element/selector around the prev/next buttons.
      * controlsContainer must have at least 2 child elements.
      * @defaultValue false
      */
    var controlsContainer: js.UndefOr[HTMLElement | String | `false`] = js.undefined
    
    /**
      * Indicate whether the slider will be frozen (controls, nav, autoplay and other functions will stop work) when all slides can be displayed in one page.
      * @defaultValue true
      */
    var freezable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables lazyloading images that are currently not viewed, thus saving bandwidth
      * @defaultValue false
      */
    var lazyload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Moves throughout all the slides seamlessly.
      * @defaultValue true
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls animation behaviour.
      * With carousel everything slides to the side, while gallery uses fade animations and changes all slides at once.
      * @defaultValue "carousel"
      */
    var mode: js.UndefOr[carousel | gallery] = js.undefined
    
    /**
      * Indecate if the dots are thurbnails. If true, they will always be visible even when more than 1 slides displayed in the viewport.
      * @defaultValue false
      */
    var navAsThumbnails: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The container element/selector around the dots.
      * navContainer must have at least same number of children as the slides.
      * @defaultValue false
      */
    var navContainer: js.UndefOr[HTMLElement | String | `false`] = js.undefined
    
    /**
      * Difine the relationship between nested sliders.
      * Make sure you run the inner slider first, otherwise the height of the inner slider container will be wrong.
      * @defaultValue false
      */
    var nested: js.UndefOr[inner | outer | `false`] = js.undefined
    
    /**
      * Callback to be run on initialization.
      * @defaultValue false
      */
    var onInit: js.UndefOr[js.Function0[Unit | `false`]] = js.undefined
    
    /**
      * Breakpoint: Integer.
      * Defines options for different viewport widths
      * @defaultValue false
      */
    var responsive: js.UndefOr[ResponsiveOptions | `false`] = js.undefined
    
    /**
      * Moves to the opposite edge when reaching the first or last slide.
      * @defaultValue false
      */
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swipe or drag will not be triggered if the angle is not inside the range when set.
      * @defaultValue 15
      */
    var swipeAngle: js.UndefOr[Double | Boolean] = js.undefined
  }
  object TinySliderSettings {
    
    @scala.inline
    def apply(): TinySliderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinySliderSettings]
    }
    
    @scala.inline
    implicit class TinySliderSettingsMutableBuilder[Self <: TinySliderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateDelay(value: Double | `false`): Self = StObject.set(x, "animateDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateDelayUndefined: Self = StObject.set(x, "animateDelay", js.undefined)
      
      @scala.inline
      def setAnimateIn(value: String): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      @scala.inline
      def setAnimateNormal(value: String): Self = StObject.set(x, "animateNormal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateNormalUndefined: Self = StObject.set(x, "animateNormal", js.undefined)
      
      @scala.inline
      def setAnimateOut(value: String): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      @scala.inline
      def setAutoplayButton(value: HTMLElement | String | `false`): Self = StObject.set(x, "autoplayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayButtonOutput(value: Boolean): Self = StObject.set(x, "autoplayButtonOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayButtonOutputUndefined: Self = StObject.set(x, "autoplayButtonOutput", js.undefined)
      
      @scala.inline
      def setAutoplayButtonUndefined: Self = StObject.set(x, "autoplayButton", js.undefined)
      
      @scala.inline
      def setAutoplayDirection(value: forward | backward): Self = StObject.set(x, "autoplayDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayDirectionUndefined: Self = StObject.set(x, "autoplayDirection", js.undefined)
      
      @scala.inline
      def setAxis(value: horizontal | vertical): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setControlsContainer(value: HTMLElement | String | `false`): Self = StObject.set(x, "controlsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsContainerUndefined: Self = StObject.set(x, "controlsContainer", js.undefined)
      
      @scala.inline
      def setFreezable(value: Boolean): Self = StObject.set(x, "freezable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreezableUndefined: Self = StObject.set(x, "freezable", js.undefined)
      
      @scala.inline
      def setLazyload(value: Boolean): Self = StObject.set(x, "lazyload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyloadUndefined: Self = StObject.set(x, "lazyload", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMode(value: carousel | gallery): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNavAsThumbnails(value: Boolean): Self = StObject.set(x, "navAsThumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavAsThumbnailsUndefined: Self = StObject.set(x, "navAsThumbnails", js.undefined)
      
      @scala.inline
      def setNavContainer(value: HTMLElement | String | `false`): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      @scala.inline
      def setNested(value: inner | outer | `false`): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      @scala.inline
      def setOnInit(value: () => Unit | `false`): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setResponsive(value: ResponsiveOptions | `false`): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setSwipeAngle(value: Double | Boolean): Self = StObject.set(x, "swipeAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeAngleUndefined: Self = StObject.set(x, "swipeAngle", js.undefined)
    }
  }
}
