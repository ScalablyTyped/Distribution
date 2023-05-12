package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcThreeMod.Layers
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasCameraMod {
  
  /* note: abstract class */ @JSImport("three/src/cameras/Camera", "Camera")
  @js.native
  /**
    * @remarks
    * Note that this class is not intended to be called directly; you probably want a
    * {@link THREE.PerspectiveCamera | PerspectiveCamera} or
    * {@link THREE.OrthographicCamera | OrthographicCamera} instead.
    */
  open class Camera () extends Object3D[Event] {
    
    /**
      * Read-only flag to check if a given object is of type {@link Camera}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCamera: `true` = js.native
    
    /**
      * @override
      * The {@link THREE.Layers | layers} that the {@link Camera} is a member of.
      * @remarks Objects must share at least one layer with the {@link Camera} to be n when the camera's viewpoint is rendered.
      * @defaultValue `new THREE.Layers()`
      */
    @JSName("layers")
    var layers_Camera: Layers = js.native
    
    /**
      * This is the inverse of matrixWorld.
      * @remarks MatrixWorld contains the Matrix which has the world transform of the {@link Camera} .
      * @defaultValue {@link THREE.Matrix4 | `new THREE.Matrix4()`}
      */
    var matrixWorldInverse: Matrix4 = js.native
    
    /**
      * This is the matrix which contains the projection.
      * @defaultValue {@link THREE.Matrix4 | `new THREE.Matrix4()`}
      */
    var projectionMatrix: Matrix4 = js.native
    
    /**
      * This is the inverse of projectionMatrix.
      * @defaultValue {@link THREE.Matrix4 | `new THREE.Matrix4()`}
      */
    var projectionMatrixInverse: Matrix4 = js.native
    
    /**
      * @override
      * @defaultValue `Camera`
      */
    @JSName("type")
    val type_Camera: String | typings.three.threeStrings.Camera = js.native
  }
}
