package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionObject[T] extends js.Object {
  var arguments: js.Array[_] = js.native
  def call(): stdLib.Promise[T] = js.native
  def call(tx: Tx): stdLib.Promise[T] = js.native
  def encodeABI(): java.lang.String = js.native
  def estimateGas(): stdLib.Promise[scala.Double] = js.native
  def estimateGas(tx: Tx): stdLib.Promise[scala.Double] = js.native
  def send(): web3Lib.promiEventMod.PromiEvent[T] = js.native
  def send(tx: Tx): web3Lib.promiEventMod.PromiEvent[T] = js.native
}

