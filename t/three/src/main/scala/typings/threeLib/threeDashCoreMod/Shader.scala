package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shader extends js.Object {
  var fragmentShader: java.lang.String
  var uniforms: org.scalablytyped.runtime.StringDictionary[IUniform]
  var vertexShader: java.lang.String
}

object Shader {
  @scala.inline
  def apply(
    fragmentShader: java.lang.String,
    uniforms: org.scalablytyped.runtime.StringDictionary[IUniform],
    vertexShader: java.lang.String
  ): Shader = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader, uniforms = uniforms, vertexShader = vertexShader)
  
    __obj.asInstanceOf[Shader]
  }
}

