package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecConcatMod.GenericConcatSpec
import typings.vegaLite.buildSrcSpecConcatMod.GenericHConcatSpec
import typings.vegaLite.buildSrcSpecConcatMod.GenericVConcatSpec
import typings.vegaLite.buildSrcSpecFacetMod.GenericFacetSpec
import typings.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typings.vegaLite.buildSrcSpecMod.GenericSpec
import typings.vegaLite.buildSrcSpecRepeatMod.RepeatSpec
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecMapMod {
  
  /* note: abstract class */ @JSImport("vega-lite/build/src/spec/map", "SpecMapper")
  @js.native
  open class SpecMapper[P, UI /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, LI /* <: GenericLayerSpec[Any] */, UO /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, RO /* <: RepeatSpec */, FO /* <: Field */] () extends StObject {
    
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
