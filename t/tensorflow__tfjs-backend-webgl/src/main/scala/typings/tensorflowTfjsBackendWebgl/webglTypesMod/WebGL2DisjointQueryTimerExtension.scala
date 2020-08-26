package typings.tensorflowTfjsBackendWebgl.webglTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL2DisjointQueryTimerExtension extends js.Object {
  var GPU_DISJOINT_EXT: Double = js.native
  var TIME_ELAPSED_EXT: Double = js.native
}

object WebGL2DisjointQueryTimerExtension {
  @scala.inline
  def apply(GPU_DISJOINT_EXT: Double, TIME_ELAPSED_EXT: Double): WebGL2DisjointQueryTimerExtension = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGL2DisjointQueryTimerExtension]
  }
  @scala.inline
  implicit class WebGL2DisjointQueryTimerExtensionOps[Self <: WebGL2DisjointQueryTimerExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGPU_DISJOINT_EXT(value: Double): Self = this.set("GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIME_ELAPSED_EXT(value: Double): Self = this.set("TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
  }
  
}

