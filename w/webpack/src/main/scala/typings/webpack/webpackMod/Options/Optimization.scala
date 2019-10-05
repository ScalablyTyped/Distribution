package typings.webpack.webpackMod.Options

import typings.webpack.webpackMod.Plugin
import typings.webpack.webpackNumbers.`false`
import typings.webpack.webpackStrings.`total-size`
import typings.webpack.webpackStrings.hashed
import typings.webpack.webpackStrings.multiple
import typings.webpack.webpackStrings.named
import typings.webpack.webpackStrings.natural
import typings.webpack.webpackStrings.single
import typings.webpack.webpackStrings.size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimization extends js.Object {
  /** Tells webpack which algorithm to use when choosing chunk ids. Default false. */
  var chunkIds: js.UndefOr[Boolean | natural | named | size | `total-size`] = js.undefined
  /** Tries to find segments of the module graph which can be safely concatenated into a single module. Depends on optimization.providedExports and optimization.usedExports. */
  var concatenateModules: js.UndefOr[Boolean] = js.undefined
  /** Chunks which are subsets of other chunks are determined and flagged in a way that subsets don’t have to be loaded when the bigger chunk has been loaded. */
  var flagIncludedChunks: js.UndefOr[Boolean] = js.undefined
  /** Equal chunks are merged. This results in less code generation and faster builds. */
  var mergeDuplicateChunks: js.UndefOr[Boolean] = js.undefined
  /** Use the minimizer (optimization.minimizer, by default uglify-js) to minimize output assets. */
  var minimize: js.UndefOr[Boolean] = js.undefined
  /** Minimizer(s) to use for minimizing the output */
  var minimizer: js.UndefOr[js.Array[Plugin | typings.tapable.tapableMod.Tapable.Plugin]] = js.undefined
  /** Tells webpack which algorithm to use when choosing module ids. Default false. */
  var moduleIds: js.UndefOr[Boolean | natural | named | hashed | size | `total-size`] = js.undefined
  /** Instead of numeric ids, give chunks readable names for better debugging. */
  var namedChunks: js.UndefOr[Boolean] = js.undefined
  /** Instead of numeric ids, give modules readable names for better debugging. */
  var namedModules: js.UndefOr[Boolean] = js.undefined
  /** Avoid emitting assets when errors occur. */
  var noEmitOnErrors: js.UndefOr[Boolean] = js.undefined
  /** Defines the process.env.NODE_ENV constant to a compile-time-constant value. This allows to remove development only code from code. */
  var nodeEnv: js.UndefOr[String | `false`] = js.undefined
  /** Give more often used ids smaller (shorter) values. */
  var occurrenceOrder: js.UndefOr[Boolean] = js.undefined
  /** Generate records with relative paths to be able to move the context folder". */
  var portableRecords: js.UndefOr[Boolean] = js.undefined
  /** Determine exports for each module when possible. This information is used by other optimizations or code generation. I. e. to generate more efficient code for export * from. */
  var providedExports: js.UndefOr[Boolean] = js.undefined
  /**
    *  Modules are removed from chunks when they are already available in all parent chunk groups.
    *  This reduces asset size. Smaller assets also result in faster builds since less code generation has to be performed.
    */
  var removeAvailableModules: js.UndefOr[Boolean] = js.undefined
  /** Empty chunks are removed. This reduces load in filesystem and results in faster builds. */
  var removeEmptyChunks: js.UndefOr[Boolean] = js.undefined
  /** Create a separate chunk for the webpack runtime code and chunk hash maps. This chunk should be inlined into the HTML */
  var runtimeChunk: js.UndefOr[Boolean | single | multiple | RuntimeChunkOptions] = js.undefined
  /**
    *  Recognise the sideEffects flag in package.json or rules to eliminate modules. This depends on optimization.providedExports and optimization.usedExports.
    *  These dependencies have a cost, but eliminating modules has positive impact on performance because of less code generation. It depends on your codebase.
    *  Try it for possible performance wins.
    */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  /** Finds modules which are shared between chunk and splits them into separate chunks to reduce duplication or separate vendor modules from application modules. */
  var splitChunks: js.UndefOr[SplitChunksOptions | `false`] = js.undefined
  /**
    *  Determine used exports for each module. This depends on optimization.providedExports. This information is used by other optimizations or code generation.
    *  I. e. exports are not generated for unused exports, export names are mangled to single char identifiers when all usages are compatible.
    *  DCE in minimizers will benefit from this and can remove unused exports.
    */
  var usedExports: js.UndefOr[Boolean] = js.undefined
}

object Optimization {
  @scala.inline
  def apply(
    chunkIds: Boolean | natural | named | size | `total-size` = null,
    concatenateModules: js.UndefOr[Boolean] = js.undefined,
    flagIncludedChunks: js.UndefOr[Boolean] = js.undefined,
    mergeDuplicateChunks: js.UndefOr[Boolean] = js.undefined,
    minimize: js.UndefOr[Boolean] = js.undefined,
    minimizer: js.Array[Plugin | typings.tapable.tapableMod.Tapable.Plugin] = null,
    moduleIds: Boolean | natural | named | hashed | size | `total-size` = null,
    namedChunks: js.UndefOr[Boolean] = js.undefined,
    namedModules: js.UndefOr[Boolean] = js.undefined,
    noEmitOnErrors: js.UndefOr[Boolean] = js.undefined,
    nodeEnv: String | `false` = null,
    occurrenceOrder: js.UndefOr[Boolean] = js.undefined,
    portableRecords: js.UndefOr[Boolean] = js.undefined,
    providedExports: js.UndefOr[Boolean] = js.undefined,
    removeAvailableModules: js.UndefOr[Boolean] = js.undefined,
    removeEmptyChunks: js.UndefOr[Boolean] = js.undefined,
    runtimeChunk: Boolean | single | multiple | RuntimeChunkOptions = null,
    sideEffects: js.UndefOr[Boolean] = js.undefined,
    splitChunks: SplitChunksOptions | `false` = null,
    usedExports: js.UndefOr[Boolean] = js.undefined
  ): Optimization = {
    val __obj = js.Dynamic.literal()
    if (chunkIds != null) __obj.updateDynamic("chunkIds")(chunkIds.asInstanceOf[js.Any])
    if (!js.isUndefined(concatenateModules)) __obj.updateDynamic("concatenateModules")(concatenateModules)
    if (!js.isUndefined(flagIncludedChunks)) __obj.updateDynamic("flagIncludedChunks")(flagIncludedChunks)
    if (!js.isUndefined(mergeDuplicateChunks)) __obj.updateDynamic("mergeDuplicateChunks")(mergeDuplicateChunks)
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (minimizer != null) __obj.updateDynamic("minimizer")(minimizer)
    if (moduleIds != null) __obj.updateDynamic("moduleIds")(moduleIds.asInstanceOf[js.Any])
    if (!js.isUndefined(namedChunks)) __obj.updateDynamic("namedChunks")(namedChunks)
    if (!js.isUndefined(namedModules)) __obj.updateDynamic("namedModules")(namedModules)
    if (!js.isUndefined(noEmitOnErrors)) __obj.updateDynamic("noEmitOnErrors")(noEmitOnErrors)
    if (nodeEnv != null) __obj.updateDynamic("nodeEnv")(nodeEnv.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrenceOrder)) __obj.updateDynamic("occurrenceOrder")(occurrenceOrder)
    if (!js.isUndefined(portableRecords)) __obj.updateDynamic("portableRecords")(portableRecords)
    if (!js.isUndefined(providedExports)) __obj.updateDynamic("providedExports")(providedExports)
    if (!js.isUndefined(removeAvailableModules)) __obj.updateDynamic("removeAvailableModules")(removeAvailableModules)
    if (!js.isUndefined(removeEmptyChunks)) __obj.updateDynamic("removeEmptyChunks")(removeEmptyChunks)
    if (runtimeChunk != null) __obj.updateDynamic("runtimeChunk")(runtimeChunk.asInstanceOf[js.Any])
    if (!js.isUndefined(sideEffects)) __obj.updateDynamic("sideEffects")(sideEffects)
    if (splitChunks != null) __obj.updateDynamic("splitChunks")(splitChunks.asInstanceOf[js.Any])
    if (!js.isUndefined(usedExports)) __obj.updateDynamic("usedExports")(usedExports)
    __obj.asInstanceOf[Optimization]
  }
}

