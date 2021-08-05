package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/canvas_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearWebGLContext(webGLVersion: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWebGLContext")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getWebGLContext(webGLVersion: Double): WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLContext")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[WebGLRenderingContext]
  
  inline def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebGLContext")(webGLVersion.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
