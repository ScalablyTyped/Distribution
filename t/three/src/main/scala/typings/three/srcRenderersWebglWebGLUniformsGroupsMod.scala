package typings.three

import typings.std.WebGLRenderingContext
import typings.three.anon.Bind
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import typings.three.srcRenderersWebglWebGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLUniformsGroupsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUniformsGroups", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WebGLUniformsGroups(gl: WebGLRenderingContext, info: WebGLInfo, capabilities: WebGLCapabilities, state: WebGLState): Bind = (^.asInstanceOf[js.Dynamic].applyDynamic("WebGLUniformsGroups")(gl.asInstanceOf[js.Any], info.asInstanceOf[js.Any], capabilities.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Bind]
}
