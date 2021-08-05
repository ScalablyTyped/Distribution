package typings.vegaLite.anon

import typings.vegaTypings.specMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normalized extends StObject {
  
  var normalized: NormalizedUnitSpecTopLeve | NormalizedLayerSpecTopLev | GenericFacetSpecNormalize | GenericConcatSpecGenericS | GenericVConcatSpecGeneric | GenericHConcatSpecGeneric
  
  var spec: Spec
}
object Normalized {
  
  inline def apply(
    normalized: NormalizedUnitSpecTopLeve | NormalizedLayerSpecTopLev | GenericFacetSpecNormalize | GenericConcatSpecGenericS | GenericVConcatSpecGeneric | GenericHConcatSpecGeneric,
    spec: Spec
  ): Normalized = {
    val __obj = js.Dynamic.literal(normalized = normalized.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalized]
  }
  
  extension [Self <: Normalized](x: Self) {
    
    inline def setNormalized(
      value: NormalizedUnitSpecTopLeve | NormalizedLayerSpecTopLev | GenericFacetSpecNormalize | GenericConcatSpecGenericS | GenericVConcatSpecGeneric | GenericHConcatSpecGeneric
    ): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
