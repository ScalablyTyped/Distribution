package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ABColumn extends js.Object {
  var __type: java.lang.String
  var a: scala.Double
  var b: scala.Double
  var column: scala.Double
  var filename: java.lang.String
  var g: scala.Double
  var lineno: scala.Double
  var r: scala.Double
}

object Anon_ABColumn {
  @scala.inline
  def apply(
    __type: java.lang.String,
    a: scala.Double,
    b: scala.Double,
    column: scala.Double,
    filename: java.lang.String,
    g: scala.Double,
    lineno: scala.Double,
    r: scala.Double
  ): Anon_ABColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[Anon_ABColumn]
  }
}

