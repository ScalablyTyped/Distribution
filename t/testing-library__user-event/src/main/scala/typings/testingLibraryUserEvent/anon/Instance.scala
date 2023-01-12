package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSetupSetupMod.UserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  var api: UserEvent
  
  var instance: typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
}
object Instance {
  
  inline def apply(api: UserEvent, instance: typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance): Instance = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    inline def setApi(value: UserEvent): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
