package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AColumn extends js.Object {
  var __type: String
  var a: Double
  var column: Double
  var filename: String
  var h: Double
  var l: Double
  var lineno: Double
  var s: Double
}

object Anon_AColumn {
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
  ): Anon_AColumn = {
    val __obj = js.Dynamic.literal(__type = __type, a = a, column = column, filename = filename, h = h, l = l, lineno = lineno, s = s)
  
    __obj.asInstanceOf[Anon_AColumn]
  }
}

