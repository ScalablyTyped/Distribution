package typings.three

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/math/Cylindrical", JSImport.Namespace)
@js.native
object cylindricalMod extends js.Object {
  @js.native
  class Cylindrical () extends js.Object {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], theta: Double) = this()
    def this(radius: Double, theta: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], theta: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], theta: Double, y: Double) = this()
    def this(radius: Double, theta: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(radius: Double, theta: Double, y: Double) = this()
    var radius: Double = js.native
    var theta: Double = js.native
    var y: Double = js.native
    def copy(other: Cylindrical): this.type = js.native
    def set(radius: Double, theta: Double, y: Double): this.type = js.native
    def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
    def setFromVector3(vec3: Vector3): this.type = js.native
  }
  
}

