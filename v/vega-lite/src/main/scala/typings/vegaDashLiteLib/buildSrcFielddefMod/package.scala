package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFielddefMod {
  type Aggregate = vegaDashTypingsLib.typesSpecTransformMod.AggregateOp | HiddenCompositeAggregate
  type ChannelDef[F] = ChannelDefWithCondition[FieldDef[F]]
  type ChannelDefWithCondition[F /* <: FieldDef[_] */] = FieldDefWithCondition[F] | ValueDefWithCondition[F]
  type Conditional[T] = ConditionalPredicate[T] | ConditionalSelection[T]
  type ConditionalPredicate[T] = vegaDashLiteLib.Anon_Test with T
  type ConditionalSelection[T] = vegaDashLiteLib.Anon_Selection with T
  type Field = java.lang.String | RepeatRef
  type FieldDefWithCondition[F /* <: FieldDef[_] */] = F with ConditionValueDefMixins
  type FieldTitleFormatter = js.Function2[
    /* fieldDef */ FieldDefBase[java.lang.String], 
    /* config */ vegaDashLiteLib.buildSrcConfigMod.Config, 
    java.lang.String
  ]
  type HiddenCompositeAggregate = vegaDashLiteLib.buildSrcCompositemarkMod.CompositeAggregate
}
