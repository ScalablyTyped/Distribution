package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/FaceNormalsHelper", JSImport.Namespace)
@js.native
object srcHelpersFaceNormalsHelperMod extends js.Object {
  @js.native
  class FaceNormalsHelper protected () extends LineSegments {
    def this(`object`: Object3D) = this()
    def this(`object`: Object3D, size: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double) = this()
    def this(`object`: Object3D, size: Double, hex: Double, linewidth: Double) = this()
    var `object`: Object3D = js.native
    var size: Double = js.native
    def update(): Unit = js.native
    def update(`object`: Object3D): Unit = js.native
  }
  
}

