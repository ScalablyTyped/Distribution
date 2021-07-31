package typings.three

import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cylindricalMod {
  
  @JSImport("three/src/math/Cylindrical", "Cylindrical")
  @js.native
  class Cylindrical () extends StObject {
    def this(radius: Double) = this()
    def this(radius: Double, theta: Double) = this()
    def this(radius: Unit, theta: Double) = this()
    def this(radius: Double, theta: Double, y: Double) = this()
    def this(radius: Double, theta: Unit, y: Double) = this()
    def this(radius: Unit, theta: Double, y: Double) = this()
    def this(radius: Unit, theta: Unit, y: Double) = this()
    
    def copy(other: Cylindrical): this.type = js.native
    
    /**
    	 * @default 1
    	 */
    var radius: Double = js.native
    
    def set(radius: Double, theta: Double, y: Double): this.type = js.native
    
    def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
    
    def setFromVector3(vec3: Vector3): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var theta: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var y: Double = js.native
  }
}
