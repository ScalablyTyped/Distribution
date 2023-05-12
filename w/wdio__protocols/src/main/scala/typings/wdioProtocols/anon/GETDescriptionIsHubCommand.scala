package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionIsHubCommand extends StObject {
  
  var GET: DescriptionIsHubCommand
}
object GETDescriptionIsHubCommand {
  
  inline def apply(GET: DescriptionIsHubCommand): GETDescriptionIsHubCommand = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionIsHubCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionIsHubCommand] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionIsHubCommand): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
