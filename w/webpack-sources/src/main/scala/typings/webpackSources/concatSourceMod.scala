package typings.webpackSources

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.libMod.MapOptions
import typings.webpackSources.libMod.SourceAndMapMixin
import typings.webpackSources.libMod.SourceAndMapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatSourceMod {
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @JSImport("webpack-sources/lib/ConcatSource", JSImport.Namespace)
  @js.native
  class ^ protected () extends ConcatSource {
    def this(args: (String | typings.webpackSources.sourceMod.^)*) = this()
  }
  
  /**
    * Concatenate multiple Sources or strings to a single source.
    */
  @js.native
  trait ConcatSource
    extends typings.webpackSources.sourceMod.^
       with SourceAndMapMixin {
    
    /**
      * Adds an item to the source.
      */
    def add(item: String): Unit = js.native
    def add(item: typings.webpackSources.sourceMod.^): Unit = js.native
    
    var children: js.Array[String | typings.webpackSources.sourceMod.^] = js.native
    
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
