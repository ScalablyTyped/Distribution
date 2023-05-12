package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETIsHubCommand extends StObject {
  
  var GET: IsHubCommand
}
object GETIsHubCommand {
  
  inline def apply(GET: IsHubCommand): GETIsHubCommand = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETIsHubCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETIsHubCommand] (val x: Self) extends AnyVal {
    
    inline def setGET(value: IsHubCommand): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
