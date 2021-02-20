package typings.textEncoding

import typings.textEncoding.TextEncoding.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding", "TextDecoder")
  @js.native
  class TextDecoder ()
    extends typings.textEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
    def this(label: String, options: TextDecoderOptions) = this()
  }
  object TextDecoder {
    
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    def apply(): typings.textEncoding.TextDecoder = js.native
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    def apply(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions): typings.textEncoding.TextDecoder = js.native
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    def apply(label: String): typings.textEncoding.TextDecoder = js.native
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    def apply(label: String, options: TextDecoderOptions): typings.textEncoding.TextDecoder = js.native
    @JSImport("text-encoding", "TextDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("text-encoding", "TextDecoder.encoding")
    @js.native
    def encoding: String = js.native
    @scala.inline
    def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("text-encoding", "TextEncoder")
  @js.native
  class TextEncoder ()
    extends typings.textEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
  }
  object TextEncoder {
    
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    def apply(): typings.textEncoding.TextEncoder = js.native
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    def apply(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    def apply(utfLabel: String): typings.textEncoding.TextEncoder = js.native
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
    @JSImport("text-encoding", "TextEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("text-encoding", "TextEncoder.encoding")
    @js.native
    def encoding: String = js.native
    @scala.inline
    def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
  }
}
