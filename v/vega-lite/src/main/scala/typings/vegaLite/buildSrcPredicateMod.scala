package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcLogicalMod.LogicalComposition
import typings.vegaLite.buildSrcParameterMod.ParameterName
import typings.vegaLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaLite.buildSrcTimeunitMod.TimeUnitParams
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPredicateMod {
  
  @JSImport("vega-lite/build/src/predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fieldFilterExpression(predicate: FieldPredicate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldFilterExpression")(predicate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldFilterExpression(predicate: FieldPredicate, useInRange: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldFilterExpression")(predicate.asInstanceOf[js.Any], useInRange.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fieldValidPredicate(fieldExpr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldValidPredicate")(fieldExpr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldValidPredicate(fieldExpr: String, valid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldValidPredicate")(fieldExpr.asInstanceOf[js.Any], valid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFieldEqualPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldEqualPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldEqualPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldEqualPredicate */ Boolean]
  
  inline def isFieldGTEPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTEPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldGTEPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldGTEPredicate */ Boolean]
  
  inline def isFieldGTPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldGTPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldGTPredicate */ Boolean]
  
  inline def isFieldLTEPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTEPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldLTEPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldLTEPredicate */ Boolean]
  
  inline def isFieldLTPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldLTPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldLTPredicate */ Boolean]
  
  inline def isFieldOneOfPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldOneOfPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOneOfPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldOneOfPredicate */ Boolean]
  
  inline def isFieldPredicate(predicate: Predicate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFieldRangePredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldRangePredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldRangePredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldRangePredicate */ Boolean]
  
  inline def isFieldValidPredicate(predicate: Any): /* is vega-lite.vega-lite/build/src/predicate.FieldValidPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldValidPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.FieldValidPredicate */ Boolean]
  
  inline def isSelectionPredicate(predicate: LogicalComposition[Predicate]): /* is vega-lite.vega-lite/build/src/predicate.ParameterPredicate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/predicate.ParameterPredicate */ Boolean]
  
  inline def normalizePredicate(f: Predicate): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePredicate")(f.asInstanceOf[js.Any]).asInstanceOf[Predicate]
  
  trait FieldEqualPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be equal to.
      */
    var equal: String | Double | Boolean | DateTime | ExprRef | SignalRef
  }
  object FieldEqualPredicate {
    
    inline def apply(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEqualPredicate]
    }
    
    extension [Self <: FieldEqualPredicate](x: Self) {
      
      inline def setEqual(value: String | Double | Boolean | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldGTEPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than or equals to.
      */
    var gte: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldGTEPredicate {
    
    inline def apply(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTEPredicate]
    }
    
    extension [Self <: FieldGTEPredicate](x: Self) {
      
      inline def setGte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldGTPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than.
      */
    var gt: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldGTPredicate {
    
    inline def apply(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTPredicate]
    }
    
    extension [Self <: FieldGTPredicate](x: Self) {
      
      inline def setGt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldLTEPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than or equals to.
      */
    var lte: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldLTEPredicate {
    
    inline def apply(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTEPredicate]
    }
    
    extension [Self <: FieldLTEPredicate](x: Self) {
      
      inline def setLte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldLTPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than.
      */
    var lt: String | Double | DateTime | ExprRef | SignalRef
  }
  object FieldLTPredicate {
    
    inline def apply(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTPredicate]
    }
    
    extension [Self <: FieldLTPredicate](x: Self) {
      
      inline def setLt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldOneOfPredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * A set of values that the `field`'s value should be a member of,
      * for a data item included in the filtered data.
      */
    var oneOf: js.Array[Boolean | DateTime | Double | String]
  }
  object FieldOneOfPredicate {
    
    inline def apply(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOneOfPredicate]
    }
    
    extension [Self <: FieldOneOfPredicate](x: Self) {
      
      inline def setOneOf(value: js.Array[Boolean | DateTime | Double | String]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "oneOf", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_
  */
  trait FieldPredicate extends StObject
  object FieldPredicate {
    
    inline def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate]
    }
    
    inline def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate]
    }
    
    inline def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate]
    }
    
    inline def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate]
    }
    
    inline def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate]
    }
    
    inline def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate]
    }
    
    inline def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate]
    }
    
    inline def FieldValidPredicate_(field: FieldName, valid: Boolean): typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_]
    }
  }
  
  trait FieldPredicateBase extends StObject {
    
    /**
      * Field to be tested.
      */
    var field: FieldName
    
    /**
      * Time unit for the field to be tested.
      */
    var timeUnit: js.UndefOr[TimeUnit | TimeUnitParams] = js.undefined
  }
  object FieldPredicateBase {
    
    inline def apply(field: FieldName): FieldPredicateBase = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPredicateBase]
    }
    
    extension [Self <: FieldPredicateBase](x: Self) {
      
      inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
  
  trait FieldRangePredicate
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * An array of inclusive minimum and maximum values
      * for a field value of a data item to be included in the filtered data.
      * @maxItems 2
      * @minItems 2
      */
    var range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
  }
  object FieldRangePredicate {
    
    inline def apply(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldRangePredicate]
    }
    
    extension [Self <: FieldRangePredicate](x: Self) {
      
      inline def setRange(value: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: (Double | DateTime | Null | ExprRef | SignalRef)*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  trait FieldValidPredicate_
    extends StObject
       with FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * If set to true the field's value has to be valid, meaning both not `null` and not [`NaN`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NaN).
      */
    var valid: Boolean
  }
  object FieldValidPredicate_ {
    
    inline def apply(field: FieldName, valid: Boolean): FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValidPredicate_]
    }
    
    extension [Self <: FieldValidPredicate_](x: Self) {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterPredicate
    extends StObject
       with _Predicate {
    
    /**
      * For selection parameters, the predicate of empty selections returns true by default.
      * Override this behavior, by setting this property `empty: false`.
      */
    var empty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter using a parameter name.
      */
    var param: ParameterName
  }
  object ParameterPredicate {
    
    inline def apply(param: ParameterName): ParameterPredicate = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterPredicate]
    }
    
    extension [Self <: ParameterPredicate](x: Self) {
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate
    - typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_
    - typings.vegaLite.buildSrcPredicateMod.ParameterPredicate
    - java.lang.String
  */
  type Predicate = _Predicate | String
  
  trait _Predicate extends StObject
  object _Predicate {
    
    inline def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldEqualPredicate]
    }
    
    inline def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldGTEPredicate]
    }
    
    inline def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldGTPredicate]
    }
    
    inline def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldLTEPredicate]
    }
    
    inline def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldLTPredicate]
    }
    
    inline def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldOneOfPredicate]
    }
    
    inline def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldRangePredicate]
    }
    
    inline def FieldValidPredicate_(field: FieldName, valid: Boolean): typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.FieldValidPredicate_]
    }
    
    inline def ParameterPredicate(param: ParameterName): typings.vegaLite.buildSrcPredicateMod.ParameterPredicate = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcPredicateMod.ParameterPredicate]
    }
  }
}
