package typings.wonka

import typings.wonka.wonkaTypesGenMod.sourceT
import typings.wonka.wonkaTypesGenMod.subscriptionT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/Wonka_sinks.gen", JSImport.Namespace)
@js.native
object wonkaSinksGenMod extends js.Object {
  def forEach[a](_1: js.Function1[/* _1 */ a, Unit]): forEachConsumerT[a] = js.native
  def publish[a](_1: sourceT[a]): subscriptionT = js.native
  def subscribe[a](_1: js.Function1[/* _1 */ a, Unit]): subscribeConsumerT[a] = js.native
  def toArray[a](_1: sourceT[a]): js.Array[a] = js.native
  type forEachConsumerT[a] = js.Function1[/* _1 */ sourceT[a], Unit]
  type subscribeConsumerT[a] = js.Function1[/* _1 */ sourceT[a], subscriptionT]
}

