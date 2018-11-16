package typings
package webglDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends js.Object {
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: webglDashExtLib.webglDashExtLibStrings.`experimental-webgl`): (stdLib.WebGLRenderingContext with WebGL1Extensions) | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(
    contextId: webglDashExtLib.webglDashExtLibStrings.`experimental-webgl`,
    contextAttributes: stdLib.WebGLContextAttributes
  ): (stdLib.WebGLRenderingContext with WebGL1Extensions) | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webglDashExtLib.webglDashExtLibStrings.webgl): (stdLib.WebGLRenderingContext with WebGL1Extensions) | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(
    contextId: webglDashExtLib.webglDashExtLibStrings.webgl,
    contextAttributes: stdLib.WebGLContextAttributes
  ): (stdLib.WebGLRenderingContext with WebGL1Extensions) | scala.Null = js.native
}

