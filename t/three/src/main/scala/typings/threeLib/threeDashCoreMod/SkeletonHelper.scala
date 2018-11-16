package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "SkeletonHelper")
@js.native
class SkeletonHelper protected () extends LineSegments {
  def this(bone: Object3D) = this()
  var bones: js.Array[Bone] = js.native
  var root: Object3D = js.native
  def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
  def update(): scala.Unit = js.native
}

