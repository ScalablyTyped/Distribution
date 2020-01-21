package typings.stylus.mod.Stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionOptions extends js.Object {
  var column: Double
  var context: Double
  var filename: String
  var input: String
  var lineno: Double
}

object ExceptionOptions {
  @scala.inline
  def apply(column: Double, context: Double, filename: String, input: String, lineno: Double): ExceptionOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExceptionOptions]
  }
}

