package typings.vegaLite.specBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionConfigMixins extends StObject {
  
  /** Default configuration for all concatenation and repeat view composition operators (`concat`, `hconcat`, `vconcat`, and `repeat`) */
  var concat: js.UndefOr[CompositionConfig] = js.native
  
  /** Default configuration for the `facet` view composition operator */
  var facet: js.UndefOr[CompositionConfig] = js.native
}
object CompositionConfigMixins {
  
  @scala.inline
  def apply(): CompositionConfigMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionConfigMixins]
  }
  
  @scala.inline
  implicit class CompositionConfigMixinsMutableBuilder[Self <: CompositionConfigMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcat(value: CompositionConfig): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    @scala.inline
    def setFacet(value: CompositionConfig): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
  }
}
