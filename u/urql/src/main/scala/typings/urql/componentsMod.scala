package typings.urql

import typings.react.mod.ReactElement
import typings.urql.mutationMod.MutationProps
import typings.urql.queryMod.QueryProps
import typings.urql.subscriptionMod.SubscriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql/dist/types/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  def Mutation[T, V](props: MutationProps[T, V]): ReactElement = js.native
  def Query[T, V](props: QueryProps[T, V]): ReactElement = js.native
  def Subscription[T, R, V](props: SubscriptionProps[T, R, V]): ReactElement = js.native
}

