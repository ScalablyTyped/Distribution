package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  @JSName("push")
  var push_Original: PushCallback = js.native
  def path(): Path = js.native
  def push(to: java.lang.String): scala.Unit = js.native
  def subscribe(cb: PushCallback): js.Function0[scala.Unit] = js.native
}

