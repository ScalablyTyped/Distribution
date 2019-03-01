package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesignerProcess extends BuildProcess {
  var phases: js.Array[Phase]
}

object DesignerProcess {
  @scala.inline
  def apply(phases: js.Array[Phase], `type`: scala.Double): DesignerProcess = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("phases")(phases)
    __obj.asInstanceOf[DesignerProcess]
  }
}

