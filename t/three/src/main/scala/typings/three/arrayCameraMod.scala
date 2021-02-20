package typings.three

import typings.three.perspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayCameraMod {
  
  @JSImport("three/src/cameras/ArrayCamera", "ArrayCamera")
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
