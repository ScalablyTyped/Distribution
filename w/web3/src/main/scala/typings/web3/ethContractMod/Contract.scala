package typings.web3.ethContractMod

import org.scalablytyped.runtime.StringDictionary
import typings.web3.Anon_AllEvents
import typings.web3.Anon_Arguments
import typings.web3.Anon_FilterFromBlock
import typings.web3.ethTypesMod.TransactionObject
import typings.web3.providersMod.Provider
import typings.web3.typesMod.Callback
import typings.web3.typesMod.EventLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contract extends js.Object {
  var events: Anon_AllEvents = js.native
  var methods: StringDictionary[js.Function1[/* repeated */ js.Any, TransactionObject[_]]] = js.native
  var options: contractOptions = js.native
  def deploy(options: Anon_Arguments): TransactionObject[Contract] = js.native
  def getPastEvents(event: String): js.Promise[js.Array[EventLog]] = js.native
  def getPastEvents(event: String, options: Anon_FilterFromBlock): js.Promise[js.Array[EventLog]] = js.native
  def getPastEvents(event: String, options: Anon_FilterFromBlock, cb: Callback[js.Array[EventLog]]): js.Promise[js.Array[EventLog]] = js.native
  def setProvider(provider: Provider): Unit = js.native
}

