package typings.webglDashExt

import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import typings.webglDashExt.webglDashExtStrings.`experimental-webgl`
import typings.webglDashExt.webglDashExtStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends js.Object {
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl(contextId: `experimental-webgl`, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext with WebGL1Extensions) | Null = js.native
}

