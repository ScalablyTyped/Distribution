package typings
package textDashEncodingLib.textDashEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding", "TextEncoder")
@js.native
class TextEncoder ()
  extends textDashEncodingLib.TextEncoder {
  def this(utfLabel: java.lang.String) = this()
  def this(utfLabel: java.lang.String, options: textDashEncodingLib.TextEncodingNs.TextEncoderOptions) = this()
}

@JSImport("text-encoding", "TextEncoder")
@js.native
object TextEncoder
  extends org.scalablytyped.runtime.Instantiable0[textDashEncodingLib.TextEncoder]
     with org.scalablytyped.runtime.Instantiable1[/* utfLabel */ java.lang.String, textDashEncodingLib.TextEncoder]
     with org.scalablytyped.runtime.Instantiable2[
      /* utfLabel */ java.lang.String, 
      /* options */ textDashEncodingLib.TextEncodingNs.TextEncoderOptions, 
      textDashEncodingLib.TextEncoder
    ] {
  var encoding: java.lang.String = js.native
  def apply(): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String): textDashEncodingLib.TextEncoder = js.native
  def apply(utfLabel: java.lang.String, options: textDashEncodingLib.TextEncodingNs.TextEncoderOptions): textDashEncodingLib.TextEncoder = js.native
}

