package typings.unzipStream

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    /* used to decode non-utf8 file names in the archive. If not specified a fallback will be used. */
    var decodeString: js.UndefOr[js.Function1[/* buffer */ Buffer, String]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDecodeString(value: /* buffer */ Buffer => String): Self = StObject.set(x, "decodeString", js.Any.fromFunction1(value))
      
      inline def setDecodeStringUndefined: Self = StObject.set(x, "decodeString", js.undefined)
    }
  }
  
  trait DecodeString extends StObject {
    
    /* used to decode non-utf8 file names in the archive. If not specified a fallback will be used. */
    var decodeString: js.UndefOr[js.Function1[/* buffer */ Buffer, String]] = js.undefined
    
    var path: String
  }
  object DecodeString {
    
    inline def apply(path: String): DecodeString = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeString]
    }
    
    extension [Self <: DecodeString](x: Self) {
      
      inline def setDecodeString(value: /* buffer */ Buffer => String): Self = StObject.set(x, "decodeString", js.Any.fromFunction1(value))
      
      inline def setDecodeStringUndefined: Self = StObject.set(x, "decodeString", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
