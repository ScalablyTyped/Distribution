package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Optimization")
@js.native
class Optimization () extends ChainedMap[Config] {
  def concatenateModules(value: scala.Boolean): this.type = js.native
  def flagIncludedChunks(value: scala.Boolean): this.type = js.native
  def mergeDuplicateChunks(value: scala.Boolean): this.type = js.native
  def minimize(value: scala.Boolean): this.type = js.native
  def minimizer(name: java.lang.String): Plugin[this.type] = js.native
  def namedChunks(value: scala.Boolean): this.type = js.native
  def namedModules(value: scala.Boolean): this.type = js.native
  def noEmitOnErrors(value: scala.Boolean): this.type = js.native
  def nodeEnv(value: java.lang.String): this.type = js.native
  def nodeEnv(value: scala.Boolean): this.type = js.native
  def occurrenceOrder(value: scala.Boolean): this.type = js.native
  def portableRecords(value: scala.Boolean): this.type = js.native
  def providedExports(value: scala.Boolean): this.type = js.native
  def removeAvailableModules(value: scala.Boolean): this.type = js.native
  def removeEmptyChunks(value: scala.Boolean): this.type = js.native
  def runtimeChunk(value: scala.Boolean): this.type = js.native
  def runtimeChunk(value: RuntimeChunk): this.type = js.native
  @JSName("runtimeChunk")
  def runtimeChunk_multiple(value: webpackDashChainLib.webpackDashChainLibStrings.multiple): this.type = js.native
  @JSName("runtimeChunk")
  def runtimeChunk_single(value: webpackDashChainLib.webpackDashChainLibStrings.single): this.type = js.native
  def sideEffects(value: scala.Boolean): this.type = js.native
  def splitChunks(value: SplitChunksOptions): this.type = js.native
  def usedExports(value: scala.Boolean): this.type = js.native
}

