package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandStringDescriptionStringParametersArray extends StObject {
  
  var POST: CommandStringDescriptionStringParametersArray
}
object POSTCommandStringDescriptionStringParametersArray {
  
  inline def apply(POST: CommandStringDescriptionStringParametersArray): POSTCommandStringDescriptionStringParametersArray = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandStringDescriptionStringParametersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandStringDescriptionStringParametersArray] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandStringDescriptionStringParametersArray): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
