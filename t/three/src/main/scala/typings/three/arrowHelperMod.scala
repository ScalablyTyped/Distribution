package typings.three

import typings.three.colorMod.Color
import typings.three.lineMod.Line
import typings.three.meshMod.Mesh
import typings.three.object3DMod.Object3D
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/ArrowHelper", JSImport.Namespace)
@js.native
object arrowHelperMod extends js.Object {
  @js.native
  class ArrowHelper protected () extends Object3D {
    def this(dir: Vector3) = this()
    def this(dir: Vector3, origin: Vector3) = this()
    def this(dir: Vector3, origin: Vector3, length: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double, headLength: Double) = this()
    def this(dir: Vector3, origin: Vector3, length: Double, hex: Double, headLength: Double, headWidth: Double) = this()
    var cone: Mesh = js.native
    var line: Line = js.native
    def setColor(color: String): Unit = js.native
    def setColor(color: Double): Unit = js.native
    def setColor(color: Color): Unit = js.native
    def setDirection(dir: Vector3): Unit = js.native
    def setLength(length: Double): Unit = js.native
    def setLength(length: Double, headLength: Double): Unit = js.native
    def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
  }
  
}

