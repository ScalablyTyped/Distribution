package typings.urqlCore

import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.ExchangeIO
import typings.urqlCore.typesMod.ExchangeInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/exchanges/compose", JSImport.Namespace)
@js.native
object composeMod extends js.Object {
  def composeExchanges(exchanges: js.Array[Exchange]): js.Function1[/* hasClientForwardDispatchDebug */ ExchangeInput, ExchangeIO] = js.native
}

