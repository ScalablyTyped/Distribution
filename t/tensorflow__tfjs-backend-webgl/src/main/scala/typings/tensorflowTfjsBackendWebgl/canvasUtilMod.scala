package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", "clearWebGLContext")
  @js.native
  def clearWebGLContext(webGLVersion: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", "getWebGLContext")
  @js.native
  def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", "setWebGLContext")
  @js.native
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
}
