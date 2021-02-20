package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BehaviorCreateModel extends StObject {
  
  /**
    * Color
    */
  var color: String = js.native
  
  /**
    * Parent behavior id
    */
  var inherits: String = js.native
  
  /**
    * Name of the behavior
    */
  var name: String = js.native
}
object BehaviorCreateModel {
  
  @scala.inline
  def apply(color: String, inherits: String, name: String): BehaviorCreateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorCreateModel]
  }
  
  @scala.inline
  implicit class BehaviorCreateModelMutableBuilder[Self <: BehaviorCreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: String): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
