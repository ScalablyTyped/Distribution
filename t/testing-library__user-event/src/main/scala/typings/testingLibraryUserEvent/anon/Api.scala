package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.UserEvent
import typings.testingLibraryUserEvent.distTypesSystemMod.System
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
