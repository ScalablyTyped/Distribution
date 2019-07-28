package typings.webpackDashSources.webpackDashSourcesMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.webpackDashSources.Anon_Columns
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapMixin extends js.Object {
  def map(options: Anon_Columns): RawSourceMap
  def sourceAndMap(options: Anon_Columns): Anon_Map
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: Anon_Columns => RawSourceMap, sourceAndMap: Anon_Columns => Anon_Map): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), sourceAndMap = js.Any.fromFunction1(sourceAndMap))
  
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

