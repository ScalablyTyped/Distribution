package typings.three

import typings.three.fogMod.IFog
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/scenes/FogExp2", JSImport.Namespace)
@js.native
object fogExp2Mod extends js.Object {
  
  @js.native
  class FogExp2 protected () extends IFog {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, density: Double) = this()
    def this(hex: Double, density: Double) = this()
    
    /**
    	 * Defines how fast the fog will grow dense.
    	 * @default 0.00025
    	 */
    var density: Double = js.native
    
    val isFogExp2: `true` = js.native
  }
}
