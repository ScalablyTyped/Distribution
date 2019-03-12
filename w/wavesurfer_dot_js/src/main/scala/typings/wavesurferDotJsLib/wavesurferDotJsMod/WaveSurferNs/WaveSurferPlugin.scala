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
  def apply(destroy: () => scala.Unit, init: () => scala.Unit): WaveSurferPlugin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[WaveSurferPlugin]
  }
}

