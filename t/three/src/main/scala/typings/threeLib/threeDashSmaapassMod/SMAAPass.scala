package typings
package threeLib.threeDashSmaapassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-smaapass", "SMAAPass")
@js.native
class SMAAPass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(width: scala.Double, height: scala.Double) = this()
  var areaTexture: threeLib.threeDashCoreMod.Texture = js.native
  var camera: threeLib.threeDashCoreMod.OrthographicCamera = js.native
  var edgesRT: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  var materialBlend: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var materialEdges: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var materialWeights: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  @JSName("needsSwap")
  var needsSwap_SMAAPass: threeLib.threeLibNumbers.`false` = js.native
  var quad: threeLib.threeDashCoreMod.Mesh = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
  var searchTexture: threeLib.threeDashCoreMod.Texture = js.native
  var uniformsBlend: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var uniformsEdges: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var uniformsWeights: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var weightsRT: threeLib.threeDashCoreMod.WebGLRenderTarget = js.native
  def getAreaTexture(): java.lang.String = js.native
  def getSearchTexture(): java.lang.String = js.native
}

