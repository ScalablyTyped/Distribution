package typings.three

import typings.std.ArrayLike
import typings.three.interleavedBufferMod.InterleavedBuffer
import typings.three.matrix4Mod.Matrix4
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InterleavedBufferAttribute", JSImport.Namespace)
@js.native
object interleavedBufferAttributeMod extends js.Object {
  @js.native
  class InterleavedBufferAttribute protected () extends js.Object {
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double) = this()
    def this(interleavedBuffer: InterleavedBuffer, itemSize: Double, offset: Double, normalized: Boolean) = this()
    var data: InterleavedBuffer = js.native
    val isInterleavedBufferAttribute: `true` = js.native
    var itemSize: Double = js.native
    var normalized: Boolean = js.native
    var offset: Double = js.native
    def applyMatrix4(m: Matrix4): this.type = js.native
    def array(): ArrayLike[Double] = js.native
    def count(): Double = js.native
    def getW(index: Double): Double = js.native
    def getX(index: Double): Double = js.native
    def getY(index: Double): Double = js.native
    def getZ(index: Double): Double = js.native
    def setW(index: Double, z: Double): InterleavedBufferAttribute = js.native
    def setX(index: Double, x: Double): InterleavedBufferAttribute = js.native
    def setXY(index: Double, x: Double, y: Double): InterleavedBufferAttribute = js.native
    def setXYZ(index: Double, x: Double, y: Double, z: Double): InterleavedBufferAttribute = js.native
    def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): InterleavedBufferAttribute = js.native
    def setY(index: Double, y: Double): InterleavedBufferAttribute = js.native
    def setZ(index: Double, z: Double): InterleavedBufferAttribute = js.native
  }
  
}

