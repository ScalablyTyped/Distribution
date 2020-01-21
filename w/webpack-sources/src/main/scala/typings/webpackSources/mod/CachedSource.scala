package typings.webpackSources.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.cryptoMod.Hash
import typings.sourceListMap.mod.SourceListMap
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceNode
import typings.webpackSources.AnonMap
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
  def sourceAndMap(options: js.Any): AnonMap = js.native
  def updateHash(hash: Hash): Unit = js.native
}

