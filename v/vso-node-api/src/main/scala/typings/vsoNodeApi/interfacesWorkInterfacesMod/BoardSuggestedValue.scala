package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardSuggestedValue extends StObject {
  
  var name: String
}
object BoardSuggestedValue {
  
  inline def apply(name: String): BoardSuggestedValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardSuggestedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoardSuggestedValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
