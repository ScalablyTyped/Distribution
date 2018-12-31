package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Camera")
@js.native
/**
  * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
  */
class Camera () extends Object3D {
  var isCamera: threeLib.threeLibNumbers.`true` = js.native
  /**
    * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
    */
  var matrixWorldInverse: Matrix4 = js.native
  /**
    * This is the matrix which contains the projection.
    */
  var projectionMatrix: Matrix4 = js.native
  def copy(source: Camera): this.type = js.native
  def copy(source: Camera, recursive: scala.Boolean): this.type = js.native
}

