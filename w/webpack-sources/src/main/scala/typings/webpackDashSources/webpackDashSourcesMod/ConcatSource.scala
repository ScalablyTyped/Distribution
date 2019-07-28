package typings.webpackDashSources.webpackDashSourcesMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.webpackDashSources.Anon_Columns
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ConcatSource")
@js.native
class ConcatSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(args: (String | Source)*) = this()
  var children: js.Array[String | Source] = js.native
  def add(item: String): Unit = js.native
  def add(item: Source): Unit = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

