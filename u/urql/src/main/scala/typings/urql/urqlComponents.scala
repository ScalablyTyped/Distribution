package typings.urql

import typings.react.mod.ComponentType
import typings.urql.mod
import typings.urqlCore.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object urqlComponents extends urqlProps {
  @scala.inline
  def Consumer: ComponentType[ConsumerProps[Client]] = typings.urql.mod.Consumer.asInstanceOf[ComponentType[ConsumerProps[Client]]]
  @scala.inline
  def Mutation[T, V]: ComponentType[MutationProps[T, V]] = mod.asInstanceOf[js.Dynamic].selectDynamic("Mutation").asInstanceOf[ComponentType[MutationProps[T, V]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[Client]] = typings.urql.mod.Provider.asInstanceOf[ComponentType[ProviderProps[Client]]]
  @scala.inline
  def Query[T, V]: ComponentType[QueryProps[T, V]] = mod.asInstanceOf[js.Dynamic].selectDynamic("Query").asInstanceOf[ComponentType[QueryProps[T, V]]]
  @scala.inline
  def Subscription[T, R, V]: ComponentType[SubscriptionProps[T, R, V]] = mod.asInstanceOf[js.Dynamic].selectDynamic("Subscription").asInstanceOf[ComponentType[SubscriptionProps[T, R, V]]]
}

