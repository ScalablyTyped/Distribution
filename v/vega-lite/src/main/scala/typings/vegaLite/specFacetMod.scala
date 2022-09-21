package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.headerMod.Header
import typings.vegaLite.sortMod.EncodingSortField
import typings.vegaLite.sortMod.SortArray
import typings.vegaLite.sortMod.SortOrder
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcSelectionMod.SelectionParameter
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specFacetMod {
  
  @JSImport("vega-lite/build/src/spec/facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFacetFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, any> */ Boolean]
  
  inline def isFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */](f: FacetFieldDef[F, ES]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetMapping")(f.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean]
  inline def isFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */](f: FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetMapping")(f.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean]
  
  inline def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean]
  
  trait EncodingFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */]
    extends StObject
       with FacetMapping[F, RowColumnEncodingFieldDef[F, ES]] {
    
    /**
      * A field definition for the (flexible) facet of trellis plots.
      *
      * If either `row` or `column` is specified, this channel will be ignored.
      */
    var facet: js.UndefOr[FacetEncodingFieldDef[F, ES]] = js.undefined
  }
  object EncodingFacetMapping {
    
    inline def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): EncodingFacetMapping[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFacetMapping[F, ES]]
    }
    
    extension [Self <: EncodingFacetMapping[?, ?], F /* <: Field */, ES /* <: ExprRef | SignalRef */](x: Self & (EncodingFacetMapping[F, ES])) {
      
      inline def setFacet(value: FacetEncodingFieldDef[F, ES]): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      inline def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
    }
  }
  
  type FacetEncodingFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */] = (FacetFieldDef[F, ES]) & GenericCompositionLayoutWithColumns
  
  trait FacetFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */]
    extends StObject
       with TypedFieldDef[F, StandardType, Boolean | BinParams | Null] {
    
    /**
      * An object defining properties of a facet's header.
      */
    var header: js.UndefOr[Header[ES] | Null] = js.undefined
    
    /**
      * Sort order for the encoded field.
      *
      * For continuous fields (quantitative or temporal), `sort` can be either `"ascending"` or `"descending"`.
      *
      * For discrete fields, `sort` can be one of the following:
      * - `"ascending"` or `"descending"` -- for sorting by the values' natural order in JavaScript.
      * - [A sort field definition](https://vega.github.io/vega-lite/docs/sort.html#sort-field) for sorting by another field.
      * - [An array specifying the field values in preferred order](https://vega.github.io/vega-lite/docs/sort.html#sort-array). In this case, the sort order will obey the values in the array, followed by any unspecified values in their original order. For discrete time field, values in the sort array can be [date-time definition objects](types#datetime). In addition, for time units `"month"` and `"day"`, the values can be the month or day names (case insensitive) or their 3-letter initials (e.g., `"Mon"`, `"Tue"`).
      * - `null` indicating no sort.
      *
      * __Default value:__ `"ascending"`
      *
      * __Note:__ `null` is not supported for `row` and `column`.
      */
    var sort: js.UndefOr[SortArray | SortOrder | EncodingSortField[F] | Null] = js.undefined
  }
  object FacetFieldDef {
    
    inline def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): FacetFieldDef[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFieldDef[F, ES]]
    }
    
    extension [Self <: FacetFieldDef[?, ?], F /* <: Field */, ES /* <: ExprRef | SignalRef */](x: Self & (FacetFieldDef[F, ES])) {
      
      inline def setHeader(value: Header[ES]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSort(value: SortArray | SortOrder | EncodingSortField[F]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortNull: Self = StObject.set(x, "sort", null)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "sort", js.Array(value*))
    }
  }
  
  trait FacetMapping[F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */] extends StObject {
    
    /**
      * A field definition for the horizontal facet of trellis plots.
      */
    var column: js.UndefOr[FD] = js.undefined
    
    /**
      * A field definition for the vertical facet of trellis plots.
      */
    var row: js.UndefOr[FD] = js.undefined
  }
  object FacetMapping {
    
    inline def apply[F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */](): FacetMapping[F, FD] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetMapping[F, FD]]
    }
    
    extension [Self <: FacetMapping[?, ?], F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */](x: Self & (FacetMapping[F, FD])) {
      
      inline def setColumn(value: FD): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: FD): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait GenericFacetSpec[U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, L /* <: GenericLayerSpec[Any] */, F /* <: Field */]
    extends StObject
       with BaseSpec
       with GenericCompositionLayoutWithColumns
       with ResolveMixins {
    
    /**
      * Definition for how to facet the data. One of:
      * 1) [a field definition for faceting the plot by one field](https://vega.github.io/vega-lite/docs/facet.html#field-def)
      * 2) [An object that maps `row` and `column` channels to their field definitions](https://vega.github.io/vega-lite/docs/facet.html#mapping)
      */
    var facet: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]])
    
    /**
      * A specification of the view that gets faceted.
      */
    var spec: L | U
  }
  object GenericFacetSpec {
    
    inline def apply[U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, L /* <: GenericLayerSpec[Any] */, F /* <: Field */](
      facet: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]]),
      spec: L | U
    ): GenericFacetSpec[U, L, F] = {
      val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericFacetSpec[U, L, F]]
    }
    
    extension [Self <: GenericFacetSpec[?, ?, ?], U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */, L /* <: GenericLayerSpec[Any] */, F /* <: Field */](x: Self & (GenericFacetSpec[U, L, F])) {
      
      inline def setFacet(
        value: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]])
      ): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: L | U): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedFacetSpec = GenericFacetSpec[NormalizedUnitSpec, NormalizedLayerSpec, FieldName]
  
  trait RowColumnEncodingFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */]
    extends StObject
       with FacetFieldDef[F, ES] {
    
    /**
      * The alignment to apply to row/column facet's subplot.
      * The supported string values are `"all"`, `"each"`, and `"none"`.
      *
      * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
      * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
      * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
      *
      * __Default value:__ `"all"`.
      */
    var align: js.UndefOr[LayoutAlign] = js.undefined
    
    /**
      * Boolean flag indicating if facet's subviews should be centered relative to their respective rows or columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The spacing in pixels between facet's sub-views.
      *
      * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object RowColumnEncodingFieldDef {
    
    inline def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): RowColumnEncodingFieldDef[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowColumnEncodingFieldDef[F, ES]]
    }
    
    extension [Self <: RowColumnEncodingFieldDef[?, ?], F /* <: Field */, ES /* <: ExprRef | SignalRef */](x: Self & (RowColumnEncodingFieldDef[F, ES])) {
      
      inline def setAlign(value: LayoutAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
