package typings
package webpackDashSourcesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: sourceDashMapLib.sourceDashMapMod.RawSourceMap
  var source: java.lang.String
}

object Anon_Map {
  @scala.inline
  def apply(map: sourceDashMapLib.sourceDashMapMod.RawSourceMap, source: java.lang.String): Anon_Map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Map]
  }
}

