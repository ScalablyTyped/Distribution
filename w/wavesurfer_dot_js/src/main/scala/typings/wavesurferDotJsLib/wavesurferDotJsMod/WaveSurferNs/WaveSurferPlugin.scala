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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[WaveSurferPlugin]
  }
}

