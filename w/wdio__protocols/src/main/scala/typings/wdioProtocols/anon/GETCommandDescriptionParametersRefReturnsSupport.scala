package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandDescriptionParametersRefReturnsSupport extends StObject {
  
  var GET: CommandDescriptionParametersRefReturnsSupport
}
object GETCommandDescriptionParametersRefReturnsSupport {
  
  inline def apply(GET: CommandDescriptionParametersRefReturnsSupport): GETCommandDescriptionParametersRefReturnsSupport = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandDescriptionParametersRefReturnsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandDescriptionParametersRefReturnsSupport] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandDescriptionParametersRefReturnsSupport): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
