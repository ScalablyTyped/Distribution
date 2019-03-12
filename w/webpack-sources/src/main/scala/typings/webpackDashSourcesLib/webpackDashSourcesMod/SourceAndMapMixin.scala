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
    map: webpackDashSourcesLib.Anon_Columns => sourceDashMapLib.sourceDashMapMod.RawSourceMap,
    sourceAndMap: webpackDashSourcesLib.Anon_Columns => webpackDashSourcesLib.Anon_Map
  ): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), sourceAndMap = js.Any.fromFunction1(sourceAndMap))
  
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

