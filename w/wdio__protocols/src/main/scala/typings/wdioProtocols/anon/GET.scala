package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GET extends StObject {
  
  var GET: ExampleReferences
}
object GET {
  
  inline def apply(GET: ExampleReferences): GET = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GET]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GET] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExampleReferences): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
