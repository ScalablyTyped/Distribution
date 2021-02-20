package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BehaviorReplaceModel extends StObject {
  
  /**
    * Color
    */
  var color: String = js.native
  
  /**
    * Behavior Name
    */
  var name: String = js.native
}
object BehaviorReplaceModel {
  
  @scala.inline
  def apply(color: String, name: String): BehaviorReplaceModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorReplaceModel]
  }
  
  @scala.inline
  implicit class BehaviorReplaceModelMutableBuilder[Self <: BehaviorReplaceModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
