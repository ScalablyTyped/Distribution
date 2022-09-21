package typings.vueScrollUp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-scroll-up", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VueScrollUp
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any */ trait VueScrollUp extends StObject {
    
    var scrollDuration: js.UndefOr[Double] = js.undefined
    
    var scrollY: js.UndefOr[Double] = js.undefined
  }
  object VueScrollUp {
    
    inline def apply(): VueScrollUp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueScrollUp]
    }
    
    extension [Self <: VueScrollUp](x: Self) {
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    }
  }
}
