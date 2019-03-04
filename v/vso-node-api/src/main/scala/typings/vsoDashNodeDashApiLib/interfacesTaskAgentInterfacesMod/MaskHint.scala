package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskHint extends js.Object {
  var `type`: MaskType
  var value: java.lang.String
}

object MaskHint {
  @scala.inline
  def apply(`type`: MaskType, value: java.lang.String): MaskHint = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MaskHint]
  }
}

