package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTExamplesParameters extends StObject {
  
  var POST: ExamplesParameters
}
object POSTExamplesParameters {
  
  inline def apply(POST: ExamplesParameters): POSTExamplesParameters = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTExamplesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTExamplesParameters] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ExamplesParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
