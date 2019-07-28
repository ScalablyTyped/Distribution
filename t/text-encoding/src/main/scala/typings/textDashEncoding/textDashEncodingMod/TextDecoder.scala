package typings.textDashEncoding.textDashEncodingMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.textDashEncoding.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding", "TextDecoder")
@js.native
class TextDecoder ()
  extends typings.textDashEncoding.TextDecoder {
  def this(label: String) = this()
  def this(label: String, options: TextDecoderOptions) = this()
}

@JSImport("text-encoding", "TextDecoder")
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

