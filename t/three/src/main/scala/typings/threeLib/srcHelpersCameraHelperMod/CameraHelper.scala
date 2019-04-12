package typings
package threeLib.srcHelpersCameraHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/CameraHelper", "CameraHelper")
@js.native
class CameraHelper protected ()
  extends threeLib.srcObjectsLineSegmentsMod.LineSegments {
  def this(camera: threeLib.srcCamerasCameraMod.Camera) = this()
  var camera: threeLib.srcCamerasCameraMod.Camera = js.native
  var pointMap: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]] = js.native
  def update(): scala.Unit = js.native
}

