package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/PerspectiveCamera", JSImport.Namespace)
@js.native
object srcCamerasPerspectiveCameraMod extends js.Object {
  @js.native
  /**
  	 * @param fov Camera frustum vertical field of view. Default value is 50.
  	 * @param aspect Camera frustum aspect ratio. Default value is 1.
  	 * @param near Camera frustum near plane. Default value is 0.1.
  	 * @param far Camera frustum far plane. Default value is 2000.
  	 */
  class PerspectiveCamera () extends Camera {
    def this(fov: Double) = this()
    def this(fov: Double, aspect: Double) = this()
    def this(fov: Double, aspect: Double, near: Double) = this()
    def this(fov: Double, aspect: Double, near: Double, far: Double) = this()
    /**
    	 * Camera frustum aspect ratio, window width divided by window height.
    	 */
    var aspect: Double = js.native
    /**
    	 * Camera frustum far plane.
    	 */
    var far: Double = js.native
    var filmGauge: Double = js.native
    var filmOffset: Double = js.native
    var focus: Double = js.native
    /**
    	 * Camera frustum vertical field of view, from bottom to top of view, in degrees.
    	 */
    var fov: Double = js.native
    var isPerspectiveCamera: `true` = js.native
    /**
    	 * Camera frustum near plane.
    	 */
    var near: Double = js.native
    @JSName("type")
    var type_PerspectiveCamera: typings.three.threeStrings.PerspectiveCamera = js.native
    var view: Null | Anon_Enabled = js.native
    var zoom: Double = js.native
    def clearViewOffset(): Unit = js.native
    def getEffectiveFOV(): Double = js.native
    def getFilmHeight(): Double = js.native
    def getFilmWidth(): Double = js.native
    def getFocalLength(): Double = js.native
    def setFocalLength(focalLength: Double): Unit = js.native
    /**
    	 * @deprecated Use {@link PerspectiveCamera#setFocalLength .setFocalLength()} and {@link PerspectiveCamera#filmGauge .filmGauge} instead.
    	 */
    def setLens(focalLength: Double): Unit = js.native
    def setLens(focalLength: Double, frameHeight: Double): Unit = js.native
    /**
    	 * Sets an offset in a larger frustum. This is useful for multi-window or multi-monitor/multi-machine setups.
    	 * For example, if you have 3x2 monitors and each monitor is 1920x1080 and the monitors are in grid like this:
    	 *
    	 *		 +---+---+---+
    	 *		 | A | B | C |
    	 *		 +---+---+---+
    	 *		 | D | E | F |
    	 *		 +---+---+---+
    	 *
    	 * then for each monitor you would call it like this:
    	 *
    	 *		 var w = 1920;
    	 *		 var h = 1080;
    	 *		 var fullWidth = w * 3;
    	 *		 var fullHeight = h * 2;
    	 *
    	 *		 // A
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 0, w, h );
    	 *		 // B
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 0, w, h );
    	 *		 // C
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 0, w, h );
    	 *		 // D
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 1, w, h );
    	 *		 // E
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 1, w, h );
    	 *		 // F
    	 *		 camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 1, w, h ); Note there is no reason monitors have to be the same size or in a grid.
    	 *
    	 * @param fullWidth full width of multiview setup
    	 * @param fullHeight full height of multiview setup
    	 * @param x horizontal offset of subcamera
    	 * @param y vertical offset of subcamera
    	 * @param width width of subcamera
    	 * @param height height of subcamera
    	 */
    def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
    def toJSON(meta: js.Any): js.Any = js.native
    /**
    	 * Updates the camera projection matrix. Must be called after change of parameters.
    	 */
    def updateProjectionMatrix(): Unit = js.native
  }
  
}

