package typings.three.buildThreeDotmoduleMod

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typings.three.srcThreeMod.InstancedMesh[TGeometry, TMaterial] {
  /**
    * Create a new instance of {@link InstancedMesh}
    * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}.
    * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
    * @param count The **maximum** number of instances of this Mesh. Expects a `Integer`
    */
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
  def this(geometry: TGeometry, material: Unit, count: Double) = this()
  def this(geometry: Unit, material: TMaterial, count: Double) = this()
  def this(geometry: Unit, material: Unit, count: Double) = this()
}
