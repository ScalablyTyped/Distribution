package typings.three

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BumpMap extends js.Object {
  var bumpMap: IUniform
  var bumpScale: IUniform
}

object Anon_BumpMap {
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): Anon_BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap, bumpScale = bumpScale)
  
    __obj.asInstanceOf[Anon_BumpMap]
  }
}

