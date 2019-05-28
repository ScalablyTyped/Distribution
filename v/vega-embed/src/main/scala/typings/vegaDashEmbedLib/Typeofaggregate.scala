package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofaggregate extends js.Object {
  val AGGREGATE_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp]
  val COUNTING_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp]
  val SHARED_DOMAIN_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp]
  val SHARED_DOMAIN_OP_INDEX: org.scalablytyped.runtime.StringDictionary[vegaDashEmbedLib.vegaDashEmbedLibNumbers.`true`]
  val SUM_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp]
  def isAggregateOp(a: java.lang.String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ scala.Boolean
  def isCountingAggregateOp(aggregate: java.lang.String): scala.Boolean
}

object Typeofaggregate {
  @scala.inline
  def apply(
    AGGREGATE_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp],
    COUNTING_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp],
    SHARED_DOMAIN_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp],
    SHARED_DOMAIN_OP_INDEX: org.scalablytyped.runtime.StringDictionary[vegaDashEmbedLib.vegaDashEmbedLibNumbers.`true`],
    SUM_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp],
    isAggregateOp: java.lang.String => /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ scala.Boolean,
    isCountingAggregateOp: java.lang.String => scala.Boolean
  ): Typeofaggregate = {
    val __obj = js.Dynamic.literal(AGGREGATE_OPS = AGGREGATE_OPS, COUNTING_OPS = COUNTING_OPS, SHARED_DOMAIN_OPS = SHARED_DOMAIN_OPS, SHARED_DOMAIN_OP_INDEX = SHARED_DOMAIN_OP_INDEX, SUM_OPS = SUM_OPS, isAggregateOp = js.Any.fromFunction1(isAggregateOp), isCountingAggregateOp = js.Any.fromFunction1(isCountingAggregateOp))
  
    __obj.asInstanceOf[Typeofaggregate]
  }
}

