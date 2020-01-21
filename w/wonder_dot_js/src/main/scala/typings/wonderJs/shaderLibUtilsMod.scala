package typings.wonderJs

import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.shaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/ShaderLibUtils", JSImport.Namespace)
@js.native
object shaderLibUtilsMod extends js.Object {
  @js.native
  class ShaderLibUtils () extends js.Object
  
  /* static members */
  @js.native
  object ShaderLibUtils extends js.Object {
    def addVerticeShaderLib(geometry: Geometry, shader: Shader): Unit = js.native
  }
  
}

