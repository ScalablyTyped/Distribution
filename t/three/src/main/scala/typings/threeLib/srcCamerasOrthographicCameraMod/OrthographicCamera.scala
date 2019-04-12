package typings
package threeLib.srcCamerasOrthographicCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/OrthographicCamera", "OrthographicCamera")
@js.native
class OrthographicCamera protected ()
  extends threeLib.srcCamerasCameraMod.Camera {
  /**
    * @param left Camera frustum left plane.
    * @param right Camera frustum right plane.
    * @param top Camera frustum top plane.
    * @param bottom Camera frustum bottom plane.
    * @param near Camera frustum near plane.
    * @param far Camera frustum far plane.
    */
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double, near: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double, near: scala.Double, far: scala.Double) = this()
  /**
    * Camera frustum bottom plane.
    */
  var bottom: scala.Double = js.native
  /**
    * Camera frustum far plane.
    */
  var far: scala.Double = js.native
  var isOrthographicCamera: threeLib.threeLibNumbers.`true` = js.native
  /**
    * Camera frustum left plane.
    */
  var left: scala.Double = js.native
  /**
    * Camera frustum near plane.
    */
  var near: scala.Double = js.native
  /**
    * Camera frustum right plane.
    */
  var right: scala.Double = js.native
  /**
    * Camera frustum top plane.
    */
  var top: scala.Double = js.native
  @JSName("type")
  var type_OrthographicCamera: threeLib.threeLibStrings.OrthographicCamera = js.native
  var view: scala.Null | threeLib.Anon_Enabled = js.native
  var zoom: scala.Double = js.native
  def clearViewOffset(): scala.Unit = js.native
  def setViewOffset(
    fullWidth: scala.Double,
    fullHeight: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  /**
    * Updates the camera projection matrix. Must be called after change of parameters.
    */
  def updateProjectionMatrix(): scala.Unit = js.native
}

