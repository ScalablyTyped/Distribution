package typings.v8ToIstanbul

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourcemap extends js.Object {
  var sourcemap: RawSourceMap
}

object AnonSourcemap {
  @scala.inline
  def apply(sourcemap: RawSourceMap): AnonSourcemap = {
    val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSourcemap]
  }
}

