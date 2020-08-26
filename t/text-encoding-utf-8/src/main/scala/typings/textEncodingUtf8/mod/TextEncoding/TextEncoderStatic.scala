package typings.textEncodingUtf8.mod.TextEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStatic
  extends Instantiable0[TextEncoder]
     with Instantiable1[/* utfLabel */ String, TextEncoder]
     with Instantiable2[js.UndefOr[/* utfLabel */ String], /* options */ TextEncoderOptions, TextEncoder] {
  def apply(): TextEncoder = js.native
  def apply(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): TextEncoder = js.native
  def apply(utfLabel: String): TextEncoder = js.native
  def apply(utfLabel: String, options: TextEncoderOptions): TextEncoder = js.native
}

