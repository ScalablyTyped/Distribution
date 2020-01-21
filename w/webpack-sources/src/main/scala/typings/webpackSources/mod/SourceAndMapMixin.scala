package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.AnonColumns
import typings.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapMixin extends js.Object {
  def map(options: AnonColumns): RawSourceMap
  def sourceAndMap(options: AnonColumns): AnonMap
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: AnonColumns => RawSourceMap, sourceAndMap: AnonColumns => AnonMap): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), sourceAndMap = js.Any.fromFunction1(sourceAndMap))
  
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

