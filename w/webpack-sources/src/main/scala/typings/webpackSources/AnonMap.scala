package typings.webpackSources

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: RawSourceMap
  var source: String
}

object AnonMap {
  @scala.inline
  def apply(map: RawSourceMap, source: String): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMap]
  }
}

