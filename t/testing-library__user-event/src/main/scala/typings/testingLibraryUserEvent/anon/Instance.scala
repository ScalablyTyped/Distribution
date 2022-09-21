package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.setupSetupMod.UserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  var api: UserEvent
  
  var instance: typings.testingLibraryUserEvent.setupSetupMod.Instance
}
object Instance {
  
  inline def apply(api: UserEvent, instance: typings.testingLibraryUserEvent.setupSetupMod.Instance): Instance = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: typings.testingLibraryUserEvent.setupSetupMod.Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
