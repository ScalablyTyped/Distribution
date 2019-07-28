package typings.webpackDashSources.webpackDashSourcesMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.cryptoMod.Hash
import typings.sourceDashListDashMap.sourceDashListDashMapMod.SourceListMap
import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.sourceDashMap.sourceDashMapMod.SourceNode
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "CachedSource")
@js.native
class CachedSource protected () extends js.Object {
  def this(source: Source) = this()
  var _cachedMaps: StringDictionary[RawSourceMap] = js.native
  var _cachedSize: Double = js.native
  var _cachedSource: String = js.native
  var _source: Source = js.native
  def listMap(options: js.Any): SourceListMap = js.native
  def map(options: js.Any): RawSourceMap = js.native
  def node(options: js.Any): SourceNode = js.native
  def size(): Double = js.native
  def source(): String = js.native
  def sourceAndMap(options: js.Any): Anon_Map = js.native
  def updateHash(hash: Hash): Unit = js.native
}

