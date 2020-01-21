package typings.textEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStatic
  extends Instantiable0[typings.textEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typings.textEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typings.textEncoding.TextEncoder
    ] {
  def apply(): typings.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typings.textEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typings.textEncoding.TextEncoder = js.native
}

