package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandDescriptionParametersRefReturnsSupportPOSTSupportIosWindows extends StObject {
  
  var GET: CommandDescriptionParametersRefReturnsSupport
  
  var POST: SupportIosWindows
}
object GETCommandDescriptionParametersRefReturnsSupportPOSTSupportIosWindows {
  
  inline def apply(GET: CommandDescriptionParametersRefReturnsSupport, POST: SupportIosWindows): GETCommandDescriptionParametersRefReturnsSupportPOSTSupportIosWindows = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandDescriptionParametersRefReturnsSupportPOSTSupportIosWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandDescriptionParametersRefReturnsSupportPOSTSupportIosWindows] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandDescriptionParametersRefReturnsSupport): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: SupportIosWindows): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
