package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typings.three.srcThreeMod.InstancedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry, material: TMaterial, count: Double) = this()
  def this(geometry: TGeometry, material: Unit, count: Double) = this()
  def this(geometry: Unit, material: TMaterial, count: Double) = this()
  def this(geometry: Unit, material: Unit, count: Double) = this()
}
