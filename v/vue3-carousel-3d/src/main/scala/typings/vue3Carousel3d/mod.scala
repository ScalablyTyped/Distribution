package typings.vue3Carousel3d

import typings.vue3Carousel3d.anon.Index
import typings.vue3Carousel3d.vue3Carousel3dStrings.ltr
import typings.vue3Carousel3d.vue3Carousel3dStrings.rtl
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue3-carousel-3d", "Carousel3d")
  @js.native
  val Carousel3d: Component[Carousel3dProps, Any, Any, ComputedOptions, MethodOptions] = js.native
  
  @JSImport("vue3-carousel-3d", "Slide")
  @js.native
  val Slide: Component[SlideProps, Any, Any, ComputedOptions, MethodOptions] = js.native
  
  trait Carousel3dProps extends StObject {
    
    var animationSpeed: Double
    
    var autoplay: Boolean
    
    var autoplayHoverPause: Boolean
    
    var autoplayTimeout: Double
    
    var bias: String
    
    var border: Double
    
    var clickable: Boolean
    
    var controlsHeight: Double
    
    var controlsNextHtml: String
    
    var controlsPrevHtml: String
    
    var controlsVisible: Boolean
    
    var controlsWidth: Double
    
    var count: Double
    
    var dir: rtl | ltr
    
    var disable3d: Boolean
    
    var display: Double
    
    var height: Double
    
    var inverseScaling: Double
    
    var loop: Boolean
    
    var minSwipeDistance: Double
    
    def onLastSlide(): Unit
    
    def onMainSlideClick(param: Index): Unit
    
    def onSlideChange(): Unit
    
    var perspective: Double
    
    var space: Double
    
    var startIndex: Double
    
    var width: Double
  }
  object Carousel3dProps {
    
    inline def apply(
      animationSpeed: Double,
      autoplay: Boolean,
      autoplayHoverPause: Boolean,
      autoplayTimeout: Double,
      bias: String,
      border: Double,
      clickable: Boolean,
      controlsHeight: Double,
      controlsNextHtml: String,
      controlsPrevHtml: String,
      controlsVisible: Boolean,
      controlsWidth: Double,
      count: Double,
      dir: rtl | ltr,
      disable3d: Boolean,
      display: Double,
      height: Double,
      inverseScaling: Double,
      loop: Boolean,
      minSwipeDistance: Double,
      onLastSlide: () => Unit,
      onMainSlideClick: Index => Unit,
      onSlideChange: () => Unit,
      perspective: Double,
      space: Double,
      startIndex: Double,
      width: Double
    ): Carousel3dProps = {
      val __obj = js.Dynamic.literal(animationSpeed = animationSpeed.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], autoplayHoverPause = autoplayHoverPause.asInstanceOf[js.Any], autoplayTimeout = autoplayTimeout.asInstanceOf[js.Any], bias = bias.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], controlsHeight = controlsHeight.asInstanceOf[js.Any], controlsNextHtml = controlsNextHtml.asInstanceOf[js.Any], controlsPrevHtml = controlsPrevHtml.asInstanceOf[js.Any], controlsVisible = controlsVisible.asInstanceOf[js.Any], controlsWidth = controlsWidth.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], disable3d = disable3d.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inverseScaling = inverseScaling.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], minSwipeDistance = minSwipeDistance.asInstanceOf[js.Any], onLastSlide = js.Any.fromFunction0(onLastSlide), onMainSlideClick = js.Any.fromFunction1(onMainSlideClick), onSlideChange = js.Any.fromFunction0(onSlideChange), perspective = perspective.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Carousel3dProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Carousel3dProps] (val x: Self) extends AnyVal {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayHoverPause(value: Boolean): Self = StObject.set(x, "autoplayHoverPause", value.asInstanceOf[js.Any])
      
      inline def setAutoplayTimeout(value: Double): Self = StObject.set(x, "autoplayTimeout", value.asInstanceOf[js.Any])
      
      inline def setBias(value: String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setControlsHeight(value: Double): Self = StObject.set(x, "controlsHeight", value.asInstanceOf[js.Any])
      
      inline def setControlsNextHtml(value: String): Self = StObject.set(x, "controlsNextHtml", value.asInstanceOf[js.Any])
      
      inline def setControlsPrevHtml(value: String): Self = StObject.set(x, "controlsPrevHtml", value.asInstanceOf[js.Any])
      
      inline def setControlsVisible(value: Boolean): Self = StObject.set(x, "controlsVisible", value.asInstanceOf[js.Any])
      
      inline def setControlsWidth(value: Double): Self = StObject.set(x, "controlsWidth", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDir(value: rtl | ltr): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDisable3d(value: Boolean): Self = StObject.set(x, "disable3d", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: Double): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInverseScaling(value: Double): Self = StObject.set(x, "inverseScaling", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      inline def setOnLastSlide(value: () => Unit): Self = StObject.set(x, "onLastSlide", js.Any.fromFunction0(value))
      
      inline def setOnMainSlideClick(value: Index => Unit): Self = StObject.set(x, "onMainSlideClick", js.Any.fromFunction1(value))
      
      inline def setOnSlideChange(value: () => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction0(value))
      
      inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlideProps extends StObject {
    
    var index: Double
  }
  object SlideProps {
    
    inline def apply(index: Double): SlideProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideProps] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
