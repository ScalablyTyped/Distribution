package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ConcatSource")
@js.native
class ConcatSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(args: (java.lang.String | Source)*) = this()
  var children: js.Array[java.lang.String | Source] = js.native
  def add(item: java.lang.String): scala.Unit = js.native
  def add(item: Source): scala.Unit = js.native
  /* CompleteClass */
  override def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Source = js.native
}

