package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLUniforms")
@js.native
class WebGLUniforms protected () extends js.Object {
  def this(gl: js.Any, program: WebGLProgram, renderer: WebGLRenderer) = this()
  var renderer: WebGLRenderer = js.native
  def set(gl: js.Any, `object`: js.Any, name: java.lang.String): scala.Unit = js.native
  def setOptional(gl: js.Any, `object`: js.Any, name: java.lang.String): scala.Unit = js.native
  def setValue(gl: js.Any, value: js.Any): scala.Unit = js.native
  def setValue(gl: js.Any, value: js.Any, renderer: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("three/three-core", "WebGLUniforms")
@js.native
object WebGLUniforms extends js.Object {
  def evalDynamic(seq: js.Any, values: js.Array[_], `object`: js.Any, camera: js.Any): js.Array[_] = js.native
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def splitDynamic(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def upload(gl: js.Any, seq: js.Any, values: js.Array[_], renderer: js.Any): scala.Unit = js.native
}

