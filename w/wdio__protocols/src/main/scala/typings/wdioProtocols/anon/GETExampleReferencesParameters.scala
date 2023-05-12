package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETExampleReferencesParameters extends StObject {
  
  var GET: ExampleReferencesParameters
  
  var POST: ParametersRef
}
object GETExampleReferencesParameters {
  
  inline def apply(GET: ExampleReferencesParameters, POST: ParametersRef): GETExampleReferencesParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETExampleReferencesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETExampleReferencesParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExampleReferencesParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: ParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
