package typings.vegaDashLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.vegaDashLiteNumbers.`true`
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/aggregate", JSImport.Namespace)
@js.native
object buildSrcAggregateMod extends js.Object {
  val AGGREGATE_OPS: js.Array[AggregateOp] = js.native
  val COUNTING_OPS: js.Array[AggregateOp] = js.native
  val SHARED_DOMAIN_OPS: js.Array[AggregateOp] = js.native
  val SUM_OPS: js.Array[AggregateOp] = js.native
  def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = js.native
  def isCountingAggregateOp(aggregate: String): Boolean = js.native
  @js.native
  object SHARED_DOMAIN_OP_INDEX extends /* T */ StringDictionary[`true`]
  
}

