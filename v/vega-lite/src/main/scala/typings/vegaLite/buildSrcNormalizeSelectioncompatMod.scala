package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typings.vegaLite.buildSrcSpecLayerMod.LayerSpec
import typings.vegaLite.buildSrcSpecMapMod.SpecMapper
import typings.vegaLite.buildSrcSpecUnitMod.FacetedUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeSelectioncompatMod {
  
  @JSImport("vega-lite/build/src/normalize/selectioncompat", "SelectionCompatibilityNormalizer")
  @js.native
  open class SelectionCompatibilityNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field, SelectionParameter[SelectionType]], 
          LayerSpec[Field], 
          UnitSpec[Field], 
          scala.Nothing, 
          FieldName
        ] {
    
    def mapLayerOrUnit(spec: LayerSpec[Field], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    def mapLayerOrUnit(spec: FacetedUnitSpec[Field, SelectionParameter[SelectionType]], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    
    def mapUnit(spec: UnitSpec[Field], normParams: NormalizerParams): Any = js.native
  }
}
