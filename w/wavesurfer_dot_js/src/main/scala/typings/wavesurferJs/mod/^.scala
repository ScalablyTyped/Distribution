package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
class ^ protected () extends WaveSurfer {
  def this(params: WaveSurferParams) = this()
  /* CompleteClass */
  override def fireEvent(eventName: String, args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
  /* CompleteClass */
  override def once(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): ListenerDescriptor = js.native
  /* CompleteClass */
  override def un(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /* CompleteClass */
  override def unAll(): Unit = js.native
}

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VERSION: String = js.native
  var util: WaveSurferUtil = js.native
  def create(params: WaveSurferParams): WaveSurfer = js.native
}

