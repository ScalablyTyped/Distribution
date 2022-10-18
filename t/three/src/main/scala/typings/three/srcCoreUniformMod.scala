package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreUniformMod {
  
  @JSImport("three/src/core/Uniform", "Uniform")
  @js.native
  open class Uniform protected () extends StObject {
    def this(value: Any) = this()
    /**
      * @deprecated
      */
    def this(`type`: String, value: Any) = this()
    
    /**
      * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
      */
    var dynamic: Boolean = js.native
    
    /**
      * @deprecated Use {@link Object3D#onBeforeRender object.onBeforeRender()} instead.
      */
    def onUpdate(callback: js.Function0[Unit]): Uniform = js.native
    
    /**
      * @deprecated
      */
    var `type`: String = js.native
    
    var value: Any = js.native
  }
}
