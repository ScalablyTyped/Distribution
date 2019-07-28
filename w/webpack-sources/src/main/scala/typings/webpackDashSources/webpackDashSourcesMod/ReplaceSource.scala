package typings.webpackDashSources.webpackDashSourcesMod

import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.sourceDashMap.sourceDashMapMod.SourceNode
import typings.webpackDashSources.Anon_Columns
import typings.webpackDashSources.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ReplaceSource")
@js.native
class ReplaceSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(source: Source) = this()
  def this(source: Source, name: String) = this()
  var _name: String = js.native
  var _source: Source = js.native
  var replacements: js.Array[js.Array[_]] = js.native
  def _replaceString(str: String): String = js.native
  def _replacementToSourceNode(oldNode: SourceNode, newString: String): String | SourceNode = js.native
  def _sortReplacements(): Unit = js.native
  def _splitSourceNode(node: String, position: Double): Double = js.native
  def _splitSourceNode(node: SourceNode, position: js.Array[SourceNode]): js.Array[SourceNode] = js.native
  def _splitString(str: String, position: Double): js.Array[String] = js.native
  def insert(pos: Double, newValue: String): Unit = js.native
  /* CompleteClass */
  override def map(options: Anon_Columns): RawSourceMap = js.native
  def replace(start: Double, end: Double, newValue: String): Unit = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Anon_Columns): Anon_Map = js.native
}

