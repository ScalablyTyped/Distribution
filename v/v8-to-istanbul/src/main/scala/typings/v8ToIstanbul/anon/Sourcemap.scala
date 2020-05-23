package typings.v8ToIstanbul.anon

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sourcemap extends js.Object {
  var sourcemap: RawSourceMap
}

object Sourcemap {
  @scala.inline
  def apply(sourcemap: RawSourceMap): Sourcemap = {
    val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sourcemap]
  }
}

