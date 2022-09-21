package typings.webglExt

import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import typings.webglExt.webglExtStrings.`experimental-webgl`
import typings.webglExt.webglExtStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCanvasElement extends StObject {
  
  def getContext(contextId: webgl | `experimental-webgl`): (WebGLRenderingContext & WebGL1Extensions) | Null = js.native
  def getContext(contextId: webgl | `experimental-webgl`, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext & WebGL1Extensions) | Null = js.native
}
