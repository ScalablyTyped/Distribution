package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventScope extends StObject {
  
  /**
    * Required: This is the identity of the scope for the type.
    */
  var id: String
  
  /**
    * Optional: The display name of the scope
    */
  var name: String
  
  /**
    * Required: The event specific type of a scope.
    */
  var `type`: String
}
object EventScope {
  
  inline def apply(id: String, name: String, `type`: String): EventScope = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventScope]
  }
  
  extension [Self <: EventScope](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
