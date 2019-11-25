package typings.webgme

import typings.webgme.GmeCommon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FinishTime extends js.Object {
  var finishTime: String
  var messages: js.Array[Message]
  var pluginName: String
  var success: Boolean
}

object Anon_FinishTime {
  @scala.inline
  def apply(finishTime: String, messages: js.Array[Message], pluginName: String, success: Boolean): Anon_FinishTime = {
    val __obj = js.Dynamic.literal(finishTime = finishTime.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FinishTime]
  }
}

