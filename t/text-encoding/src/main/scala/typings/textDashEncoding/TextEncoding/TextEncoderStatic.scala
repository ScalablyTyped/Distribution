package typings.textDashEncoding.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStatic
  extends Instantiable0[typings.textDashEncoding.TextEncoder]
     with Instantiable1[/* utfLabel */ String, typings.textDashEncoding.TextEncoder]
     with Instantiable2[
      /* utfLabel */ String, 
      /* options */ TextEncoderOptions, 
      typings.textDashEncoding.TextEncoder
    ] {
  def apply(): typings.textDashEncoding.TextEncoder = js.native
  def apply(utfLabel: String): typings.textDashEncoding.TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): typings.textDashEncoding.TextEncoder = js.native
}

