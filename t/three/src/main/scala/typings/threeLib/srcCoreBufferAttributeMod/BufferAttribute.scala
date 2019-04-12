package typings
package threeLib.srcCoreBufferAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/BufferAttribute", "BufferAttribute")
@js.native
class BufferAttribute protected () extends js.Object {
  def this(array: stdLib.ArrayLike[scala.Double], itemSize: scala.Double) = this()
  def this(array: stdLib.ArrayLike[scala.Double], itemSize: scala.Double, normalized: scala.Boolean) = this()
  var array: stdLib.ArrayLike[scala.Double] = js.native
  var count: scala.Double = js.native
  var dynamic: scala.Boolean = js.native
  var itemSize: scala.Double = js.native
  /**
    * @deprecated Use {@link BufferAttribute#count .count} instead.
    */
  var length: scala.Double = js.native
  var needsUpdate: scala.Boolean = js.native
  var normalized: scala.Boolean = js.native
  var onUpload: js.Function = js.native
  var updateRange: threeLib.Anon_Count = js.native
   // array parameter should be TypedArray.
  var uuid: java.lang.String = js.native
  var version: scala.Double = js.native
  def copy(source: BufferAttribute): this.type = js.native
  def copyArray(array: stdLib.ArrayLike[scala.Double]): BufferAttribute = js.native
  def copyAt(index1: scala.Double, attribute: BufferAttribute, index2: scala.Double): BufferAttribute = js.native
  def copyColorsArray(colors: js.Array[threeLib.Anon_B]): BufferAttribute = js.native
  def copyVector2sArray(vectors: js.Array[threeLib.Anon_X]): BufferAttribute = js.native
  def copyVector3sArray(vectors: js.Array[threeLib.Anon_XY]): BufferAttribute = js.native
  def copyVector4sArray(vectors: js.Array[threeLib.Anon_W]): BufferAttribute = js.native
  def getW(index: scala.Double): scala.Double = js.native
  def getX(index: scala.Double): scala.Double = js.native
  def getY(index: scala.Double): scala.Double = js.native
  def getZ(index: scala.Double): scala.Double = js.native
  def set(value: stdLib.ArrayBufferView): BufferAttribute = js.native
  def set(value: stdLib.ArrayBufferView, offset: scala.Double): BufferAttribute = js.native
  def set(value: stdLib.ArrayLike[scala.Double]): BufferAttribute = js.native
  def set(value: stdLib.ArrayLike[scala.Double], offset: scala.Double): BufferAttribute = js.native
  def setArray(): scala.Unit = js.native
  def setArray(array: stdLib.ArrayBufferView): scala.Unit = js.native
  def setDynamic(dynamic: scala.Boolean): BufferAttribute = js.native
  def setW(index: scala.Double, z: scala.Double): BufferAttribute = js.native
  def setX(index: scala.Double, x: scala.Double): BufferAttribute = js.native
  def setXY(index: scala.Double, x: scala.Double, y: scala.Double): BufferAttribute = js.native
  def setXYZ(index: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): BufferAttribute = js.native
  def setXYZW(index: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): BufferAttribute = js.native
  def setY(index: scala.Double, y: scala.Double): BufferAttribute = js.native
  def setZ(index: scala.Double, z: scala.Double): BufferAttribute = js.native
}

