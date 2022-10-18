package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecLayerMod.LayerSpec
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaLite.buildSrcSpecMapMod.SpecMapper
import typings.vegaLite.buildSrcSpecUnitMod.FacetedUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeCoreMod {
  
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
