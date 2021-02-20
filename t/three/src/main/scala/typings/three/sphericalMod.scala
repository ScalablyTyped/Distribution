package typings.three

import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphericalMod {
  
  @JSImport("three/src/math/Spherical", "Spherical")
  @js.native
  class Spherical () extends StObject {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], phi: Double) = this()
    def this(radius: Double, phi: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], phi: js.UndefOr[scala.Nothing], theta: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], phi: Double, theta: Double) = this()
    def this(radius: Double, phi: js.UndefOr[scala.Nothing], theta: Double) = this()
    def this(radius: Double, phi: Double, theta: Double) = this()
    
    def copy(other: Spherical): this.type = js.native
    
    def makeSafe(): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var phi: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var radius: Double = js.native
    
    def set(radius: Double, phi: Double, theta: Double): this.type = js.native
    
    def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
    
    def setFromVector3(v: Vector3): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var theta: Double = js.native
  }
}
