package typings.webpack.mod.compilation

import typings.webpack.anon.NewChunks
import typings.webpack.mod.SortableSet
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import typings.webpack.webpackStrings.exports
import typings.webpack.webpackStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.Module")
@js.native
class Module protected () extends DependenciesBlock {
  def this(`type`: String) = this()
  def this(`type`: String, context: String) = this()
  var _chunks: SortableSet[Chunk] = js.native
  var _rewriteChunkInReasons: js.UndefOr[NewChunks] = js.native
  var _source: js.Any = js.native
  var buildInfo: js.Any = js.native
  var buildMeta: js.Any = js.native
  var built: Boolean = js.native
  var chunksIterable: SortableSet[Chunk] = js.native
  var context: String | Null = js.native
  var debugId: Double = js.native
  var depth: Double | Null = js.native
  var errors: js.Array[_] = js.native
  var exportsArgument: String | exports = js.native
  var factoryMeta: js.Any = js.native
  var getNumberOfChunks: Double = js.native
  var hash: js.UndefOr[String] = js.native
  var id: Double | String | Null = js.native
  var index: Double | Null = js.native
  var index2: Double | Null = js.native
  var issuer: Module | Null = js.native
  var moduleArgument: String | module = js.native
  var optimizationBailout: String | js.Array[_] = js.native
  var optional: Boolean = js.native
  var prefetched: Boolean = js.native
  var profile: js.Any = js.native
  var reasons: js.Array[_] = js.native
  var renderedHash: js.UndefOr[String] = js.native
  var resolveOptions: js.Any = js.native
  var `type`: String = js.native
  var useSourceMap: Boolean = js.native
  var used: Null | Boolean = js.native
  var usedExports: `false` | `true` | js.Array[String] | Null = js.native
  var warnings: js.Array[_] = js.native
  def _doRewriteChunkInReasons(oldChunk: Chunk, newChunks: js.Array[Chunk]): Unit = js.native
  def addChunk(chunk: Chunk): Boolean = js.native
  def addReason(module: Module, dependency: js.Any, explanation: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
  def getChunks(): js.Array[Chunk] = js.native
  def hasEqualsChunks(module: Module): Boolean = js.native
  def hasReasonForChunk(chunk: Chunk): Boolean = js.native
  def hasReasons(): Boolean = js.native
  def isEntryModule(): Boolean = js.native
  def isInChunk(chunk: Chunk): Boolean = js.native
  def isProvided(exportName: String): Boolean | Null = js.native
  def isUsed(): Boolean | String = js.native
  def isUsed(exportName: String): Boolean | String = js.native
  def needRebuild(fileTimestamps: js.Any, contextTimestamps: js.Any): Boolean = js.native
  def removeChunk(chunk: Chunk): Boolean = js.native
  def removeReason(module: Module, dependency: js.Any): Boolean = js.native
  def rewriteChunkInReasons(oldChunk: Chunk, newChunks: js.Array[Chunk]): Unit = js.native
  def setChunks(chunks: js.Array[Chunk]): Unit = js.native
  def sortItems(): Unit = js.native
  def sortItems(sortChunks: Boolean): Unit = js.native
  def unbuild(): Unit = js.native
  def unseal(): Unit = js.native
  def updateHash(hash: js.Any): Unit = js.native
}

