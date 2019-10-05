package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/SkeletonHelper", JSImport.Namespace)
@js.native
object srcHelpersSkeletonHelperMod extends js.Object {
  @js.native
  class SkeletonHelper protected () extends LineSegments {
    def this(bone: Object3D) = this()
    var bones: js.Array[Bone] = js.native
    var root: Object3D = js.native
    def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
    def update(): Unit = js.native
  }
  
}

