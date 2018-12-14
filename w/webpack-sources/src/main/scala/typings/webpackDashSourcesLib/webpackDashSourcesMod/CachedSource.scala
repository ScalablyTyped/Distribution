package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "CachedSource")
@js.native
class CachedSource protected () extends js.Object {
  def this(source: Source) = this()
  var _cachedMaps: org.scalablytyped.runtime.StringDictionary[sourceDashMapLib.sourceDashMapMod.RawSourceMap] = js.native
  var _cachedSize: scala.Double = js.native
  var _cachedSource: java.lang.String = js.native
  var _source: Source = js.native
  def listMap(options: js.Any): sourceDashListDashMapLib.sourceDashListDashMapMod.SourceListMap = js.native
  def map(options: js.Any): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  def node(options: js.Any): sourceDashMapLib.sourceDashMapMod.SourceNode = js.native
  def size(): scala.Double = js.native
  def source(): java.lang.String = js.native
  def sourceAndMap(options: js.Any): webpackDashSourcesLib.Anon_Source = js.native
  def updateHash(hash: nodeLib.cryptoMod.Hash): scala.Unit = js.native
}

