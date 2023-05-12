package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTVariables extends StObject {
  
  var POST: Variables
}
object POSTVariables {
  
  inline def apply(POST: Variables): POSTVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Variables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
