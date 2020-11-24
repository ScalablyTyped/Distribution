package typings.webpackSources.replaceSourceMod

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.libMod.MapOptions
import typings.webpackSources.libMod.Replacement
import typings.webpackSources.libMod.SourceAndMapMixin
import typings.webpackSources.libMod.SourceAndMapResult
import typings.webpackSources.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Decorates a Source with replacements and insertions of source code.
  *
  */
@js.native
trait ReplaceSource
  extends Source
     with SourceAndMapMixin {
  
  /**
    * Inserts the insertion before char pos (0-indexed).
    */
  def insert(pos: Double, newValue: String): Unit = js.native
  def insert(pos: Double, newValue: String, name: String): Unit = js.native
  
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
  def original(): typings.webpackSources.sourceMod.^ = js.native
  
  /**
    * Replaces chars from start (0-indexed, inclusive) to end (0-indexed, inclusive) with replacement.
    */
  def replace(start: Double, end: Double, newValue: String): Unit = js.native
  def replace(start: Double, end: Double, newValue: String, name: String): Unit = js.native
  
  var replacements: js.Array[Replacement] = js.native
  
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  /* InferMemberOverrides */
  override def sourceAndMap(): SourceAndMapResult = js.native
  /* InferMemberOverrides */
  override def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
}
