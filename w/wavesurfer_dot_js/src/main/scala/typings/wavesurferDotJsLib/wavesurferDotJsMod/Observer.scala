package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observer extends js.Object {
  def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Unit
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
  def once(eventName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor
  def un(eventName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit
  def unAll(): scala.Unit
}

