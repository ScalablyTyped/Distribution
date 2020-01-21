package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanViewData extends js.Object {
  var id: String
  var revision: Double
}

object PlanViewData {
  @scala.inline
  def apply(id: String, revision: Double): PlanViewData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlanViewData]
  }
}

