package typings.swiper

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualMod {
  
  trait VirtualData extends StObject {
    
    /**
      * index of first slide required to be rendered
      */
    var from: Double
    
    /**
      * slides left/top offset in px
      */
    var offset: Double
    
    /**
      * array with slide items to be rendered
      */
    var slides: js.Array[Any]
    
    /**
      * index of last slide required to be rendered
      */
    var to: Double
  }
  object VirtualData {
    
    inline def apply(from: Double, offset: Double, slides: js.Array[Any], to: Double): VirtualData = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], slides = slides.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualData]
    }
    
    extension [Self <: VirtualData](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSlides(value: js.Array[Any]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesVarargs(value: Any*): Self = StObject.set(x, "slides", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait VirtualEvents extends StObject
  
  @js.native
  trait VirtualMethods extends StObject {
    
    def appendSlide(slide: String): Unit = js.native
    def appendSlide(slide: js.Array[HTMLElement | String]): Unit = js.native
    /*
      * Methods
      */
    /**
      * Append slide. `slides` can be a single slide item or array with such slides.
      *
      * @note Only for Core version (in React, Svelte, Vue & Angular it should be done by modifying slides array/data/source)
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
    def prependSlide(slide: js.Array[HTMLElement | String]): Unit = js.native
    /**
      * Prepend slide. `slides` can be a single slide item or array with such slides.
      *
      * @note Only for Core version (in React, Svelte, Vue & Angular it should be done by modifying slides array/data/source)
      */
    def prependSlide(slide: HTMLElement): Unit = js.native
    
    /**
      * Remove all slides
      *
      * @note Only for Core version (in React, Svelte, Vue & Angular it should be done by modifying slides array/data/source)
      */
    def removeAllSlides(): Unit = js.native
    
    /**
      * Remove specific slide or slides. `slideIndexes` can be a number with slide index to remove or array with indexes.
      *
      * @note Only for Core version (in React, Svelte, Vue & Angular it should be done by modifying slides array/data/source)
      */
    def removeSlide(slideIndexes: js.Array[Double]): Unit = js.native
    
    /**
      * Array with slide items passed by `virtual.slides` parameter
      */
    var slides: js.Array[Any] = js.native
    
    /**
      * Index of last rendered slide
      */
    var to: Double = js.native
    
    /**
      * Update virtual slides state
      */
    def update(force: Boolean): Unit = js.native
  }
  
  trait VirtualOptions extends StObject {
    
    /**
      * Increases amount of pre-rendered slides after active slide
      *
      * @default 0
      */
    var addSlidesAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Increases amount of pre-rendered slides before active slide
      *
      * @default 0
      */
    var addSlidesBefore: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables DOM cache of rendering slides html elements. Once they are rendered they will be saved to cache and reused from it.
      *
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the virtual slides are enabled
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function for external rendering (e.g. using some other library to handle DOM manipulations and state like React.js or Vue.js). As an argument it accepts `data` object with the following properties:
      *
      * - `offset` - slides left/top offset in px
      * - `from` - index of first slide required to be rendered
      * - `to` - index of last slide required to be rendered
      * - `slides` - array with slide items to be rendered
      *
      * @default null
      */
    var renderExternal: js.UndefOr[js.Function1[/* data */ VirtualData, Any | Null]] = js.undefined
    
    /**
      * When enabled (by default) it will update Swiper layout right after renderExternal called. Useful to disable and update swiper manually when used with render libraries that renders asynchronously
      *
      * @default true
      */
    var renderExternalUpdate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to render slide. As an argument it accepts current slide item for `slides` array and index number of the current slide. Function must return an outter HTML of the swiper slide.
      *
      * @default null
      */
    var renderSlide: js.UndefOr[js.Function2[/* slide */ Any, /* index */ Any, Any | Null]] = js.undefined
    
    /**
      * Array with slides
      *
      * @default []
      */
    var slides: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object VirtualOptions {
    
    inline def apply(): VirtualOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualOptions]
    }
    
    extension [Self <: VirtualOptions](x: Self) {
      
      inline def setAddSlidesAfter(value: Double): Self = StObject.set(x, "addSlidesAfter", value.asInstanceOf[js.Any])
      
      inline def setAddSlidesAfterUndefined: Self = StObject.set(x, "addSlidesAfter", js.undefined)
      
      inline def setAddSlidesBefore(value: Double): Self = StObject.set(x, "addSlidesBefore", value.asInstanceOf[js.Any])
      
      inline def setAddSlidesBeforeUndefined: Self = StObject.set(x, "addSlidesBefore", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setRenderExternal(value: /* data */ VirtualData => Any | Null): Self = StObject.set(x, "renderExternal", js.Any.fromFunction1(value))
      
      inline def setRenderExternalUndefined: Self = StObject.set(x, "renderExternal", js.undefined)
      
      inline def setRenderExternalUpdate(value: Boolean): Self = StObject.set(x, "renderExternalUpdate", value.asInstanceOf[js.Any])
      
      inline def setRenderExternalUpdateUndefined: Self = StObject.set(x, "renderExternalUpdate", js.undefined)
      
      inline def setRenderSlide(value: (/* slide */ Any, /* index */ Any) => Any | Null): Self = StObject.set(x, "renderSlide", js.Any.fromFunction2(value))
      
      inline def setRenderSlideUndefined: Self = StObject.set(x, "renderSlide", js.undefined)
      
      inline def setSlides(value: js.Array[Any]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setSlidesVarargs(value: Any*): Self = StObject.set(x, "slides", js.Array(value*))
    }
  }
}
