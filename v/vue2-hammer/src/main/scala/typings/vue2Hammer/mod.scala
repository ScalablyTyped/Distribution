package typings.vue2Hammer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<any> * / any */ trait VueHammer extends StObject {
    
    var config: Any
  }
  object VueHammer {
    
    @JSImport("vue2-hammer", "VueHammer")
    @js.native
    val ^ : VueHammer = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueHammer] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
