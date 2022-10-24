package typings.vueTheMask

import org.scalablytyped.runtime.Shortcut
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-the-mask", JSImport.Namespace)
  @js.native
  val ^ : VueTheMaskPlugin = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<undefined> * / any */ trait VueTheMaskPlugin extends StObject {
    
    var TheMask: Component[Any, Any, Any, ComputedOptions, MethodOptions]
    
    var mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveFunction */ Any
  }
  object VueTheMaskPlugin {
    
    inline def apply(
      TheMask: Component[Any, Any, Any, ComputedOptions, MethodOptions],
      mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveFunction */ Any
    ): VueTheMaskPlugin = {
      val __obj = js.Dynamic.literal(TheMask = TheMask.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTheMaskPlugin]
    }
    
    extension [Self <: VueTheMaskPlugin](x: Self) {
      
      inline def setMask(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveFunction */ Any
      ): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setTheMask(value: Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "TheMask", value.asInstanceOf[js.Any])
    }
    
    type VueStatic = js.Function0[Unit]
  }
  
  type _To = VueTheMaskPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VueTheMaskPlugin = ^
}
