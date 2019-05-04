package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encode extends js.Object {
  var encode: Anon_UpdateAnonAlign
  var offset: scala.Double
  var orient: java.lang.String
  var style: java.lang.String
  var text: Anon_Signal
}

object Anon_Encode {
  @scala.inline
  def apply(
    encode: Anon_UpdateAnonAlign,
    offset: scala.Double,
    orient: java.lang.String,
    style: java.lang.String,
    text: Anon_Signal
  ): Anon_Encode = {
    val __obj = js.Dynamic.literal(encode = encode, offset = offset, orient = orient, style = style, text = text)
  
    __obj.asInstanceOf[Anon_Encode]
  }
}

