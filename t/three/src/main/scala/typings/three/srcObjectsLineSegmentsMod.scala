package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineMod.Line
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/LineSegments", JSImport.Namespace)
@js.native
object srcObjectsLineSegmentsMod extends js.Object {
  @js.native
  class LineSegments () extends Line {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: BufferGeometry, material: Material, mode: Double) = this()
    def this(geometry: Geometry, material: js.Array[Material], mode: Double) = this()
    def this(geometry: Geometry, material: Material, mode: Double) = this()
    var isLineSegments: `true` = js.native
    @JSName("type")
    var type_LineSegments: typings.three.threeStrings.LineSegments = js.native
  }
  
  val LinePieces: Double = js.native
  val LineStrip: Double = js.native
}

