package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionParametersPOSTCommandDescriptionParameters extends StObject {
  
  var GET: DescriptionParameters
  
  var POST: CommandDescriptionParameters
}
object GETDescriptionParametersPOSTCommandDescriptionParameters {
  
  inline def apply(GET: DescriptionParameters, POST: CommandDescriptionParameters): GETDescriptionParametersPOSTCommandDescriptionParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionParametersPOSTCommandDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionParametersPOSTCommandDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
