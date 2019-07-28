package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesignerProcess extends BuildProcess {
  var phases: js.Array[Phase]
}

object DesignerProcess {
  @scala.inline
  def apply(phases: js.Array[Phase], `type`: Double): DesignerProcess = {
    val __obj = js.Dynamic.literal(phases = phases)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DesignerProcess]
  }
}

