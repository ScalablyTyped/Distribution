package typings.webgme

import typings.webgme.GmeCommonNs.Message
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
    val __obj = js.Dynamic.literal(finishTime = finishTime, messages = messages, pluginName = pluginName, success = success)
  
    __obj.asInstanceOf[Anon_FinishTime]
  }
}

