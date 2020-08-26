package typings.textEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.textEncoding.TextEncoding.TextEncoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TextDecoder ()
    extends typings.textEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
    def this(label: String, options: TextDecoderOptions) = this()
  }
  
  @js.native
  class TextEncoder ()
    extends typings.textEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
  }
  
  @js.native
  object TextDecoder
    extends Instantiable0[typings.textEncoding.TextDecoder]
       with Instantiable1[/* label */ String, typings.textEncoding.TextDecoder]
       with Instantiable2[
          js.UndefOr[/* label */ String], 
          /* options */ TextDecoderOptions, 
          typings.textEncoding.TextDecoder
        ] {
    var encoding: String = js.native
    def apply(): typings.textEncoding.TextDecoder = js.native
    def apply(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions): typings.textEncoding.TextDecoder = js.native
    def apply(label: String): typings.textEncoding.TextDecoder = js.native
    def apply(label: String, options: TextDecoderOptions): typings.textEncoding.TextDecoder = js.native
  }
  
  @js.native
  object TextEncoder
    extends Instantiable0[typings.textEncoding.TextEncoder]
       with Instantiable1[/* utfLabel */ String, typings.textEncoding.TextEncoder]
       with Instantiable2[
          js.UndefOr[/* utfLabel */ String], 
          /* options */ TextEncoderOptions, 
          typings.textEncoding.TextEncoder
        ] {
    var encoding: String = js.native
    def apply(): typings.textEncoding.TextEncoder = js.native
    def apply(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
    def apply(utfLabel: String): typings.textEncoding.TextEncoder = js.native
    def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
  }
  
}

