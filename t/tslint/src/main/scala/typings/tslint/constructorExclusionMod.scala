package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructorExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/constructorExclusion", "ConstructorExclusion")
  @js.native
  open class ConstructorExclusion () extends Exclusion[IConstructorExclusionDescriptor] {
    def this(descriptor: Partial[IConstructorExclusionDescriptor]) = this()
    
    val privacies: Set[Privacy] = js.native
  }
  
  trait IConstructorExclusionDescriptor extends StObject {
    
    var privacies: js.UndefOr[js.Array[Privacy]] = js.undefined
  }
  object IConstructorExclusionDescriptor {
    
    inline def apply(): IConstructorExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConstructorExclusionDescriptor]
    }
    
    extension [Self <: IConstructorExclusionDescriptor](x: Self) {
      
      inline def setPrivacies(value: js.Array[Privacy]): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
      
      inline def setPrivaciesUndefined: Self = StObject.set(x, "privacies", js.undefined)
      
      inline def setPrivaciesVarargs(value: Privacy*): Self = StObject.set(x, "privacies", js.Array(value*))
    }
  }
}
