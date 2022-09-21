package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.completedDocsRuleMod.Location
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
  @js.native
  open class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
    def this(descriptor: Partial[IClassExclusionDescriptor]) = this()
    
    val locations: Set[Location] = js.native
    
    val privacies: Set[Privacy] = js.native
    
    /* private */ var shouldLocationBeDocumented: Any = js.native
    
    /* private */ var shouldPrivacyBeDocumented: Any = js.native
  }
  
  trait IClassExclusionDescriptor
    extends StObject
       with ExclusionDescriptor {
    
    var locations: js.UndefOr[js.Array[Location]] = js.undefined
    
    var privacies: js.UndefOr[js.Array[Privacy]] = js.undefined
  }
  object IClassExclusionDescriptor {
    
    inline def apply(): IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClassExclusionDescriptor]
    }
    
    extension [Self <: IClassExclusionDescriptor](x: Self) {
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setPrivacies(value: js.Array[Privacy]): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
      
      inline def setPrivaciesUndefined: Self = StObject.set(x, "privacies", js.undefined)
      
      inline def setPrivaciesVarargs(value: Privacy*): Self = StObject.set(x, "privacies", js.Array(value*))
    }
  }
}
