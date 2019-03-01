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
    fireEvent: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    on: js.Function2[
      java.lang.String, 
      js.Function1[/* repeated */ js.Any, scala.Unit], 
      wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
    ],
    once: js.Function2[
      java.lang.String, 
      js.Function1[/* repeated */ js.Any, scala.Unit], 
      wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
    ],
    un: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit],
    unAll: js.Function0[scala.Unit]
  ): Observer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.updateDynamic("un")(un)
    __obj.updateDynamic("unAll")(unAll)
    __obj.asInstanceOf[Observer]
  }
}

