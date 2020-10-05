package typings.three

import typings.three.matrix4Mod.Matrix4
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/cameras/Camera", JSImport.Namespace)
@js.native
object cameraMod extends js.Object {
  @js.native
  /**
  	 * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
  	 */
  class Camera () extends Object3D {
    val isCamera: `true` = js.native
    /**
    	 * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
    	 */
    var matrixWorldInverse: Matrix4 = js.native
    /**
    	 * This is the matrix which contains the projection.
    	 */
    var projectionMatrix: Matrix4 = js.native
    /**
    	 * This is the inverse of projectionMatrix.
    	 */
    var projectionMatrixInverse: Matrix4 = js.native
  }
  
}

