package typings.webpackSources.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "CachedSource")
@js.native
class CachedSource protected () extends Source {
  def this(source: Source) = this()
  var _cachedMaps: StringDictionary[RawSourceMap] = js.native
  var _cachedSize: Double = js.native
  var _cachedSource: String = js.native
  var _source: Source = js.native
}

