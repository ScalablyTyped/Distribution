package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.hooksMod.ComponentBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var bounds: ComponentBounds
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance
}
object Bounds {
  
  inline def apply(bounds: ComponentBounds, componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setBounds(value: ComponentBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
  }
}
