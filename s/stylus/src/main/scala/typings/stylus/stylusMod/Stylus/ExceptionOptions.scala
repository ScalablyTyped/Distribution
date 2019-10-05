package typings.stylus.stylusMod.Stylus

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
    val __obj = js.Dynamic.literal(column = column, context = context, filename = filename, input = input, lineno = lineno)
  
    __obj.asInstanceOf[ExceptionOptions]
  }
}

