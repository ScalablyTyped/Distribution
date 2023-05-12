package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescriptionParameters extends StObject {
  
  var GET: Returns
  
  var POST: CommandDescriptionParameters
}
object POSTCommandDescriptionParameters {
  
  inline def apply(GET: Returns, POST: CommandDescriptionParameters): POSTCommandDescriptionParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: Returns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
