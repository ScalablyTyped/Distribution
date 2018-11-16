package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CameraHelper")
@js.native
class CameraHelper protected () extends LineSegments {
  def this(camera: Camera) = this()
  var camera: Camera = js.native
  var pointMap: ScalablyTyped.runtime.StringDictionary[js.Array[scala.Double]] = js.native
  def update(): scala.Unit = js.native
}

