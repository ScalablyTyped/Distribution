package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInstances extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var componentInstances: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
}
object ComponentInstances {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    componentInstances: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
  ): ComponentInstances = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstances = componentInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInstances]
  }
  
  extension [Self <: ComponentInstances](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstances(value: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]): Self = StObject.set(x, "componentInstances", value.asInstanceOf[js.Any])
    
    inline def setComponentInstancesVarargs(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance*): Self = StObject.set(x, "componentInstances", js.Array(value*))
  }
}
