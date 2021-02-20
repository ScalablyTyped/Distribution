package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * State Object
  */
@js.native
trait IStateObject extends StObject {
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var parentId: Double = js.native
}
object IStateObject {
  
  @scala.inline
  def apply(id: Double, name: String, parentId: Double): IStateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateObject]
  }
  
  @scala.inline
  implicit class IStateObjectMutableBuilder[Self <: IStateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
