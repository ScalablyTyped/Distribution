package typings.webgl2Compute

import typings.std.WebGLContextAttributes
import typings.webgl2Compute.webgl2ComputeStrings.`webgl2-compute`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvas extends StObject {
  
  @JSName("getContext")
  def getContext_webgl2compute(contextId: `webgl2-compute`): WebGL2ComputeRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2compute(contextId: `webgl2-compute`, contextAttributes: WebGLContextAttributes): WebGL2ComputeRenderingContext | Null = js.native
}
