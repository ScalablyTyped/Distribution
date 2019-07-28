package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends js.Object {
  var invoker: typings.ts3DashNodejsDashLibrary.propertyClientMod.^
  var msg: String
  var targetmode: TargetMode
}

object MessageData {
  @scala.inline
  def apply(invoker: typings.ts3DashNodejsDashLibrary.propertyClientMod.^, msg: String, targetmode: TargetMode): MessageData = {
    val __obj = js.Dynamic.literal(invoker = invoker, msg = msg, targetmode = targetmode)
  
    __obj.asInstanceOf[MessageData]
  }
}

