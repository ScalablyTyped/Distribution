package typings.three.shaderLibMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shader extends js.Object {
  var fragmentShader: String
  var uniforms: StringDictionary[IUniform]
  var vertexShader: String
}

object Shader {
  @scala.inline
  def apply(fragmentShader: String, uniforms: StringDictionary[IUniform], vertexShader: String): Shader = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shader]
  }
}

