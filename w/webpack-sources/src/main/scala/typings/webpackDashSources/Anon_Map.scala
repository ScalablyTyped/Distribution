package typings.webpackDashSources

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: RawSourceMap
  var source: String
}

object Anon_Map {
  @scala.inline
  def apply(map: RawSourceMap, source: String): Anon_Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Map]
  }
}

