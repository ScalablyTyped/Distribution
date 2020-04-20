package typings.urqlCore

import typings.urqlCore.ssrMod.SSRExchangeParams
import typings.urqlCore.ssrMod.SSRExchange_
import typings.urqlCore.subscriptionMod.SubscriptionExchangeOpts
import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.ExchangeIO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/exchanges", JSImport.Namespace)
@js.native
object exchangesMod extends js.Object {
  val cacheExchange: Exchange = js.native
  val debugExchange: Exchange = js.native
  val dedupExchange: Exchange = js.native
  val defaultExchanges: js.Array[Exchange] = js.native
  val fallbackExchangeIO: ExchangeIO = js.native
  val fetchExchange: Exchange = js.native
  def composeExchanges(exchanges: js.Array[Exchange]): Exchange = js.native
  def ssrExchange(): SSRExchange_ = js.native
  def ssrExchange(params: SSRExchangeParams): SSRExchange_ = js.native
  def subscriptionExchange(hasForwardSubscriptionEnableAllOperations: SubscriptionExchangeOpts): Exchange = js.native
}

