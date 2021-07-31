package typings.webpackSources

import typings.node.Buffer
import typings.node.cryptoMod.Hash
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapGenerator
import typings.std.ArrayBuffer
import typings.std.Map
import typings.webpackSources.cachedSourceMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources/lib", "CachedSource")
  @js.native
  class CachedSource protected () extends ^ {
    def this(source: typings.webpackSources.sourceMod.^) = this()
    def this(source: js.Function0[typings.webpackSources.sourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  @JSImport("webpack-sources/lib", "CompatSource")
  @js.native
  class CompatSource protected ()
    extends typings.webpackSources.compatSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  object CompatSource {
    
    @JSImport("webpack-sources/lib", "CompatSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def from(sourceLike: SourceLike): typings.webpackSources.sourceMod.^ | typings.webpackSources.compatSourceMod.CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typings.webpackSources.sourceMod.^ | typings.webpackSources.compatSourceMod.CompatSource]
  }
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @JSImport("webpack-sources/lib", "ConcatSource")
  @js.native
  class ConcatSource protected ()
    extends typings.webpackSources.concatSourceMod.^ {
    def this(args: (String | typings.webpackSources.sourceMod.^)*) = this()
  }
  
  /**
    * Represents source code, which is a copy of the original file
    */
  @JSImport("webpack-sources/lib", "OriginalSource")
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
  @JSImport("webpack-sources/lib", "PrefixSource")
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
  @JSImport("webpack-sources/lib", "RawSource")
  @js.native
  class RawSource protected ()
    extends typings.webpackSources.rawSourceMod.^ {
    def this(value: String) = this()
  }
  
  /**
    * Decorates a Source with replacements and insertions of source code.
    *
    */
  @JSImport("webpack-sources/lib", "ReplaceSource")
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
  
  @JSImport("webpack-sources/lib", "SizeOnlySource")
  @js.native
  class SizeOnlySource protected ()
    extends typings.webpackSources.sizeOnlySourceMod.^ {
    def this(size: Double) = this()
  }
  
  /**
    * Base class for all sources.
    * A Source can be asked for source code, size, source map and hash.
    */
  @JSImport("webpack-sources/lib", "Source")
  @js.native
  abstract class Source ()
    extends typings.webpackSources.sourceMod.^
  
  /**
    * Represents source code with SourceMap, optionally having an additional SourceMap for the original source.
    */
  @JSImport("webpack-sources/lib", "SourceMapSource")
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
  
  trait CachedData extends StObject {
    
    var buffer: js.UndefOr[Buffer] = js.undefined
    
    var cachedData: js.UndefOr[Map[js.Any, js.Any]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String | Boolean] = js.undefined
  }
  object CachedData {
    
    @scala.inline
    def apply(): CachedData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CachedData]
    }
    
    @scala.inline
    implicit class CachedDataMutableBuilder[Self <: CachedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setCachedData(value: Map[js.Any, js.Any]): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSource(value: String | Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait MapOptions extends StObject {
    
    /**
      * If set to false the implementation may omit mappings for columns
      * @default true
      */
    var columns: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to false the implementation may omit inner mappings for modules.
      * @default true
      */
    var module: js.UndefOr[Boolean] = js.undefined
  }
  object MapOptions {
    
    @scala.inline
    def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  trait Replacement extends StObject {
    
    val content: String
    
    val end: Double
    
    val insertIndex: Double
    
    val name: String
    
    val start: Double
  }
  object Replacement {
    
    @scala.inline
    def apply(content: String, end: Double, insertIndex: Double, name: String, start: Double): Replacement = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], insertIndex = insertIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Replacement]
    }
    
    @scala.inline
    implicit class ReplacementMutableBuilder[Self <: Replacement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIndex(value: Double): Self = StObject.set(x, "insertIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceAndMapMixin extends StObject {
    
    /**
      * Returns the SourceMap of the represented source code as JSON.
      * May return `null` if no SourceMap is available.
      */
    def map(): RawSourceMap | Null = js.native
    def map(options: MapOptions): RawSourceMap | Null = js.native
    
    /**
      * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
      * This method could have better performance than calling `source()` and `map()` separately.
      */
    def sourceAndMap(): SourceAndMapResult = js.native
    def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
  }
  
  trait SourceAndMapResult extends StObject {
    
    var map: RawSourceMap | Null
    
    var source: String
  }
  object SourceAndMapResult {
    
    @scala.inline
    def apply(source: String): SourceAndMapResult = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[SourceAndMapResult]
    }
    
    @scala.inline
    implicit class SourceAndMapResultMutableBuilder[Self <: SourceAndMapResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapNull: Self = StObject.set(x, "map", null)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<webpack-sources.webpack-sources/lib.Source, 'source' | 'buffer' | 'size' | 'map' | 'sourceAndMap' | 'updateHash'>> */
  trait SourceLike extends StObject {
    
    var buffer: js.UndefOr[js.Function0[Buffer]] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* options */ js.UndefOr[MapOptions], RawSourceMap | Null]] = js.undefined
    
    var size: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var source: js.UndefOr[js.Function0[String | ArrayBuffer]] = js.undefined
    
    var sourceAndMap: js.UndefOr[js.Function1[/* options */ js.UndefOr[MapOptions], SourceAndMapResult]] = js.undefined
    
    var updateHash: js.UndefOr[js.Function1[/* hash */ Hash, Unit]] = js.undefined
  }
  object SourceLike {
    
    @scala.inline
    def apply(): SourceLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceLike]
    }
    
    @scala.inline
    implicit class SourceLikeMutableBuilder[Self <: SourceLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: () => Buffer): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setMap(value: /* options */ js.UndefOr[MapOptions] => RawSourceMap | Null): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSource(value: () => String | ArrayBuffer): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSourceAndMap(value: /* options */ js.UndefOr[MapOptions] => SourceAndMapResult): Self = StObject.set(x, "sourceAndMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceAndMapUndefined: Self = StObject.set(x, "sourceAndMap", js.undefined)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setUpdateHash(value: /* hash */ Hash => Unit): Self = StObject.set(x, "updateHash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateHashUndefined: Self = StObject.set(x, "updateHash", js.undefined)
    }
  }
}
