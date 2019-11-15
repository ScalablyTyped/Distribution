package typings.web3DashShh.web3DashShhMod

import org.scalablytyped.runtime.Instantiable0
import typings.node.netMod.Socket
import typings.std.Error
import typings.web3DashCore.web3DashCoreMod.Extension
import typings.web3DashCore.web3DashCoreMod.Providers
import typings.web3DashCore.web3DashCoreMod.provider
import typings.web3DashNet.web3DashNetMod.Network
import typings.web3DashShh.web3DashShhStrings.messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-shh", "Shh")
@js.native
class Shh () extends js.Object {
  def this(provider: provider) = this()
  def this(provider: provider, net: Socket) = this()
  var BatchRequest: Instantiable0[typings.web3DashCore.web3DashCoreMod.BatchRequest] = js.native
  val currentProvider: provider = js.native
  val givenProvider: js.Any = js.native
  var net: Network = js.native
  def addPrivateKey(privateKey: String): js.Promise[String] = js.native
  def addPrivateKey(privateKey: String, callback: js.Function2[/* error */ Error, /* privateKey */ String, Unit]): js.Promise[String] = js.native
  def addSymKey(symKey: String): js.Promise[String] = js.native
  def addSymKey(symKey: String, callback: js.Function2[/* error */ Error, /* key */ String, Unit]): js.Promise[String] = js.native
  def deleteKeyPair(id: String): js.Promise[Boolean] = js.native
  def deleteKeyPair(id: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def deleteMessageFilter(id: String): js.Promise[Boolean] = js.native
  def deleteMessageFilter(id: String, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): js.Promise[Boolean] = js.native
  def deleteSymKey(id: String): js.Promise[Boolean] = js.native
  def deleteSymKey(id: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def extend(extension: Extension): js.Any = js.native
  def generateSymKeyFromPassword(password: String): js.Promise[String] = js.native
  def generateSymKeyFromPassword(password: String, callback: js.Function2[/* error */ Error, /* key */ String, Unit]): js.Promise[String] = js.native
  def getFilterMessages(id: String): js.Promise[js.Array[Notification]] = js.native
  def getFilterMessages(id: String, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): js.Promise[js.Array[Notification]] = js.native
  def getInfo(): js.Promise[Info] = js.native
  def getInfo(callback: js.Function2[/* error */ Error, /* info */ Info, Unit]): js.Promise[Info] = js.native
  def getPrivateKey(id: String): js.Promise[String] = js.native
  def getPrivateKey(id: String, callback: js.Function2[/* error */ Error, /* privateKey */ String, Unit]): js.Promise[String] = js.native
  def getPublicKey(id: String): js.Promise[String] = js.native
  def getPublicKey(id: String, callback: js.Function2[/* error */ Error, /* publicKey */ String, Unit]): js.Promise[String] = js.native
  def getSymKey(id: String): js.Promise[String] = js.native
  def getSymKey(id: String, callback: js.Function2[/* error */ Error, /* key */ String, Unit]): js.Promise[String] = js.native
  def getVersion(): js.Promise[String] = js.native
  def getVersion(callback: js.Function2[/* error */ Error, /* version */ String, Unit]): js.Promise[String] = js.native
  def hasKeyPair(id: String): js.Promise[Boolean] = js.native
  def hasKeyPair(id: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def hasSymKey(id: String): js.Promise[Boolean] = js.native
  def hasSymKey(id: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def markTrustedPeer(enode: String): js.Promise[Boolean] = js.native
  def markTrustedPeer(enode: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def newKeyPair(): js.Promise[String] = js.native
  def newKeyPair(callback: js.Function2[/* error */ Error, /* key */ String, Unit]): js.Promise[String] = js.native
  def newMessageFilter(): js.Promise[String] = js.native
  def newMessageFilter(options: SubscriptionOptions): js.Promise[String] = js.native
  def newMessageFilter(options: SubscriptionOptions, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): js.Promise[String] = js.native
  def newSymKey(): js.Promise[String] = js.native
  def newSymKey(callback: js.Function2[/* error */ Error, /* key */ String, Unit]): js.Promise[String] = js.native
  def post(`object`: PostWithPubKey): js.Promise[String] = js.native
  def post(`object`: PostWithPubKey, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): js.Promise[String] = js.native
  def post(`object`: PostWithSymKey): js.Promise[String] = js.native
  def post(`object`: PostWithSymKey, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): js.Promise[String] = js.native
  def setMaxMessageSize(size: Double): js.Promise[Boolean] = js.native
  def setMaxMessageSize(size: Double, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def setMinPoW(pow: Double): js.Promise[Boolean] = js.native
  def setMinPoW(pow: Double, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def setProvider(provider: provider): Boolean = js.native
  @JSName("subscribe")
  def subscribe_messages(string: messages, options: SubscriptionOptions): Subscribe = js.native
  @JSName("subscribe")
  def subscribe_messages(
    string: messages,
    options: SubscriptionOptions,
    callback: js.Function3[/* error */ Error, /* message */ Notification, /* subscription */ js.Any, Unit]
  ): Subscribe = js.native
}

/* static members */
@JSImport("web3-shh", "Shh")
@js.native
object Shh extends js.Object {
  val givenProvider: js.Any = js.native
  val providers: Providers = js.native
}

