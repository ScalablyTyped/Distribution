package typings.webpackSources.mod

import typings.sourceListMap.mod.SourceListMap
import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ReplaceSource")
@js.native
class ReplaceSource protected ()
  extends Source
     with SourceAndMapMixin {
  /**
    * The ReplaceSource supports "identity" mappings for child source.
    * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
    */
  def this(source: Source) = this()
  def this(source: Source, name: String) = this()
  var replacements: js.Array[Replacement] = js.native
  /**
    * Inserts the insertion before char pos (0-indexed).
    */
  def insert(pos: Double, newValue: String, name: String): Unit = js.native
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
    * Get decorated Source.
    */
  def original(): Source = js.native
  /**
    * Replaces chars from start (0-indexed, inclusive) to end (0-indexed, inclusive) with replacement.
    */
  def replace(start: Double, end: Double, newValue: String, name: String): Unit = js.native
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  /* InferMemberOverrides */
  override def sourceAndMap(): SourceAndMapResult = js.native
  /* InferMemberOverrides */
  override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
}

