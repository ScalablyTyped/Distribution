package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.UserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var api: UserEvent
  
  var instance: Instance
}
object Api {
  
  inline def apply(api: UserEvent, instance: Instance): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
