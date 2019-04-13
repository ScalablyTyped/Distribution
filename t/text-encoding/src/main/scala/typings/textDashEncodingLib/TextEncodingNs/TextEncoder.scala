package typings
package textDashEncodingLib.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextEncoder")
@js.native
class TextEncoder ()
  extends textDashEncodingLib.TextEncoder {
  def this(utfLabel: java.lang.String) = this()
  def this(utfLabel: java.lang.String, options: TextEncoderOptions) = this()
}

@JSGlobal("TextEncoding.TextEncoder")
@js.native
object TextEncoder
  extends org.scalablytyped.runtime.Instantiable0[textDashEncodingLib.TextEncoder]
     with org.scalablytyped.runtime.Instantiable1[/* utfLabel */ java.lang.String, textDashEncodingLib.TextEncoder]
     with org.scalablytyped.runtime.Instantiable2[
      /* utfLabel */ java.lang.String, 
      /* options */ TextEncoderOptions, 
      textDashEncodingLib.TextEncoder
    ] {
  var encoding: java.lang.String = js.native
  def apply(): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String, options: textDashEncodingLib.TextEncodingNs.TextEncoderOptions): textDashEncodingLib.TextEncoder = js.native
}

