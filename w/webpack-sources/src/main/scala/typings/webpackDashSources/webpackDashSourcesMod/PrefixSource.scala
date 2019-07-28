package typings.webpackDashSources.webpackDashSourcesMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.webpackDashSources.Anon_Columns
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "PrefixSource")
@js.native
class PrefixSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(prefix: String, source: String) = this()
  def this(prefix: String, source: Source) = this()
  def this(prefix: Source, source: String) = this()
  def this(prefix: Source, source: Source) = this()
  var _prefix: Source | String = js.native
  var _source: Source | String = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

