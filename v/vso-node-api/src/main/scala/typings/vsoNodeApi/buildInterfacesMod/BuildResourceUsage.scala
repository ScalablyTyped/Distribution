package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildResourceUsage extends js.Object {
  /**
    * The number of build agents.
    */
  var distributedTaskAgents: Double
  /**
    * The number of paid private agent slots.
    */
  var paidPrivateAgentSlots: Double
  /**
    * The total usage.
    */
  var totalUsage: Double
  /**
    * The number of XAML controllers.
    */
  var xamlControllers: Double
}

object BuildResourceUsage {
  @scala.inline
  def apply(
    distributedTaskAgents: Double,
    paidPrivateAgentSlots: Double,
    totalUsage: Double,
    xamlControllers: Double
  ): BuildResourceUsage = {
    val __obj = js.Dynamic.literal(distributedTaskAgents = distributedTaskAgents.asInstanceOf[js.Any], paidPrivateAgentSlots = paidPrivateAgentSlots.asInstanceOf[js.Any], totalUsage = totalUsage.asInstanceOf[js.Any], xamlControllers = xamlControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResourceUsage]
  }
}

