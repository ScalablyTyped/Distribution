package typings
package web3DashProviderDashEngineLib.web3DashProviderDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web3ProviderEngine
  extends ethereumDashProtocolLib.ethereumDashProtocolMod.Provider {
  def addProvider(provider: js.Any): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(payload: ethereumDashProtocolLib.ethereumDashProtocolMod.JSONRPCRequestPayload): scala.Unit = js.native
  // start block polling
  def start(): scala.Unit = js.native
  // start block polling
  def start(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  // stop block polling
  def stop(): scala.Unit = js.native
}

