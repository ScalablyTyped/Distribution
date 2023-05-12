package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefVariables extends StObject {
  
  var POST: RefVariables
}
object POSTRefVariables {
  
  inline def apply(POST: RefVariables): POSTRefVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
