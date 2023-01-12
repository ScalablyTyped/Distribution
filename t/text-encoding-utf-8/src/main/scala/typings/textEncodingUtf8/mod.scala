package typings.textEncodingUtf8

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.textEncodingUtf8.mod.TextEncoding.TextDecoderOptions
import typings.textEncodingUtf8.mod.TextEncoding.TextDecoderStatic
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderOptions
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding-utf-8", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends StObject
       with typings.textEncodingUtf8.mod.TextEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  @JSImport("text-encoding-utf-8", "TextDecoder")
  @js.native
  val TextDecoder: TextDecoderStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding-utf-8", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends StObject
       with typings.textEncodingUtf8.mod.TextEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
    def this(utfLabel: Unit, options: TextEncoderOptions) = this()
  }
  @JSImport("text-encoding-utf-8", "TextEncoder")
  @js.native
  val TextEncoder: TextEncoderStatic = js.native
  
  object TextEncoding extends Shortcut {
    
    @JSImport("text-encoding-utf-8", "TextEncoding")
    @js.native
    val ^ : TextEncodingStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("text-encoding-utf-8", "TextEncoding.TextDecoder")
    @js.native
    open class TextDecoderCls ()
      extends StObject
         with typings.textEncodingUtf8.mod.TextEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: String, options: TextDecoderOptions) = this()
      def this(label: Unit, options: TextDecoderOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("text-encoding-utf-8", "TextEncoding.TextEncoder")
    @js.native
    open class TextEncoderCls ()
      extends StObject
         with typings.textEncodingUtf8.mod.TextEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
      def this(utfLabel: Unit, options: TextEncoderOptions) = this()
    }
    
    trait TextDecodeOptions extends StObject {
      
      var stream: js.UndefOr[Boolean] = js.undefined
    }
    object TextDecodeOptions {
      
      inline def apply(): TextDecodeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextDecodeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TextDecodeOptions] (val x: Self) extends AnyVal {
        
        inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      }
    }
    
    @js.native
    trait TextDecoder extends StObject {
      
      def decode(): String = js.native
      def decode(input: js.typedarray.ArrayBuffer): String = js.native
      def decode(input: js.typedarray.ArrayBufferView): String = js.native
      def decode(input: js.typedarray.ArrayBufferView, options: TextDecodeOptions): String = js.native
      def decode(input: js.typedarray.ArrayBuffer, options: TextDecodeOptions): String = js.native
      def decode(input: Unit, options: TextDecodeOptions): String = js.native
      
      var encoding: String = js.native
      
      var fatal: Boolean = js.native
      
      var ignoreBOM: Boolean = js.native
    }
    
    trait TextDecoderOptions extends StObject {
      
      var fatal: js.UndefOr[Boolean] = js.undefined
      
      var ignoreBOM: js.UndefOr[Boolean] = js.undefined
    }
    object TextDecoderOptions {
      
      inline def apply(): TextDecoderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextDecoderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
        
        inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
        
        inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
        
        inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
        
        inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
      }
    }
    
    @js.native
    trait TextDecoderStatic
      extends StObject
         with Instantiable0[typings.textEncodingUtf8.mod.TextEncoding.TextDecoder]
         with Instantiable1[/* label */ String, typings.textEncodingUtf8.mod.TextEncoding.TextDecoder]
         with Instantiable2[
              (/* label */ String) | (/* label */ Unit), 
              /* options */ TextDecoderOptions, 
              typings.textEncodingUtf8.mod.TextEncoding.TextDecoder
            ] {
      
      def apply(): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
      def apply(label: String): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
      def apply(label: String, options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
      def apply(label: Unit, options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
    }
    
    trait TextEncodeOptions extends StObject {
      
      var stream: js.UndefOr[Boolean] = js.undefined
    }
    object TextEncodeOptions {
      
      inline def apply(): TextEncodeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextEncodeOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TextEncodeOptions] (val x: Self) extends AnyVal {
        
        inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      }
    }
    
    @js.native
    trait TextEncoder extends StObject {
      
      def encode(): js.typedarray.Uint8Array = js.native
      def encode(input: String): js.typedarray.Uint8Array = js.native
      def encode(input: String, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
      def encode(input: Unit, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
      
      var encoding: String = js.native
    }
    
    trait TextEncoderOptions extends StObject {
      
      var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.undefined
    }
    object TextEncoderOptions {
      
      inline def apply(): TextEncoderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextEncoderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
        
        inline def setNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", value.asInstanceOf[js.Any])
        
        inline def setNONSTANDARD_allowLegacyEncodingUndefined: Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", js.undefined)
      }
    }
    
    @js.native
    trait TextEncoderStatic
      extends StObject
         with Instantiable0[typings.textEncodingUtf8.mod.TextEncoding.TextEncoder]
         with Instantiable1[/* utfLabel */ String, typings.textEncodingUtf8.mod.TextEncoding.TextEncoder]
         with Instantiable2[
              (/* utfLabel */ String) | (/* utfLabel */ Unit), 
              /* options */ TextEncoderOptions, 
              typings.textEncodingUtf8.mod.TextEncoding.TextEncoder
            ] {
      
      def apply(): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
      def apply(utfLabel: String): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
      def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
      def apply(utfLabel: Unit, options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
    }
    
    trait TextEncodingStatic extends StObject {
      
      def TextDecoder(): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder
      def TextDecoder(label: String): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder
      def TextDecoder(label: String, options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder
      def TextDecoder(label: Unit, options: TextDecoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextDecoder
      @JSName("TextDecoder")
      var TextDecoder_Original: TextDecoderStatic
      
      def TextEncoder(): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder
      def TextEncoder(utfLabel: String): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder
      def TextEncoder(utfLabel: String, options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder
      def TextEncoder(utfLabel: Unit, options: TextEncoderOptions): typings.textEncodingUtf8.mod.TextEncoding.TextEncoder
      @JSName("TextEncoder")
      var TextEncoder_Original: TextEncoderStatic
    }
    object TextEncodingStatic {
      
      inline def apply(TextDecoder: TextDecoderStatic, TextEncoder: TextEncoderStatic): TextEncodingStatic = {
        val __obj = js.Dynamic.literal(TextDecoder = TextDecoder.asInstanceOf[js.Any], TextEncoder = TextEncoder.asInstanceOf[js.Any])
        __obj.asInstanceOf[TextEncodingStatic]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TextEncodingStatic] (val x: Self) extends AnyVal {
        
        inline def setTextDecoder(value: TextDecoderStatic): Self = StObject.set(x, "TextDecoder", value.asInstanceOf[js.Any])
        
        inline def setTextEncoder(value: TextEncoderStatic): Self = StObject.set(x, "TextEncoder", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = TextEncodingStatic
    
    /* This means you don't have to write `^`, but can instead just say `TextEncoding.foo` */
    override def _to: TextEncodingStatic = ^
  }
}
