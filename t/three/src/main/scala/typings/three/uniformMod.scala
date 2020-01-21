package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/Uniform", JSImport.Namespace)
@js.native
object uniformMod extends js.Object {
  @js.native
  class Uniform protected () extends js.Object {
    def this(value: js.Any) = this()
    /**
    	 * @deprecated
    	 */
    def this(`type`: String, value: js.Any) = this()
    /**
    	 * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
    	 */
    var dynamic: Boolean = js.native
    var onUpdateCallback: js.Function = js.native
    /**
    	 * @deprecated
    	 */
    var `type`: String = js.native
    var value: js.Any = js.native
    /**
    	 * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
    	 */
    def onUpdate(callback: js.Function): Uniform = js.native
  }
  
}

