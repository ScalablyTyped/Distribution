package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "InstancedMesh")
@js.native
class InstancedMesh protected ()
  extends typings.three.instancedMeshMod.InstancedMesh {
  def this(
    geometry: typings.three.bufferGeometryMod.BufferGeometry,
    material: js.Array[typings.three.materialMod.Material],
    count: Double
  ) = this()
  def this(
    geometry: typings.three.bufferGeometryMod.BufferGeometry,
    material: typings.three.materialMod.Material,
    count: Double
  ) = this()
  def this(
    geometry: typings.three.geometryMod.Geometry,
    material: js.Array[typings.three.materialMod.Material],
    count: Double
  ) = this()
  def this(
    geometry: typings.three.geometryMod.Geometry,
    material: typings.three.materialMod.Material,
    count: Double
  ) = this()
}

