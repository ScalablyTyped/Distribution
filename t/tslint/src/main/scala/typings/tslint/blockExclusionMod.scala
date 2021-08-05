package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.completedDocsRuleMod.Visibility
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
  @js.native
  class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
    def this(descriptor: Partial[IBlockExclusionDescriptor]) = this()
    
    val visibilities: Set[Visibility] = js.native
  }
  
  trait IBlockExclusionDescriptor
    extends StObject
       with ExclusionDescriptor {
    
    var visibilities: js.UndefOr[js.Array[Visibility]] = js.undefined
  }
  object IBlockExclusionDescriptor {
    
    inline def apply(): IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBlockExclusionDescriptor]
    }
    
    extension [Self <: IBlockExclusionDescriptor](x: Self) {
      
      inline def setVisibilities(value: js.Array[Visibility]): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
      
      inline def setVisibilitiesUndefined: Self = StObject.set(x, "visibilities", js.undefined)
      
      inline def setVisibilitiesVarargs(value: Visibility*): Self = StObject.set(x, "visibilities", js.Array(value :_*))
    }
  }
}
