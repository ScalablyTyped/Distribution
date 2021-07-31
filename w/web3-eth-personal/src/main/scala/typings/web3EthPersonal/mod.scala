package typings.web3EthPersonal

import org.scalablytyped.runtime.Instantiable0
import typings.node.netMod.Socket
import typings.std.Error
import typings.web3Core.mod.Extension
import typings.web3Core.mod.Providers
import typings.web3Core.mod.RLPEncodedTransaction
import typings.web3Core.mod.TransactionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-personal", "Personal")
  @js.native
  class Personal () extends StObject {
    def this(provider: typings.web3Core.mod.provider) = this()
    def this(provider: typings.web3Core.mod.provider, net: Socket) = this()
    
    var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest] = js.native
    
    val currentProvider: typings.web3Core.mod.provider = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: String | Double = js.native
    
    def ecRecover(dataThatWasSigned: String, signature: String): js.Promise[String] = js.native
    def ecRecover(
      dataThatWasSigned: String,
      signature: String,
      callback: js.Function2[/* error */ Error, /* address */ String, Unit]
    ): js.Promise[String] = js.native
    
    def extend(`extension`: Extension): js.Any = js.native
    
    def getAccounts(): js.Promise[js.Array[String]] = js.native
    def getAccounts(callback: js.Function2[/* error */ Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
    
    val givenProvider: js.Any = js.native
    
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
    
    def setProvider(provider: typings.web3Core.mod.provider): Boolean = js.native
    
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
  object Personal {
    
    @JSImport("web3-eth-personal", "Personal.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
    
    @JSImport("web3-eth-personal", "Personal.providers")
    @js.native
    val providers: Providers = js.native
  }
}
