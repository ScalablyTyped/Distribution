package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "OutlinePass")
@js.native
class OutlinePass protected ()
  extends threeLib.threeDashOutlinepassMod.OutlinePass {
  def this(resolution: threeLib.threeDashCoreMod.Vector2, scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, selectedObjects: js.Array[threeLib.threeDashCoreMod.Object3D]) = this()
}

/* static members */
@JSImport("three", "OutlinePass")
@js.native
object OutlinePass extends js.Object {
  var BlurDirectionX: threeLib.threeDashCoreMod.Vector2 = js.native
  var BlurDirectionY: threeLib.threeDashCoreMod.Vector2 = js.native
}

