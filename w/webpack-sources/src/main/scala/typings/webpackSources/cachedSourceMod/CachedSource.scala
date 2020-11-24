package typings.webpackSources.cachedSourceMod

import typings.webpackSources.libMod.CachedData
import typings.webpackSources.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Decorates a Source and caches returned results of map, source, size and sourceAndMap in memory.
  * Every other operation is delegated to the wrapped Source.
  */
@js.native
trait CachedSource extends Source {
  
  def getCachedData(): CachedData = js.native
  
  def original(): typings.webpackSources.sourceMod.^ = js.native
}
