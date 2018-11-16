package typings
package textDashEncodingLib.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStatic
  extends ScalablyTyped.runtime.Instantiable0[textDashEncodingLib.TextEncoder]
     with ScalablyTyped.runtime.Instantiable1[/* utfLabel */ java.lang.String, textDashEncodingLib.TextEncoder]
     with ScalablyTyped.runtime.Instantiable2[
      /* utfLabel */ java.lang.String, 
      /* options */ TextEncoderOptions, 
      textDashEncodingLib.TextEncoder
    ] {
  def apply(): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String, options: TextEncoderOptions): textDashEncodingLib.TextEncoder = js.native
}

