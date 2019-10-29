package typings.web3DashEthDashContract.web3DashEthDashContractMod

import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.Common
import typings.web3DashCore.web3DashCoreMod.chain
import typings.web3DashCore.web3DashCoreMod.hardfork
import typings.web3DashCore.web3DashCoreMod.provider
import typings.web3DashUtils.web3DashUtilsMod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-contract", "Contract")
@js.native
class Contract protected () extends js.Object {
  def this(provider: provider, abi: js.Array[AbiItem]) = this()
  def this(provider: provider, abi: js.Array[AbiItem], address: String) = this()
  def this(provider: provider, abi: js.Array[AbiItem], address: String, options: ContractOptions) = this()
  var _address: String = js.native
  var _jsonInterface: js.Array[AbiItem] = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  var defaultChain: chain = js.native
  var defaultCommon: Common = js.native
  var defaultHardfork: hardfork = js.native
  var events: js.Any = js.native
  var methods: js.Any = js.native
  var options: Options = js.native
  var transactionBlockTimeout: Double = js.native
  var transactionConfirmationBlocks: Double = js.native
  var transactionPollingTimeout: Double = js.native
  def deploy(options: DeployOptions): ContractSendMethod = js.native
  def getPastEvents(event: String): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(event: String, options: EventOptions): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(
    event: String,
    options: EventOptions,
    callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
  ): js.Promise[js.Array[EventData]] = js.native
  def once(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): Unit = js.native
  def once(
    event: String,
    options: EventOptions,
    callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
  ): Unit = js.native
}

