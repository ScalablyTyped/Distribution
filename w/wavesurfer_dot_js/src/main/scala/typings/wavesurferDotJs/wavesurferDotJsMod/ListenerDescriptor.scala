package typings.wavesurferDotJs.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDescriptor extends js.Object {
  var name: String
  def callback(args: js.Any*): Unit
  def un(): Unit
}

object ListenerDescriptor {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
  
    __obj.asInstanceOf[ListenerDescriptor]
  }
}

