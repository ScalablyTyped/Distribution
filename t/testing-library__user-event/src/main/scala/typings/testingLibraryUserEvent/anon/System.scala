package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.UserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait System extends StObject {
  
  var api: UserEvent
  
  var system: typings.testingLibraryUserEvent.distTypesSystemMod.System
}
object System {
  
  inline def apply(api: UserEvent, system: typings.testingLibraryUserEvent.distTypesSystemMod.System): System = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  
  extension [Self <: System](x: Self) {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: typings.testingLibraryUserEvent.distTypesSystemMod.System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
