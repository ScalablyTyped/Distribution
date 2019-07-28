package typings.atTensorflowTfjsDashCore

import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/canvas_util", JSImport.Namespace)
@js.native
object distBackendsWebglCanvasUnderscoreUtilMod extends js.Object {
  def createCanvas(webGLVersion: Double): OffscreenCanvas | HTMLCanvasElement = js.native
  def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = js.native
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
}

