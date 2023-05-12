package typings.svelte

import typings.std.DOMRectReadOnly
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalResizeObserverSingletonMod {
  
  @JSImport("svelte/types/runtime/internal/ResizeObserverSingleton", "ResizeObserverSingleton")
  @js.native
  open class ResizeObserverSingleton () extends StObject {
    def this(options: ResizeObserverOptions) = this()
    
    /* private */ var _getObserver: Any = js.native
    
    /* private */ val _listeners: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    def observe(element: Element, listener: Listener): js.Function0[Unit] = js.native
    
    val options: js.UndefOr[ResizeObserverOptions] = js.native
  }
  
  type Listener = js.Function1[/* entry */ ResizeObserverEntry, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.svelte.svelteStrings.`border-box`
    - typings.svelte.svelteStrings.`content-box`
    - typings.svelte.svelteStrings.`device-pixel-content-box`
  */
  trait ResizeObserverBoxOptions extends StObject
  object ResizeObserverBoxOptions {
    
    inline def `border-box`: typings.svelte.svelteStrings.`border-box` = "border-box".asInstanceOf[typings.svelte.svelteStrings.`border-box`]
    
    inline def `content-box`: typings.svelte.svelteStrings.`content-box` = "content-box".asInstanceOf[typings.svelte.svelteStrings.`content-box`]
    
    inline def `device-pixel-content-box`: typings.svelte.svelteStrings.`device-pixel-content-box` = "device-pixel-content-box".asInstanceOf[typings.svelte.svelteStrings.`device-pixel-content-box`]
  }
  
  trait ResizeObserverEntry extends StObject {
    
    val borderBoxSize: js.Array[ResizeObserverSize]
    
    val contentBoxSize: js.Array[ResizeObserverSize]
    
    val contentRect: DOMRectReadOnly
    
    val devicePixelContentBoxSize: js.Array[ResizeObserverSize]
    
    val target: Element
  }
  object ResizeObserverEntry {
    
    inline def apply(
      borderBoxSize: js.Array[ResizeObserverSize],
      contentBoxSize: js.Array[ResizeObserverSize],
      contentRect: DOMRectReadOnly,
      devicePixelContentBoxSize: js.Array[ResizeObserverSize],
      target: Element
    ): ResizeObserverEntry = {
      val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], devicePixelContentBoxSize = devicePixelContentBoxSize.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
      
      inline def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
      
      inline def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "borderBoxSize", js.Array(value*))
      
      inline def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
      
      inline def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "contentBoxSize", js.Array(value*))
      
      inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
      
      inline def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
      
      inline def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "devicePixelContentBoxSize", js.Array(value*))
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeObserverOptions extends StObject {
    
    var box: js.UndefOr[ResizeObserverBoxOptions] = js.undefined
  }
  object ResizeObserverOptions {
    
    inline def apply(): ResizeObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeObserverOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeObserverOptions] (val x: Self) extends AnyVal {
      
      inline def setBox(value: ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    }
  }
  
  trait ResizeObserverSize extends StObject {
    
    val blockSize: Double
    
    val inlineSize: Double
  }
  object ResizeObserverSize {
    
    inline def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeObserverSize] (val x: Self) extends AnyVal {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSize(value: Double): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
    }
  }
}
