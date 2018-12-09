package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Net")
@js.native
class Net () extends js.Object {
  def getId(): js.Promise[scala.Double] = js.native
  def getId(cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def getPeerCount(): js.Promise[scala.Double] = js.native
  def getPeerCount(cb: web3Lib.typesMod.Callback[scala.Double]): js.Promise[scala.Double] = js.native
  def isListening(): js.Promise[scala.Boolean] = js.native
  def isListening(cb: web3Lib.typesMod.Callback[scala.Boolean]): js.Promise[scala.Boolean] = js.native
}

