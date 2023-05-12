package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETExamplesParameters extends StObject {
  
  var GET: ExamplesParameters
}
object GETExamplesParameters {
  
  inline def apply(GET: ExamplesParameters): GETExamplesParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETExamplesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETExamplesParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExamplesParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
