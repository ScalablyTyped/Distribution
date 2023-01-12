package typings.useResizeObserver

import typings.react.mod.RefCallback
import typings.std.Element
import typings.std.ResizeObserverSize
import typings.useResizeObserver.anon.Box
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Element */](): HookResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HookResponse[T]]
  inline def default[T /* <: Element */](opts: Box[T]): HookResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[HookResponse[T]]
  
  trait HookResponse[T /* <: Element */]
    extends StObject
       with ObservedSize {
    
    var ref: RefCallback[T]
  }
  object HookResponse {
    
    inline def apply[T /* <: Element */](ref: /* instance */ T | Null => Unit): HookResponse[T] = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[HookResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookResponse[?], T /* <: Element */] (val x: Self & HookResponse[T]) extends AnyVal {
      
      inline def setRef(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  trait ObservedSize extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ObservedSize {
    
    inline def apply(): ObservedSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObservedSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservedSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ResizeHandler = js.Function1[/* size */ ObservedSize, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.useResizeObserver.useResizeObserverStrings.`border-box`
    - typings.useResizeObserver.useResizeObserverStrings.`content-box`
    - typings.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box`
  */
  trait ResizeObserverBoxOptions extends StObject
  object ResizeObserverBoxOptions {
    
    inline def `border-box`: typings.useResizeObserver.useResizeObserverStrings.`border-box` = "border-box".asInstanceOf[typings.useResizeObserver.useResizeObserverStrings.`border-box`]
    
    inline def `content-box`: typings.useResizeObserver.useResizeObserverStrings.`content-box` = "content-box".asInstanceOf[typings.useResizeObserver.useResizeObserverStrings.`content-box`]
    
    inline def `device-pixel-content-box`: typings.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box` = "device-pixel-content-box".asInstanceOf[typings.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box`]
  }
  
  type RoundingFunction = js.Function1[/* n */ Double, Double]
  
  object global {
    
    trait ResizeObserverEntry extends StObject {
      
      val devicePixelContentBoxSize: js.Array[ResizeObserverSize]
    }
    object ResizeObserverEntry {
      
      inline def apply(devicePixelContentBoxSize: js.Array[ResizeObserverSize]): ResizeObserverEntry = {
        val __obj = js.Dynamic.literal(devicePixelContentBoxSize = devicePixelContentBoxSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResizeObserverEntry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
        
        inline def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
        
        inline def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "devicePixelContentBoxSize", js.Array(value*))
      }
    }
  }
}
