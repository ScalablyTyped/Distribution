package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: java.lang.String, name: java.lang.String) = this()
  var _name: java.lang.String = js.native
  var _value: java.lang.String = js.native
  /* CompleteClass */
  override def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  def node(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.SourceNode = js.native
  /* CompleteClass */
  override def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Map = js.native
}

