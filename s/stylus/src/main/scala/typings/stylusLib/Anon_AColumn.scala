package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AColumn extends js.Object {
  var __type: java.lang.String
  var a: scala.Double
  var column: scala.Double
  var filename: java.lang.String
  var h: scala.Double
  var l: scala.Double
  var lineno: scala.Double
  var s: scala.Double
}

object Anon_AColumn {
  @scala.inline
  def apply(
    __type: java.lang.String,
    a: scala.Double,
    column: scala.Double,
    filename: java.lang.String,
    h: scala.Double,
    l: scala.Double,
    lineno: scala.Double,
    s: scala.Double
  ): Anon_AColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[Anon_AColumn]
  }
}

