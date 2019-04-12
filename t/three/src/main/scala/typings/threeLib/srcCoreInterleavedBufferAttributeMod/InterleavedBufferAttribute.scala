package typings
package threeLib.srcCoreInterleavedBufferAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InterleavedBufferAttribute", "InterleavedBufferAttribute")
@js.native
class InterleavedBufferAttribute protected () extends js.Object {
  def this(interleavedBuffer: threeLib.srcCoreInterleavedBufferMod.InterleavedBuffer, itemSize: scala.Double, offset: scala.Double) = this()
  def this(interleavedBuffer: threeLib.srcCoreInterleavedBufferMod.InterleavedBuffer, itemSize: scala.Double, offset: scala.Double, normalized: scala.Boolean) = this()
  var array: js.Array[_] = js.native
  var count: scala.Double = js.native
  var data: threeLib.srcCoreInterleavedBufferMod.InterleavedBuffer = js.native
  var itemSize: scala.Double = js.native
  /**
    * @deprecated Use {@link InterleavedBufferAttribute#count .count} instead.
    */
  var length: scala.Double = js.native
  var normalized: scala.Boolean = js.native
  var offset: scala.Double = js.native
  var uuid: java.lang.String = js.native
  def getW(index: scala.Double): scala.Double = js.native
  def getX(index: scala.Double): scala.Double = js.native
  def getY(index: scala.Double): scala.Double = js.native
  def getZ(index: scala.Double): scala.Double = js.native
  def setW(index: scala.Double, z: scala.Double): InterleavedBufferAttribute = js.native
  def setX(index: scala.Double, x: scala.Double): InterleavedBufferAttribute = js.native
  def setXY(index: scala.Double, x: scala.Double, y: scala.Double): InterleavedBufferAttribute = js.native
  def setXYZ(index: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): InterleavedBufferAttribute = js.native
  def setXYZW(index: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): InterleavedBufferAttribute = js.native
  def setY(index: scala.Double, y: scala.Double): InterleavedBufferAttribute = js.native
  def setZ(index: scala.Double, z: scala.Double): InterleavedBufferAttribute = js.native
}

