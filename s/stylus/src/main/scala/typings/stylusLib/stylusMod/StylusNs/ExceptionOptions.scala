package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionOptions extends js.Object {
  var column: scala.Double
  var context: scala.Double
  var filename: java.lang.String
  var input: java.lang.String
  var lineno: scala.Double
}

object ExceptionOptions {
  @scala.inline
  def apply(
    column: scala.Double,
    context: scala.Double,
    filename: java.lang.String,
    input: java.lang.String,
    lineno: scala.Double
  ): ExceptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("lineno")(lineno)
    __obj.asInstanceOf[ExceptionOptions]
  }
}

