package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceNode
import typings.webpackSources.anon.Columns
import typings.webpackSources.anon.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String) = this()
  var _name: String = js.native
  var _value: String = js.native
  /* CompleteClass */
  override def map(options: Columns): RawSourceMap = js.native
  def node(options: Columns): SourceNode = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Columns): Map = js.native
}

