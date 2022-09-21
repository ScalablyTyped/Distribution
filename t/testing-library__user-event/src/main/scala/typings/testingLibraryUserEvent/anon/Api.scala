package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.setupSetupMod.UserEvent
import typings.testingLibraryUserEvent.systemMod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var api: UserEvent
  
  var system: System
}
object Api {
  
  inline def apply(api: UserEvent, system: System): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
