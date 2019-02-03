package typings
package threeLib.threeDashOutlinepassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-outlinepass", "OutlinePass")
@js.native
class OutlinePass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(resolution: threeLib.threeDashCoreMod.Vector2, scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, selectedObjects: js.Array[threeLib.threeDashCoreMod.Object3D]) = this()
  var copyUniforms: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var downSampleRatio: scala.Double = js.native
  var edgeDetectionMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var edgeGlow: scala.Double = js.native
  var edgeStrength: scala.Double = js.native
  var edgeThickness: scala.Double = js.native
  var hiddenEdgeColor: threeLib.threeDashCoreMod.Color = js.native
  var maskBufferMaterial: threeLib.threeDashCoreMod.MeshBasicMaterial = js.native
  var materialCopy: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var oldClearColor: threeLib.threeDashCoreMod.Color = js.native
  var overlayMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var prepareMaskMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var pulsePeriod: scala.Double = js.native
  var renderCamera: threeLib.threeDashCoreMod.Camera = js.native
  var renderScene: threeLib.threeDashCoreMod.Scene = js.native
  var renderTargetBlurBuffer1: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTargetBlurBuffer2: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTargetDepthBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var renderTargetMaskDownSampleBuffer: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var resolution: threeLib.threeDashCoreMod.Vector2 = js.native
  var selectedObjects: js.Array[threeLib.threeDashCoreMod.Object3D] = js.native
  var separableBlurMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var tempPulseColor1: threeLib.threeDashCoreMod.Color = js.native
  var tempPulseColor2: threeLib.threeDashCoreMod.Color = js.native
  var textureMatrix: threeLib.threeDashCoreMod.Matrix4 = js.native
  var usePatternTexture: scala.Boolean = js.native
  var visibleEdgeColor: threeLib.threeDashCoreMod.Color = js.native
  def changeVisibilityOfNonSelectedObjects(bVisible: scala.Boolean): scala.Unit = js.native
  def changeVisibilityOfSelectedObjects(bVisible: scala.Boolean): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def updateTextureMatrix(): scala.Unit = js.native
}

/* static members */
@JSImport("three/three-outlinepass", "OutlinePass")
@js.native
object OutlinePass extends js.Object {
  var BlurDirectionX: threeLib.threeDashCoreMod.Vector2 = js.native
  var BlurDirectionY: threeLib.threeDashCoreMod.Vector2 = js.native
}

