package typings.web3.ethTypesMod

import typings.web3.typesMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Net")
@js.native
class Net () extends js.Object {
  def getId(): js.Promise[Double] = js.native
  def getId(cb: Callback[Double]): js.Promise[Double] = js.native
  def getPeerCount(): js.Promise[Double] = js.native
  def getPeerCount(cb: Callback[Double]): js.Promise[Double] = js.native
  def isListening(): js.Promise[Boolean] = js.native
  def isListening(cb: Callback[Boolean]): js.Promise[Boolean] = js.native
}

