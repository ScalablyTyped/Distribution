package typings.three.mod

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
  extends typings.three.pointsMod.Points {
  def this(geometry: typings.three.bufferGeometryMod.BufferGeometry) = this()
  def this(geometry: typings.three.geometryMod.Geometry) = this()
  def this(
    geometry: typings.three.bufferGeometryMod.BufferGeometry,
    material: js.Array[typings.three.materialMod.Material]
  ) = this()
  def this(
    geometry: typings.three.bufferGeometryMod.BufferGeometry,
    material: typings.three.materialMod.Material
  ) = this()
  def this(
    geometry: typings.three.geometryMod.Geometry,
    material: js.Array[typings.three.materialMod.Material]
  ) = this()
  def this(geometry: typings.three.geometryMod.Geometry, material: typings.three.materialMod.Material) = this()
}

