package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobalWorkflow extends js.Object {
  var globalWorkflow: Double
  var workItemType: Double
}

object AnonGlobalWorkflow {
  @scala.inline
  def apply(globalWorkflow: Double, workItemType: Double): AnonGlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalWorkflow]
  }
}

