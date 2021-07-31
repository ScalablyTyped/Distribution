package typings.three

import typings.three.matrix4Mod.Matrix4
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod {
  
  @JSImport("three/src/cameras/Camera", "Camera")
  @js.native
  /**
  	 * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
  	 */
  class Camera () extends Object3D {
    
    val isCamera: `true` = js.native
    
    /**
    	 * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
    	 * @default new THREE.Matrix4()
    	 */
    var matrixWorldInverse: Matrix4 = js.native
    
    /**
    	 * This is the matrix which contains the projection.
    	 * @default new THREE.Matrix4()
    	 */
    var projectionMatrix: Matrix4 = js.native
    
    /**
    	 * This is the inverse of projectionMatrix.
    	 * @default new THREE.Matrix4()
    	 */
    var projectionMatrixInverse: Matrix4 = js.native
  }
}
