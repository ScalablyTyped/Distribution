package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/BoxHelper", JSImport.Namespace)
@js.native
object boxHelperMod extends js.Object {
  @js.native
  class BoxHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, color: String) = this()
    def this(`object`: Object3D, color: Double) = this()
    def this(`object`: Object3D, color: Color) = this()
    def setFromObject(`object`: Object3D): this.type = js.native
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
  
}

