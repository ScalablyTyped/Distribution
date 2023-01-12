package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentInstances extends StObject {
  
  var componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var parentInstances: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
}
object ParentInstances {
  
  inline def apply(
    componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    parentInstances: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
  ): ParentInstances = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], parentInstances = parentInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentInstances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentInstances] (val x: Self) extends AnyVal {
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setParentInstances(value: js.Array[typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]): Self = StObject.set(x, "parentInstances", value.asInstanceOf[js.Any])
    
    inline def setParentInstancesVarargs(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance*): Self = StObject.set(x, "parentInstances", js.Array(value*))
  }
}
