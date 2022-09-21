package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.componentMod.ComponentDevtoolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance
  
  var options: ComponentDevtoolsOptions
}
object Options {
  
  inline def apply(
    componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance,
    options: ComponentDevtoolsOptions
  ): Options = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ComponentDevtoolsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
