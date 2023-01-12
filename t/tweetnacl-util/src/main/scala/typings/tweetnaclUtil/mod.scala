package typings.tweetnaclUtil

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tweetnacl-util", JSImport.Namespace)
  @js.native
  val ^ : util = js.native
  
  type _To = util
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: util = ^
  
  trait util extends StObject {
    
    def decodeBase64(s: String): js.typedarray.Uint8Array
    
    def decodeUTF8(s: String): js.typedarray.Uint8Array
    
    def encodeBase64(arr: js.typedarray.Uint8Array): String
    
    def encodeUTF8(arr: js.typedarray.Uint8Array): String
  }
  object util {
    
    inline def apply(
      decodeBase64: String => js.typedarray.Uint8Array,
      decodeUTF8: String => js.typedarray.Uint8Array,
      encodeBase64: js.typedarray.Uint8Array => String,
      encodeUTF8: js.typedarray.Uint8Array => String
    ): util = {
      val __obj = js.Dynamic.literal(decodeBase64 = js.Any.fromFunction1(decodeBase64), decodeUTF8 = js.Any.fromFunction1(decodeUTF8), encodeBase64 = js.Any.fromFunction1(encodeBase64), encodeUTF8 = js.Any.fromFunction1(encodeUTF8))
      __obj.asInstanceOf[util]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: util] (val x: Self) extends AnyVal {
      
      inline def setDecodeBase64(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decodeBase64", js.Any.fromFunction1(value))
      
      inline def setDecodeUTF8(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decodeUTF8", js.Any.fromFunction1(value))
      
      inline def setEncodeBase64(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encodeBase64", js.Any.fromFunction1(value))
      
      inline def setEncodeUTF8(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encodeUTF8", js.Any.fromFunction1(value))
    }
  }
}
