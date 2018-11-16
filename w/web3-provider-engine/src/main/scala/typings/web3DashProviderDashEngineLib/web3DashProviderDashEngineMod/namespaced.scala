package typings
package web3DashProviderDashEngineLib.web3DashProviderDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-provider-engine", JSImport.Namespace)
@js.native
class namespaced () extends Web3ProviderEngine {
  def this(options: Web3ProviderEngineOptions) = this()
  /* CompleteClass */
  override def sendAsync(
    payload: ethereumDashProtocolLib.ethereumDashProtocolMod.JSONRPCRequestPayload,
    callback: ethereumDashProtocolLib.ethereumDashProtocolMod.JSONRPCErrorCallback
  ): scala.Unit = js.native
}

