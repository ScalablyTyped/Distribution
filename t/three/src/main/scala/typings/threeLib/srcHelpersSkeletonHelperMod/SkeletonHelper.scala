package typings
package threeLib.srcHelpersSkeletonHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/SkeletonHelper", "SkeletonHelper")
@js.native
class SkeletonHelper protected ()
  extends threeLib.srcObjectsLineSegmentsMod.LineSegments {
  def this(bone: threeLib.srcCoreObject3DMod.Object3D) = this()
  var bones: js.Array[threeLib.srcObjectsBoneMod.Bone] = js.native
  var root: threeLib.srcCoreObject3DMod.Object3D = js.native
  def getBoneList(`object`: threeLib.srcCoreObject3DMod.Object3D): js.Array[threeLib.srcObjectsBoneMod.Bone] = js.native
  def update(): scala.Unit = js.native
}

