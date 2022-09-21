package typings.webpackSources

import typings.sourceMap.mod.RawSourceMap
import typings.webpackSources.libMod.MapOptions
import typings.webpackSources.libMod.SourceAndMapMixin
import typings.webpackSources.libMod.SourceAndMapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixSourceMod {
  
  /**
    * Prefix every line of the decorated Source with a provided string.
    */
  @JSImport("webpack-sources/lib/PrefixSource", JSImport.Namespace)
  @js.native
  open class ^ protected () extends PrefixSource {
    def this(prefix: String, source: String) = this()
    def this(prefix: String, source: typings.webpackSources.sourceMod.^) = this()
    def this(prefix: typings.webpackSources.sourceMod.^, source: String) = this()
    def this(prefix: typings.webpackSources.sourceMod.^, source: typings.webpackSources.sourceMod.^) = this()
  }
  
  /**
    * Prefix every line of the decorated Source with a provided string.
    */
  @js.native
  trait PrefixSource
    extends typings.webpackSources.sourceMod.^
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
