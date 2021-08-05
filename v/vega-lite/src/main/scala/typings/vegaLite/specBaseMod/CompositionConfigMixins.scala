package typings.vegaLite.specBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionConfigMixins extends StObject {
  
  /** Default configuration for all concatenation and repeat view composition operators (`concat`, `hconcat`, `vconcat`, and `repeat`) */
  var concat: js.UndefOr[CompositionConfig] = js.undefined
  
  /** Default configuration for the `facet` view composition operator */
  var facet: js.UndefOr[CompositionConfig] = js.undefined
}
object CompositionConfigMixins {
  
  inline def apply(): CompositionConfigMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionConfigMixins]
  }
  
  extension [Self <: CompositionConfigMixins](x: Self) {
    
    inline def setConcat(value: CompositionConfig): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setFacet(value: CompositionConfig): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    inline def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
  }
}
