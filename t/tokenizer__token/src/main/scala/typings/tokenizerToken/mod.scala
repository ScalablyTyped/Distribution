package typings.tokenizerToken

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IGetToken[T] extends StObject {
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    def get(buffer: Buffer, offset: Double): T
    
    /**
      * Length of encoded token in bytes
      */
    var len: Double
  }
  object IGetToken {
    
    inline def apply[T](get: (Buffer, Double) => T, len: Double): IGetToken[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetToken[T]]
    }
    
    extension [Self <: IGetToken[?], T](x: Self & IGetToken[T]) {
      
      inline def setGet(value: (Buffer, Double) => T): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    }
  }
  
  trait IToken[T]
    extends StObject
       with IGetToken[T] {
    
    /**
      * Encode value to buffer
      * @param buffer - Buffer to write the encoded value to
      * @param offset - Buffer write offset
      * @param value - Value to decode of type T
      */
    def put(buffer: Buffer, offset: Double, value: T): Double
  }
  object IToken {
    
    inline def apply[T](get: (Buffer, Double) => T, len: Double, put: (Buffer, Double, T) => Double): IToken[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any], put = js.Any.fromFunction3(put))
      __obj.asInstanceOf[IToken[T]]
    }
    
    extension [Self <: IToken[?], T](x: Self & IToken[T]) {
      
      inline def setPut(value: (Buffer, Double, T) => Double): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
}
