package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLInfo")
@js.native
class WebGLInfo () extends js.Object {
  var autoReset: scala.Boolean = js.native
  var memory: threeLib.Anon_Geometries = js.native
  var programs: js.Array[WebGLProgram] | scala.Null = js.native
  var render: threeLib.Anon_Calls = js.native
  def reset(): scala.Unit = js.native
}

