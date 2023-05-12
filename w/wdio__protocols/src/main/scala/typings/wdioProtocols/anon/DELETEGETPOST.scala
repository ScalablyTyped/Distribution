package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEGETPOST extends StObject {
  
  var DELETE: CommandDescription
  
  var GET: Returns
  
  var POST: Ref
}
object DELETEGETPOST {
  
  inline def apply(DELETE: CommandDescription, GET: Returns, POST: Ref): DELETEGETPOST = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEGETPOST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEGETPOST] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandDescription): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: Returns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: Ref): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
