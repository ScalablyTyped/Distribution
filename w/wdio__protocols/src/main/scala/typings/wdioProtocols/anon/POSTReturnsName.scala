package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTReturnsName extends StObject {
  
  var POST: ReturnsName
}
object POSTReturnsName {
  
  inline def apply(POST: ReturnsName): POSTReturnsName = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTReturnsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTReturnsName] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ReturnsName): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
