package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandDescriptionIsHubCommand extends StObject {
  
  var GET: CommandDescriptionIsHubCommand
}
object GETCommandDescriptionIsHubCommand {
  
  inline def apply(GET: CommandDescriptionIsHubCommand): GETCommandDescriptionIsHubCommand = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandDescriptionIsHubCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandDescriptionIsHubCommand] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandDescriptionIsHubCommand): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
