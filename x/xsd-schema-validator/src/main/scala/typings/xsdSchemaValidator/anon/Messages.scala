package typings.xsdSchemaValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var messages: js.Array[String]
  var result: String
  var valid: Boolean
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[String], result: String, valid: Boolean): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
}

