package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.anon.Columns
import typings.webpackSources.anon.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapMixin extends js.Object {
  def map(options: Columns): RawSourceMap
  def sourceAndMap(options: Columns): Map
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: Columns => RawSourceMap, sourceAndMap: Columns => Map): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), sourceAndMap = js.Any.fromFunction1(sourceAndMap))
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

