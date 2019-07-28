package typings.web3.web3Mod

import org.scalablytyped.runtime.Instantiable0
import typings.web3.Anon_Bzz
import typings.web3.ethMod.Eth
import typings.web3.providersMod.Provider
import typings.web3.providersMod.Providers
import typings.web3.typesMod.Bzz
import typings.web3.typesMod.Shh
import typings.web3.utilsMod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3", JSImport.Namespace)
@js.native
class ^ () extends Web3 {
  def this(provider: String) = this()
  def this(provider: Provider) = this()
  /* CompleteClass */
  override var BatchRequest: Instantiable0[typings.web3.ethTypesMod.BatchRequest] = js.native
   // TODO
  /* CompleteClass */
  override var bzz: Bzz = js.native
  /* CompleteClass */
  override var currentProvider: Provider = js.native
  /* CompleteClass */
  override var eth: Eth = js.native
  /* CompleteClass */
  override var givenProvider: Provider = js.native
  /* CompleteClass */
  override var providers: Providers = js.native
  /* CompleteClass */
  override var shh: Shh = js.native
  /* CompleteClass */
  override var utils: Utils = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def extend(methods: js.Any): js.Any = js.native
  /* CompleteClass */
  override def setProvider(provider: Provider): Unit = js.native
}

@JSImport("web3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var givenProvider: Provider = js.native
  var modules: Anon_Bzz = js.native
  var providers: Providers = js.native
  var utils: Utils = js.native
}

