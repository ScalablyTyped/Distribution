package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETReturns extends StObject {
  
  var GET: Returns
}
object GETReturns {
  
  inline def apply(GET: Returns): GETReturns = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETReturns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETReturns] (val x: Self) extends AnyVal {
    
    inline def setGET(value: Returns): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
