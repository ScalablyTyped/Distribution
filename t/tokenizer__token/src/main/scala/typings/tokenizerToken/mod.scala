package typings.tokenizerToken

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait IGetToken[T] extends StObject {
    
    /**
      * Decode value from buffer at offset
      * @param buffer - Buffer to read the decoded value from
      * @param offset - Decode offset
      * @return Decoded value
      */
    def get(buffer: Buffer, offset: Double): T = js.native
    
    /**
      * Length of encoded token in bytes
      */
    var len: Double = js.native
  }
  object IGetToken {
    
    @scala.inline
    def apply[T](get: (Buffer, Double) => T, len: Double): IGetToken[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetToken[T]]
    }
    
    @scala.inline
    implicit class IGetTokenMutableBuilder[Self <: IGetToken[_], T] (val x: Self with IGetToken[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: (Buffer, Double) => T): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IToken[T] extends IGetToken[T] {
    
    /**
      * Encode value to buffer
      * @param buffer - Buffer to write the encoded value to
      * @param offset - Buffer write offset
      * @param value - Value to decode of type T
      */
    def put(buffer: Buffer, offset: Double, value: T): Double = js.native
  }
  object IToken {
    
    @scala.inline
    def apply[T](get: (Buffer, Double) => T, len: Double, put: (Buffer, Double, T) => Double): IToken[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any], put = js.Any.fromFunction3(put))
      __obj.asInstanceOf[IToken[T]]
    }
    
    @scala.inline
    implicit class ITokenMutableBuilder[Self <: IToken[_], T] (val x: Self with IToken[T]) extends AnyVal {
      
      @scala.inline
      def setPut(value: (Buffer, Double, T) => Double): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
}
