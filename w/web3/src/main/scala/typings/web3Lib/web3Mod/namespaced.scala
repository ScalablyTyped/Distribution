package typings
package web3Lib.web3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3", JSImport.Namespace)
@js.native
class namespaced () extends Web3 {
  def this(provider: java.lang.String) = this()
  def this(provider: web3Lib.providersMod.Provider) = this()
  /* CompleteClass */
  override var BatchRequest: org.scalablytyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest] = js.native
   // TODO
  /* CompleteClass */
  override var bzz: web3Lib.typesMod.Bzz = js.native
  /* CompleteClass */
  override var currentProvider: web3Lib.providersMod.Provider = js.native
  /* CompleteClass */
  override var eth: web3Lib.ethMod.Eth = js.native
  /* CompleteClass */
  override var givenProvider: web3Lib.providersMod.Provider = js.native
  /* CompleteClass */
  override var providers: web3Lib.providersMod.Providers = js.native
  /* CompleteClass */
  override var shh: web3Lib.typesMod.Shh = js.native
  /* CompleteClass */
  override var utils: web3Lib.utilsMod.Utils = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def extend(methods: js.Any): js.Any = js.native
  /* CompleteClass */
  override def setProvider(provider: web3Lib.providersMod.Provider): scala.Unit = js.native
}

@JSImport("web3", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var givenProvider: web3Lib.providersMod.Provider = js.native
  var modules: web3Lib.Anon_Bzz = js.native
  var providers: web3Lib.providersMod.Providers = js.native
  var utils: web3Lib.utilsMod.Utils = js.native
}

