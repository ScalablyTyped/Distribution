package typings.three

import typings.std.WebGLRenderingContext
import typings.three.anon.Bind
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLInfoMod.WebGLInfo
import typings.three.webGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLUniformsGroupsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUniformsGroups", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WebGLUniformsGroups(gl: WebGLRenderingContext, info: WebGLInfo, capabilities: WebGLCapabilities, state: WebGLState): Bind = (^.asInstanceOf[js.Dynamic].applyDynamic("WebGLUniformsGroups")(gl.asInstanceOf[js.Any], info.asInstanceOf[js.Any], capabilities.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Bind]
}
