package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.mapMod.SpecMapper
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import typings.vegaLite.srcSelectionMod.SelectionParameter
import typings.vegaLite.srcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectioncompatMod {
  
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
