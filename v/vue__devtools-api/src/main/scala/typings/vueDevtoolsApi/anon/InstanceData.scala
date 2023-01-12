package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiComponentMod.InspectedComponentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceData extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var instanceData: InspectedComponentData
}
object InstanceData {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    instanceData: InspectedComponentData
  ): InstanceData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], instanceData = instanceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceData] (val x: Self) extends AnyVal {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setInstanceData(value: InspectedComponentData): Self = StObject.set(x, "instanceData", value.asInstanceOf[js.Any])
  }
}
