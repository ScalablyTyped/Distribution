package typings.webpackSources.anon

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: RawSourceMap
  var source: String
}

object Map {
  @scala.inline
  def apply(map: RawSourceMap, source: String): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

