package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "SourceMapSource")
@js.native
class SourceMapSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap) = this()
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.SourceMapGenerator) = this()
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap, originalSource: java.lang.String) = this()
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.SourceMapGenerator, originalSource: java.lang.String) = this()
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap, originalSource: java.lang.String, innerSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap) = this()
  def this(value: java.lang.String, name: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.SourceMapGenerator, originalSource: java.lang.String, innerSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap) = this()
  var _innerSourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  var _name: java.lang.String = js.native
  var _originalSource: java.lang.String = js.native
  var _sourceMap: sourceDashMapLib.sourceDashMapMod.SourceMapGenerator | sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  var _value: java.lang.String = js.native
  def listMap(options: webpackDashSourcesLib.Anon_Module): sourceDashListDashMapLib.sourceDashListDashMapMod.SourceListMap = js.native
  /* CompleteClass */
  override def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Source = js.native
}

