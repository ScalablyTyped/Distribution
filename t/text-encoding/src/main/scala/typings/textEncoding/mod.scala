package typings.textEncoding

import typings.textEncoding.TextEncoding.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding", "TextDecoder")
  @js.native
  class TextDecoder ()
    extends StObject
       with typings.textEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  object TextDecoder {
    
    inline def apply(): typings.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.textEncoding.TextDecoder]
    inline def apply(label: String): typings.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any]).asInstanceOf[typings.textEncoding.TextDecoder]
    inline def apply(label: String, options: TextDecoderOptions): typings.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextDecoder]
    inline def apply(label: Unit, options: TextDecoderOptions): typings.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextDecoder]
    
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("text-encoding", "TextDecoder.encoding")
    @js.native
    def encoding: String = js.native
    inline def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding", "TextEncoder")
  @js.native
  class TextEncoder ()
    extends StObject
       with typings.textEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
    def this(utfLabel: Unit, options: TextEncoderOptions) = this()
  }
  object TextEncoder {
    
    inline def apply(): typings.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.textEncoding.TextEncoder]
    inline def apply(utfLabel: String): typings.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any]).asInstanceOf[typings.textEncoding.TextEncoder]
    inline def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextEncoder]
    inline def apply(utfLabel: Unit, options: TextEncoderOptions): typings.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.textEncoding.TextEncoder]
    
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("text-encoding", "TextEncoder.encoding")
    @js.native
    def encoding: String = js.native
    inline def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
  }
}
