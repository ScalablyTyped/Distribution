package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.mapMod.SpecMapper
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import typings.vegaLite.srcSelectionMod.SelectionParameter
import typings.vegaLite.srcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("vega-lite/build/src/normalize/core", "CoreNormalizer")
  @js.native
  open class CoreNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field, SelectionParameter[SelectionType]], 
          LayerSpec[Field], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    /* private */ var getFacetMappingAndLayout: Any = js.native
    
    /* private */ var mapFacetedUnit: Any = js.native
    
    /* private */ var mapLayerRepeat: Any = js.native
    
    /* private */ var mapNonLayerRepeat: Any = js.native
    
    def mapUnit(spec: UnitSpec[Field], params: NormalizerParams): NormalizedUnitSpec | NormalizedLayerSpec = js.native
    
    /* private */ var mapUnitWithParentEncodingOrProjection: Any = js.native
    
    /* private */ var nonFacetUnitNormalizers: Any = js.native
  }
}
