package typings.three.webGLCapabilitiesMod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLCapabilities", "WebGLCapabilities")
@js.native
class WebGLCapabilities protected () extends js.Object {
  def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
  var floatFragmentTextures: Boolean = js.native
  var floatVertexTextures: Boolean = js.native
  val isWebGL2: Boolean = js.native
  var logarithmicDepthBuffer: Boolean = js.native
  var maxAttributes: Double = js.native
  var maxCubemapSize: Double = js.native
  var maxFragmentUniforms: Double = js.native
  var maxTextureSize: Double = js.native
  var maxTextures: Double = js.native
  var maxVaryings: Double = js.native
  var maxVertexTextures: Double = js.native
  var maxVertexUniforms: Double = js.native
  var precision: String = js.native
  var vertexTextures: Boolean = js.native
  def getMaxAnisotropy(): Double = js.native
  def getMaxPrecision(precision: String): String = js.native
}

