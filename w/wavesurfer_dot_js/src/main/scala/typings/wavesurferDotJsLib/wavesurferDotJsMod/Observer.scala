package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Unit
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
  def once(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
  def un(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit
  def unAll(): scala.Unit
}

object Observer {
  @scala.inline
  def apply(
    fireEvent: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    on: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor,
    once: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor,
    un: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => scala.Unit,
    unAll: () => scala.Unit
  ): Observer = {
    val __obj = js.Dynamic.literal(fireEvent = js.Any.fromFunction2(fireEvent), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), un = js.Any.fromFunction2(un), unAll = js.Any.fromFunction0(unAll))
  
    __obj.asInstanceOf[Observer]
  }
}

