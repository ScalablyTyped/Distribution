package typings.webpackSources.mod

import typings.sourceListMap.mod.SourceListMap
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  /**
    * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
    */
  def this(sourceCode: String, name: String) = this()
  def listMap(options: MapOptions): SourceListMap = js.native
  /**
    * Returns the SourceMap of the represented source code as JSON.
    * May return `null` if no SourceMap is available.
    */
  /* InferMemberOverrides */
  override def map(options: MapOptions): RawSourceMap | Null = js.native
  def source(): String = js.native
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  /* InferMemberOverrides */
  override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
}

