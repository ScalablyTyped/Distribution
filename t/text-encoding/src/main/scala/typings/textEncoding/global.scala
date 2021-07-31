package typings.textEncoding

import typings.textEncoding.TextEncoding.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TextEncoding {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextDecoder")
    @js.native
    class TextDecoder ()
      extends StObject
         with typings.textEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: String, options: TextDecoderOptions) = this()
      def this(label: Unit, options: TextDecoderOptions) = this()
    }
    object TextDecoder {
      
      @scala.inline
      def apply(): typings.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.textEncoding.TextDecoder]
      @scala.inline
      def apply(label: String): typings.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any]).asInstanceOf[typings.textEncoding.TextDecoder]
      @scala.inline
      def apply(label: String, options: TextDecoderOptions): typings.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextDecoder]
      @scala.inline
      def apply(label: Unit, options: TextDecoderOptions): typings.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextDecoder]
      
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextDecoder.encoding")
      @js.native
      def encoding: String = js.native
      @scala.inline
      def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextEncoder")
    @js.native
    class TextEncoder ()
      extends StObject
         with typings.textEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
      def this(utfLabel: Unit, options: TextEncoderOptions) = this()
    }
    object TextEncoder {
      
      @scala.inline
      def apply(): typings.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.textEncoding.TextEncoder]
      @scala.inline
      def apply(utfLabel: String): typings.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any]).asInstanceOf[typings.textEncoding.TextEncoder]
      @scala.inline
      def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextEncoder]
      @scala.inline
      def apply(utfLabel: Unit, options: TextEncoderOptions): typings.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextEncoder]
      
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextEncoder.encoding")
      @js.native
      def encoding: String = js.native
      @scala.inline
      def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
  }
}
