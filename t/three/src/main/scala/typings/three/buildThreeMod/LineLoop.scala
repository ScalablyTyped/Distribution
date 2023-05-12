package typings.three.buildThreeMod

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "LineLoop")
@js.native
/**
  * Create a new instance of {@link LineLoop}
  * @param geometry  List of vertices representing points on the line loop. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
  * @param material Material for the line. Default {@link THREE.LineBasicMaterial | `new THREE.LineBasicMaterial()`}.
  */
open class LineLoop[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] ()
  extends typings.three.srcThreeMod.LineLoop[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
}
