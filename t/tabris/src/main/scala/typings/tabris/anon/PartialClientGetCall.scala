package typings.tabris.anon

import typings.tabris.tabrisStrings.get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientGetCall> */
trait PartialClientGetCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[get] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
}
object PartialClientGetCall {
  
  inline def apply(): PartialClientGetCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientGetCall]
  }
  
  extension [Self <: PartialClientGetCall](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOp(value: get): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
