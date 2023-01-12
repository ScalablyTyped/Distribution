package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.libCommonRalMod.RAL.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonEncodingMod {
  
  object Encodings {
    
    @JSImport("vscode-jsonrpc/lib/common/encoding", "Encodings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEncodingHeaderValue(encodings: js.Array[Named]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingHeaderValue")(encodings.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def parseEncodingHeaderValue(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEncodingHeaderValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  type ContentDecoder = FunctionContentDecoder | (FunctionContentDecoder & StreamContentDecoder)
  
  type ContentEncoder = FunctionContentEncoder | (FunctionContentEncoder & StreamContentEncoder)
  
  type ContentTypeDecoder = FunctionContentTypeDecoder | (FunctionContentTypeDecoder & StreamContentTypeDecoder)
  
  trait ContentTypeDecoderOptions extends StObject {
    
    var charset: MessageBufferEncoding
  }
  object ContentTypeDecoderOptions {
    
    inline def apply(charset: MessageBufferEncoding): ContentTypeDecoderOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTypeDecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentTypeDecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: MessageBufferEncoding): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentTypeEncoder = FunctionContentTypeEncoder | (FunctionContentTypeEncoder & StreamContentTypeEncoder)
  
  trait ContentTypeEncoderOptions extends StObject {
    
    var charset: MessageBufferEncoding
  }
  object ContentTypeEncoderOptions {
    
    inline def apply(charset: MessageBufferEncoding): ContentTypeEncoderOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTypeEncoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentTypeEncoderOptions] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: MessageBufferEncoding): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionContentDecoder extends StObject {
    
    def decode(buffer: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    
    var name: String
  }
  object FunctionContentDecoder {
    
    inline def apply(decode: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array], name: String): FunctionContentDecoder = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionContentDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionContentDecoder] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionContentEncoder extends StObject {
    
    def encode(input: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    
    var name: String
  }
  object FunctionContentEncoder {
    
    inline def apply(encode: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array], name: String): FunctionContentEncoder = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionContentEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionContentEncoder] (val x: Self) extends AnyVal {
      
      inline def setEncode(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionContentTypeDecoder extends StObject {
    
    def decode(buffer: js.typedarray.Uint8Array, options: ContentTypeDecoderOptions): js.Promise[Message]
    
    var name: String
  }
  object FunctionContentTypeDecoder {
    
    inline def apply(decode: (js.typedarray.Uint8Array, ContentTypeDecoderOptions) => js.Promise[Message], name: String): FunctionContentTypeDecoder = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionContentTypeDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionContentTypeDecoder] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: (js.typedarray.Uint8Array, ContentTypeDecoderOptions) => js.Promise[Message]): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionContentTypeEncoder extends StObject {
    
    def encode(msg: Message, options: ContentTypeEncoderOptions): js.Promise[js.typedarray.Uint8Array]
    
    var name: String
  }
  object FunctionContentTypeEncoder {
    
    inline def apply(encode: (Message, ContentTypeEncoderOptions) => js.Promise[js.typedarray.Uint8Array], name: String): FunctionContentTypeEncoder = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionContentTypeEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionContentTypeEncoder] (val x: Self) extends AnyVal {
      
      inline def setEncode(value: (Message, ContentTypeEncoderOptions) => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Named extends StObject {
    
    var name: String
  }
  object Named {
    
    inline def apply(name: String): Named = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Named]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Named] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamContentDecoder extends StObject {
    
    def create(): WritableStream
    
    var name: String
  }
  object StreamContentDecoder {
    
    inline def apply(create: () => WritableStream, name: String): StreamContentDecoder = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamContentDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamContentDecoder] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => WritableStream): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamContentEncoder extends StObject {
    
    def create(): WritableStream
    
    var name: String
  }
  object StreamContentEncoder {
    
    inline def apply(create: () => WritableStream, name: String): StreamContentEncoder = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamContentEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamContentEncoder] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => WritableStream): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamContentTypeDecoder extends StObject {
    
    def create(options: ContentTypeDecoderOptions): WritableStream
    
    var name: String
  }
  object StreamContentTypeDecoder {
    
    inline def apply(create: ContentTypeDecoderOptions => WritableStream, name: String): StreamContentTypeDecoder = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamContentTypeDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamContentTypeDecoder] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: ContentTypeDecoderOptions => WritableStream): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamContentTypeEncoder extends StObject {
    
    def create(options: ContentTypeEncoderOptions): WritableStream
    
    var name: String
  }
  object StreamContentTypeEncoder {
    
    inline def apply(create: ContentTypeEncoderOptions => WritableStream, name: String): StreamContentTypeEncoder = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamContentTypeEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamContentTypeEncoder] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: ContentTypeEncoderOptions => WritableStream): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
