package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Mesh")
@js.native
class Mesh ()
  extends typings.three.meshMod.Mesh {
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

