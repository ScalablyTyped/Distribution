package typings.webpackDashSources.webpackDashSourcesMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.webpackDashSources.Anon_Columns
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "LineToLineMappedSource")
@js.native
class LineToLineMappedSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String, originalSource: String) = this()
  var _name: String = js.native
  var _originalSource: String = js.native
  var _value: String = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

