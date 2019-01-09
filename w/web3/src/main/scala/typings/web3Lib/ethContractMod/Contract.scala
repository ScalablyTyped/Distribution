package typings
package web3Lib.ethContractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contract extends js.Object {
  var events: web3Lib.Anon_AllEvents = js.native
  var methods: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, web3Lib.ethTypesMod.TransactionObject[_]]] = js.native
  var options: contractOptions = js.native
  def deploy(options: web3Lib.Anon_Arguments): web3Lib.ethTypesMod.TransactionObject[Contract] = js.native
  def getPastEvents(event: java.lang.String): js.Promise[js.Array[web3Lib.typesMod.EventLog]] = js.native
  def getPastEvents(event: java.lang.String, options: web3Lib.Anon_FilterFromBlock): js.Promise[js.Array[web3Lib.typesMod.EventLog]] = js.native
  def getPastEvents(
    event: java.lang.String,
    options: web3Lib.Anon_FilterFromBlock,
    cb: web3Lib.typesMod.Callback[js.Array[web3Lib.typesMod.EventLog]]
  ): js.Promise[js.Array[web3Lib.typesMod.EventLog]] = js.native
  def setProvider(provider: web3Lib.providersMod.Provider): scala.Unit = js.native
}

