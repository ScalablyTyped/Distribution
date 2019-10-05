package typings.textDashEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.textDashEncoding.TextEncoding.TextEncoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding", JSImport.Namespace)
@js.native
object textDashEncodingMod extends js.Object {
  @js.native
  class TextDecoder ()
    extends typings.textDashEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
  }
  
  @js.native
  class TextEncoder ()
    extends typings.textDashEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
  }
  
  @js.native
  object TextDecoder
    extends Instantiable0[typings.textDashEncoding.TextDecoder]
       with Instantiable1[/* label */ String, typings.textDashEncoding.TextDecoder]
       with Instantiable2[
          /* label */ String, 
          /* options */ TextDecoderOptions, 
          typings.textDashEncoding.TextDecoder
        ] {
    var encoding: String = js.native
    def apply(): typings.textDashEncoding.TextDecoder = js.native
    def apply(label: String): typings.textDashEncoding.TextDecoder = js.native
    def apply(label: String, options: TextDecoderOptions): typings.textDashEncoding.TextDecoder = js.native
  }
  
  @js.native
  object TextEncoder
    extends Instantiable0[typings.textDashEncoding.TextEncoder]
       with Instantiable1[/* utfLabel */ String, typings.textDashEncoding.TextEncoder]
       with Instantiable2[
          /* utfLabel */ String, 
          /* options */ TextEncoderOptions, 
          typings.textDashEncoding.TextEncoder
        ] {
    var encoding: String = js.native
    def apply(): typings.textDashEncoding.TextEncoder = js.native
    def apply(utfLabel: String): typings.textDashEncoding.TextEncoder = js.native
    def apply(utfLabel: String, options: TextEncoderOptions): typings.textDashEncoding.TextEncoder = js.native
  }
  
}

