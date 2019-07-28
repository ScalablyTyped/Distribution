package typings.three.srcHelpersCameraHelperMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/CameraHelper", "CameraHelper")
@js.native
class CameraHelper protected () extends LineSegments {
  def this(camera: Camera) = this()
  var camera: Camera = js.native
  var pointMap: StringDictionary[js.Array[Double]] = js.native
  def update(): Unit = js.native
}

