package typings
package threeLib.threeDashMaskpassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-maskpass", "MaskPass")
@js.native
class MaskPass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  var camera: threeLib.threeDashCoreMod.Camera = js.native
  @JSName("clear")
  var clear_MaskPass: threeLib.threeLibNumbers.`true` = js.native
  var inverse: scala.Boolean = js.native
  @JSName("needsSwap")
  var needsSwap_MaskPass: threeLib.threeLibNumbers.`false` = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
}

