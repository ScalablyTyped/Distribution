package typings.vegaLite

import typings.vegaLite.buildSrcAggregateMod.NonArgAggregateOp
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSortMod {
  
  @JSImport("vega-lite/build/src/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/sort", "DEFAULT_SORT_OP")
  @js.native
  val DEFAULT_SORT_OP: /* "min" */ String = js.native
  
  inline def isSortArray[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortArray")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortArray */ Boolean]
  
  inline def isSortByChannel(c: String): /* is vega-lite.vega-lite/build/src/sort.SortByChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortByChannel */ Boolean]
  
  inline def isSortByEncoding[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortByEncoding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByEncoding")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortByEncoding */ Boolean]
  
  inline def isSortField[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortField")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcSortMod.SortOrder
    - typings.vegaLite.buildSrcSortMod.SortByChannel
    - typings.vegaLite.buildSrcSortMod.SortByChannelDesc
  */
  trait AllSortString
    extends StObject
       with _Sort[Any]
  
  trait EncodingSortField[F]
    extends StObject
       with _Sort[F] {
    
    /**
      * The data [field](https://vega.github.io/vega-lite/docs/field.html) to sort by.
      *
      * __Default value:__ If unspecified, defaults to the field specified in the outer data reference.
      */
    var field: js.UndefOr[F] = js.undefined
    
    /**
      * An [aggregate operation](https://vega.github.io/vega-lite/docs/aggregate.html#ops) to perform on the field prior to sorting (e.g., `"count"`, `"mean"` and `"median"`).
      * An aggregation is required when there are multiple values of the sort field for each encoded data field.
      * The input data objects will be aggregated, grouped by the encoded data field.
      *
      * For a full list of operations, please see the documentation for [aggregate](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
      *
      * __Default value:__ `"sum"` for stacked plots. Otherwise, `"min"`.
      */
    var op: js.UndefOr[NonArgAggregateOp] = js.undefined
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object EncodingSortField {
    
    inline def apply[F](): EncodingSortField[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingSortField[F]]
    }
    
    extension [Self <: EncodingSortField[?], F](x: Self & EncodingSortField[F]) {
      
      inline def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setOp(value: NonArgAggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcSortMod.SortArray
    - typings.vegaLite.buildSrcSortMod.AllSortString
    - typings.vegaLite.buildSrcSortMod.EncodingSortField[F]
    - typings.vegaLite.buildSrcSortMod.SortByEncoding
    - scala.Null
  */
  type Sort[F] = _Sort[F] | SortArray | Null
  
  type SortArray = js.Array[Boolean | DateTime | Double | String]
  
  /* keyof vega-lite.anon.FillOpacity */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x
    - typings.vegaLite.vegaLiteStrings.y
    - typings.vegaLite.vegaLiteStrings.color
    - typings.vegaLite.vegaLiteStrings.fill
    - typings.vegaLite.vegaLiteStrings.stroke
    - typings.vegaLite.vegaLiteStrings.strokeWidth
    - typings.vegaLite.vegaLiteStrings.size
    - typings.vegaLite.vegaLiteStrings.shape
    - typings.vegaLite.vegaLiteStrings.fillOpacity
    - typings.vegaLite.vegaLiteStrings.strokeOpacity
    - typings.vegaLite.vegaLiteStrings.opacity
    - typings.vegaLite.vegaLiteStrings.text
  */
  trait SortByChannel
    extends StObject
       with AllSortString
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.`-x`
    - typings.vegaLite.vegaLiteStrings.`-y`
    - typings.vegaLite.vegaLiteStrings.`-color`
    - typings.vegaLite.vegaLiteStrings.`-fill`
    - typings.vegaLite.vegaLiteStrings.`-stroke`
    - typings.vegaLite.vegaLiteStrings.`-strokeWidth`
    - typings.vegaLite.vegaLiteStrings.`-size`
    - typings.vegaLite.vegaLiteStrings.`-shape`
    - typings.vegaLite.vegaLiteStrings.`-fillOpacity`
    - typings.vegaLite.vegaLiteStrings.`-strokeOpacity`
    - typings.vegaLite.vegaLiteStrings.`-opacity`
    - typings.vegaLite.vegaLiteStrings.`-text`
  */
  trait SortByChannelDesc
    extends StObject
       with AllSortString
  object SortByChannelDesc {
    
    inline def `-color`: typings.vegaLite.vegaLiteStrings.`-color` = "-color".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-color`]
    
    inline def `-fill`: typings.vegaLite.vegaLiteStrings.`-fill` = "-fill".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-fill`]
    
    inline def `-fillOpacity`: typings.vegaLite.vegaLiteStrings.`-fillOpacity` = "-fillOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-fillOpacity`]
    
    inline def `-opacity`: typings.vegaLite.vegaLiteStrings.`-opacity` = "-opacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-opacity`]
    
    inline def `-shape`: typings.vegaLite.vegaLiteStrings.`-shape` = "-shape".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-shape`]
    
    inline def `-size`: typings.vegaLite.vegaLiteStrings.`-size` = "-size".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-size`]
    
    inline def `-stroke`: typings.vegaLite.vegaLiteStrings.`-stroke` = "-stroke".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-stroke`]
    
    inline def `-strokeOpacity`: typings.vegaLite.vegaLiteStrings.`-strokeOpacity` = "-strokeOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-strokeOpacity`]
    
    inline def `-strokeWidth`: typings.vegaLite.vegaLiteStrings.`-strokeWidth` = "-strokeWidth".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-strokeWidth`]
    
    inline def `-text`: typings.vegaLite.vegaLiteStrings.`-text` = "-text".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-text`]
    
    inline def `-x`: typings.vegaLite.vegaLiteStrings.`-x` = "-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-x`]
    
    inline def `-y`: typings.vegaLite.vegaLiteStrings.`-y` = "-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-y`]
  }
  
  trait SortByEncoding
    extends StObject
       with _Sort[Any] {
    
    /**
      * The [encoding channel](https://vega.github.io/vega-lite/docs/encoding.html#channels) to sort by (e.g., `"x"`, `"y"`)
      */
    var encoding: SortByChannel
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object SortByEncoding {
    
    inline def apply(encoding: SortByChannel): SortByEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortByEncoding]
    }
    
    extension [Self <: SortByEncoding](x: Self) {
      
      inline def setEncoding(value: SortByChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait SortField extends StObject {
    
    /**
      * The name of the field to sort.
      */
    var field: FieldName
    
    /**
      * Whether to sort the field in ascending or descending order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.undefined
  }
  object SortField {
    
    inline def apply(field: FieldName): SortField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortField]
    }
    
    extension [Self <: SortField](x: Self) {
      
      inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderNull: Self = StObject.set(x, "order", null)
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait SortFields extends StObject {
    
    var field: js.Array[FieldName]
    
    var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
  }
  object SortFields {
    
    inline def apply(field: js.Array[FieldName]): SortFields = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortFields]
    }
    
    extension [Self <: SortFields](x: Self) {
      
      inline def setField(value: js.Array[FieldName]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldVarargs(value: FieldName*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.ascending
    - typings.vegaLite.vegaLiteStrings.descending
  */
  trait SortOrder
    extends StObject
       with AllSortString
  object SortOrder {
    
    inline def ascending: typings.vegaLite.vegaLiteStrings.ascending = "ascending".asInstanceOf[typings.vegaLite.vegaLiteStrings.ascending]
    
    inline def descending: typings.vegaLite.vegaLiteStrings.descending = "descending".asInstanceOf[typings.vegaLite.vegaLiteStrings.descending]
  }
  
  trait _Sort[F] extends StObject
}
