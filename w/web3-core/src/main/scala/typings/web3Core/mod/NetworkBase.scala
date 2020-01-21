package typings.web3Core.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "NetworkBase")
@js.native
class NetworkBase () extends js.Object {
  def this(provider: provider) = this()
  def this(provider: provider, net: Socket) = this()
  var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest] = js.native
  val currentProvider: provider = js.native
  val givenProvider: js.Any = js.native
  def extend(extension: Extension): js.Any = js.native
  def getId(): js.Promise[Double] = js.native
  def getId(callback: js.Function2[/* error */ Error, /* id */ Double, Unit]): js.Promise[Double] = js.native
  def getNetworkType(): js.Promise[String] = js.native
  def getNetworkType(callback: js.Function2[/* error */ Error, /* returnValue */ String, Unit]): js.Promise[String] = js.native
  def getPeerCount(): js.Promise[Double] = js.native
  def getPeerCount(callback: js.Function2[/* error */ Error, /* peerCount */ Double, Unit]): js.Promise[Double] = js.native
  def isListening(): js.Promise[Boolean] = js.native
  def isListening(callback: js.Function2[/* error */ Error, /* listening */ Boolean, Unit]): js.Promise[Boolean] = js.native
  def setProvider(provider: provider): Boolean = js.native
}

/* static members */
@JSImport("web3-core", "NetworkBase")
@js.native
object NetworkBase extends js.Object {
  val givenProvider: js.Any = js.native
  val providers: Providers = js.native
}

