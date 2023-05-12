package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTReturnsVariables extends StObject {
  
  var POST: ReturnsVariables
}
object POSTReturnsVariables {
  
  inline def apply(POST: ReturnsVariables): POSTReturnsVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTReturnsVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTReturnsVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ReturnsVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
