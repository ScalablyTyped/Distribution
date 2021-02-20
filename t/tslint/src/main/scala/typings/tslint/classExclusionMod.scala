package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.completedDocsRuleMod.Location
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
  @js.native
  class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
    def this(descriptor: Partial[IClassExclusionDescriptor]) = this()
    
    val locations: Set[Location] = js.native
    
    val privacies: Set[Privacy] = js.native
    
    var shouldLocationBeDocumented: js.Any = js.native
    
    var shouldPrivacyBeDocumented: js.Any = js.native
  }
  
  @js.native
  trait IClassExclusionDescriptor extends ExclusionDescriptor {
    
    var locations: js.UndefOr[js.Array[Location]] = js.native
    
    var privacies: js.UndefOr[js.Array[Privacy]] = js.native
  }
  object IClassExclusionDescriptor {
    
    @scala.inline
    def apply(): IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClassExclusionDescriptor]
    }
    
    @scala.inline
    implicit class IClassExclusionDescriptorMutableBuilder[Self <: IClassExclusionDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setPrivacies(value: js.Array[Privacy]): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivaciesUndefined: Self = StObject.set(x, "privacies", js.undefined)
      
      @scala.inline
      def setPrivaciesVarargs(value: Privacy*): Self = StObject.set(x, "privacies", js.Array(value :_*))
    }
  }
}
