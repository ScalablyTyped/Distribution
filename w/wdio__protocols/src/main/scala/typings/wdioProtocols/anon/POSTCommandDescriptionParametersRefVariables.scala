package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescriptionParametersRefVariables extends StObject {
  
  var POST: CommandDescriptionParametersRefVariables
}
object POSTCommandDescriptionParametersRefVariables {
  
  inline def apply(POST: CommandDescriptionParametersRefVariables): POSTCommandDescriptionParametersRefVariables = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescriptionParametersRefVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescriptionParametersRefVariables] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
