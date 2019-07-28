package typings.three.threeMod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLState")
@js.native
class WebGLState protected ()
  extends typings.three.srcRenderersWebglWebGLStateMod.WebGLState {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
    utils: js.Any,
    capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}

