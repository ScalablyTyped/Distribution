package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETParametersRefReturnsSupport extends StObject {
  
  var GET: ParametersRefReturnsSupport
}
object GETParametersRefReturnsSupport {
  
  inline def apply(GET: ParametersRefReturnsSupport): GETParametersRefReturnsSupport = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETParametersRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETParametersRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ParametersRefReturnsSupport): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
