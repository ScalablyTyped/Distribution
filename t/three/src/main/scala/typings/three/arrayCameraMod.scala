package typings.three

import typings.three.perspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/cameras/ArrayCamera", JSImport.Namespace)
@js.native
object arrayCameraMod extends js.Object {
  
  @js.native
  class ArrayCamera () extends PerspectiveCamera {
    def this(cameras: js.Array[PerspectiveCamera]) = this()
    
    /**
    	 * @default []
    	 */
    var cameras: js.Array[PerspectiveCamera] = js.native
    
    val isArrayCamera: `true` = js.native
  }
}
