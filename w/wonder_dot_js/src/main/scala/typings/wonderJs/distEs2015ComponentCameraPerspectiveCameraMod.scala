package typings.wonderJs

import typings.wonderJs.distEs2015ComponentCameraCameraMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentCameraPerspectiveCameraMod {
  
  @JSImport("wonder.js/dist/es2015/component/camera/PerspectiveCamera", "PerspectiveCamera")
  @js.native
  open class PerspectiveCamera () extends Camera {
    
    var aspect: Double = js.native
    
    var fovy: Double = js.native
    
    def zoomIn(speed: Double): Unit = js.native
    def zoomIn(speed: Double, min: Double): Unit = js.native
    
    def zoomOut(speed: Double): Unit = js.native
    def zoomOut(speed: Double, max: Double): Unit = js.native
  }
  /* static members */
  object PerspectiveCamera {
    
    @JSImport("wonder.js/dist/es2015/component/camera/PerspectiveCamera", "PerspectiveCamera")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): PerspectiveCamera = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PerspectiveCamera]
  }
}
