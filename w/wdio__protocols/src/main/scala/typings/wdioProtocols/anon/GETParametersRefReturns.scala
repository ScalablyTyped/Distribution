package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETParametersRefReturns extends StObject {
  
  var GET: ParametersRefReturns
}
object GETParametersRefReturns {
  
  inline def apply(GET: ParametersRefReturns): GETParametersRefReturns = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETParametersRefReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETParametersRefReturns] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ParametersRefReturns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
