package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", "WaveSurferPlugin")
@js.native
class WaveSurferPlugin protected () extends js.Object {
  def this(params: js.Object, ws: WaveSurfer) = this()
  def destroy(): scala.Unit = js.native
  def init(): scala.Unit = js.native
}

/* static members */
@JSImport("wavesurfer.js", "WaveSurferPlugin")
@js.native
object WaveSurferPlugin extends js.Object {
  def create(params: js.Object): wavesurferDotJsLib.wavesurferDotJsMod.PluginDefinition = js.native
}

