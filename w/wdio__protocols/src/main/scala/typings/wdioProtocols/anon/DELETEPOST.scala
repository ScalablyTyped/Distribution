package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETEPOST extends StObject {
  
  var DELETE: Parameters
  
  var POST: CommandDescriptionParameters
}
object DELETEPOST {
  
  inline def apply(DELETE: Parameters, POST: CommandDescriptionParameters): DELETEPOST = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETEPOST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETEPOST] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
