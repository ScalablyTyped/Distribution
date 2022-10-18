package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcLogicalMod.LogicalComposition
import typings.vegaLite.buildSrcPredicateMod.Predicate
import typings.vegaLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaLite.buildSrcTimeunitMod.TimeUnitParams
import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcTransformMod.AggregateTransform
  - typings.vegaLite.buildSrcTransformMod.BinTransform
  - typings.vegaLite.buildSrcTransformMod.CalculateTransform
  - typings.vegaLite.buildSrcTransformMod.DensityTransform
  - typings.vegaLite.buildSrcTransformMod.FilterTransform
  - typings.vegaLite.buildSrcTransformMod.FlattenTransform
  - typings.vegaLite.buildSrcTransformMod.FoldTransform
  - typings.vegaLite.buildSrcTransformMod.ImputeTransform
  - typings.vegaLite.buildSrcTransformMod.JoinAggregateTransform
  - typings.vegaLite.buildSrcTransformMod.LoessTransform
  - typings.vegaLite.buildSrcTransformMod.LookupTransform
  - typings.vegaLite.buildSrcTransformMod.QuantileTransform
  - typings.vegaLite.buildSrcTransformMod.RegressionTransform
  - typings.vegaLite.buildSrcTransformMod.TimeUnitTransform
  - typings.vegaLite.buildSrcTransformMod.SampleTransform
  - typings.vegaLite.buildSrcTransformMod.StackTransform
  - typings.vegaLite.buildSrcTransformMod.WindowTransform
  - typings.vegaLite.buildSrcTransformMod.PivotTransform
*/
trait Transform extends StObject
object Transform {
  
  inline def AggregateTransform(aggregate: js.Array[AggregatedFieldDef]): typings.vegaLite.buildSrcTransformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.AggregateTransform]
  }
  
  inline def BinTransform(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): typings.vegaLite.buildSrcTransformMod.BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.BinTransform]
  }
  
  inline def CalculateTransform(as: FieldName, calculate: String): typings.vegaLite.buildSrcTransformMod.CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.CalculateTransform]
  }
  
  inline def DensityTransform(density: FieldName): typings.vegaLite.buildSrcTransformMod.DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.DensityTransform]
  }
  
  inline def FilterTransform(filter: LogicalComposition[Predicate]): typings.vegaLite.buildSrcTransformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.FilterTransform]
  }
  
  inline def FlattenTransform(flatten: js.Array[FieldName]): typings.vegaLite.buildSrcTransformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.FlattenTransform]
  }
  
  inline def FoldTransform(fold: js.Array[FieldName]): typings.vegaLite.buildSrcTransformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.FoldTransform]
  }
  
  inline def ImputeTransform(impute: FieldName, key: FieldName): typings.vegaLite.buildSrcTransformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.ImputeTransform]
  }
  
  inline def JoinAggregateTransform(joinaggregate: js.Array[JoinAggregateFieldDef]): typings.vegaLite.buildSrcTransformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.JoinAggregateTransform]
  }
  
  inline def LoessTransform(loess: FieldName, on: FieldName): typings.vegaLite.buildSrcTransformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(loess = loess.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.LoessTransform]
  }
  
  inline def LookupTransform(from: LookupData | LookupSelection, lookup: String): typings.vegaLite.buildSrcTransformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.LookupTransform]
  }
  
  inline def PivotTransform(pivot: FieldName, value: FieldName): typings.vegaLite.buildSrcTransformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.PivotTransform]
  }
  
  inline def QuantileTransform(quantile: FieldName): typings.vegaLite.buildSrcTransformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.QuantileTransform]
  }
  
  inline def RegressionTransform(on: FieldName, regression: FieldName): typings.vegaLite.buildSrcTransformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], regression = regression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.RegressionTransform]
  }
  
  inline def SampleTransform(sample: Double): typings.vegaLite.buildSrcTransformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.SampleTransform]
  }
  
  inline def StackTransform(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): typings.vegaLite.buildSrcTransformMod.StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.StackTransform]
  }
  
  inline def TimeUnitTransform(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): typings.vegaLite.buildSrcTransformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.TimeUnitTransform]
  }
  
  inline def WindowTransform(window: js.Array[WindowFieldDef]): typings.vegaLite.buildSrcTransformMod.WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcTransformMod.WindowTransform]
  }
}
