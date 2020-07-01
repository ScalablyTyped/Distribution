package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapResult extends js.Object {
  var map: RawSourceMap | Null
  var source: String
}

object SourceAndMapResult {
  @scala.inline
  def apply(source: String, map: RawSourceMap = null): SourceAndMapResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndMapResult]
  }
}

