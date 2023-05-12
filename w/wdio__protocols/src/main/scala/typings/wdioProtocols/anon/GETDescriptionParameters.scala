package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionParameters extends StObject {
  
  var GET: DescriptionParameters
}
object GETDescriptionParameters {
  
  inline def apply(GET: DescriptionParameters): GETDescriptionParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
