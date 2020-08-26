package typings.three.shaderLibMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  var fragmentShader: String = js.native
  var uniforms: StringDictionary[IUniform] = js.native
  var vertexShader: String = js.native
}

object Shader {
  @scala.inline
  def apply(fragmentShader: String, uniforms: StringDictionary[IUniform], vertexShader: String): Shader = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shader]
  }
  @scala.inline
  implicit class ShaderOps[Self <: Shader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniforms(value: StringDictionary[IUniform]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
  }
  
}

