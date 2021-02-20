package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamFieldValue extends StObject {
  
  var includeChildren: Boolean = js.native
  
  var value: String = js.native
}
object TeamFieldValue {
  
  @scala.inline
  def apply(includeChildren: Boolean, value: String): TeamFieldValue = {
    val __obj = js.Dynamic.literal(includeChildren = includeChildren.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValue]
  }
  
  @scala.inline
  implicit class TeamFieldValueMutableBuilder[Self <: TeamFieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeChildren(value: Boolean): Self = StObject.set(x, "includeChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
