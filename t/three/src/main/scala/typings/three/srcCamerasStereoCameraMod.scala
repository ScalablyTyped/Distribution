package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasStereoCameraMod {
  
  @JSImport("three/src/cameras/StereoCamera", "StereoCamera")
  @js.native
  open class StereoCamera () extends Camera {
    
    /**
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var aspect: Double = js.native
    
    /**
      * The Left camera.
      * A {@link PerspectiveCamera } added to {@link THREE.PerspectiveCamera.layers | layer 1}
      * @remarks Objects to be rendered by the **left** camera must also be added to this layer.
      */
    var cameraL: PerspectiveCamera = js.native
    
    /**
      * The Right camera.
      * A {@link PerspectiveCamera } added to {@link THREE.PerspectiveCamera.layers | layer 2}
      * @remarks Objects to be rendered by the **right** camera must also be added to this layer.
      */
    var cameraR: PerspectiveCamera = js.native
    
    /**
      * @remarks Expects a `Float`
      * @defaultValue `0.064`
      */
    var eyeSep: Double = js.native
    
    @JSName("type")
    var type_StereoCamera: typings.three.threeStrings.StereoCamera = js.native
    
    /**
      * Update the stereo cameras based on the camera passed in.
      * @param camera
      */
    def update(camera: PerspectiveCamera): Unit = js.native
  }
}
