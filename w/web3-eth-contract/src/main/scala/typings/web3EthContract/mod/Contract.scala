package typings.web3EthContract.mod

import typings.std.Error
import typings.web3Core.mod.BlockNumber
import typings.web3Core.mod.Common
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import typings.web3Utils.mod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-contract", "Contract")
@js.native
class Contract protected () extends js.Object {
  def this(jsonInterface: js.Array[AbiItem]) = this()
  def this(jsonInterface: js.Array[AbiItem], address: String) = this()
  def this(jsonInterface: js.Array[AbiItem], address: js.UndefOr[scala.Nothing], options: ContractOptions) = this()
  def this(jsonInterface: js.Array[AbiItem], address: String, options: ContractOptions) = this()
  var _address: String = js.native
  var _jsonInterface: js.Array[AbiItem] = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: BlockNumber = js.native
  var defaultChain: chain = js.native
  var defaultCommon: Common = js.native
  var defaultHardfork: hardfork = js.native
  var events: js.Any = js.native
  var handleRevert: Boolean = js.native
  var methods: js.Any = js.native
  var options: Options = js.native
  var transactionBlockTimeout: Double = js.native
  var transactionConfirmationBlocks: Double = js.native
  var transactionPollingTimeout: Double = js.native
  def deploy(options: DeployOptions): ContractSendMethod = js.native
  def getPastEvents(event: String): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(event: String, options: PastEventOptions): js.Promise[js.Array[EventData]] = js.native
  def getPastEvents(
    event: String,
    options: PastEventOptions,
    callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
  ): js.Promise[js.Array[EventData]] = js.native
  def once(event: String, callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]): Unit = js.native
  def once(
    event: String,
    options: EventOptions,
    callback: js.Function2[/* error */ Error, /* event */ EventData, Unit]
  ): Unit = js.native
}

