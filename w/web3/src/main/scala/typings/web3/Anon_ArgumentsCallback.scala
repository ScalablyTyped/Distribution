package typings.web3

import typings.web3.typesMod.Callback
import typings.web3.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgumentsCallback[T] extends js.Object {
  var arguments: js.Object = js.native
  var id: String = js.native
  def subscribe(): Subscribe[T] = js.native
  def subscribe(callback: Callback[Subscribe[T]]): Subscribe[T] = js.native
  def unsubscribe(): Unit | Boolean = js.native
  def unsubscribe(callback: Callback[Boolean]): Unit | Boolean = js.native
}

