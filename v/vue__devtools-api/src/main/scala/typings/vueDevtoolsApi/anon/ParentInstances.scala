package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentInstances extends StObject {
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance
  
  var parentInstances: js.Array[typings.vueDevtoolsApi.componentMod.ComponentInstance]
}
object ParentInstances {
  
  inline def apply(
    componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance,
    parentInstances: js.Array[typings.vueDevtoolsApi.componentMod.ComponentInstance]
  ): ParentInstances = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], parentInstances = parentInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentInstances]
  }
  
  extension [Self <: ParentInstances](x: Self) {
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setParentInstances(value: js.Array[typings.vueDevtoolsApi.componentMod.ComponentInstance]): Self = StObject.set(x, "parentInstances", value.asInstanceOf[js.Any])
    
    inline def setParentInstancesVarargs(value: typings.vueDevtoolsApi.componentMod.ComponentInstance*): Self = StObject.set(x, "parentInstances", js.Array(value*))
  }
}
