package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETIsHubCommandParameters extends StObject {
  
  var GET: IsHubCommandParameters
}
object GETIsHubCommandParameters {
  
  inline def apply(GET: IsHubCommandParameters): GETIsHubCommandParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETIsHubCommandParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETIsHubCommandParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: IsHubCommandParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
