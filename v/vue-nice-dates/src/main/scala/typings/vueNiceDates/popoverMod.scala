package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Popover extends StObject {
    
    var props: StringDictionary[Boolean]
  }
  object Popover {
    
    @JSImport("vue-nice-dates/Popover", "Popover")
    @js.native
    val ^ : Popover = js.native
    
    extension [Self <: Popover](x: Self) {
      
      inline def setProps(value: StringDictionary[Boolean]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
