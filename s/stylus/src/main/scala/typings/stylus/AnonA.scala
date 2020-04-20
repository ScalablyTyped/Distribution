package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends js.Object {
  var __type: String
  var a: Double
  var b: Double
  var column: Double
  var filename: String
  var g: Double
  var lineno: Double
  var r: Double
}

object AnonA {
  @scala.inline
  def apply(
    __type: String,
    a: Double,
    b: Double,
    column: Double,
    filename: String,
    g: Double,
    lineno: Double,
    r: Double
  ): AnonA = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA]
  }
}

