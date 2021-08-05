package typings.svg2png

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(sourceBuffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(sourceBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(sourceBuffer: Buffer, opts: opts): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(sourceBuffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("svg2png", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(sourceBuffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(sourceBuffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def sync(sourceBuffer: Buffer, opts: opts): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(sourceBuffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait opts extends StObject {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object opts {
    
    inline def apply(): opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[opts]
    }
    
    extension [Self <: opts](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
