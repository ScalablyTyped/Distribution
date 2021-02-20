package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.ExtendedChannel
import typings.vegaLite.channeldefMod.FieldRefOption
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.modelMod.Model
import typings.vegaLite.modelMod.ModelWithField
import typings.vegaLite.sortMod.EncodingSortField
import typings.vegaLite.specFacetMod.EncodingFacetMapping
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaLite.specFacetMod.NormalizedFacetSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileFacetMod {
  
  @JSImport("vega-lite/build/src/compile/facet", "FacetModel")
  @js.native
  class FacetModel protected () extends ModelWithField {
    def this(spec: NormalizedFacetSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    var assembleFacet: js.Any = js.native
    
    var assembleLabelTitle: js.Any = js.native
    
    def channelHasField(channel: ExtendedChannel): Boolean = js.native
    
    val child: Model = js.native
    
    var columnDistinctSignal: js.Any = js.native
    
    val facet: EncodingFacetMapping[String, SignalRef] = js.native
    
    var facetSortFields: js.Any = js.native
    
    var facetSortOrder: js.Any = js.native
    
    def fieldDef(channel: ExtendedChannel): TypedFieldDef[String, _, Boolean | BinParams | binned | Null] = js.native
    
    /**
      * Aggregate cardinality for calculating size
      */
    var getCardinalityAggregateForChild: js.Any = js.native
    
    var getHeaderLayoutMixins: js.Any = js.native
    
    var initFacet: js.Any = js.native
    
    var initFacetFieldDef: js.Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/facet", "facetSortFieldName")
  @js.native
  def facetSortFieldName(fieldDef: FacetFieldDef[String, ExprRef | SignalRef], sort: EncodingSortField[String]): String = js.native
  @JSImport("vega-lite/build/src/compile/facet", "facetSortFieldName")
  @js.native
  def facetSortFieldName(
    fieldDef: FacetFieldDef[String, ExprRef | SignalRef],
    sort: EncodingSortField[String],
    opt: FieldRefOption
  ): String = js.native
}
