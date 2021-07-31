package typings.vegaLite.transformMod

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.srcPredicateMod.Predicate
import typings.vegaLite.srcTimeunitMod.TimeUnit
import typings.vegaLite.srcTimeunitMod.TimeUnitParams
import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.transformMod.AggregateTransform
  - typings.vegaLite.transformMod.BinTransform
  - typings.vegaLite.transformMod.CalculateTransform
  - typings.vegaLite.transformMod.DensityTransform
  - typings.vegaLite.transformMod.FilterTransform
  - typings.vegaLite.transformMod.FlattenTransform
  - typings.vegaLite.transformMod.FoldTransform
  - typings.vegaLite.transformMod.ImputeTransform
  - typings.vegaLite.transformMod.JoinAggregateTransform
  - typings.vegaLite.transformMod.LoessTransform
  - typings.vegaLite.transformMod.LookupTransform
  - typings.vegaLite.transformMod.QuantileTransform
  - typings.vegaLite.transformMod.RegressionTransform
  - typings.vegaLite.transformMod.TimeUnitTransform
  - typings.vegaLite.transformMod.SampleTransform
  - typings.vegaLite.transformMod.StackTransform
  - typings.vegaLite.transformMod.WindowTransform
  - typings.vegaLite.transformMod.PivotTransform
*/
trait Transform extends StObject
object Transform {
  
  @scala.inline
  def AggregateTransform(aggregate: js.Array[AggregatedFieldDef]): typings.vegaLite.transformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.AggregateTransform]
  }
  
  @scala.inline
  def BinTransform(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): typings.vegaLite.transformMod.BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.BinTransform]
  }
  
  @scala.inline
  def CalculateTransform(as: FieldName, calculate: String): typings.vegaLite.transformMod.CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.CalculateTransform]
  }
  
  @scala.inline
  def DensityTransform(density: FieldName): typings.vegaLite.transformMod.DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.DensityTransform]
  }
  
  @scala.inline
  def FilterTransform(filter: LogicalComposition[Predicate]): typings.vegaLite.transformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.FilterTransform]
  }
  
  @scala.inline
  def FlattenTransform(flatten: js.Array[FieldName]): typings.vegaLite.transformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.FlattenTransform]
  }
  
  @scala.inline
  def FoldTransform(fold: js.Array[FieldName]): typings.vegaLite.transformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.FoldTransform]
  }
  
  @scala.inline
  def ImputeTransform(impute: FieldName, key: FieldName): typings.vegaLite.transformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.ImputeTransform]
  }
  
  @scala.inline
  def JoinAggregateTransform(joinaggregate: js.Array[JoinAggregateFieldDef]): typings.vegaLite.transformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.JoinAggregateTransform]
  }
  
  @scala.inline
  def LoessTransform(loess: FieldName, on: FieldName): typings.vegaLite.transformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(loess = loess.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.LoessTransform]
  }
  
  @scala.inline
  def LookupTransform(from: LookupData | LookupSelection, lookup: String): typings.vegaLite.transformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.LookupTransform]
  }
  
  @scala.inline
  def PivotTransform(pivot: FieldName, value: FieldName): typings.vegaLite.transformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.PivotTransform]
  }
  
  @scala.inline
  def QuantileTransform(quantile: FieldName): typings.vegaLite.transformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.QuantileTransform]
  }
  
  @scala.inline
  def RegressionTransform(on: FieldName, regression: FieldName): typings.vegaLite.transformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], regression = regression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.RegressionTransform]
  }
  
  @scala.inline
  def SampleTransform(sample: Double): typings.vegaLite.transformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.SampleTransform]
  }
  
  @scala.inline
  def StackTransform(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): typings.vegaLite.transformMod.StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.StackTransform]
  }
  
  @scala.inline
  def TimeUnitTransform(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): typings.vegaLite.transformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.TimeUnitTransform]
  }
  
  @scala.inline
  def WindowTransform(window: js.Array[WindowFieldDef]): typings.vegaLite.transformMod.WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.transformMod.WindowTransform]
  }
}
