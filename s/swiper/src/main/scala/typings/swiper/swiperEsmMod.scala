package typings.swiper

import typings.std.HTMLElement
import typings.swiper.mod.DOM7Element
import typings.swiper.mod.SelectableElement
import typings.swiper.mod.SwiperModule
import typings.swiper.mod.SwiperOptions
import typings.swiper.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperEsmMod {
  
  @JSImport("swiper/js/swiper.esm", "A11y")
  @js.native
  class A11y () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "Autoplay")
  @js.native
  class Autoplay () extends SwiperModule {
    
    // Properties
    /**
      * Whether autoplay enabled and running
      */
    var running: Boolean = js.native
    
    // Methods
    /**
      * Start autoplay
      */
    def start(): Boolean = js.native
    
    /**
      * Stop autoplay
      */
    def stop(): Boolean = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Controller")
  @js.native
  class Controller () extends SwiperModule {
    
    /**
      * Pass here another Swiper instance or array with Swiper instances that should be controlled
      * by this Swiper
      */
    var control: js.UndefOr[default | js.Array[default]] = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "EffectCoverflow")
  @js.native
  class EffectCoverflow () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "EffectCube")
  @js.native
  class EffectCube () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "EffectFade")
  @js.native
  class EffectFade () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "EffectFlip")
  @js.native
  class EffectFlip () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "HashNavigation")
  @js.native
  class HashNavigation () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "History")
  @js.native
  class History () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "Keyboard")
  @js.native
  class Keyboard () extends SwiperModule {
    
    /**
      * Disable keyboard control
      */
    def disable(): Unit = js.native
    
    // Methods
    /**
      * Enable keyboard control
      */
    def enable(): Unit = js.native
    
    /**
      * Whether the keyboard control is enabled
      */
    var enabled: Boolean = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Lazy")
  @js.native
  class Lazy () extends SwiperModule {
    
    /**
      * Load/update lazy images based on current slider state (position)
      */
    def load(): Unit = js.native
    
    /**
      * Force to load lazy images in slide by specified index
      * @param number index number of slide to load lazy images in
      */
    def loadInSlide(index: Double): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Mousewheel")
  @js.native
  class Mousewheel () extends SwiperModule {
    
    /**
      * Disable mousewheel control
      */
    def disable(): Unit = js.native
    
    // Methods
    /**
      * Enable mousewheel control
      */
    def enable(): Unit = js.native
    
    /**
      * Whether the mousewheel control is enabled
      */
    var enabled: Boolean = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Navigation")
  @js.native
  class Navigation () extends SwiperModule {
    
    /**
      * HTMLElement of "next" navigation button
      */
    var nextEl: HTMLElement = js.native
    
    /**
      * HTMLElement of "previous" navigation button
      */
    var prevEl: HTMLElement = js.native
    
    /**
      * Update navigation buttons state (enabled/disabled)
      */
    def update(): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Pagination")
  @js.native
  class Pagination () extends SwiperModule {
    
    /**
      * Dom7 array-like collection of pagination bullets
      * HTML elements. To get specific slide HTMLElement
      * use `mySwiper.pagination.bullets[1]`.
      */
    var bullets: js.Array[DOM7Element] = js.native
    
    /**
      * HTMLElement of pagination container element
      */
    var el: HTMLElement = js.native
    
    /**
      * Render pagination layout
      */
    def render(): Unit = js.native
    
    /**
      * Update pagination state (enabled/disabled/active)
      */
    def update(): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Parallax")
  @js.native
  class Parallax () extends SwiperModule
  
  @JSImport("swiper/js/swiper.esm", "Scrollbar")
  @js.native
  class Scrollbar () extends SwiperModule {
    
    /**
      * HTMLElement of Scrollbar draggable handler element
      */
    var dragEl: HTMLElement = js.native
    
    // Properties
    /**
      * HTMLElement of Scrollbar container element
      */
    var el: HTMLElement = js.native
    
    // Methods
    /**
      * Updates scrollbar track and handler sizes
      */
    def updateSize(): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Swiper")
  @js.native
  class Swiper protected () extends default {
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: SelectableElement) = this()
    def this(container: SelectableElement, options: SwiperOptions) = this()
  }
  /* static members */
  object Swiper {
    
    /**
      * Installs modules on Swiper in runtime.
      */
    @JSImport("swiper/js/swiper.esm", "Swiper.use")
    @js.native
    def use(modules: js.Array[SwiperModule]): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Virtual")
  @js.native
  class Virtual () extends SwiperModule {
    
    def appendSlide(slide: String): Unit = js.native
    /*
      * Methods
      */
    /**
      * Add new slides to the end. slides could be HTMLElement or HTML string with new slide or array
      * with such slides, for example:
      *
      * @example
      * mySwiper.appendSlide('<div class="swiper-slide">Slide 10"</div>')
      * mySwiper.appendSlide([
      *   '<div class="swiper-slide">Slide 10"</div>',
      *   '<div class="swiper-slide">Slide 11"</div>'
      * ]);
      */
    def appendSlide(slide: HTMLElement): Unit = js.native
    
    /**
      * Object with cached slides HTML elements
      */
    var cache: js.Object = js.native
    
    /**
      * Index of first rendered slide
      */
    var from: Double = js.native
    
    def prependSlide(slide: String): Unit = js.native
    /**
      * Add new slides to the beginning. slides could be HTMLElement or HTML string with new slide or
      * array with such slides, for example:
      *
      * @example
      * mySwiper.prependSlide('<div class="swiper-slide">Slide 0"</div>')
      * mySwiper.prependSlide([
      * '<div class="swiper-slide">Slide 1"</div>',
      * '<div class="swiper-slide">Slide 2"</div>'
      * ]);
      */
    def prependSlide(slide: HTMLElement): Unit = js.native
    
    /**
      * Array with slide items passed by virtual.slides parameter
      */
    var slides: js.Array[_] = js.native
    
    /**
      * Index of last rendered slide
      */
    var to: Double = js.native
    
    /**
      * Update virutal slides state
      */
    def update(): Unit = js.native
  }
  
  @JSImport("swiper/js/swiper.esm", "Zoom")
  @js.native
  class Zoom () extends SwiperModule {
    
    /**
      * Disable zoom module
      */
    def disable(): Unit = js.native
    
    /**
      * Enable zoom module
      */
    def enable(): Unit = js.native
    
    /**
      * Whether the zoom module is enabled
      */
    var enabled: Boolean = js.native
    
    /**
      * Zoom in image of the currently active slide
      */
    def in(): Unit = js.native
    
    /**
      * Zoom out image of the currently active slide
      */
    def out(): Unit = js.native
    
    /**
      * Current image scale ratio
      */
    var scale: Double = js.native
    
    /**
      * Toggle image zoom of the currently active slide
      */
    def toggle(): Unit = js.native
  }
}
