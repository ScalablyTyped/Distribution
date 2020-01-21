package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAColumn extends js.Object {
  var __type: String
  var a: Double
  var column: Double
  var filename: String
  var h: Double
  var l: Double
  var lineno: Double
  var s: Double
}

object AnonAColumn {
  @scala.inline
  def apply(
    __type: String,
    a: Double,
    column: Double,
    filename: String,
    h: Double,
    l: Double,
    lineno: Double,
    s: Double
  ): AnonAColumn = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAColumn]
  }
}

