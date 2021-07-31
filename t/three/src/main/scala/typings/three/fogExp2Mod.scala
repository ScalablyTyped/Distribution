package typings.three

import typings.three.colorMod.Color
import typings.three.fogMod.IFog
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fogExp2Mod {
  
  @JSImport("three/src/scenes/FogExp2", "FogExp2")
  @js.native
  class FogExp2 protected ()
    extends StObject
       with IFog {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, density: Double) = this()
    def this(hex: Double, density: Double) = this()
    
    /* CompleteClass */
    var color: Color = js.native
    
    /**
    	 * Defines how fast the fog will grow dense.
    	 * @default 0.00025
    	 */
    var density: Double = js.native
    
    val isFogExp2: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
}
