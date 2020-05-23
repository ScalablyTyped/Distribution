package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpMap extends js.Object {
  var bumpMap: IUniform
  var bumpScale: IUniform
}

object BumpMap {
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpMap]
  }
}

