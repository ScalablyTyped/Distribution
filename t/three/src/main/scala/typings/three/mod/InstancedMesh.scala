package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "InstancedMesh")
@js.native
class InstancedMesh[TGeometry /* <: typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] protected ()
  extends typings.three.instancedMeshMod.InstancedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
}

