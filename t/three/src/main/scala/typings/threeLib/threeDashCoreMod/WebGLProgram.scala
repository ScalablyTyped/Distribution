package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLProgram")
@js.native
class WebGLProgram protected () extends js.Object {
  def this(renderer: WebGLRenderer, code: java.lang.String, material: ShaderMaterial, parameters: WebGLRendererParameters) = this()
  /**
    * @deprecated Use {@link WebGLProgram#getAttributes getAttributes()} instead.
    */
  var attributes: js.Any = js.native
  var code: java.lang.String = js.native
  var fragmentShader: WebGLShader = js.native
  var id: scala.Double = js.native
  var program: js.Any = js.native
  /**
    * @deprecated Use {@link WebGLProgram#getUniforms getUniforms()} instead.
    */
  var uniforms: js.Any = js.native
  var usedTimes: scala.Double = js.native
  var vertexShader: WebGLShader = js.native
  def destroy(): scala.Unit = js.native
  def getAttributes(): js.Any = js.native
  def getUniforms(): WebGLUniforms = js.native
}

