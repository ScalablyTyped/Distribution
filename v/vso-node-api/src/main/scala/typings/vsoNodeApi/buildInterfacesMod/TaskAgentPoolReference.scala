package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPoolReference extends StObject {
  
  /**
    * The pool ID.
    */
  var id: Double
  
  /**
    * A value indicating whether or not this pool is managed by the service.
    */
  var isHosted: Boolean
  
  /**
    * The pool name.
    */
  var name: String
}
object TaskAgentPoolReference {
  
  @scala.inline
  def apply(id: Double, isHosted: Boolean, name: String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
  
  @scala.inline
  implicit class TaskAgentPoolReferenceMutableBuilder[Self <: TaskAgentPoolReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHosted(value: Boolean): Self = StObject.set(x, "isHosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
