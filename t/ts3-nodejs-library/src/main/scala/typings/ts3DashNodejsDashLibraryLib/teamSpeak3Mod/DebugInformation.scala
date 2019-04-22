package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInformation extends js.Object {
  var data: java.lang.String
  var `type`: java.lang.String
}

object DebugInformation {
  @scala.inline
  def apply(data: java.lang.String, `type`: java.lang.String): DebugInformation = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DebugInformation]
  }
}

