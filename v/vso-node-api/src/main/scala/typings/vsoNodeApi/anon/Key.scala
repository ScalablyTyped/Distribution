package typings.vsoNodeApi.anon

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: String = js.native
  
  var value: js.Array[WorkItemTypeColor] = js.native
}
object Key {
  
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColor]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[WorkItemTypeColor]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: WorkItemTypeColor*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
