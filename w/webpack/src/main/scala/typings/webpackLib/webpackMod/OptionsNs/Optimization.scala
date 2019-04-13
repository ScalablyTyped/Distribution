package typings
package webpackLib.webpackMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimization extends js.Object {
  /** Tries to find segments of the module graph which can be safely concatenated into a single module. Depends on optimization.providedExports and optimization.usedExports. */
  var concatenateModules: js.UndefOr[scala.Boolean] = js.undefined
  /** Chunks which are subsets of other chunks are determined and flagged in a way that subsets don’t have to be loaded when the bigger chunk has been loaded. */
  var flagIncludedChunks: js.UndefOr[scala.Boolean] = js.undefined
  /** Equal chunks are merged. This results in less code generation and faster builds. */
  var mergeDuplicateChunks: js.UndefOr[scala.Boolean] = js.undefined
  /** Use the minimizer (optimization.minimizer, by default uglify-js) to minimize output assets. */
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  /** Minimizer(s) to use for minimizing the output */
  var minimizer: js.UndefOr[js.Array[webpackLib.webpackMod.Plugin | tapableLib.tapableMod.TapableNs.Plugin]] = js.undefined
  /** Instead of numeric ids, give chunks readable names for better debugging. */
  var namedChunks: js.UndefOr[scala.Boolean] = js.undefined
  /** Instead of numeric ids, give modules readable names for better debugging. */
  var namedModules: js.UndefOr[scala.Boolean] = js.undefined
  /** Avoid emitting assets when errors occur. */
  var noEmitOnErrors: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the process.env.NODE_ENV constant to a compile-time-constant value. This allows to remove development only code from code. */
  var nodeEnv: js.UndefOr[java.lang.String | webpackLib.webpackLibNumbers.`false`] = js.undefined
  /** Give more often used ids smaller (shorter) values. */
  var occurrenceOrder: js.UndefOr[scala.Boolean] = js.undefined
  /** Generate records with relative paths to be able to move the context folder". */
  var portableRecords: js.UndefOr[scala.Boolean] = js.undefined
  /** Determine exports for each module when possible. This information is used by other optimizations or code generation. I. e. to generate more efficient code for export * from. */
  var providedExports: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Modules are removed from chunks when they are already available in all parent chunk groups.
    *  This reduces asset size. Smaller assets also result in faster builds since less code generation has to be performed.
    */
  var removeAvailableModules: js.UndefOr[scala.Boolean] = js.undefined
  /** Empty chunks are removed. This reduces load in filesystem and results in faster builds. */
  var removeEmptyChunks: js.UndefOr[scala.Boolean] = js.undefined
  /** Create a separate chunk for the webpack runtime code and chunk hash maps. This chunk should be inlined into the HTML */
  var runtimeChunk: js.UndefOr[
    scala.Boolean | webpackLib.webpackLibStrings.single | webpackLib.webpackLibStrings.multiple | RuntimeChunkOptions
  ] = js.undefined
  /**
    *  Recognise the sideEffects flag in package.json or rules to eliminate modules. This depends on optimization.providedExports and optimization.usedExports.
    *  These dependencies have a cost, but eliminating modules has positive impact on performance because of less code generation. It depends on your codebase.
    *  Try it for possible performance wins.
    */
  var sideEffects: js.UndefOr[scala.Boolean] = js.undefined
  /** Finds modules which are shared between chunk and splits them into separate chunks to reduce duplication or separate vendor modules from application modules. */
  var splitChunks: js.UndefOr[SplitChunksOptions | webpackLib.webpackLibNumbers.`false`] = js.undefined
  /**
    *  Determine used exports for each module. This depends on optimization.providedExports. This information is used by other optimizations or code generation.
    *  I. e. exports are not generated for unused exports, export names are mangled to single char identifiers when all usages are compatible.
    *  DCE in minimizers will benefit from this and can remove unused exports.
    */
  var usedExports: js.UndefOr[scala.Boolean] = js.undefined
}

object Optimization {
  @scala.inline
  def apply(
    concatenateModules: js.UndefOr[scala.Boolean] = js.undefined,
    flagIncludedChunks: js.UndefOr[scala.Boolean] = js.undefined,
    mergeDuplicateChunks: js.UndefOr[scala.Boolean] = js.undefined,
    minimize: js.UndefOr[scala.Boolean] = js.undefined,
    minimizer: js.Array[webpackLib.webpackMod.Plugin | tapableLib.tapableMod.TapableNs.Plugin] = null,
    namedChunks: js.UndefOr[scala.Boolean] = js.undefined,
    namedModules: js.UndefOr[scala.Boolean] = js.undefined,
    noEmitOnErrors: js.UndefOr[scala.Boolean] = js.undefined,
    nodeEnv: java.lang.String | webpackLib.webpackLibNumbers.`false` = null,
    occurrenceOrder: js.UndefOr[scala.Boolean] = js.undefined,
    portableRecords: js.UndefOr[scala.Boolean] = js.undefined,
    providedExports: js.UndefOr[scala.Boolean] = js.undefined,
    removeAvailableModules: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmptyChunks: js.UndefOr[scala.Boolean] = js.undefined,
    runtimeChunk: scala.Boolean | webpackLib.webpackLibStrings.single | webpackLib.webpackLibStrings.multiple | RuntimeChunkOptions = null,
    sideEffects: js.UndefOr[scala.Boolean] = js.undefined,
    splitChunks: SplitChunksOptions | webpackLib.webpackLibNumbers.`false` = null,
    usedExports: js.UndefOr[scala.Boolean] = js.undefined
  ): Optimization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concatenateModules)) __obj.updateDynamic("concatenateModules")(concatenateModules)
    if (!js.isUndefined(flagIncludedChunks)) __obj.updateDynamic("flagIncludedChunks")(flagIncludedChunks)
    if (!js.isUndefined(mergeDuplicateChunks)) __obj.updateDynamic("mergeDuplicateChunks")(mergeDuplicateChunks)
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (minimizer != null) __obj.updateDynamic("minimizer")(minimizer)
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

