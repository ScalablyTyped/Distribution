package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POST extends StObject {
  
  var POST: Command
}
object POST {
  
  inline def apply(POST: Command): POST = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POST] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: Command): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
