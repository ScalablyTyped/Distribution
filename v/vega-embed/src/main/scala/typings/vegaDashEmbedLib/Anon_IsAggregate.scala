package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsAggregate extends js.Object {
  def isAggregate(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ scala.Boolean
  def isBin(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ scala.Boolean
  def isCalculate(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ scala.Boolean
  def isFilter(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ scala.Boolean
  def isLookup(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ scala.Boolean
  def isStack(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ scala.Boolean
  def isTimeUnit(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ scala.Boolean
  def isWindow(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ scala.Boolean
  def normalizeTransform(transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform]): js.Array[
    vegaDashLiteLib.buildSrcTransformMod.CalculateTransform | vegaDashLiteLib.buildSrcTransformMod.LookupTransform | vegaDashLiteLib.buildSrcTransformMod.BinTransform | vegaDashLiteLib.buildSrcTransformMod.TimeUnitTransform | vegaDashLiteLib.buildSrcTransformMod.AggregateTransform | vegaDashLiteLib.buildSrcTransformMod.WindowTransform | vegaDashLiteLib.buildSrcTransformMod.StackTransform | vegaDashLiteLib.Anon_Filter
  ]
}

object Anon_IsAggregate {
  @scala.inline
  def apply(
    isAggregate: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ scala.Boolean,
    isBin: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.BinTransform */ scala.Boolean,
    isCalculate: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ scala.Boolean,
    isFilter: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ scala.Boolean,
    isLookup: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ scala.Boolean,
    isStack: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.StackTransform */ scala.Boolean,
    isTimeUnit: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ scala.Boolean,
    isWindow: vegaDashLiteLib.buildSrcTransformMod.Transform => /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ scala.Boolean,
    normalizeTransform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] => js.Array[
      vegaDashLiteLib.buildSrcTransformMod.CalculateTransform | vegaDashLiteLib.buildSrcTransformMod.LookupTransform | vegaDashLiteLib.buildSrcTransformMod.BinTransform | vegaDashLiteLib.buildSrcTransformMod.TimeUnitTransform | vegaDashLiteLib.buildSrcTransformMod.AggregateTransform | vegaDashLiteLib.buildSrcTransformMod.WindowTransform | vegaDashLiteLib.buildSrcTransformMod.StackTransform | vegaDashLiteLib.Anon_Filter
    ]
  ): Anon_IsAggregate = {
    val __obj = js.Dynamic.literal(isAggregate = js.Any.fromFunction1(isAggregate), isBin = js.Any.fromFunction1(isBin), isCalculate = js.Any.fromFunction1(isCalculate), isFilter = js.Any.fromFunction1(isFilter), isLookup = js.Any.fromFunction1(isLookup), isStack = js.Any.fromFunction1(isStack), isTimeUnit = js.Any.fromFunction1(isTimeUnit), isWindow = js.Any.fromFunction1(isWindow), normalizeTransform = js.Any.fromFunction1(normalizeTransform))
  
    __obj.asInstanceOf[Anon_IsAggregate]
  }
}

