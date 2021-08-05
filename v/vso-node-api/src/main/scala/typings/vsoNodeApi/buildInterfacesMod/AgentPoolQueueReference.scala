package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPoolQueueReference
  extends StObject
     with ResourceReference {
  
  /**
    * The ID of the queue.
    */
  var id: Double
}
object AgentPoolQueueReference {
  
  inline def apply(alias: String, id: Double): AgentPoolQueueReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueueReference]
  }
  
  extension [Self <: AgentPoolQueueReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
