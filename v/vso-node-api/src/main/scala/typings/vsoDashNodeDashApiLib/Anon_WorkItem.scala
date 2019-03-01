package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WorkItem extends js.Object {
  var workItem: scala.Double
  var workItemLink: scala.Double
}

object Anon_WorkItem {
  @scala.inline
  def apply(workItem: scala.Double, workItemLink: scala.Double): Anon_WorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("workItem")(workItem)
    __obj.updateDynamic("workItemLink")(workItemLink)
    __obj.asInstanceOf[Anon_WorkItem]
  }
}

