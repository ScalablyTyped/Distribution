package typings.swiper

import typings.std.HTMLElement
import typings.swiper.swiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
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
    
    extension [Self <: ZoomEvents](x: Self) {
      
      inline def setZoomChange(value: (default, Double, HTMLElement, HTMLElement) => Unit): Self = StObject.set(x, "zoomChange", js.Any.fromFunction4(value))
    }
  }
  
  trait ZoomMethods extends StObject {
    
    /**
      * Disable zoom module
      */
    def disable(): Unit
    
    /**
      * Enable zoom module
      */
    def enable(): Unit
    
    /**
      * Whether the zoom module is enabled
      */
    var enabled: Boolean
    
    /**
      * Zoom in image of the currently active slide
      */
    def in(): Unit
    
    /**
      * Zoom out image of the currently active slide
      */
    def out(): Unit
    
    /**
      * Current image scale ratio
      */
    var scale: Double
    
    /**
      * Toggle image zoom of the currently active slide
      */
    def toggle(): Unit
  }
  object ZoomMethods {
    
    inline def apply(
      disable: () => Unit,
      enable: () => Unit,
      enabled: Boolean,
      in: () => Unit,
      out: () => Unit,
      scale: Double,
      toggle: () => Unit
    ): ZoomMethods = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], in = js.Any.fromFunction0(in), out = js.Any.fromFunction0(out), scale = scale.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[ZoomMethods]
    }
    
    extension [Self <: ZoomMethods](x: Self) {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setIn(value: () => Unit): Self = StObject.set(x, "in", js.Any.fromFunction0(value))
      
      inline def setOut(value: () => Unit): Self = StObject.set(x, "out", js.Any.fromFunction0(value))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
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
    
    extension [Self <: ZoomOptions](x: Self) {
      
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
