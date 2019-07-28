package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInformation extends js.Object {
  var data: String
  var `type`: String
}

object DebugInformation {
  @scala.inline
  def apply(data: String, `type`: String): DebugInformation = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DebugInformation]
  }
}

