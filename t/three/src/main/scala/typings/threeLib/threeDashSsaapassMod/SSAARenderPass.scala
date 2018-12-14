package typings
package threeLib.threeDashSsaapassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-ssaapass", "SSAARenderPass")
@js.native
class SSAARenderPass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: java.lang.String) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: threeLib.threeDashCoreMod.Color) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: java.lang.String, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: scala.Double, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: threeLib.threeDashCoreMod.Color, clearAlpha: scala.Double) = this()
  var camera: threeLib.threeDashCoreMod.Camera = js.native
  var camera2: threeLib.threeDashCoreMod.OrthographicCamera = js.native
  var clearAlpha: scala.Double = js.native
  var clearColor: threeLib.threeDashCoreMod.Color | java.lang.String | scala.Double = js.native
  var copyMaterial: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var copyUniforms: org.scalablytyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
  var quad2: threeLib.threeDashCoreMod.Mesh = js.native
  var sampleLevel: scala.Double = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
  var scene2: threeLib.threeDashCoreMod.Scene = js.native
  var unbiased: scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
}

@JSImport("three/three-ssaapass", "SSAARenderPass")
@js.native
object SSAARenderPass extends js.Object {
  val JitterVectors: js.Array[js.Array[js.Array[scala.Double]]] = js.native
}

