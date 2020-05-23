package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends js.Object {
  var workItem: scala.Double
  var workItemLink: scala.Double
}

object WorkItem {
  @scala.inline
  def apply(workItem: scala.Double, workItemLink: scala.Double): WorkItem = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
}

