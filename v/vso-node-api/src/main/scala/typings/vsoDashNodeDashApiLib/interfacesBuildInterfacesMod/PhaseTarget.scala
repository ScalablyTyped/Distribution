package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseTarget extends js.Object {
  /**
    * The type of the target.
    */
  var `type`: scala.Double
}

object PhaseTarget {
  @scala.inline
  def apply(`type`: scala.Double): PhaseTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PhaseTarget]
  }
}

