package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.SkinnedMesh")
@js.native
open class SkinnedMesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] ()
  extends typings.three.mod.SkinnedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
  def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
  def this(geometry: TGeometry, material: Unit, useVertexTexture: Boolean) = this()
  def this(geometry: Unit, material: TMaterial, useVertexTexture: Boolean) = this()
  def this(geometry: Unit, material: Unit, useVertexTexture: Boolean) = this()
}
