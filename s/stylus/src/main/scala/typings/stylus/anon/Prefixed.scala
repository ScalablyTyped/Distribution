package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefixed extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var prefixed: Boolean
  var string: String
  var `val`: String
}

object Prefixed {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    prefixed: Boolean,
    string: String,
    `val`: String
  ): Prefixed = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefixed]
  }
}

