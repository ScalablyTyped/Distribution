package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkItem extends js.Object {
  var workItem: Double
  var workItemLink: Double
}

object AnonWorkItem {
  @scala.inline
  def apply(workItem: Double, workItemLink: Double): AnonWorkItem = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkItem]
  }
}

