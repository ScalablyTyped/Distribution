package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamFieldValue extends StObject {
  
  var includeChildren: Boolean
  
  var value: String
}
object TeamFieldValue {
  
  inline def apply(includeChildren: Boolean, value: String): TeamFieldValue = {
    val __obj = js.Dynamic.literal(includeChildren = includeChildren.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValue]
  }
  
  extension [Self <: TeamFieldValue](x: Self) {
    
    inline def setIncludeChildren(value: Boolean): Self = StObject.set(x, "includeChildren", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
