package typings
package xsdDashSchemaDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Messages extends js.Object {
  var messages: js.Array[java.lang.String]
  var result: java.lang.String
  var valid: scala.Boolean
}

object Anon_Messages {
  @scala.inline
  def apply(messages: js.Array[java.lang.String], result: java.lang.String, valid: scala.Boolean): Anon_Messages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_Messages]
  }
}

