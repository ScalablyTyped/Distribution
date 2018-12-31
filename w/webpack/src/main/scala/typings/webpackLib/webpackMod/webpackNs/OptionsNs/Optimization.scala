package typings
package webpackLib.webpackMod.webpackNs.OptionsNs

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
  var minimizer: js.UndefOr[
    js.Array[webpackLib.webpackMod.webpackNs.Plugin | tapableLib.tapableMod.TapableNs.Plugin]
  ] = js.undefined
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

