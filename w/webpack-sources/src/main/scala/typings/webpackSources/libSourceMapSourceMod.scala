package typings.webpackSources

import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapGenerator
import typings.webpackSources.libMod.MapOptions
import typings.webpackSources.libMod.SourceAndMapMixin
import typings.webpackSources.libMod.SourceAndMapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSourceMapSourceMod {
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @JSImport("webpack-sources/lib/SourceMapSource", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SourceMapSource {
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator) = this()
    def this(sourceCode: String, name: String, sourceMap: RawSourceMap, originalSource: String) = this()
    def this(sourceCode: String, name: String, sourceMap: SourceMapGenerator, originalSource: String) = this()
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
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
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
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: String
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: RawSourceMap
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
      innerSourceMap: Unit,
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
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: RawSourceMap,
      originalSource: Unit,
      innerSourceMap: RawSourceMap,
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
      innerSourceMap: Unit,
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
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: String,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: Unit,
      removeOriginalSource: Boolean
    ) = this()
    def this(
      sourceCode: String,
      name: String,
      sourceMap: SourceMapGenerator,
      originalSource: Unit,
      innerSourceMap: RawSourceMap,
      removeOriginalSource: Boolean
    ) = this()
  }
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @js.native
  trait SourceMapSource
    extends typings.webpackSources.libSourceMod.^
       with SourceAndMapMixin {
    
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
}
