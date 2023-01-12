package typings.ttf2woff

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ttf: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].apply(ttf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def apply(ttf: js.typedarray.Uint8Array, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].apply(ttf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("ttf2woff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Woff Extended Metadata Block
      *
      * See https://www.w3.org/TR/WOFF/#Metadata
      */
    var metadata: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
