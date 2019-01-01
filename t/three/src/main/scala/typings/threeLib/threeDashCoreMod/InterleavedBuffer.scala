package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "InterleavedBuffer")
@js.native
class InterleavedBuffer protected () extends js.Object {
  def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double) = this()
  var array: stdLib.ArrayLike[scala.Double] = js.native
  var count: scala.Double = js.native
  var dynamic: scala.Boolean = js.native
  var length: scala.Double = js.native
  var needsUpdate: scala.Boolean = js.native
  var stride: scala.Double = js.native
  var updateRange: threeLib.Anon_Count = js.native
  var version: scala.Double = js.native
  def copy(source: InterleavedBuffer): this.type = js.native
  def copyAt(index1: scala.Double, attribute: InterleavedBufferAttribute, index2: scala.Double): InterleavedBuffer = js.native
  def set(value: stdLib.ArrayLike[scala.Double], index: scala.Double): InterleavedBuffer = js.native
  def setArray(): scala.Unit = js.native
  def setArray(array: stdLib.ArrayBufferView): scala.Unit = js.native
  def setDynamic(dynamic: scala.Boolean): InterleavedBuffer = js.native
}

