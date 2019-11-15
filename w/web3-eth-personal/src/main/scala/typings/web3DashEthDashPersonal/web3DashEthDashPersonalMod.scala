package typings.web3DashEthDashPersonal

import org.scalablytyped.runtime.Instantiable0
import typings.node.netMod.Socket
import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.Extension
import typings.web3DashCore.web3DashCoreMod.Providers
import typings.web3DashCore.web3DashCoreMod.RLPEncodedTransaction
import typings.web3DashCore.web3DashCoreMod.TransactionConfig
import typings.web3DashCore.web3DashCoreMod.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-personal", JSImport.Namespace)
@js.native
object web3DashEthDashPersonalMod extends js.Object {
  @js.native
  class Personal () extends js.Object {
    def this(provider: provider) = this()
    def this(provider: provider, net: Socket) = this()
    var BatchRequest: Instantiable0[typings.web3DashCore.web3DashCoreMod.BatchRequest] = js.native
    val currentProvider: provider = js.native
    var defaultAccount: String | Null = js.native
    var defaultBlock: String | Double = js.native
    val givenProvider: js.Any = js.native
    def ecRecover(dataThatWasSigned: String, signature: String): js.Promise[String] = js.native
    def ecRecover(
      dataThatWasSigned: String,
      signature: String,
      callback: js.Function2[/* error */ Error, /* address */ String, Unit]
    ): js.Promise[String] = js.native
    def extend(extension: Extension): js.Any = js.native
    def getAccounts(): js.Promise[js.Array[String]] = js.native
    def getAccounts(callback: js.Function2[/* error */ Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
    def importRawKey(privateKey: String, password: String): js.Promise[String] = js.native
    def importRawKey(
      privateKey: String,
      password: String,
      callback: js.Function2[/* error */ Error, /* result */ String, Unit]
    ): js.Promise[String] = js.native
    def lockAccount(address: String): js.Promise[Boolean] = js.native
    def lockAccount(address: String, callback: js.Function2[/* error */ Error, /* success */ Boolean, Unit]): js.Promise[Boolean] = js.native
    def newAccount(password: String): js.Promise[String] = js.native
    def newAccount(password: String, callback: js.Function2[/* error */ Error, /* address */ String, Unit]): js.Promise[String] = js.native
    def sendTransaction(transactionConfig: TransactionConfig, password: String): js.Promise[String] = js.native
    def sendTransaction(
      transactionConfig: TransactionConfig,
      password: String,
      callback: js.Function2[/* error */ Error, /* transactionHash */ String, Unit]
    ): js.Promise[String] = js.native
    def setProvider(provider: provider): Boolean = js.native
    def sign(dataToSign: String, address: String, password: String): js.Promise[String] = js.native
    def sign(
      dataToSign: String,
      address: String,
      password: String,
      callback: js.Function2[/* error */ Error, /* signature */ String, Unit]
    ): js.Promise[String] = js.native
    def signTransaction(transactionConfig: TransactionConfig, password: String): js.Promise[RLPEncodedTransaction] = js.native
    def signTransaction(
      transactionConfig: TransactionConfig,
      password: String,
      callback: js.Function2[/* error */ Error, /* RLPEncodedTransaction */ RLPEncodedTransaction, Unit]
    ): js.Promise[RLPEncodedTransaction] = js.native
    def unlockAccount(address: String, password: String, unlockDuration: Double): js.Promise[Boolean] = js.native
    def unlockAccount(
      address: String,
      password: String,
      unlockDuration: Double,
      callback: js.Function1[/* error */ Error, Unit]
    ): js.Promise[Boolean] = js.native
  }
  
  /* static members */
  @js.native
  object Personal extends js.Object {
    val givenProvider: js.Any = js.native
    val providers: Providers = js.native
  }
  
}

