package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferPlugin extends js.Object {
  def destroy(): scala.Unit
  def init(): scala.Unit
}

object WaveSurferPlugin {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], init: js.Function0[scala.Unit]): WaveSurferPlugin = {
    val __obj = js.Dynamic.literal(destroy = destroy, init = init)
  
    __obj.asInstanceOf[WaveSurferPlugin]
  }
}

