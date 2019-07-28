package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: Double
  var orient: String
  var style: String
  var text: String
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Double, orient: String, style: String, text: String): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, orient = orient, style = style, text = text)
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

