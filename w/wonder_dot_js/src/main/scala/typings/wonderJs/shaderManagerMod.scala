package typings.wonderJs

import typings.wonderJs.materialMod.Material
import typings.wonderJs.quadCommandMod.QuadCommand
import typings.wonderJs.shaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/ShaderManager", JSImport.Namespace)
@js.native
object shaderManagerMod extends js.Object {
  @js.native
  class ShaderManager protected () extends js.Object {
    def this(material: Material) = this()
    val shader: Shader = js.native
    def dispose(): Unit = js.native
    def init(): Unit = js.native
    def setShader(shader: Shader): Unit = js.native
    def update(quadCmd: QuadCommand): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ShaderManager extends js.Object {
    def create(material: Material): ShaderManager = js.native
  }
  
}

