package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.anon.Columns
import typings.webpackSources.anon.Map
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
  override def map(options: Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Columns): Map = js.native
}

