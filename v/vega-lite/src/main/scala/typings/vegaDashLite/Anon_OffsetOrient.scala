package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetOrient extends js.Object {
  var offset: Double
  var orient: String
  var style: String
  var text: Anon_Signal
}

object Anon_OffsetOrient {
  @scala.inline
  def apply(offset: Double, orient: String, style: String, text: Anon_Signal): Anon_OffsetOrient = {
    val __obj = js.Dynamic.literal(offset = offset, orient = orient, style = style, text = text)
  
    __obj.asInstanceOf[Anon_OffsetOrient]
  }
}

