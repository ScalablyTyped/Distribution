package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "LineLoop")
@js.native
class LineLoop[TGeometry /* <: typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] ()
  extends typings.three.lineLoopMod.LineLoop[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
}

