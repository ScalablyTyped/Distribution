package typings.vegaExpression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  /** The generated code as a string. */
  var code: String
  /** A hash of all properties referenced within the fieldvar scope. */
  var fields: js.Array[String]
  /** A hash of all properties referenced outside a provided whitelist */
  var globals: js.Array[String]
}

object AnonCode {
  @scala.inline
  def apply(code: String, fields: js.Array[String], globals: js.Array[String]): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

