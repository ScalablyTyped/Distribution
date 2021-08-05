package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientCreateCall> */
trait PartialClientCreateCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[create] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialClientCreateCall {
  
  inline def apply(): PartialClientCreateCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientCreateCall]
  }
  
  extension [Self <: PartialClientCreateCall](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOp(value: create): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
