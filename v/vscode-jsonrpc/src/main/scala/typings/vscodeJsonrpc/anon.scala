package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentTypeDecoder
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentTypeEncoder
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBuffer
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(encoding: MessageBufferEncoding): MessageBuffer
  }
  object Create {
    
    inline def apply(create: MessageBufferEncoding => MessageBuffer): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: MessageBufferEncoding => MessageBuffer): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait Decoder extends StObject {
    
    val decoder: ContentTypeDecoder
    
    val encoder: ContentTypeEncoder
  }
  object Decoder {
    
    inline def apply(decoder: ContentTypeDecoder, encoder: ContentTypeEncoder): Decoder = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any], encoder = encoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoder]
    }
    
    extension [Self <: Decoder](x: Self) {
      
      inline def setDecoder(value: ContentTypeDecoder): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setEncoder(value: ContentTypeEncoder): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    def error(message: Any, optionalParams: Any*): Unit = js.native
    def error(message: Unit, optionalParams: Any*): Unit = js.native
    
    def info(message: Any, optionalParams: Any*): Unit = js.native
    def info(message: Unit, optionalParams: Any*): Unit = js.native
    
    def log(message: Any, optionalParams: Any*): Unit = js.native
    def log(message: Unit, optionalParams: Any*): Unit = js.native
    
    def warn(message: Any, optionalParams: Any*): Unit = js.native
    def warn(message: Unit, optionalParams: Any*): Unit = js.native
  }
  
  trait SetImmediate extends StObject {
    
    def setImmediate(callback: js.Function1[/* repeated */ Any, Unit], args: Any*): Disposable
    
    def setInterval(callback: js.Function1[/* repeated */ Any, Unit], ms: Double, args: Any*): Disposable
    
    def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], ms: Double, args: Any*): Disposable
  }
  object SetImmediate {
    
    inline def apply(
      setImmediate: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Disposable,
      setInterval: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Disposable,
      setTimeout: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Disposable
    ): SetImmediate = {
      val __obj = js.Dynamic.literal(setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout))
      __obj.asInstanceOf[SetImmediate]
    }
    
    extension [Self <: SetImmediate](x: Self) {
      
      inline def setSetImmediate(value: (js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Disposable): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetInterval(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Disposable): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Disposable): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
    }
  }
}
