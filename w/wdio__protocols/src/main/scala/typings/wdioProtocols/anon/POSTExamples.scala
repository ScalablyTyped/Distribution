package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTExamples extends StObject {
  
  var POST: Examples
}
object POSTExamples {
  
  inline def apply(POST: Examples): POSTExamples = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTExamples] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Examples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
