package typings.swiper

import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import typings.swiper.anon.ClassNames
import typings.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solidSwiperSolidMod {
  
  @JSImport("swiper/solid/swiper-solid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/solid/swiper-solid", "Swiper")
  @js.native
  val Swiper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SwiperProps> */ Any = js.native
  
  @JSImport("swiper/solid/swiper-solid", "SwiperSlide")
  @js.native
  val SwiperSlide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SwiperSlideProps> */ Any = js.native
  
  inline def useSwiper(): typings.swiper.typesMod.Swiper = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[typings.swiper.typesMod.Swiper]
  
  inline def useSwiperSlide(): SlideData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[SlideData]
  
  trait SlideData extends StObject {
    
    var isActive: Boolean
    
    var isDuplicate: Boolean
    
    var isNext: Boolean
    
    var isPrev: Boolean
    
    var isVisible: Boolean
  }
  object SlideData {
    
    inline def apply(isActive: Boolean, isDuplicate: Boolean, isNext: Boolean, isPrev: Boolean, isVisible: Boolean): SlideData = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDuplicate = isDuplicate.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], isPrev = isPrev.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideData] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsDuplicate(value: Boolean): Self = StObject.set(x, "isDuplicate", value.asInstanceOf[js.Any])
      
      inline def setIsNext(value: Boolean): Self = StObject.set(x, "isNext", value.asInstanceOf[js.Any])
      
      inline def setIsPrev(value: Boolean): Self = StObject.set(x, "isPrev", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.HTMLAttributes<HTMLElement> * / any, 'onProgress' | 'onClick' | 'onTouchEnd' | 'onTouchMove' | 'onTouchStart' | 'onTransitionEnd' | 'onKeyPress' | 'onDoubleClick' | 'onScroll'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.HTMLAttributes<HTMLElement> * / any[P]} */ trait SwiperProps
    extends StObject
       with SwiperOptions {
    
    /**
      * !INTERNAL: Event will fired right before breakpoint change
      */
    var _beforeBreakpoint: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* breakpointParams */ SwiperOptions, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper container element
      */
    var _containerClasses: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* classNames */ String, Unit]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
      */
    var _freeModeNoMomentumRelease: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
      */
    var _slideClass: js.UndefOr[
        js.Function3[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* classNames */ String, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
      */
    var _slideClasses: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* slides */ js.Array[ClassNames], Unit]
      ] = js.undefined
    
    /**
      * !INTERNAL: Event will fired as soon as swiper instance available (before init)
      */
    var _swiper: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired on active index change
      */
    var onActiveIndexChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired right after initialization
      */
    var onAfterInit: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when slide changed with autoplay
      */
    var onAutoplay: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on autoplay pause (on mouse/pointer enter), when `pauseOnMouseEnter` enabled
      */
    var onAutoplayPause: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on autoplay resume (on mouse/pointer leave), when `pauseOnMouseEnter` enabled
      */
    var onAutoplayResume: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in when autoplay started
      */
    var onAutoplayStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when autoplay stopped
      */
    var onAutoplayStop: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired right before Swiper destroyed
      */
    var onBeforeDestroy: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired right before initialization
      */
    var onBeforeInit: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired right before "loop fix"
      */
    var onBeforeLoopFix: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before resize handler
      */
    var onBeforeResize: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before slide change transition start
      */
    var onBeforeSlideChangeStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired before transition start
      */
    var onBeforeTransitionStart: js.UndefOr[
        js.Function3[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* speed */ Double, 
          /* internal */ Any, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on breakpoint change
      */
    var onBreakpoint: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* breakpointParams */ SwiperOptions, 
          Unit
        ]
      ] = js.undefined
    
    // what is internal?
    /**
      * Event will fired on direction change
      */
    var onChangeDirection: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on swiper destroy
      */
    var onDestroy: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user double click/tap on Swiper
      */
    var onDoubleClick: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
      */
    var onDoubleTap: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when Swiper goes from beginning or end position
      */
    var onFromEdge: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on window hash change
      */
    var onHashChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when swiper updates the hash
      */
    var onHashSet: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired right after all inner images are loaded. updateOnImagesReady should be also enabled
      */
    var onImagesReady: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Fired right after Swiper initialization.
      * @note Note that with `swiper.on('init')` syntax it will
      * work only in case you set `init: false` parameter.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   init: false,
      *   // other parameters
      * });
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
      *   on: {
      *     init: function () {
      *       // do something
      *     },
      *   }
      * });
      * ```
      */
    var onInit: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Any]] = js.undefined
    
    /**
      * Event will be fired on key press
      */
    var onKeyPress: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* keyCode */ String, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired in the beginning of lazy loading of image
      */
    var onLazyImageLoad: js.UndefOr[
        js.Function3[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* imageEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when lazy loading image will be loaded
      */
    var onLazyImageReady: js.UndefOr[
        js.Function3[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* slideEl */ HTMLElement, 
          /* imageEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when swiper is locked (when `watchOverflow` enabled)
      */
    var onLock: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after "loop fix"
      */
    var onLoopFix: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on momentum bounce
      */
    var onMomentumBounce: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation hide
      */
    var onNavigationHide: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation next button click
      */
    var onNavigationNext: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation prev button click
      */
    var onNavigationPrev: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on navigation show
      */
    var onNavigationShow: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired if observer is enabled and it detects DOM mutations
      */
    var onObserverUpdate: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on orientation change (e.g. landscape -> portrait)
      */
    var onOrientationchange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on pagination hide
      */
    var onPaginationHide: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after pagination rendered
      */
    var onPaginationRender: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired on pagination show
      */
    var onPaginationShow: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when pagination updated
      */
    var onPaginationUpdate: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
      */
    var onProgress: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* progress */ Double, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when Swiper reach its beginning (initial position)
      */
    var onReachBeginning: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when Swiper reach last slide
      */
    var onReachEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired on real index change
      */
    var onRealIndexChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on window resize right before swiper's onresize manipulation
      */
    var onResize: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on mousewheel scroll
      */
    var onScroll: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* event */ WheelEvent, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag end
      */
    var onScrollbarDragEnd: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag move
      */
    var onScrollbarDragMove: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired on draggable scrollbar drag start
      */
    var onScrollbarDragStart: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
      */
    var onSetTransition: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* transition */ Double, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
      */
    var onSetTranslate: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* translate */ Double, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when currently active slide is changed
      */
    var onSlideChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after animation to other slide (next or previous).
      */
    var onSlideChangeTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of animation to other slide (next or previous).
      */
    var onSlideChangeTransitionStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionEnd" but for "forward" direction only
      */
    var onSlideNextTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionStart" but for "forward" direction only
      */
    var onSlideNextTransitionStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionEnd" but for "backward" direction only
      */
    var onSlidePrevTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Same as "slideChangeTransitionStart" but for "backward" direction only
      */
    var onSlidePrevTransitionStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the end of animation of resetting slide to current one
      */
    var onSlideResetTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of animation of resetting slide to current one
      */
    var onSlideResetTransitionStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired with first touch/drag move
      */
    var onSliderFirstMove: js.UndefOr[
        js.Function2[/* swiper */ typings.swiper.typesMod.Swiper, /* event */ TouchEvent, Unit]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
      */
    var onSliderMove: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when slides grid has changed
      */
    var onSlidesGridLengthChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when number of slides has changed
      */
    var onSlidesLengthChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when snap grid has changed
      */
    var onSnapGridLengthChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will fired on snap index change
      */
    var onSnapIndexChange: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Get Swiper instance
      */
    var onSwiper: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    var onTap: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when Swiper goes to beginning or end position
      */
    var onToEdge: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
      */
    var onTouchEnd: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
      */
    var onTouchMove: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
      */
    var onTouchMoveOpposite: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
      */
    var onTouchStart: js.UndefOr[
        js.Function2[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* event */ MouseEvent | TouchEvent | PointerEvent, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Event will be fired after transition.
      */
    var onTransitionEnd: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired in the beginning of transition.
      */
    var onTransitionStart: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
      */
    var onUnlock: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired after swiper.update() call
      */
    var onUpdate: js.UndefOr[js.Function1[/* swiper */ typings.swiper.typesMod.Swiper, Unit]] = js.undefined
    
    /**
      * Event will be fired on zoom change
      */
    var onZoomChange: js.UndefOr[
        js.Function4[
          /* swiper */ typings.swiper.typesMod.Swiper, 
          /* scale */ Double, 
          /* imageEl */ HTMLElement, 
          /* slideEl */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Swiper container tag
      *
      * @default 'div'
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /**
      * Swiper wrapper tag
      *
      * @default 'div'
      */
    var wrapperTag: js.UndefOr[String] = js.undefined
  }
  object SwiperProps {
    
    inline def apply(): SwiperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperProps] (val x: Self) extends AnyVal {
      
      inline def setOnActiveIndexChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
      
      inline def setOnAfterInit(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAfterInit", js.Any.fromFunction1(value))
      
      inline def setOnAfterInitUndefined: Self = StObject.set(x, "onAfterInit", js.undefined)
      
      inline def setOnAutoplay(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAutoplay", js.Any.fromFunction1(value))
      
      inline def setOnAutoplayPause(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAutoplayPause", js.Any.fromFunction1(value))
      
      inline def setOnAutoplayPauseUndefined: Self = StObject.set(x, "onAutoplayPause", js.undefined)
      
      inline def setOnAutoplayResume(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAutoplayResume", js.Any.fromFunction1(value))
      
      inline def setOnAutoplayResumeUndefined: Self = StObject.set(x, "onAutoplayResume", js.undefined)
      
      inline def setOnAutoplayStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAutoplayStart", js.Any.fromFunction1(value))
      
      inline def setOnAutoplayStartUndefined: Self = StObject.set(x, "onAutoplayStart", js.undefined)
      
      inline def setOnAutoplayStop(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onAutoplayStop", js.Any.fromFunction1(value))
      
      inline def setOnAutoplayStopUndefined: Self = StObject.set(x, "onAutoplayStop", js.undefined)
      
      inline def setOnAutoplayUndefined: Self = StObject.set(x, "onAutoplay", js.undefined)
      
      inline def setOnBeforeDestroy(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onBeforeDestroy", js.Any.fromFunction1(value))
      
      inline def setOnBeforeDestroyUndefined: Self = StObject.set(x, "onBeforeDestroy", js.undefined)
      
      inline def setOnBeforeInit(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onBeforeInit", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInitUndefined: Self = StObject.set(x, "onBeforeInit", js.undefined)
      
      inline def setOnBeforeLoopFix(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onBeforeLoopFix", js.Any.fromFunction1(value))
      
      inline def setOnBeforeLoopFixUndefined: Self = StObject.set(x, "onBeforeLoopFix", js.undefined)
      
      inline def setOnBeforeResize(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onBeforeResize", js.Any.fromFunction1(value))
      
      inline def setOnBeforeResizeUndefined: Self = StObject.set(x, "onBeforeResize", js.undefined)
      
      inline def setOnBeforeSlideChangeStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onBeforeSlideChangeStart", js.Any.fromFunction1(value))
      
      inline def setOnBeforeSlideChangeStartUndefined: Self = StObject.set(x, "onBeforeSlideChangeStart", js.undefined)
      
      inline def setOnBeforeTransitionStart(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* speed */ Double, /* internal */ Any) => Unit
      ): Self = StObject.set(x, "onBeforeTransitionStart", js.Any.fromFunction3(value))
      
      inline def setOnBeforeTransitionStartUndefined: Self = StObject.set(x, "onBeforeTransitionStart", js.undefined)
      
      inline def setOnBreakpoint(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Unit): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction2(value))
      
      inline def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      inline def setOnChangeDirection(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onChangeDirection", js.Any.fromFunction1(value))
      
      inline def setOnChangeDirectionUndefined: Self = StObject.set(x, "onChangeDirection", js.undefined)
      
      inline def setOnClick(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDestroy(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnDoubleClick(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDoubleTap(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction2(value))
      
      inline def setOnDoubleTapUndefined: Self = StObject.set(x, "onDoubleTap", js.undefined)
      
      inline def setOnFromEdge(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onFromEdge", js.Any.fromFunction1(value))
      
      inline def setOnFromEdgeUndefined: Self = StObject.set(x, "onFromEdge", js.undefined)
      
      inline def setOnHashChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onHashChange", js.Any.fromFunction1(value))
      
      inline def setOnHashChangeUndefined: Self = StObject.set(x, "onHashChange", js.undefined)
      
      inline def setOnHashSet(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onHashSet", js.Any.fromFunction1(value))
      
      inline def setOnHashSetUndefined: Self = StObject.set(x, "onHashSet", js.undefined)
      
      inline def setOnImagesReady(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onImagesReady", js.Any.fromFunction1(value))
      
      inline def setOnImagesReadyUndefined: Self = StObject.set(x, "onImagesReady", js.undefined)
      
      inline def setOnInit(value: /* swiper */ typings.swiper.typesMod.Swiper => Any): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnKeyPress(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* keyCode */ String) => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction2(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnLazyImageLoad(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onLazyImageLoad", js.Any.fromFunction3(value))
      
      inline def setOnLazyImageLoadUndefined: Self = StObject.set(x, "onLazyImageLoad", js.undefined)
      
      inline def setOnLazyImageReady(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* imageEl */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onLazyImageReady", js.Any.fromFunction3(value))
      
      inline def setOnLazyImageReadyUndefined: Self = StObject.set(x, "onLazyImageReady", js.undefined)
      
      inline def setOnLock(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onLock", js.Any.fromFunction1(value))
      
      inline def setOnLockUndefined: Self = StObject.set(x, "onLock", js.undefined)
      
      inline def setOnLoopFix(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onLoopFix", js.Any.fromFunction1(value))
      
      inline def setOnLoopFixUndefined: Self = StObject.set(x, "onLoopFix", js.undefined)
      
      inline def setOnMomentumBounce(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onMomentumBounce", js.Any.fromFunction1(value))
      
      inline def setOnMomentumBounceUndefined: Self = StObject.set(x, "onMomentumBounce", js.undefined)
      
      inline def setOnNavigationHide(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onNavigationHide", js.Any.fromFunction1(value))
      
      inline def setOnNavigationHideUndefined: Self = StObject.set(x, "onNavigationHide", js.undefined)
      
      inline def setOnNavigationNext(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onNavigationNext", js.Any.fromFunction1(value))
      
      inline def setOnNavigationNextUndefined: Self = StObject.set(x, "onNavigationNext", js.undefined)
      
      inline def setOnNavigationPrev(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onNavigationPrev", js.Any.fromFunction1(value))
      
      inline def setOnNavigationPrevUndefined: Self = StObject.set(x, "onNavigationPrev", js.undefined)
      
      inline def setOnNavigationShow(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onNavigationShow", js.Any.fromFunction1(value))
      
      inline def setOnNavigationShowUndefined: Self = StObject.set(x, "onNavigationShow", js.undefined)
      
      inline def setOnObserverUpdate(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onObserverUpdate", js.Any.fromFunction1(value))
      
      inline def setOnObserverUpdateUndefined: Self = StObject.set(x, "onObserverUpdate", js.undefined)
      
      inline def setOnOrientationchange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onOrientationchange", js.Any.fromFunction1(value))
      
      inline def setOnOrientationchangeUndefined: Self = StObject.set(x, "onOrientationchange", js.undefined)
      
      inline def setOnPaginationHide(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onPaginationHide", js.Any.fromFunction1(value))
      
      inline def setOnPaginationHideUndefined: Self = StObject.set(x, "onPaginationHide", js.undefined)
      
      inline def setOnPaginationRender(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Unit): Self = StObject.set(x, "onPaginationRender", js.Any.fromFunction2(value))
      
      inline def setOnPaginationRenderUndefined: Self = StObject.set(x, "onPaginationRender", js.undefined)
      
      inline def setOnPaginationShow(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onPaginationShow", js.Any.fromFunction1(value))
      
      inline def setOnPaginationShowUndefined: Self = StObject.set(x, "onPaginationShow", js.undefined)
      
      inline def setOnPaginationUpdate(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* paginationEl */ HTMLElement) => Unit): Self = StObject.set(x, "onPaginationUpdate", js.Any.fromFunction2(value))
      
      inline def setOnPaginationUpdateUndefined: Self = StObject.set(x, "onPaginationUpdate", js.undefined)
      
      inline def setOnProgress(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* progress */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnReachBeginning(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onReachBeginning", js.Any.fromFunction1(value))
      
      inline def setOnReachBeginningUndefined: Self = StObject.set(x, "onReachBeginning", js.undefined)
      
      inline def setOnReachEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onReachEnd", js.Any.fromFunction1(value))
      
      inline def setOnReachEndUndefined: Self = StObject.set(x, "onReachEnd", js.undefined)
      
      inline def setOnRealIndexChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onRealIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnRealIndexChangeUndefined: Self = StObject.set(x, "onRealIndexChange", js.undefined)
      
      inline def setOnResize(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ WheelEvent) => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnScrollbarDragEnd(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onScrollbarDragEnd", js.Any.fromFunction2(value))
      
      inline def setOnScrollbarDragEndUndefined: Self = StObject.set(x, "onScrollbarDragEnd", js.undefined)
      
      inline def setOnScrollbarDragMove(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onScrollbarDragMove", js.Any.fromFunction2(value))
      
      inline def setOnScrollbarDragMoveUndefined: Self = StObject.set(x, "onScrollbarDragMove", js.undefined)
      
      inline def setOnScrollbarDragStart(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onScrollbarDragStart", js.Any.fromFunction2(value))
      
      inline def setOnScrollbarDragStartUndefined: Self = StObject.set(x, "onScrollbarDragStart", js.undefined)
      
      inline def setOnSetTransition(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* transition */ Double) => Unit): Self = StObject.set(x, "onSetTransition", js.Any.fromFunction2(value))
      
      inline def setOnSetTransitionUndefined: Self = StObject.set(x, "onSetTransition", js.undefined)
      
      inline def setOnSetTranslate(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* translate */ Double) => Unit): Self = StObject.set(x, "onSetTranslate", js.Any.fromFunction2(value))
      
      inline def setOnSetTranslateUndefined: Self = StObject.set(x, "onSetTranslate", js.undefined)
      
      inline def setOnSlideChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1(value))
      
      inline def setOnSlideChangeTransitionEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideChangeTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnSlideChangeTransitionEndUndefined: Self = StObject.set(x, "onSlideChangeTransitionEnd", js.undefined)
      
      inline def setOnSlideChangeTransitionStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideChangeTransitionStart", js.Any.fromFunction1(value))
      
      inline def setOnSlideChangeTransitionStartUndefined: Self = StObject.set(x, "onSlideChangeTransitionStart", js.undefined)
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      inline def setOnSlideNextTransitionEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideNextTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnSlideNextTransitionEndUndefined: Self = StObject.set(x, "onSlideNextTransitionEnd", js.undefined)
      
      inline def setOnSlideNextTransitionStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideNextTransitionStart", js.Any.fromFunction1(value))
      
      inline def setOnSlideNextTransitionStartUndefined: Self = StObject.set(x, "onSlideNextTransitionStart", js.undefined)
      
      inline def setOnSlidePrevTransitionEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlidePrevTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnSlidePrevTransitionEndUndefined: Self = StObject.set(x, "onSlidePrevTransitionEnd", js.undefined)
      
      inline def setOnSlidePrevTransitionStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlidePrevTransitionStart", js.Any.fromFunction1(value))
      
      inline def setOnSlidePrevTransitionStartUndefined: Self = StObject.set(x, "onSlidePrevTransitionStart", js.undefined)
      
      inline def setOnSlideResetTransitionEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideResetTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnSlideResetTransitionEndUndefined: Self = StObject.set(x, "onSlideResetTransitionEnd", js.undefined)
      
      inline def setOnSlideResetTransitionStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlideResetTransitionStart", js.Any.fromFunction1(value))
      
      inline def setOnSlideResetTransitionStartUndefined: Self = StObject.set(x, "onSlideResetTransitionStart", js.undefined)
      
      inline def setOnSliderFirstMove(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ TouchEvent) => Unit): Self = StObject.set(x, "onSliderFirstMove", js.Any.fromFunction2(value))
      
      inline def setOnSliderFirstMoveUndefined: Self = StObject.set(x, "onSliderFirstMove", js.undefined)
      
      inline def setOnSliderMove(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onSliderMove", js.Any.fromFunction2(value))
      
      inline def setOnSliderMoveUndefined: Self = StObject.set(x, "onSliderMove", js.undefined)
      
      inline def setOnSlidesGridLengthChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlidesGridLengthChange", js.Any.fromFunction1(value))
      
      inline def setOnSlidesGridLengthChangeUndefined: Self = StObject.set(x, "onSlidesGridLengthChange", js.undefined)
      
      inline def setOnSlidesLengthChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSlidesLengthChange", js.Any.fromFunction1(value))
      
      inline def setOnSlidesLengthChangeUndefined: Self = StObject.set(x, "onSlidesLengthChange", js.undefined)
      
      inline def setOnSnapGridLengthChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSnapGridLengthChange", js.Any.fromFunction1(value))
      
      inline def setOnSnapGridLengthChangeUndefined: Self = StObject.set(x, "onSnapGridLengthChange", js.undefined)
      
      inline def setOnSnapIndexChange(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSnapIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnSnapIndexChangeUndefined: Self = StObject.set(x, "onSnapIndexChange", js.undefined)
      
      inline def setOnSwiper(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onSwiper", js.Any.fromFunction1(value))
      
      inline def setOnSwiperUndefined: Self = StObject.set(x, "onSwiper", js.undefined)
      
      inline def setOnTap(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnToEdge(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onToEdge", js.Any.fromFunction1(value))
      
      inline def setOnToEdgeUndefined: Self = StObject.set(x, "onToEdge", js.undefined)
      
      inline def setOnTouchEnd(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction2(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction2(value))
      
      inline def setOnTouchMoveOpposite(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onTouchMoveOpposite", js.Any.fromFunction2(value))
      
      inline def setOnTouchMoveOppositeUndefined: Self = StObject.set(x, "onTouchMoveOpposite", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* event */ MouseEvent | TouchEvent | PointerEvent) => Unit
      ): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction2(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnTransitionStart(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
      
      inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      inline def setOnUnlock(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onUnlock", js.Any.fromFunction1(value))
      
      inline def setOnUnlockUndefined: Self = StObject.set(x, "onUnlock", js.undefined)
      
      inline def setOnUpdate(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOnZoomChange(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* scale */ Double, /* imageEl */ HTMLElement, /* slideEl */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction4(value))
      
      inline def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWrapperTag(value: String): Self = StObject.set(x, "wrapperTag", value.asInstanceOf[js.Any])
      
      inline def setWrapperTagUndefined: Self = StObject.set(x, "wrapperTag", js.undefined)
      
      inline def set_beforeBreakpoint(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* breakpointParams */ SwiperOptions) => Unit): Self = StObject.set(x, "_beforeBreakpoint", js.Any.fromFunction2(value))
      
      inline def set_beforeBreakpointUndefined: Self = StObject.set(x, "_beforeBreakpoint", js.undefined)
      
      inline def set_containerClasses(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* classNames */ String) => Unit): Self = StObject.set(x, "_containerClasses", js.Any.fromFunction2(value))
      
      inline def set_containerClassesUndefined: Self = StObject.set(x, "_containerClasses", js.undefined)
      
      inline def set_freeModeNoMomentumRelease(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "_freeModeNoMomentumRelease", js.Any.fromFunction1(value))
      
      inline def set_freeModeNoMomentumReleaseUndefined: Self = StObject.set(x, "_freeModeNoMomentumRelease", js.undefined)
      
      inline def set_slideClass(
        value: (/* swiper */ typings.swiper.typesMod.Swiper, /* slideEl */ HTMLElement, /* classNames */ String) => Unit
      ): Self = StObject.set(x, "_slideClass", js.Any.fromFunction3(value))
      
      inline def set_slideClassUndefined: Self = StObject.set(x, "_slideClass", js.undefined)
      
      inline def set_slideClasses(value: (/* swiper */ typings.swiper.typesMod.Swiper, /* slides */ js.Array[ClassNames]) => Unit): Self = StObject.set(x, "_slideClasses", js.Any.fromFunction2(value))
      
      inline def set_slideClassesUndefined: Self = StObject.set(x, "_slideClasses", js.undefined)
      
      inline def set_swiper(value: /* swiper */ typings.swiper.typesMod.Swiper => Unit): Self = StObject.set(x, "_swiper", js.Any.fromFunction1(value))
      
      inline def set_swiperUndefined: Self = StObject.set(x, "_swiper", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.HTMLAttributes<HTMLElement> * / any, 'children'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.HTMLAttributes<HTMLElement> * / any[P]} */ trait SwiperSlideProps extends StObject {
    
    /**
      * Slide's child element or render function
      *
      * @default undefined
      */
    var children: js.UndefOr[Element | (js.Function1[/* slideData */ SlideData, Element])] = js.undefined
    
    /**
      * Slide tag
      *
      * @default 'div'
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /**
      * Slide's index in slides array/collection
      *
      * @default false
      */
    var virtualIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables additional wrapper required for zoom mode
      *
      * @default false
      */
    var zoom: js.UndefOr[Boolean] = js.undefined
  }
  object SwiperSlideProps {
    
    inline def apply(): SwiperSlideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperSlideProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperSlideProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Element | (js.Function1[/* slideData */ SlideData, Element])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* slideData */ SlideData => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setVirtualIndex(value: Double): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
      
      inline def setVirtualIndexUndefined: Self = StObject.set(x, "virtualIndex", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
