package typings.tabris.anon

import typings.tabris.tabrisStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientDestroyCall> */
trait PartialClientDestroyCall extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[destroy] = js.undefined
}
object PartialClientDestroyCall {
  
  inline def apply(): PartialClientDestroyCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientDestroyCall]
  }
  
  extension [Self <: PartialClientDestroyCall](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOp(value: destroy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
