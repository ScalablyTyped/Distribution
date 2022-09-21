package typings.three

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLShaderMod {
  
  @JSImport("three/src/renderers/webgl/WebGLShader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WebGLShader(gl: WebGLRenderingContext, `type`: String, string: String): typings.std.WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("WebGLShader")(gl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[typings.std.WebGLShader]
}
