package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header
  extends StObject
     with BaseSchema {
  
  @JSName("type")
  var type_Header: ParameterType
}
object Header {
  
  inline def apply(`type`: ParameterType): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    inline def setType(value: ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
