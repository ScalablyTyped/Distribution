package typings.vegaDashEmbed

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashEmbed.vegaDashEmbedNumbers.`true`
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofaggregate extends js.Object {
  val AGGREGATE_OPS: js.Array[AggregateOp]
  val COUNTING_OPS: js.Array[AggregateOp]
  val SHARED_DOMAIN_OPS: js.Array[AggregateOp]
  val SHARED_DOMAIN_OP_INDEX: StringDictionary[`true`]
  val SUM_OPS: js.Array[AggregateOp]
  def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean
  def isCountingAggregateOp(aggregate: String): Boolean
}

object Typeofaggregate {
  @scala.inline
  def apply(
    AGGREGATE_OPS: js.Array[AggregateOp],
    COUNTING_OPS: js.Array[AggregateOp],
    SHARED_DOMAIN_OPS: js.Array[AggregateOp],
    SHARED_DOMAIN_OP_INDEX: StringDictionary[`true`],
    SUM_OPS: js.Array[AggregateOp],
    isAggregateOp: String => /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean,
    isCountingAggregateOp: String => Boolean
  ): Typeofaggregate = {
    val __obj = js.Dynamic.literal(AGGREGATE_OPS = AGGREGATE_OPS, COUNTING_OPS = COUNTING_OPS, SHARED_DOMAIN_OPS = SHARED_DOMAIN_OPS, SHARED_DOMAIN_OP_INDEX = SHARED_DOMAIN_OP_INDEX, SUM_OPS = SUM_OPS, isAggregateOp = js.Any.fromFunction1(isAggregateOp), isCountingAggregateOp = js.Any.fromFunction1(isCountingAggregateOp))
  
    __obj.asInstanceOf[Typeofaggregate]
  }
}

