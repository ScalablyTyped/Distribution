package typings.vegaLite

import typings.vegaLite.aggregateMod.NonArgAggregateOp
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.datetimeMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("vega-lite/build/src/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/sort", "DEFAULT_SORT_OP")
  @js.native
  val DEFAULT_SORT_OP: /* "min" */ String = js.native
  
  @scala.inline
  def isSortArray[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortArray")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortArray */ Boolean]
  
  @scala.inline
  def isSortByChannel(c: String): /* is vega-lite.vega-lite/build/src/sort.SortByChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByChannel")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortByChannel */ Boolean]
  
  @scala.inline
  def isSortByEncoding[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortByEncoding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortByEncoding")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.SortByEncoding */ Boolean]
  
  @scala.inline
  def isSortField[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortField")(sort.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.sortMod.SortOrder
    - typings.vegaLite.sortMod.SortByChannel
    - typings.vegaLite.sortMod.SortByChannelDesc
  */
  trait AllSortString
    extends StObject
       with _Sort[js.Any]
  
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
    
    @scala.inline
    def apply[F](): EncodingSortField[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingSortField[F]]
    }
    
    @scala.inline
    implicit class EncodingSortFieldMutableBuilder[Self <: EncodingSortField[?], F] (val x: Self & EncodingSortField[F]) extends AnyVal {
      
      @scala.inline
      def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setOp(value: NonArgAggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.sortMod.SortArray
    - typings.vegaLite.sortMod.AllSortString
    - typings.vegaLite.sortMod.EncodingSortField[F]
    - typings.vegaLite.sortMod.SortByEncoding
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
    
    @scala.inline
    def `-color`: typings.vegaLite.vegaLiteStrings.`-color` = "-color".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-color`]
    
    @scala.inline
    def `-fill`: typings.vegaLite.vegaLiteStrings.`-fill` = "-fill".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-fill`]
    
    @scala.inline
    def `-fillOpacity`: typings.vegaLite.vegaLiteStrings.`-fillOpacity` = "-fillOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-fillOpacity`]
    
    @scala.inline
    def `-opacity`: typings.vegaLite.vegaLiteStrings.`-opacity` = "-opacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-opacity`]
    
    @scala.inline
    def `-shape`: typings.vegaLite.vegaLiteStrings.`-shape` = "-shape".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-shape`]
    
    @scala.inline
    def `-size`: typings.vegaLite.vegaLiteStrings.`-size` = "-size".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-size`]
    
    @scala.inline
    def `-stroke`: typings.vegaLite.vegaLiteStrings.`-stroke` = "-stroke".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-stroke`]
    
    @scala.inline
    def `-strokeOpacity`: typings.vegaLite.vegaLiteStrings.`-strokeOpacity` = "-strokeOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-strokeOpacity`]
    
    @scala.inline
    def `-strokeWidth`: typings.vegaLite.vegaLiteStrings.`-strokeWidth` = "-strokeWidth".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-strokeWidth`]
    
    @scala.inline
    def `-text`: typings.vegaLite.vegaLiteStrings.`-text` = "-text".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-text`]
    
    @scala.inline
    def `-x`: typings.vegaLite.vegaLiteStrings.`-x` = "-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-x`]
    
    @scala.inline
    def `-y`: typings.vegaLite.vegaLiteStrings.`-y` = "-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`-y`]
  }
  
  trait SortByEncoding
    extends StObject
       with _Sort[js.Any] {
    
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
    
    @scala.inline
    def apply(encoding: SortByChannel): SortByEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortByEncoding]
    }
    
    @scala.inline
    implicit class SortByEncodingMutableBuilder[Self <: SortByEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: SortByChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
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
    
    @scala.inline
    def apply(field: FieldName): SortField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortField]
    }
    
    @scala.inline
    implicit class SortFieldMutableBuilder[Self <: SortField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait SortFields extends StObject {
    
    var field: js.Array[FieldName]
    
    var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
  }
  object SortFields {
    
    @scala.inline
    def apply(field: js.Array[FieldName]): SortFields = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortFields]
    }
    
    @scala.inline
    implicit class SortFieldsMutableBuilder[Self <: SortFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: js.Array[FieldName]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldVarargs(value: FieldName*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
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
    
    @scala.inline
    def ascending: typings.vegaLite.vegaLiteStrings.ascending = "ascending".asInstanceOf[typings.vegaLite.vegaLiteStrings.ascending]
    
    @scala.inline
    def descending: typings.vegaLite.vegaLiteStrings.descending = "descending".asInstanceOf[typings.vegaLite.vegaLiteStrings.descending]
  }
  
  trait _Sort[F] extends StObject
}
