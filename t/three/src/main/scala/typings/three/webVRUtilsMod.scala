package typings.three

import typings.three.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webvr/WebVRUtils", JSImport.Namespace)
@js.native
object webVRUtilsMod extends js.Object {
  def setProjectionFromUnion(camera: Camera, cameraL: Camera, cameraR: Camera): Unit = js.native
}

