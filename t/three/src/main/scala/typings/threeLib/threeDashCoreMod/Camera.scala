package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Camera")
@js.native
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
}

