package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskHint extends js.Object {
  var `type`: MaskType
  var value: String
}

object MaskHint {
  @scala.inline
  def apply(`type`: MaskType, value: String): MaskHint = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MaskHint]
  }
}

