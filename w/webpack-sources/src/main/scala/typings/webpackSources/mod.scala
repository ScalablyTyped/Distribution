package typings.webpackSources

import typings.node.Buffer
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapGenerator
import typings.webpackSources.cachedSourceMod.^
import typings.webpackSources.libMod.CachedData
import typings.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources", "CachedSource")
  @js.native
  class CachedSource protected () extends ^ {
    def this(source: typings.webpackSources.sourceMod.^) = this()
    def this(source: js.Function0[typings.webpackSources.sourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  @JSImport("webpack-sources", "CompatSource")
  @js.native
  class CompatSource protected ()
    extends typings.webpackSources.compatSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  object CompatSource {
    
    @JSImport("webpack-sources", "CompatSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def from(sourceLike: SourceLike): typings.webpackSources.sourceMod.^ | typings.webpackSources.compatSourceMod.CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typings.webpackSources.sourceMod.^ | typings.webpackSources.compatSourceMod.CompatSource]
  }
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @JSImport("webpack-sources", "ConcatSource")
  @js.native
  class ConcatSource protected ()
    extends typings.webpackSources.concatSourceMod.^ {
    def this(args: (String | typings.webpackSources.sourceMod.^)*) = this()
  }
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @JSImport("webpack-sources", "OriginalSource")
  @js.native
  class OriginalSource protected ()
    extends typings.webpackSources.originalSourceMod.^ {
    /**
      * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
      */
    def this(sourceCode: String, name: String) = this()
    def this(sourceCode: Buffer, name: String) = this()
  }
  
  /**
    * Prefix every line of the decorated Source with a provided string.
    */
  @JSImport("webpack-sources", "PrefixSource")
  @js.native
  class PrefixSource protected ()
    extends typings.webpackSources.prefixSourceMod.^ {
    def this(prefix: String, source: String) = this()
    def this(prefix: String, source: typings.webpackSources.sourceMod.^) = this()
    def this(prefix: typings.webpackSources.sourceMod.^, source: String) = this()
    def this(prefix: typings.webpackSources.sourceMod.^, source: typings.webpackSources.sourceMod.^) = this()
  }
  
  /**
    * Represents source code without SourceMap
    */
  @JSImport("webpack-sources", "RawSource")
  @js.native
  class RawSource protected ()
    extends typings.webpackSources.rawSourceMod.^ {
    def this(value: String) = this()
  }
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @JSImport("webpack-sources", "ReplaceSource")
  @js.native
  class ReplaceSource protected ()
    extends typings.webpackSources.replaceSourceMod.^ {
    /**
      * The ReplaceSource supports "identity" mappings for child source.
      * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
      */
    def this(source: typings.webpackSources.sourceMod.^) = this()
    def this(source: typings.webpackSources.sourceMod.^, name: String) = this()
  }
  
  @JSImport("webpack-sources", "SizeOnlySource")
  @js.native
  class SizeOnlySource protected ()
    extends typings.webpackSources.sizeOnlySourceMod.^ {
    def this(size: Double) = this()
  }
  
  /**
    * Base class for all sources.
    * A Source can be asked for source code, size, source map and hash.
    */
  @JSImport("webpack-sources", "Source")
  @js.native
  abstract class Source ()
    extends typings.webpackSources.sourceMod.^
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @JSImport("webpack-sources", "SourceMapSource")
  @js.native
  class SourceMapSource protected ()
    extends typings.webpackSources.sourceMapSourceMod.^ {
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
}
