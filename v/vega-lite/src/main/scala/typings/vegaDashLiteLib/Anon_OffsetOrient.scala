package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetOrient extends js.Object {
  var offset: scala.Double
  var orient: java.lang.String
  var style: java.lang.String
  var text: Anon_Signal
}

object Anon_OffsetOrient {
  @scala.inline
  def apply(offset: scala.Double, orient: java.lang.String, style: java.lang.String, text: Anon_Signal): Anon_OffsetOrient = {
    val __obj = js.Dynamic.literal(offset = offset, orient = orient, style = style, text = text)
  
    __obj.asInstanceOf[Anon_OffsetOrient]
  }
}

