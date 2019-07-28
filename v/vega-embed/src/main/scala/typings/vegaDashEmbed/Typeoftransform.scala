package typings.vegaDashEmbed

import typings.vegaDashLite.Anon_Filter
import typings.vegaDashLite.buildSrcTransformMod.AggregateTransform
import typings.vegaDashLite.buildSrcTransformMod.BinTransform
import typings.vegaDashLite.buildSrcTransformMod.CalculateTransform
import typings.vegaDashLite.buildSrcTransformMod.LookupTransform
import typings.vegaDashLite.buildSrcTransformMod.StackTransform
import typings.vegaDashLite.buildSrcTransformMod.TimeUnitTransform
import typings.vegaDashLite.buildSrcTransformMod.Transform
import typings.vegaDashLite.buildSrcTransformMod.WindowTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftransform extends js.Object {
  def isAggregate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ Boolean
  def isBin(t: Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ Boolean
  def isCalculate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ Boolean
  def isFilter(t: Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ Boolean
  def isLookup(t: Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ Boolean
  def isStack(t: Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ Boolean
  def isTimeUnit(t: Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ Boolean
  def isWindow(t: Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ Boolean
  def normalizeTransform(transform: js.Array[Transform]): js.Array[
    CalculateTransform | LookupTransform | BinTransform | TimeUnitTransform | AggregateTransform | WindowTransform | StackTransform | Anon_Filter
  ]
}

object Typeoftransform {
  @scala.inline
  def apply(
    isAggregate: Transform => /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ Boolean,
    isBin: Transform => /* is vega-lite.vega-lite/build/src/transform.BinTransform */ Boolean,
    isCalculate: Transform => /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ Boolean,
    isFilter: Transform => /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ Boolean,
    isLookup: Transform => /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ Boolean,
    isStack: Transform => /* is vega-lite.vega-lite/build/src/transform.StackTransform */ Boolean,
    isTimeUnit: Transform => /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ Boolean,
    isWindow: Transform => /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ Boolean,
    normalizeTransform: js.Array[Transform] => js.Array[
      CalculateTransform | LookupTransform | BinTransform | TimeUnitTransform | AggregateTransform | WindowTransform | StackTransform | Anon_Filter
    ]
  ): Typeoftransform = {
    val __obj = js.Dynamic.literal(isAggregate = js.Any.fromFunction1(isAggregate), isBin = js.Any.fromFunction1(isBin), isCalculate = js.Any.fromFunction1(isCalculate), isFilter = js.Any.fromFunction1(isFilter), isLookup = js.Any.fromFunction1(isLookup), isStack = js.Any.fromFunction1(isStack), isTimeUnit = js.Any.fromFunction1(isTimeUnit), isWindow = js.Any.fromFunction1(isWindow), normalizeTransform = js.Any.fromFunction1(normalizeTransform))
  
    __obj.asInstanceOf[Typeoftransform]
  }
}

