package typings.three.mod

import typings.three.webGLBindingStatesMod.WebGLBindingStates
import typings.three.webGLCubeMapsMod.WebGLCubeMaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLPrograms")
@js.native
open class WebGLPrograms protected ()
  extends typings.three.threeMod.WebGLPrograms {
  def this(
    renderer: typings.three.webGLRendererMod.WebGLRenderer,
    cubemaps: WebGLCubeMaps,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities,
    bindingStates: WebGLBindingStates,
    clipping: typings.three.webGLClippingMod.WebGLClipping
  ) = this()
}
