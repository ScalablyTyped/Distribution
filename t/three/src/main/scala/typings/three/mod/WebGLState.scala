package typings.three.mod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLState")
@js.native
class WebGLState protected ()
  extends typings.three.webGLStateMod.WebGLState {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    utils: js.Any,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}

