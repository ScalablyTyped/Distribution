package typings.tokenizerToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IGetToken[Value, Array /* <: js.typedarray.Uint8Array */] extends StObject {
    
    /**
      * Decode value from buffer at offset
      * @param array - Uint8Array to read the decoded value from
      * @param offset - Decode offset
      * @return decoded value
      */
    def get(array: Array, offset: Double): Value
    
    /**
      * Length of encoded token in bytes
      */
    var len: Double
  }
  object IGetToken {
    
    inline def apply[Value, Array /* <: js.typedarray.Uint8Array */](get: (Array, Double) => Value, len: Double): IGetToken[Value, Array] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetToken[Value, Array]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetToken[?, ?], Value, Array /* <: js.typedarray.Uint8Array */] (val x: Self & (IGetToken[Value, Array])) extends AnyVal {
      
      inline def setGet(value: (Array, Double) => Value): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToken[Value, Array /* <: js.typedarray.Uint8Array */]
    extends StObject
       with IGetToken[Value, Array] {
    
    /**
      * Encode value to buffer
      * @param array - Uint8Array to write the encoded value to
      * @param offset - Buffer write offset
      * @param value - Value to decode of type T
      * @return offset plus number of bytes written
      */
    def put(array: Array, offset: Double, value: Value): Double
  }
  object IToken {
    
    inline def apply[Value, Array /* <: js.typedarray.Uint8Array */](get: (Array, Double) => Value, len: Double, put: (Array, Double, Value) => Double): IToken[Value, Array] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any], put = js.Any.fromFunction3(put))
      __obj.asInstanceOf[IToken[Value, Array]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToken[?, ?], Value, Array /* <: js.typedarray.Uint8Array */] (val x: Self & (IToken[Value, Array])) extends AnyVal {
      
      inline def setPut(value: (Array, Double, Value) => Double): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
}
