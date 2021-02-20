package typings.webpackSources

import typings.webpackSources.libMod.CachedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachedSourceMod {
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @JSImport("webpack-sources/lib/CachedSource", JSImport.Namespace)
  @js.native
  class ^ protected () extends CachedSource {
    def this(source: typings.webpackSources.sourceMod.^) = this()
    def this(source: js.Function0[typings.webpackSources.sourceMod.^], cachedData: CachedData) = this()
    def this(source: Null, cachedData: CachedData) = this()
  }
  
  /**
    * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
    * Every other operation is delegated to the wrapped Source.
    */
  @js.native
  trait CachedSource
    extends typings.webpackSources.sourceMod.^ {
    
    def getCachedData(): CachedData = js.native
    
    def original(): typings.webpackSources.sourceMod.^ = js.native
  }
}
