package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PerspectiveCamera")
@js.native
/**
  * @param fov Camera frustum vertical field of view. Default value is 50.
  * @param aspect Camera frustum aspect ratio. Default value is 1.
  * @param near Camera frustum near plane. Default value is 0.1.
  * @param far Camera frustum far plane. Default value is 2000.
  */
class PerspectiveCamera () extends Camera {
  def this(fov: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double, near: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double, near: scala.Double, far: scala.Double) = this()
  /**
    * Camera frustum aspect ratio, window width divided by window height.
    */
  var aspect: scala.Double = js.native
  /**
    * Camera frustum far plane.
    */
  var far: scala.Double = js.native
  var filmGauge: scala.Double = js.native
  var filmOffset: scala.Double = js.native
  var focus: scala.Double = js.native
  /**
    * Camera frustum vertical field of view, from bottom to top of view, in degrees.
    */
  var fov: scala.Double = js.native
  var isPerspectiveCamera: threeLib.threeLibNumbers.`true` = js.native
  /**
    * Camera frustum near plane.
    */
  var near: scala.Double = js.native
  @JSName("type")
  var type_PerspectiveCamera: threeLib.threeLibStrings.PerspectiveCamera = js.native
  var view: scala.Null | threeLib.Anon_Enabled = js.native
  var zoom: scala.Double = js.native
  def clearViewOffset(): scala.Unit = js.native
  def getEffectiveFOV(): scala.Double = js.native
  def getFilmHeight(): scala.Double = js.native
  def getFilmWidth(): scala.Double = js.native
  def getFocalLength(): scala.Double = js.native
  def setFocalLength(focalLength: scala.Double): scala.Unit = js.native
  /**
    * @deprecated Use {@link PerspectiveCamera#setFocalLength .setFocalLength()} and {@link PerspectiveCamera#filmGauge .filmGauge} instead.
    */
  def setLens(focalLength: scala.Double): scala.Unit = js.native
  def setLens(focalLength: scala.Double, frameHeight: scala.Double): scala.Unit = js.native
  /**
    * Sets an offset in a larger frustum. This is useful for multi-window or multi-monitor/multi-machine setups.
    * For example, if you have 3x2 monitors and each monitor is 1920x1080 and the monitors are in grid like this:
    *
    *     +---+---+---+
    *     | A | B | C |
    *     +---+---+---+
    *     | D | E | F |
    *     +---+---+---+
    *
    * then for each monitor you would call it like this:
    *
    *     var w = 1920;
    *     var h = 1080;
    *     var fullWidth = w * 3;
    *     var fullHeight = h * 2;
    *
    *     // A
    *     camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 0, w, h );
    *     // B
    *     camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 0, w, h );
    *     // C
    *     camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 0, w, h );
    *     // D
    *     camera.setViewOffset( fullWidth, fullHeight, w * 0, h * 1, w, h );
    *     // E
    *     camera.setViewOffset( fullWidth, fullHeight, w * 1, h * 1, w, h );
    *     // F
    *     camera.setViewOffset( fullWidth, fullHeight, w * 2, h * 1, w, h ); Note there is no reason monitors have to be the same size or in a grid.
    *
    * @param fullWidth full width of multiview setup
    * @param fullHeight full height of multiview setup
    * @param x horizontal offset of subcamera
    * @param y vertical offset of subcamera
    * @param width width of subcamera
    * @param height height of subcamera
    */
  def setViewOffset(
    fullWidth: scala.Double,
    fullHeight: scala.Double,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  /**
    * Updates the camera projection matrix. Must be called after change of parameters.
    */
  def updateProjectionMatrix(): scala.Unit = js.native
}

