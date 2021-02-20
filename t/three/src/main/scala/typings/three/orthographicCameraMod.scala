package typings.three

import typings.three.anon.Enabled
import typings.three.cameraMod.Camera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orthographicCameraMod {
  
  @JSImport("three/src/cameras/OrthographicCamera", "OrthographicCamera")
  @js.native
  class OrthographicCamera protected () extends Camera {
    /**
    	 * @param left Camera frustum left plane.
    	 * @param right Camera frustum right plane.
    	 * @param top Camera frustum top plane.
    	 * @param bottom Camera frustum bottom plane.
    	 * @param [near=0.1] Camera frustum near plane.
    	 * @param [far=2000] Camera frustum far plane.
    	 */
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double, near: Double) = this()
    def this(
      left: Double,
      right: Double,
      top: Double,
      bottom: Double,
      near: js.UndefOr[scala.Nothing],
      far: Double
    ) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()
    
    /**
    	 * Camera frustum bottom plane.
    	 * @default -1
    	 */
    var bottom: Double = js.native
    
    def clearViewOffset(): Unit = js.native
    
    /**
    	 * Camera frustum far plane.
    	 * @default 2000
    	 */
    var far: Double = js.native
    
    val isOrthographicCamera: `true` = js.native
    
    /**
    	 * Camera frustum left plane.
    	 * @default -1
    	 */
    var left: Double = js.native
    
    /**
    	 * Camera frustum near plane.
    	 * @default 0.1
    	 */
    var near: Double = js.native
    
    /**
    	 * Camera frustum right plane.
    	 * @default 1
    	 */
    var right: Double = js.native
    
    def setViewOffset(
      fullWidth: Double,
      fullHeight: Double,
      offsetX: Double,
      offsetY: Double,
      width: Double,
      height: Double
    ): Unit = js.native
    
    def toJSON(meta: js.Any): js.Any = js.native
    
    /**
    	 * Camera frustum top plane.
    	 * @default 1
    	 */
    var top: Double = js.native
    
    @JSName("type")
    var type_OrthographicCamera: typings.three.threeStrings.OrthographicCamera = js.native
    
    /**
    	 * Updates the camera projection matrix. Must be called after change of parameters.
    	 */
    def updateProjectionMatrix(): Unit = js.native
    
    /**
    	 * @default null
    	 */
    var view: Null | Enabled = js.native
    
    /**
    	 * @default 1
    	 */
    var zoom: Double = js.native
  }
}
