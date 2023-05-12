package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTRef extends StObject {
  
  var POST: Ref
}
object POSTRef {
  
  inline def apply(POST: Ref): POSTRef = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTRef] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Ref): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
