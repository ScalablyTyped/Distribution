package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TexParams extends js.Object {
  var offset: threeLib.threeDashCoreMod.Vector2
  var scale: threeLib.threeDashCoreMod.Vector2
  var url: java.lang.String
}

object TexParams {
  @scala.inline
  def apply(
    offset: threeLib.threeDashCoreMod.Vector2,
    scale: threeLib.threeDashCoreMod.Vector2,
    url: java.lang.String
  ): TexParams = {
    val __obj = js.Dynamic.literal(offset = offset, scale = scale, url = url)
  
    __obj.asInstanceOf[TexParams]
  }
}

