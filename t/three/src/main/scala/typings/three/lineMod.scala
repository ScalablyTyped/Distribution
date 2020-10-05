package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import typings.three.threeStrings.LineLoop
import typings.three.threeStrings.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/Line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  @js.native
  class Line[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
    def this(geometry: TGeometry, material: TMaterial, mode: Double) = this()
    def this(geometry: TGeometry, material: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial, mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: js.UndefOr[scala.Nothing], mode: Double) = this()
    var geometry: TGeometry = js.native
    val isLine: `true` = js.native
    var material: TMaterial = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    @JSName("type")
    var type_Line: typings.three.threeStrings.Line | LineLoop | LineSegments = js.native
    def computeLineDistances(): this.type = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

