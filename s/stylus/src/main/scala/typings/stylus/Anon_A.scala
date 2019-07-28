package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var __type: String
  var a: Double
  var b: Double
  var column: Double
  var filename: String
  var g: Double
  var lineno: Double
  var r: Double
}

object Anon_A {
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
  ): Anon_A = {
    val __obj = js.Dynamic.literal(__type = __type, a = a, b = b, column = column, filename = filename, g = g, lineno = lineno, r = r)
  
    __obj.asInstanceOf[Anon_A]
  }
}

