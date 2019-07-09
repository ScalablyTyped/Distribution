package typings
package threeLib.srcCamerasCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/Camera", "Camera")
@js.native
/**
	 * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
	 */
class Camera ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  var isCamera: threeLib.threeLibNumbers.`true` = js.native
  /**
  	 * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
  	 */
  var matrixWorldInverse: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  /**
  	 * This is the matrix which contains the projection.
  	 */
  var projectionMatrix: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  /**
  	 * This is the inverse of projectionMatrix.
  	 */
  var projectionMatrixInverse: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  def copy(source: Camera): this.type = js.native
  def copy(source: Camera, recursive: scala.Boolean): this.type = js.native
}

