package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var id: String
}
object Extension {
  
  inline def apply(id: String): Extension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
