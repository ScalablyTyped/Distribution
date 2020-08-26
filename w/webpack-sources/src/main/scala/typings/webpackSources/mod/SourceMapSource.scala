package typings.webpackSources.mod

import typings.sourceListMap.mod.SourceListMap
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "SourceMapSource")
@js.native
class SourceMapSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(sourceCode: String, name: String, sourceMap: RawSourceMap) = this()
  def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator) = this()
  def this(sourceCode: String, name: String, sourceMap: RawSourceMap, originalSource: String) = this()
  def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator, originalSource: String) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: String
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: String
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: String
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: String
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: RawSourceMap
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: js.UndefOr[scala.Nothing],
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: String,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: js.UndefOr[scala.Nothing],
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: String,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: RawSourceMap,
    originalSource: String,
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: js.UndefOr[scala.Nothing],
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: String,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: js.UndefOr[scala.Nothing],
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: js.UndefOr[scala.Nothing],
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: String,
    removeOriginalSource: Boolean
  ) = this()
  def this(
    sourceCode: String,
    name: String,
    sourceMap: SourceMapGenerator,
    originalSource: String,
    innerSourceMap: RawSourceMap,
    removeOriginalSource: Boolean
  ) = this()
  def listMap(options: MapOptions): SourceListMap = js.native
  /**
    * Returns the SourceMap of the represented source code as JSON.
    * May return `null` if no SourceMap is available.
    */
  /* InferMemberOverrides */
  override def map(): RawSourceMap | Null = js.native
  /* InferMemberOverrides */
  override def map(options: MapOptions): RawSourceMap | Null = js.native
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  /* InferMemberOverrides */
  override def sourceAndMap(): SourceAndMapResult = js.native
  /* InferMemberOverrides */
  override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
}

