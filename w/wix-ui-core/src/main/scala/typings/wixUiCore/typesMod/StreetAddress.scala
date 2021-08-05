package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetAddress extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object StreetAddress {
  
  inline def apply(): StreetAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetAddress]
  }
  
  extension [Self <: StreetAddress](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
