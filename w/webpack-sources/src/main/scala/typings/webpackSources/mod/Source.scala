package typings.webpackSources.mod

import typings.node.cryptoMod.Hash
import typings.sourceListMap.mod.SourceListMap
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceNode
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "Source")
@js.native
abstract class Source () extends js.Object {
  /**
    * This is an optional method. It may be null if not implemented.
    * Returns a SourceListMap (see source-list-map library) for the represented source code.
    */
  def listNode(options: MapOptions): SourceListMap = js.native
  /**
    * Returns the SourceMap of the represented source code as JSON.
    * May return `null` if no SourceMap is available.
    */
  def map(): RawSourceMap | Null = js.native
  def map(options: MapOptions): RawSourceMap | Null = js.native
  /**
    * This is an optional method. It may be null if not implemented.
    * Returns a SourceNode (see source-map library) for the represented source code.
    */
  def node(options: MapOptions): SourceNode = js.native
  /**
    * Returns the size in chars of the represented source code.
    */
  def size(): Double = js.native
  /**
    * Returns the represented source code as string.
    */
  def source(): String | ArrayBuffer = js.native
  /**
    * Returns both, source code (like `Source.prototype.source()` and SourceMap (like `Source.prototype.map()`).
    * This method could have better performance than calling `source()` and `map()` separately.
    */
  def sourceAndMap(): SourceAndMapResult = js.native
  def sourceAndMap(options: MapOptions): SourceAndMapResult = js.native
  /**
    * Updates the provided Hash object with the content of the represented source code.
    * (Hash is an object with an update method, which is called with string values)
    */
  def updateHash(hash: Hash): Unit = js.native
}

