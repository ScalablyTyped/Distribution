package typings
package threeLib.threeDashUnrealbloompassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-unrealbloompass", "UnrealBloomPass")
@js.native
class UnrealBloomPass ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(resolution: threeLib.threeDashCoreMod.Vector2) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double, radius: scala.Double) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double, radius: scala.Double, threshold: scala.Double) = this()
  var bloomTintColors: js.Array[threeLib.threeDashCoreMod.Color] = js.native
  var camera: threeLib.threeDashCoreMod.OrthographicCamera = js.native
  var compositeMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var copyUniforms: ScalablyTyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var highPassUniforms: ScalablyTyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var materialCopy: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var materialHighPassFilter: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var nMips: scala.Double = js.native
  @JSName("needsSwap")
  var needsSwap_UnrealBloomPass: threeLib.threeLibNumbers.`false` = js.native
  var oldClearAlpha: scala.Double = js.native
  var oldClearColor: threeLib.threeDashCoreMod.Color = js.native
  var quad: threeLib.threeDashCoreMod.Mesh = js.native
  var radius: scala.Double = js.native
  var renderTargetBright: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTargetsHorizontal: js.Array[threeLib.threeDashCoreMod.WebGLRenderTarget] = js.native
  var renderTargetsVertical: js.Array[threeLib.threeDashCoreMod.WebGLRenderTarget] = js.native
  var resolution: threeLib.threeDashCoreMod.Vector2 = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
  var separableBlurMaterials: js.Array[threeLib.threeDashCoreMod.ShaderMaterial] = js.native
  var strength: scala.Double = js.native
  var threshold: scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def getCompositeMaterial(): threeLib.threeDashCoreMod.ShaderMaterial = js.native
  def getSeparableBlurMaterial(): threeLib.threeDashCoreMod.ShaderMaterial = js.native
}

@JSImport("three/three-unrealbloompass", "UnrealBloomPass")
@js.native
object UnrealBloomPass extends js.Object {
  var BlurDirectionX: threeLib.threeDashCoreMod.Vector2 = js.native
  var BlurDirectionY: threeLib.threeDashCoreMod.Vector2 = js.native
}

