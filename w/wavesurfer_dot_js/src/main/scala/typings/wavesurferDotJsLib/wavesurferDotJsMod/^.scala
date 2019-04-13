package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
class ^ protected () extends WaveSurfer {
  def this(params: WaveSurferParams) = this()
  /* CompleteClass */
  override def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): ListenerDescriptor = js.native
  /* CompleteClass */
  override def once(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): ListenerDescriptor = js.native
  /* CompleteClass */
  override def un(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def unAll(): scala.Unit = js.native
}

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var util: WaveSurferUtil = js.native
  def create(params: WaveSurferParams): WaveSurfer = js.native
}

