package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FinishTime extends js.Object {
  var finishTime: java.lang.String
  var messages: js.Array[webgmeLib.GmeCommonNs.Message]
  var pluginName: java.lang.String
  var success: scala.Boolean
}

object Anon_FinishTime {
  @scala.inline
  def apply(
    finishTime: java.lang.String,
    messages: js.Array[webgmeLib.GmeCommonNs.Message],
    pluginName: java.lang.String,
    success: scala.Boolean
  ): Anon_FinishTime = {
    val __obj = js.Dynamic.literal(finishTime = finishTime, messages = messages, pluginName = pluginName, success = success)
  
    __obj.asInstanceOf[Anon_FinishTime]
  }
}

