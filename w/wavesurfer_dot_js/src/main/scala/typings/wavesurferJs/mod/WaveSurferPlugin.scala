package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wavesurfer.js", "WaveSurferPlugin")
@js.native
class WaveSurferPlugin protected () extends js.Object {
  def this(params: js.Object, ws: WaveSurfer) = this()
  
  def destroy(): Unit = js.native
  
  def init(): Unit = js.native
}
/* static members */
@JSImport("wavesurfer.js", "WaveSurferPlugin")
@js.native
object WaveSurferPlugin extends js.Object {
  
  def create(params: js.Object): PluginDefinition = js.native
}
