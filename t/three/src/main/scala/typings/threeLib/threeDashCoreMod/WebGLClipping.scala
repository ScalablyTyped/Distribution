package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLClipping")
@js.native
class WebGLClipping () extends js.Object {
  var numPlanes: scala.Double = js.native
  var uniform: threeLib.Anon_NeedsUpdate = js.native
  def beginShadows(): scala.Unit = js.native
  def endShadows(): scala.Unit = js.native
  def init(planes: js.Array[_], enableLocalClipping: scala.Boolean, camera: Camera): scala.Boolean = js.native
  def setState(
    planes: js.Array[_],
    clipShadows: scala.Boolean,
    camera: Camera,
    cache: scala.Boolean,
    fromCache: scala.Boolean
  ): scala.Unit = js.native
}

