package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionStringParametersArray extends StObject {
  
  var GET: DescriptionStringParametersArray
}
object GETDescriptionStringParametersArray {
  
  inline def apply(GET: DescriptionStringParametersArray): GETDescriptionStringParametersArray = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionStringParametersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionStringParametersArray] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionStringParametersArray): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
