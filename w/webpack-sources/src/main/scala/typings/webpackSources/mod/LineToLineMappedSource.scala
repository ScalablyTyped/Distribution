package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.anon.Columns
import typings.webpackSources.anon.Map
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
  override def map(options: Columns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: Columns): Map = js.native
}

