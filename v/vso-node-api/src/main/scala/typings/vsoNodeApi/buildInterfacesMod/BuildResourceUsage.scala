package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildResourceUsage extends StObject {
  
  /**
    * The number of build agents.
    */
  var distributedTaskAgents: Double = js.native
  
  /**
    * The number of paid private agent slots.
    */
  var paidPrivateAgentSlots: Double = js.native
  
  /**
    * The total usage.
    */
  var totalUsage: Double = js.native
  
  /**
    * The number of XAML controllers.
    */
  var xamlControllers: Double = js.native
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
  
  @scala.inline
  implicit class BuildResourceUsageMutableBuilder[Self <: BuildResourceUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributedTaskAgents(value: Double): Self = StObject.set(x, "distributedTaskAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaidPrivateAgentSlots(value: Double): Self = StObject.set(x, "paidPrivateAgentSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUsage(value: Double): Self = StObject.set(x, "totalUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXamlControllers(value: Double): Self = StObject.set(x, "xamlControllers", value.asInstanceOf[js.Any])
  }
}
