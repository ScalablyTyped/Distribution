package typings.three

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Spherical", JSImport.Namespace)
@js.native
object sphericalMod extends js.Object {
  @js.native
  class Spherical () extends js.Object {
    def this(radius: Double) = this()
    def this(radius: Double, phi: Double) = this()
    def this(radius: Double, phi: Double, theta: Double) = this()
    var phi: Double = js.native
    var radius: Double = js.native
    var theta: Double = js.native
    def copy(other: Spherical): this.type = js.native
    def makeSafe(): Unit = js.native
    def set(radius: Double, phi: Double, theta: Double): this.type = js.native
    def setFromCartesianCoords(x: Double, y: Double, z: Double): this.type = js.native
    def setFromVector3(v: Vector3): this.type = js.native
  }
  
}

