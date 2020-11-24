package typings.webpackSources.libMod

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceAndMapMixin extends js.Object {
  
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
