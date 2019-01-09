package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "PrefixSource")
@js.native
class PrefixSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(prefix: java.lang.String, source: java.lang.String) = this()
  def this(prefix: java.lang.String, source: Source) = this()
  def this(prefix: Source, source: java.lang.String) = this()
  def this(prefix: Source, source: Source) = this()
  var _prefix: Source | java.lang.String = js.native
  var _source: Source | java.lang.String = js.native
  /* CompleteClass */
  override def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Map = js.native
}

