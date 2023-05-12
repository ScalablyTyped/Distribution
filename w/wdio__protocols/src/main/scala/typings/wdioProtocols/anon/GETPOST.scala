package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETPOST extends StObject {
  
  var GET: ExampleReferences
  
  var POST: Ref
}
object GETPOST {
  
  inline def apply(GET: ExampleReferences, POST: Ref): GETPOST = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETPOST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETPOST] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExampleReferences): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: Ref): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
