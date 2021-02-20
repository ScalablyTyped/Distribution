package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.completedDocsRuleMod.Privacy
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructorExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/constructorExclusion", "ConstructorExclusion")
  @js.native
  class ConstructorExclusion () extends Exclusion[IConstructorExclusionDescriptor] {
    def this(descriptor: Partial[IConstructorExclusionDescriptor]) = this()
    
    val privacies: Set[Privacy] = js.native
  }
  
  @js.native
  trait IConstructorExclusionDescriptor extends StObject {
    
    var privacies: js.UndefOr[js.Array[Privacy]] = js.native
  }
  object IConstructorExclusionDescriptor {
    
    @scala.inline
    def apply(): IConstructorExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConstructorExclusionDescriptor]
    }
    
    @scala.inline
    implicit class IConstructorExclusionDescriptorMutableBuilder[Self <: IConstructorExclusionDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivacies(value: js.Array[Privacy]): Self = StObject.set(x, "privacies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivaciesUndefined: Self = StObject.set(x, "privacies", js.undefined)
      
      @scala.inline
      def setPrivaciesVarargs(value: Privacy*): Self = StObject.set(x, "privacies", js.Array(value :_*))
    }
  }
}
