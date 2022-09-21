package typings.textEncodingUtf8

import org.scalablytyped.runtime.Shortcut
import typings.textEncodingUtf8.mod.TextEncoding.TextDecoderOptions
import typings.textEncodingUtf8.mod.TextEncoding.TextDecoderStatic
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderOptions
import typings.textEncodingUtf8.mod.TextEncoding.TextEncoderStatic
import typings.textEncodingUtf8.mod.TextEncoding.TextEncodingStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TextEncoding {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextDecoder")
    @js.native
    open class TextDecoder ()
      extends StObject
         with typings.textEncodingUtf8.mod.TextEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: String, options: TextDecoderOptions) = this()
      def this(label: Unit, options: TextDecoderOptions) = this()
    }
    @JSGlobal("TextEncoding.TextDecoder")
    @js.native
    val TextDecoder: TextDecoderStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextEncoder")
    @js.native
    open class TextEncoder ()
      extends StObject
         with typings.textEncodingUtf8.mod.TextEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
      def this(utfLabel: Unit, options: TextEncoderOptions) = this()
    }
    @JSGlobal("TextEncoding.TextEncoder")
    @js.native
    val TextEncoder: TextEncoderStatic = js.native
    
    object TextEncoding extends Shortcut {
      
      @JSGlobal("TextEncoding.TextEncoding")
      @js.native
      val ^ : TextEncodingStatic = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("TextEncoding.TextEncoding.TextDecoder")
      @js.native
      open class TextDecoderCls ()
        extends StObject
           with typings.textEncodingUtf8.mod.TextEncoding.TextDecoder {
        def this(label: String) = this()
        def this(label: String, options: TextDecoderOptions) = this()
        def this(label: Unit, options: TextDecoderOptions) = this()
      }
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("TextEncoding.TextEncoding.TextEncoder")
      @js.native
      open class TextEncoderCls ()
        extends StObject
           with typings.textEncodingUtf8.mod.TextEncoding.TextEncoder {
        def this(utfLabel: String) = this()
        def this(utfLabel: String, options: TextEncoderOptions) = this()
        def this(utfLabel: Unit, options: TextEncoderOptions) = this()
      }
      
      type _To = TextEncodingStatic
      
      /* This means you don't have to write `^`, but can instead just say `TextEncoding.foo` */
      override def _to: TextEncodingStatic = ^
    }
  }
}
