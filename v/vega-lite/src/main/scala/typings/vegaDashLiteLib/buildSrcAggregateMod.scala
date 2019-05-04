package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/aggregate", JSImport.Namespace)
@js.native
object buildSrcAggregateMod extends js.Object {
  val AGGREGATE_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
  val COUNTING_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
  val SHARED_DOMAIN_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
  val SUM_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
  def isAggregateOp(a: java.lang.String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ scala.Boolean = js.native
  def isCountingAggregateOp(aggregate: java.lang.String): scala.Boolean = js.native
  @js.native
  object SHARED_DOMAIN_OP_INDEX
    extends /* T */ org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.vegaDashLiteLibNumbers.`true`]
  
}

