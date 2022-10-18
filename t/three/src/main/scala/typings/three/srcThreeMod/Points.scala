package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Points")
@js.native
/**
  * @param geometry An instance of BufferGeometry.
  * @param material An instance of Material (optional).
  */
open class Points[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] ()
  extends typings.three.srcObjectsPointsMod.Points[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
}
