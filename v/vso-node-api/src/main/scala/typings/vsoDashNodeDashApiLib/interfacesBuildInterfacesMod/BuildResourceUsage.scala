package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildResourceUsage extends js.Object {
  /**
    * The number of build agents.
    */
  var distributedTaskAgents: scala.Double
  /**
    * The number of paid private agent slots.
    */
  var paidPrivateAgentSlots: scala.Double
  /**
    * The total usage.
    */
  var totalUsage: scala.Double
  /**
    * The number of XAML controllers.
    */
  var xamlControllers: scala.Double
}

object BuildResourceUsage {
  @scala.inline
  def apply(
    distributedTaskAgents: scala.Double,
    paidPrivateAgentSlots: scala.Double,
    totalUsage: scala.Double,
    xamlControllers: scala.Double
  ): BuildResourceUsage = {
    val __obj = js.Dynamic.literal(distributedTaskAgents = distributedTaskAgents, paidPrivateAgentSlots = paidPrivateAgentSlots, totalUsage = totalUsage, xamlControllers = xamlControllers)
  
    __obj.asInstanceOf[BuildResourceUsage]
  }
}

