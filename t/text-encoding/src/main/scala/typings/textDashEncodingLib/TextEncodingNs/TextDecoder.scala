package typings
package textDashEncodingLib.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoding.TextDecoder")
@js.native
class TextDecoder ()
  extends textDashEncodingLib.TextDecoder {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, options: textDashEncodingLib.TextDecoderOptions) = this()
}

@JSGlobal("TextEncoding.TextDecoder")
@js.native
object TextDecoder
  extends org.scalablytyped.runtime.Instantiable0[textDashEncodingLib.TextDecoder]
     with org.scalablytyped.runtime.Instantiable1[/* label */ java.lang.String, textDashEncodingLib.TextDecoder]
     with org.scalablytyped.runtime.Instantiable2[
      /* label */ java.lang.String, 
      /* options */ textDashEncodingLib.TextDecoderOptions, 
      textDashEncodingLib.TextDecoder
    ] {
  var encoding: java.lang.String = js.native
  def apply(): textDashEncodingLib.TextDecoder = js.native
  def apply(label: java.lang.String): textDashEncodingLib.TextDecoder = js.native
  def apply(label: java.lang.String, options: textDashEncodingLib.TextDecoderOptions): textDashEncodingLib.TextDecoder = js.native
}

