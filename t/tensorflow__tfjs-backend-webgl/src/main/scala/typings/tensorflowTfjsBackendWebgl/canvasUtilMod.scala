package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", JSImport.Namespace)
@js.native
object canvasUtilMod extends js.Object {
  
  def clearWebGLContext(webGLVersion: Double): Unit = js.native
  
  def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = js.native
  
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
}
