package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniformMod {
  
  @JSImport("three/src/core/Uniform", "Uniform")
  @js.native
  class Uniform protected () extends StObject {
    def this(value: js.Any) = this()
    /**
    	 * @deprecated
    	 */
    def this(`type`: String, value: js.Any) = this()
    
    /**
    	 * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
    	 */
    var dynamic: Boolean = js.native
    
    /**
    	 * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
    	 */
    def onUpdate(callback: js.Function): Uniform = js.native
    
    var onUpdateCallback: js.Function = js.native
    
    /**
    	 * @deprecated
    	 */
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
}
