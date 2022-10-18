package typings.three

import typings.three.srcThreeMod.PerspectiveCamera
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsCameraUtilsMod {
  
  @JSImport("three/examples/jsm/utils/CameraUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frameCorners(
    camera: PerspectiveCamera,
    bottomLeftCorner: Vector3,
    bottomRightCorner: Vector3,
    topLeftCorner: Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frameCorners")(camera.asInstanceOf[js.Any], bottomLeftCorner.asInstanceOf[js.Any], bottomRightCorner.asInstanceOf[js.Any], topLeftCorner.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def frameCorners(
    camera: PerspectiveCamera,
    bottomLeftCorner: Vector3,
    bottomRightCorner: Vector3,
    topLeftCorner: Vector3,
    estimateViewFrustum: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("frameCorners")(camera.asInstanceOf[js.Any], bottomLeftCorner.asInstanceOf[js.Any], bottomRightCorner.asInstanceOf[js.Any], topLeftCorner.asInstanceOf[js.Any], estimateViewFrustum.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
