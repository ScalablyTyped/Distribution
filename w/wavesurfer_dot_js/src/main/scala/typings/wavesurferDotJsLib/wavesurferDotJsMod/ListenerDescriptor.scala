package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDescriptor extends js.Object {
  var name: java.lang.String
  def callback(args: js.Any*): scala.Unit
  def un(): scala.Unit
}

object ListenerDescriptor {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => scala.Unit, name: java.lang.String, un: () => scala.Unit): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name, un = js.Any.fromFunction0(un))
  
    __obj.asInstanceOf[ListenerDescriptor]
  }
}

