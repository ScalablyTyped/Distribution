package typings.web3DashEthDashEns

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.PromiEvent
import typings.web3DashCore.web3DashCoreMod.TransactionConfig
import typings.web3DashEthDashContract.web3DashEthDashContractMod.Contract
import typings.web3DashEthDashEns.web3DashEthDashEnsMod.Ens
import typings.web3DashEthDashEns.web3DashEthDashEnsMod.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-ens", JSImport.Namespace)
@js.native
object web3DashEthDashEnsMod extends js.Object {
  @js.native
  class Ens protected () extends js.Object {
    def this(eth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eth */ js.Any) = this()
    var registry: Registry = js.native
    def getAddress(name: String): js.Promise[String] = js.native
    def getAddress(name: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
    def getContent(name: String): js.Promise[String] = js.native
    def getContent(name: String, callback: js.Function2[/* error */ Error, /* contentHash */ String, Unit]): js.Promise[String] = js.native
    def getContenthash(name: String): js.Promise[String] = js.native
    def getContenthash(name: String, callback: js.Function2[/* error */ Error, /* contenthash */ String, Unit]): js.Promise[String] = js.native
    def getMultihash(name: String): js.Promise[String] = js.native
    def getMultihash(name: String, callback: js.Function2[/* error */ Error, /* multihash */ String, Unit]): js.Promise[String] = js.native
    def getPubkey(name: String): js.Promise[StringDictionary[String]] = js.native
    def getPubkey(
      name: String,
      callback: js.Function2[/* error */ Error, /* result */ StringDictionary[String], Unit]
    ): js.Promise[StringDictionary[String]] = js.native
    def getText(name: String, key: String): js.Promise[String] = js.native
    def getText(name: String, key: String, callback: js.Function2[/* error */ Error, /* ensName */ String, Unit]): js.Promise[String] = js.native
    def resolver(name: String): js.Promise[Contract] = js.native
    def setAddress(name: String, address: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setAddress(
      name: String,
      address: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setContent(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setContent(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setContenthash(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setContenthash(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setMultihash(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setMultihash(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setPubkey(name: String, x: String, y: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setPubkey(
      name: String,
      x: String,
      y: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setText(name: String, key: String, value: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setText(
      name: String,
      key: String,
      value: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def supportsInterface(name: String, interfaceId: String): js.Promise[Boolean] = js.native
    def supportsInterface(
      name: String,
      interfaceId: String,
      callback: js.Function2[/* error */ Error, /* supportsInterface */ Boolean, Unit]
    ): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class Registry protected () extends js.Object {
    def this(ens: Ens) = this()
    var contract: Contract | Null = js.native
    var ens: Ens = js.native
    def owner(name: String): js.Promise[String] = js.native
    def owner(name: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
    def resolver(name: String): js.Promise[Contract] = js.native
  }
  
}

