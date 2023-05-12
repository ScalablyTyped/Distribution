package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTExamplesIsHubCommand extends StObject {
  
  var POST: ExamplesIsHubCommand
}
object POSTExamplesIsHubCommand {
  
  inline def apply(POST: ExamplesIsHubCommand): POSTExamplesIsHubCommand = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTExamplesIsHubCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTExamplesIsHubCommand] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: ExamplesIsHubCommand): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
