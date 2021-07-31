package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.mapMod.SpecMapper
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("vega-lite/build/src/normalize/core", "CoreNormalizer")
  @js.native
  class CoreNormalizer ()
    extends SpecMapper[NormalizerParams, FacetedUnitSpec, LayerSpec, NormalizedUnitSpec, scala.Nothing, FieldName] {
    
    var getFacetMappingAndLayout: js.Any = js.native
    
    var mapFacetedUnit: js.Any = js.native
    
    var mapLayerRepeat: js.Any = js.native
    
    var mapNonLayerRepeat: js.Any = js.native
    
    def mapUnit(spec: UnitSpec, params: NormalizerParams): NormalizedUnitSpec | NormalizedLayerSpec = js.native
    
    var mapUnitWithParentEncodingOrProjection: js.Any = js.native
    
    var nonFacetUnitNormalizers: js.Any = js.native
  }
}
