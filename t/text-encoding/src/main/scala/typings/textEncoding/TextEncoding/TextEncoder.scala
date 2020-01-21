package typings.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextEncoder")
@js.native
class TextEncoder ()
  extends typings.textEncoding.TextEncoder {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: TextEncoderOptions) = this()
}

@JSGlobal("TextEncoding.TextEncoder")
@js.native
object TextEncoder
  extends Instantiable0[typings.textEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typings.textEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typings.textEncoding.TextEncoder
    ] {
  var encoding: String = js.native
  def apply(): typings.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typings.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
}

