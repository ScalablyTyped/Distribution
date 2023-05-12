package typings.wordpressCompose

import typings.std.ResizeObserverSize
import typings.wordpressCompose.anon.Height
import typings.wordpressElement.buildTypesReactMod.WPElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseResizeObserverMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-resize-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[WPElement, Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[WPElement, Height]]
  
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
