package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Net")
@js.native
class Net () extends js.Object {
  def getId(): stdLib.Promise[scala.Double] = js.native
  def getId(cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def getPeerCount(): stdLib.Promise[scala.Double] = js.native
  def getPeerCount(cb: web3Lib.typesMod.Callback[scala.Double]): stdLib.Promise[scala.Double] = js.native
  def isListening(): stdLib.Promise[scala.Boolean] = js.native
  def isListening(cb: web3Lib.typesMod.Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
}

