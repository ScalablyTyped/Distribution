package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "SkinnedMesh")
@js.native
open class SkinnedMesh[TGeometry /* <: typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] ()
  extends typings.three.skinnedMeshMod.SkinnedMesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
  def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
  def this(geometry: TGeometry, material: Unit, useVertexTexture: Boolean) = this()
  def this(geometry: Unit, material: TMaterial, useVertexTexture: Boolean) = this()
  def this(geometry: Unit, material: Unit, useVertexTexture: Boolean) = this()
}
