package typings.vegaDashLite

import typings.vegaDashLite.Anon_Selection
import typings.vegaDashLite.Anon_Test
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeAggregate
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFielddefMod {
  type Aggregate = AggregateOp | HiddenCompositeAggregate
  type ChannelDef[F] = ChannelDefWithCondition[FieldDef[F]]
  type ChannelDefWithCondition[F /* <: FieldDef[_] */] = FieldDefWithCondition[F] | ValueDefWithCondition[F]
  type Conditional[T] = ConditionalPredicate[T] | ConditionalSelection[T]
  type ConditionalPredicate[T] = Anon_Test with T
  type ConditionalSelection[T] = Anon_Selection with T
  type Field = String | RepeatRef
  type FieldDefWithCondition[F /* <: FieldDef[_] */] = F with ConditionValueDefMixins
  type FieldTitleFormatter = js.Function2[/* fieldDef */ FieldDefBase[String], /* config */ Config, String]
  type HiddenCompositeAggregate = CompositeAggregate
}
