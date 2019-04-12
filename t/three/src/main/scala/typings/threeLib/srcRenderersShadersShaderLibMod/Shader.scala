package typings
package threeLib.srcRenderersShadersShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shader extends js.Object {
  var fragmentShader: java.lang.String
  var uniforms: org.scalablytyped.runtime.StringDictionary[threeLib.srcRenderersShadersUniformsLibMod.IUniform]
  var vertexShader: java.lang.String
}

object Shader {
  @scala.inline
  def apply(
    fragmentShader: java.lang.String,
    uniforms: org.scalablytyped.runtime.StringDictionary[threeLib.srcRenderersShadersUniformsLibMod.IUniform],
    vertexShader: java.lang.String
  ): Shader = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader, uniforms = uniforms, vertexShader = vertexShader)
  
    __obj.asInstanceOf[Shader]
  }
}

