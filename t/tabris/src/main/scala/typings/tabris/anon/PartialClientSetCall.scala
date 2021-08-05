package typings.tabris.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientSetCall> */
trait PartialClientSetCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[set] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object PartialClientSetCall {
  
  inline def apply(): PartialClientSetCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientSetCall]
  }
  
  extension [Self <: PartialClientSetCall](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOp(value: set): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
