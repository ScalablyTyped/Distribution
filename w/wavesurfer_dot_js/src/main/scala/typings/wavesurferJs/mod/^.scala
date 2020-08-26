package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
class ^ protected () extends WaveSurfer {
  def this(params: WaveSurferParams) = this()
}

@JSImport("wavesurfer.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VERSION: String = js.native
  var util: WaveSurferUtil = js.native
  def create(params: WaveSurferParams): WaveSurfer = js.native
}

