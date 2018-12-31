package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Points")
@js.native
/**
  * @param geometry An instance of Geometry or BufferGeometry.
  * @param material An instance of Material (optional).
  */
class Points ()
  extends threeLib.threeDashCoreMod.Points {
  def this(geometry: threeLib.threeDashCoreMod.BufferGeometry) = this()
  def this(geometry: threeLib.threeDashCoreMod.Geometry) = this()
  def this(geometry: threeLib.threeDashCoreMod.BufferGeometry, material: js.Array[threeLib.threeDashCoreMod.Material]) = this()
  def this(geometry: threeLib.threeDashCoreMod.BufferGeometry, material: threeLib.threeDashCoreMod.Material) = this()
  def this(geometry: threeLib.threeDashCoreMod.Geometry, material: js.Array[threeLib.threeDashCoreMod.Material]) = this()
  def this(geometry: threeLib.threeDashCoreMod.Geometry, material: threeLib.threeDashCoreMod.Material) = this()
}

