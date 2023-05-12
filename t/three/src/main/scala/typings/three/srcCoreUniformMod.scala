package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreUniformMod {
  
  @JSImport("three/src/core/Uniform", "Uniform")
  @js.native
  open class Uniform[T] protected () extends StObject {
    /**
      * Create a new instance of {@link THREE.Uniform | Uniform}
      * @param value An object containing the value to set up the uniform. It's type must be one of the Uniform Types described above.
      */
    def this(value: T) = this()
    
    /**
      * Current value of the uniform.
      */
    var value: T = js.native
  }
}
