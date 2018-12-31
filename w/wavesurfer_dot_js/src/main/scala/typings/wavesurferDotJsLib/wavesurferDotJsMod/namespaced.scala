package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
class namespaced protected () extends WaveSurfer {
  def this(params: wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.WaveSurferParams) = this()
  /* CompleteClass */
  override def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor = js.native
  /* CompleteClass */
  override def once(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.ListenerDescriptor = js.native
  /* CompleteClass */
  override def un(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def unAll(): scala.Unit = js.native
}

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var util: wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.WaveSurferUtil = js.native
  def create(params: wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs.WaveSurferParams): wavesurferDotJsLib.wavesurferDotJsMod.WaveSurfer = js.native
}

