package typings.three

import typings.three.shaderMaterialMod.ShaderMaterial
import typings.three.shaderMaterialMod.ShaderMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/ShadowMaterial", JSImport.Namespace)
@js.native
object shadowMaterialMod extends js.Object {
  @js.native
  class ShadowMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
}

