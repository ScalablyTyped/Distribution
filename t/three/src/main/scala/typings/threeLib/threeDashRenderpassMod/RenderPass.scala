package typings
package threeLib.threeDashRenderpassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-renderpass", "RenderPass")
@js.native
class RenderPass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: java.lang.String) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: threeLib.threeDashCoreMod.Color) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: java.lang.String) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: threeLib.threeDashCoreMod.Color) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: java.lang.String, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: scala.Double, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: scala.Null, clearColor: threeLib.threeDashCoreMod.Color, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: java.lang.String, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: scala.Double, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, overrideMaterial: threeLib.threeDashCoreMod.Material, clearColor: threeLib.threeDashCoreMod.Color, clearAlpha: scala.Double) = this()
  var camera: threeLib.threeDashCoreMod.Camera = js.native
  var clearAlpha: js.UndefOr[scala.Double] = js.native
  var clearColor: js.UndefOr[threeLib.threeDashCoreMod.Color | java.lang.String | scala.Double] = js.native
  var clearDepth: threeLib.threeLibNumbers.`false` = js.native
  @JSName("needsSwap")
  var needsSwap_RenderPass: threeLib.threeLibNumbers.`false` = js.native
  var overrideMaterial: js.UndefOr[threeLib.threeDashCoreMod.Material | scala.Null] = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
}

