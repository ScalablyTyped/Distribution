package typings.three

import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasArrayCameraMod {
  
  @JSImport("three/src/cameras/ArrayCamera", "ArrayCamera")
  @js.native
  /**
    * An array of cameras.
    * @param array. Default `[]`.
    */
  open class ArrayCamera () extends PerspectiveCamera {
    def this(cameras: js.Array[PerspectiveCamera]) = this()
    
    /**
      * An array of cameras.
      * @defaultValue `[]`
      */
    var cameras: js.Array[PerspectiveCamera] = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link ArrayCamera}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isArrayCamera: `true` = js.native
  }
}
