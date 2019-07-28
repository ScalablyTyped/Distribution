package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FogColor extends js.Object {
  var fogColor: IUniform
  var fogDensity: IUniform
  var fogFar: IUniform
  var fogNear: IUniform
}

object Anon_FogColor {
  @scala.inline
  def apply(fogColor: IUniform, fogDensity: IUniform, fogFar: IUniform, fogNear: IUniform): Anon_FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor, fogDensity = fogDensity, fogFar = fogFar, fogNear = fogNear)
  
    __obj.asInstanceOf[Anon_FogColor]
  }
}

