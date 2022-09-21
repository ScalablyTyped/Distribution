package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] protected ()
  extends typings.three.instancedMeshMod.InstancedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
  def this(geometry: TGeometry, material: Unit, count: Double) = this()
  def this(geometry: Unit, material: TMaterial, count: Double) = this()
  def this(geometry: Unit, material: Unit, count: Double) = this()
}
