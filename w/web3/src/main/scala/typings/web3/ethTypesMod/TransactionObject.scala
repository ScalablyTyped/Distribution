package typings.web3.ethTypesMod

import typings.web3.promiEventMod.PromiEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionObject[T] extends js.Object {
  var arguments: js.Array[_] = js.native
  def call(): js.Promise[T] = js.native
  def call(tx: Tx): js.Promise[T] = js.native
  def encodeABI(): String = js.native
  def estimateGas(): js.Promise[Double] = js.native
  def estimateGas(tx: Tx): js.Promise[Double] = js.native
  def send(): PromiEvent[T] = js.native
  def send(tx: Tx): PromiEvent[T] = js.native
}

