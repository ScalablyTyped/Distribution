package typings
package threeLib.srcObjectsLineLoopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineLoop", "LineLoop")
@js.native
class LineLoop ()
  extends threeLib.srcObjectsLineMod.Line {
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: js.Array[threeLib.srcMaterialsMaterialMod.Material]) = this()
  def this(geometry: threeLib.srcCoreGeometryMod.Geometry, material: threeLib.srcMaterialsMaterialMod.Material) = this()
  var isLineLoop: threeLib.threeLibNumbers.`true` = js.native
  @JSName("type")
  var type_LineLoop: threeLib.threeLibStrings.LineLoop = js.native
}

