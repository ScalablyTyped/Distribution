package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETReturnsType extends StObject {
  
  var GET: ReturnsType
}
object GETReturnsType {
  
  inline def apply(GET: ReturnsType): GETReturnsType = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETReturnsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETReturnsType] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ReturnsType): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
