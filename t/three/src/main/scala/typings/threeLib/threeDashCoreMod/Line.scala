package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Line")
@js.native
class Line () extends Object3D {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Geometry) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
  def this(geometry: BufferGeometry, material: Material) = this()
  def this(geometry: Geometry, material: js.Array[Material]) = this()
  def this(geometry: Geometry, material: Material) = this()
  def this(geometry: BufferGeometry, material: js.Array[Material], mode: scala.Double) = this()
  def this(geometry: BufferGeometry, material: Material, mode: scala.Double) = this()
  def this(geometry: Geometry, material: js.Array[Material], mode: scala.Double) = this()
  def this(geometry: Geometry, material: Material, mode: scala.Double) = this()
  var geometry: Geometry | BufferGeometry = js.native
  var isLine: threeLib.threeLibNumbers.`true` = js.native
  var material: Material | js.Array[Material] = js.native
  @JSName("type")
  var type_Line: threeLib.threeLibStrings.Line = js.native
  def computeLineDistances(): this.type = js.native
}

