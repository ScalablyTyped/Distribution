package typings.three

import typings.three.shaderMaterialMod.ShaderMaterial
import typings.three.shaderMaterialMod.ShaderMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/materials/RawShaderMaterial", JSImport.Namespace)
@js.native
object rawShaderMaterialMod extends js.Object {
  
  @js.native
  class RawShaderMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
}
