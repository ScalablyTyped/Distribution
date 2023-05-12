package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandParametersRef extends StObject {
  
  var GET: CommandParametersRef
}
object GETCommandParametersRef {
  
  inline def apply(GET: CommandParametersRef): GETCommandParametersRef = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandParametersRef] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandParametersRef): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
