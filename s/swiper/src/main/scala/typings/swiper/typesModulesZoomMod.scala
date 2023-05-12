package typings.swiper

import typings.std.HTMLElement
import typings.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesZoomMod {
  
  trait ZoomEvents extends StObject {
    
    /**
      * Event will be fired on zoom change
      */
    def zoomChange(swiper: default, scale: Double, imageEl: HTMLElement, slideEl: HTMLElement): Unit
  }
  object ZoomEvents {
    
    inline def apply(zoomChange: (default, Double, HTMLElement, HTMLElement) => Unit): ZoomEvents = {
      val __obj = js.Dynamic.literal(zoomChange = js.Any.fromFunction4(zoomChange))
      __obj.asInstanceOf[ZoomEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomEvents] (val x: Self) extends AnyVal {
      
      inline def setZoomChange(value: (default, Double, HTMLElement, HTMLElement) => Unit): Self = StObject.set(x, "zoomChange", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait ZoomMethods extends StObject {
    
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
      * Zoom in image of the currently active slide. Optionally accepts custom zoom ratio
      */
    def in(): Unit = js.native
    def in(ratio: Double): Unit = js.native
    
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
  
  trait ZoomOptions extends StObject {
    
    /**
      * CSS class name of zoom container
      *
      * @default 'swiper-zoom-container'
      */
    var containerClass: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum image zoom multiplier
      *
      * @default 3
      */
    var maxRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal image zoom multiplier
      *
      * @default 1
      */
    var minRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable/disable zoom-in by slide's double tap
      *
      * @default true
      */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of zoomed in container
      *
      * @default 'swiper-slide-zoomed'
      */
    var zoomedSlideClass: js.UndefOr[String] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(): ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
      
      inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      inline def setMaxRatio(value: Double): Self = StObject.set(x, "maxRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxRatioUndefined: Self = StObject.set(x, "maxRatio", js.undefined)
      
      inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setZoomedSlideClass(value: String): Self = StObject.set(x, "zoomedSlideClass", value.asInstanceOf[js.Any])
      
      inline def setZoomedSlideClassUndefined: Self = StObject.set(x, "zoomedSlideClass", js.undefined)
    }
  }
}
