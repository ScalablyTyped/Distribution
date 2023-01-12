package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiHooksMod.ComponentBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var bounds: ComponentBounds
  
  var componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
}
object Bounds {
  
  inline def apply(
    bounds: ComponentBounds,
    componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  ): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: ComponentBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
  }
}
