package typings.three.buildThreeDotmoduleDotminMod

import typings.three.srcCoreBufferGeometryMod.NormalOrGLBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "Points")
@js.native
/**
  * Create a new instance of {@link Points}
  * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
  * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.PointsMaterial | `new THREE.PointsMaterial()`}.
  */
open class Points[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalOrGLBufferAttributes] */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] ()
  extends typings.three.srcThreeMod.Points[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
}
