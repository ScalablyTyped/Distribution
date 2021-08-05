package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  var property: js.UndefOr[String] = js.undefined
  
  var `type`: topojson
}
object Property {
  
  inline def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("topojson")
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
