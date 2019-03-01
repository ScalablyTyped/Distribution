package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapMixin extends js.Object {
  def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap
  def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Map
}

object SourceAndMapMixin {
  @scala.inline
  def apply(
    map: js.Function1[webpackDashSourcesLib.Anon_Columns, sourceDashMapLib.sourceDashMapMod.RawSourceMap],
    sourceAndMap: js.Function1[webpackDashSourcesLib.Anon_Columns, webpackDashSourcesLib.Anon_Map]
  ): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("sourceAndMap")(sourceAndMap)
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

