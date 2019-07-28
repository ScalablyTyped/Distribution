package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.Anon_Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isAggregate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ Boolean = js.native
  def isBin(t: Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ Boolean = js.native
  def isCalculate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ Boolean = js.native
  def isFilter(t: Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ Boolean = js.native
  def isLookup(t: Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ Boolean = js.native
  def isStack(t: Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ Boolean = js.native
  def isTimeUnit(t: Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ Boolean = js.native
  def isWindow(t: Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ Boolean = js.native
  def normalizeTransform(transform: js.Array[Transform]): js.Array[
    CalculateTransform | LookupTransform | BinTransform | TimeUnitTransform | AggregateTransform | WindowTransform | StackTransform | Anon_Filter
  ] = js.native
}

