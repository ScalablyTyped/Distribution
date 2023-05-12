package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandParametersRefReturns extends StObject {
  
  var GET: CommandParametersRefReturns
}
object GETCommandParametersRefReturns {
  
  inline def apply(GET: CommandParametersRefReturns): GETCommandParametersRefReturns = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandParametersRefReturns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
