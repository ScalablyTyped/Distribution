package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encode extends js.Object {
  var encode: Anon_UpdateAnonAlign
  var offset: Double
  var orient: String
  var style: String
  var text: Anon_Signal
}

object Anon_Encode {
  @scala.inline
  def apply(encode: Anon_UpdateAnonAlign, offset: Double, orient: String, style: String, text: Anon_Signal): Anon_Encode = {
    val __obj = js.Dynamic.literal(encode = encode, offset = offset, orient = orient, style = style, text = text)
  
    __obj.asInstanceOf[Anon_Encode]
  }
}

