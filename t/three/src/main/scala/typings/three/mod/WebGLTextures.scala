package typings.three.mod

import typings.std.WebGLRenderingContext
import typings.three.webGLUtilsMod.WebGLUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLTextures")
@js.native
class WebGLTextures protected ()
  extends typings.three.webGLTexturesMod.WebGLTextures {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    state: typings.three.webGLStateMod.WebGLState,
    properties: typings.three.webGLPropertiesMod.WebGLProperties,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities,
    utils: WebGLUtils,
    info: typings.three.webGLInfoMod.WebGLInfo
  ) = this()
}
