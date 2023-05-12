package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandParameters extends StObject {
  
  var GET: CommandParameters
  
  var POST: CommandParametersRef
}
object GETCommandParameters {
  
  inline def apply(GET: CommandParameters, POST: CommandParametersRef): GETCommandParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
