package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanViewData extends js.Object {
  var id: java.lang.String
  var revision: scala.Double
}

object PlanViewData {
  @scala.inline
  def apply(id: java.lang.String, revision: scala.Double): PlanViewData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[PlanViewData]
  }
}

