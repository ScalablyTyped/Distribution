package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AoMap extends js.Object {
  var aoMap: IUniform
  var aoMapIntensity: IUniform
}

object Anon_AoMap {
  @scala.inline
  def apply(aoMap: IUniform, aoMapIntensity: IUniform): Anon_AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AoMap]
  }
}

