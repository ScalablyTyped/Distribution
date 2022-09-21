package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.repeatMod.RepeatSpec
import typings.vegaLite.specConcatMod.GenericConcatSpec
import typings.vegaLite.specConcatMod.GenericHConcatSpec
import typings.vegaLite.specConcatMod.GenericVConcatSpec
import typings.vegaLite.specFacetMod.GenericFacetSpec
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.srcSelectionMod.SelectionParameter
import typings.vegaLite.srcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("vega-lite/build/src/spec/map", "SpecMapper")
  @js.native
  abstract class SpecMapper[P, UI /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, LI /* <: GenericLayerSpec[Any] */, UO /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, RO /* <: RepeatSpec */, FO /* <: Field */] () extends StObject {
    
    def map(spec: GenericSpec[UI, LI, RepeatSpec, Field], params: P): GenericSpec[UO, GenericLayerSpec[UO], RO, FO] = js.native
    
    /* protected */ def mapConcat(spec: GenericConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapFacet(spec: GenericFacetSpec[UI, LI, Field], params: P): GenericFacetSpec[UO, GenericLayerSpec[UO], FO] = js.native
    
    /* protected */ def mapHConcat(spec: GenericHConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericHConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapLayer(spec: LI, params: P): GenericLayerSpec[UO] = js.native
    
    def mapLayerOrUnit(spec: LI | UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapRepeat(spec: RepeatSpec, params: P): GenericSpec[UO, Any, RO, FO] = js.native
    
    def mapUnit(spec: UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapVConcat(spec: GenericVConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericVConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
  }
}
