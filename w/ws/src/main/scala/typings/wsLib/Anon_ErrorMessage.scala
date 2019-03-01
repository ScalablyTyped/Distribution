package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var error: js.Any
  var message: js.Any
  var target: this.type
  var `type`: java.lang.String
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(error: js.Any, message: js.Any, target: Anon_ErrorMessage, `type`: java.lang.String): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

