package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRefSupportVariables extends StObject {
  
  var POST: RefSupportVariables
}
object POSTRefSupportVariables {
  
  inline def apply(POST: RefSupportVariables): POSTRefSupportVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRefSupportVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRefSupportVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: RefSupportVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
