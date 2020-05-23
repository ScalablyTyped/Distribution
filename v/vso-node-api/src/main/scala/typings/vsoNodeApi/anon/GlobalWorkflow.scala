package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalWorkflow extends js.Object {
  var globalWorkflow: scala.Double
  var workItemType: scala.Double
}

object GlobalWorkflow {
  @scala.inline
  def apply(globalWorkflow: scala.Double, workItemType: scala.Double): GlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkflow]
  }
}

