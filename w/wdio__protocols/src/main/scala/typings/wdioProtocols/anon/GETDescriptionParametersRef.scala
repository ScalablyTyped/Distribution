package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionParametersRef extends StObject {
  
  var GET: DescriptionParametersRef
}
object GETDescriptionParametersRef {
  
  inline def apply(GET: DescriptionParametersRef): GETDescriptionParametersRef = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionParametersRef] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionParametersRef): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
