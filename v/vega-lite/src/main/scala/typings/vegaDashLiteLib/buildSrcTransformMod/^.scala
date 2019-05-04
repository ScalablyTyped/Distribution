package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isAggregate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ scala.Boolean = js.native
  def isBin(t: Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ scala.Boolean = js.native
  def isCalculate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ scala.Boolean = js.native
  def isFilter(t: Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ scala.Boolean = js.native
  def isLookup(t: Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ scala.Boolean = js.native
  def isStack(t: Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ scala.Boolean = js.native
  def isTimeUnit(t: Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ scala.Boolean = js.native
  def isWindow(t: Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ scala.Boolean = js.native
  def normalizeTransform(transform: js.Array[Transform]): js.Array[
    CalculateTransform | LookupTransform | BinTransform | TimeUnitTransform | AggregateTransform | WindowTransform | StackTransform | vegaDashLiteLib.Anon_Filter
  ] = js.native
}

