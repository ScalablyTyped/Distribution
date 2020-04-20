package typings.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait urqlProps {
  type ConsumerProps[T] = typings.react.mod.ConsumerProps[T]
  @scala.inline
  def MutationProps: typings.urql.mutationMod.MutationProps.type = typings.urql.mutationMod.MutationProps
  type MutationProps[T, V] = typings.urql.mutationMod.MutationProps[T, V]
  type ProviderProps[T] = typings.react.mod.ProviderProps[T]
  @scala.inline
  def QueryProps: typings.urql.queryMod.QueryProps.type = typings.urql.queryMod.QueryProps
  type QueryProps[T, V] = typings.urql.queryMod.QueryProps[T, V]
  @scala.inline
  def SubscriptionProps: typings.urql.subscriptionMod.SubscriptionProps.type = typings.urql.subscriptionMod.SubscriptionProps
  type SubscriptionProps[T, R, V] = typings.urql.subscriptionMod.SubscriptionProps[T, R, V]
}

