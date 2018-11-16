package typings
package webgl2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement
  extends stdLib.HTMLElement {
  @JSName("getContext")
  def `getContext_experimental-webgl2`(contextId: webgl2Lib.webgl2LibStrings.`experimental-webgl2`): WebGL2RenderingContext | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl2`(
    contextId: webgl2Lib.webgl2LibStrings.`experimental-webgl2`,
    contextAttributes: stdLib.WebGLContextAttributes
  ): WebGL2RenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2Lib.webgl2LibStrings.webgl2): WebGL2RenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: webgl2Lib.webgl2LibStrings.webgl2, contextAttributes: stdLib.WebGLContextAttributes): WebGL2RenderingContext | scala.Null = js.native
}

