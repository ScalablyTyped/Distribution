package typings.three

import typings.three.cameraMod.Camera
import typings.three.perspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/cameras/StereoCamera", JSImport.Namespace)
@js.native
object stereoCameraMod extends js.Object {
  
  @js.native
  class StereoCamera () extends Camera {
    
    /**
    	 * @default 1
    	 */
    var aspect: Double = js.native
    
    var cameraL: PerspectiveCamera = js.native
    
    var cameraR: PerspectiveCamera = js.native
    
    /**
    	 * @default 0.064
    	 */
    var eyeSep: Double = js.native
    
    @JSName("type")
    var type_StereoCamera: typings.three.threeStrings.StereoCamera = js.native
    
    def update(camera: PerspectiveCamera): Unit = js.native
  }
}
