package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProcessModel extends StObject {
  
  /**
    * Description of the process
    */
  var description: String = js.native
  
  /**
    * Name of the process
    */
  var name: String = js.native
  
  /**
    * The ID of the parent process
    */
  var parentProcessTypeId: String = js.native
  
  /**
    * Reference name of the process
    */
  var referenceName: String = js.native
}
object CreateProcessModel {
  
  @scala.inline
  def apply(description: String, name: String, parentProcessTypeId: String, referenceName: String): CreateProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessModel]
  }
  
  @scala.inline
  implicit class CreateProcessModelMutableBuilder[Self <: CreateProcessModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProcessTypeId(value: String): Self = StObject.set(x, "parentProcessTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
