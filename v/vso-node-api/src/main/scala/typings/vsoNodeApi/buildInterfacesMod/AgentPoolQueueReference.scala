package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolQueueReference extends ResourceReference {
  
  /**
    * The ID of the queue.
    */
  var id: Double = js.native
}
object AgentPoolQueueReference {
  
  @scala.inline
  def apply(alias: String, id: Double): AgentPoolQueueReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueueReference]
  }
  
  @scala.inline
  implicit class AgentPoolQueueReferenceMutableBuilder[Self <: AgentPoolQueueReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
