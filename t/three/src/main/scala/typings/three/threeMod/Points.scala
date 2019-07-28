package typings.three.threeMod

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
  extends typings.three.srcObjectsPointsMod.Points {
  def this(geometry: typings.three.srcCoreBufferGeometryMod.BufferGeometry) = this()
  def this(geometry: typings.three.srcCoreGeometryMod.Geometry) = this()
  def this(
    geometry: typings.three.srcCoreBufferGeometryMod.BufferGeometry,
    material: js.Array[typings.three.srcMaterialsMaterialMod.Material]
  ) = this()
  def this(
    geometry: typings.three.srcCoreBufferGeometryMod.BufferGeometry,
    material: typings.three.srcMaterialsMaterialMod.Material
  ) = this()
  def this(
    geometry: typings.three.srcCoreGeometryMod.Geometry,
    material: js.Array[typings.three.srcMaterialsMaterialMod.Material]
  ) = this()
  def this(
    geometry: typings.three.srcCoreGeometryMod.Geometry,
    material: typings.three.srcMaterialsMaterialMod.Material
  ) = this()
}

