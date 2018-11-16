package typings
package webpackDashSourcesLib.webpackDashSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ReplaceSource")
@js.native
class ReplaceSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(source: Source) = this()
  def this(source: Source, name: java.lang.String) = this()
  var _name: java.lang.String = js.native
  var _source: Source = js.native
  var replacements: js.Array[js.Array[_]] = js.native
  def _replaceString(str: java.lang.String): java.lang.String = js.native
  def _replacementToSourceNode(oldNode: sourceDashMapLib.sourceDashMapMod.SourceNode, newString: java.lang.String): java.lang.String | sourceDashMapLib.sourceDashMapMod.SourceNode = js.native
  def _sortReplacements(): scala.Unit = js.native
  def _splitSourceNode(node: java.lang.String, position: scala.Double): scala.Double = js.native
  def _splitSourceNode(
    node: sourceDashMapLib.sourceDashMapMod.SourceNode,
    position: js.Array[sourceDashMapLib.sourceDashMapMod.SourceNode]
  ): js.Array[sourceDashMapLib.sourceDashMapMod.SourceNode] = js.native
  def _splitString(str: java.lang.String, position: scala.Double): js.Array[java.lang.String] = js.native
  def insert(pos: scala.Double, newValue: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def map(options: webpackDashSourcesLib.Anon_Columns): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
  def replace(start: scala.Double, end: scala.Double, newValue: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def sourceAndMap(options: webpackDashSourcesLib.Anon_Columns): webpackDashSourcesLib.Anon_Source = js.native
}

