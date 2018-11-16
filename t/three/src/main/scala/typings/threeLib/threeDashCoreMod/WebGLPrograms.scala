package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLPrograms")
@js.native
class WebGLPrograms protected () extends js.Object {
  def this(renderer: WebGLRenderer, capabilities: js.Any) = this()
  var programs: js.Array[WebGLProgram] = js.native
  def acquireProgram(material: ShaderMaterial, parameters: js.Any, code: java.lang.String): WebGLProgram = js.native
  def getParameters(material: ShaderMaterial, lights: js.Any, fog: js.Any, nClipPlanes: scala.Double, `object`: js.Any): js.Any = js.native
  def getProgramCode(material: ShaderMaterial, parameters: js.Any): java.lang.String = js.native
  def releaseProgram(program: WebGLProgram): scala.Unit = js.native
}

