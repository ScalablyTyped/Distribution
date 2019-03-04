package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

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
  def apply(
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    name: java.lang.String,
    un: js.Function0[scala.Unit]
  ): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(callback = callback, name = name, un = un)
  
    __obj.asInstanceOf[ListenerDescriptor]
  }
}

