package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTExampleReferencesParametersRef extends StObject {
  
  var POST: ExampleReferencesParametersRef
}
object POSTExampleReferencesParametersRef {
  
  inline def apply(POST: ExampleReferencesParametersRef): POSTExampleReferencesParametersRef = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTExampleReferencesParametersRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTExampleReferencesParametersRef] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ExampleReferencesParametersRef): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
