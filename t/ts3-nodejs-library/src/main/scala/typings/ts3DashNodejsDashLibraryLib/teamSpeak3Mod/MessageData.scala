package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends js.Object {
  var invoker: ts3DashNodejsDashLibraryLib.propertyClientMod.^
  var msg: java.lang.String
  var targetmode: TargetMode
}

object MessageData {
  @scala.inline
  def apply(
    invoker: ts3DashNodejsDashLibraryLib.propertyClientMod.^,
    msg: java.lang.String,
    targetmode: TargetMode
  ): MessageData = {
    val __obj = js.Dynamic.literal(invoker = invoker, msg = msg, targetmode = targetmode)
  
    __obj.asInstanceOf[MessageData]
  }
}

