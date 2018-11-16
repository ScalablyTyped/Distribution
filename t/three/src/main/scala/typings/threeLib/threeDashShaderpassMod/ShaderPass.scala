package typings
package threeLib.threeDashShaderpassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-shaderpass", "ShaderPass")
@js.native
class ShaderPass protected ()
  extends threeLib.threeDashEffectcomposerMod.Pass {
  def this(shader: threeLib.threeDashCoreMod.Shader) = this()
  def this(shader: threeLib.threeDashCoreMod.Shader, textureID: java.lang.String) = this()
  var camera: threeLib.threeDashCoreMod.OrthographicCamera = js.native
  var material: threeLib.threeDashCoreMod.ShaderMaterial = js.native
  var quad: threeLib.threeDashCoreMod.Mesh = js.native
  var scene: threeLib.threeDashCoreMod.Scene = js.native
  var textureID: java.lang.String = js.native
  var uniforms: ScalablyTyped.runtime.StringDictionary[threeLib.threeDashCoreMod.IUniform] = js.native
}

