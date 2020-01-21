package typings.tensorflowTfjsCore

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/canvas_util", JSImport.Namespace)
@js.native
object canvasUtilMod extends js.Object {
  def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = js.native
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
}

