package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgumentsCallback[T] extends js.Object {
  var arguments: js.Object = js.native
  var id: java.lang.String = js.native
  def subscribe(): web3Lib.typesMod.Subscribe[T] = js.native
  def subscribe(callback: web3Lib.typesMod.Callback[web3Lib.typesMod.Subscribe[T]]): web3Lib.typesMod.Subscribe[T] = js.native
  def unsubscribe(): scala.Unit | scala.Boolean = js.native
  def unsubscribe(callback: web3Lib.typesMod.Callback[scala.Boolean]): scala.Unit | scala.Boolean = js.native
}

