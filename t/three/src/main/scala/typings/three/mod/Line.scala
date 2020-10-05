package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Line")
@js.native
class Line[TGeometry /* <: typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] ()
  extends typings.three.lineMod.Line[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
  def this(geometry: TGeometry, material: TMaterial, mode: Double) = this()
  def this(geometry: TGeometry, material: js.UndefOr[scala.Nothing], mode: Double) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial, mode: Double) = this()
  def this(geometry: js.UndefOr[scala.Nothing], material: js.UndefOr[scala.Nothing], mode: Double) = this()
}

