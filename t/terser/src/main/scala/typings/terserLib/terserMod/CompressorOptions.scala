package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressorOptions extends js.Object {
  // Optimize boolean expressions
  var booleans: js.UndefOr[scala.Boolean] = js.undefined
  // Try to cascade `right` into `left` in sequences
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  // Optimize comparisons
  var comparisons: js.UndefOr[scala.Boolean] = js.undefined
  // Optimize if-s and conditional expressions
  var conditionals: js.UndefOr[scala.Boolean] = js.undefined
  // Discard unreachable code
  var dead_code: js.UndefOr[scala.Boolean] = js.undefined
  // Discard “debugger” statements
  var drop_debugger: js.UndefOr[scala.Boolean] = js.undefined
  // Evaluate constant expressions
  var evaluate: js.UndefOr[scala.Boolean] = js.undefined
  // Global definitions
  var global_defs: js.UndefOr[js.Object] = js.undefined
  // Hoist function declarations
  var hoist_funs: js.UndefOr[scala.Boolean] = js.undefined
  // Hoist variable declarations
  var hoist_vars: js.UndefOr[scala.Boolean] = js.undefined
  // Optimize if-s followed by return/continue
  var if_return: js.UndefOr[scala.Boolean] = js.undefined
  // Join var declarations
  var join_vars: js.UndefOr[scala.Boolean] = js.undefined
  // Optimize loops
  var loops: js.UndefOr[scala.Boolean] = js.undefined
  // Optimize property access: a["foo"] → a.foo
  var properties: js.UndefOr[scala.Boolean] = js.undefined
  // Join consecutive statemets with the “comma operator”
  var sequences: js.UndefOr[scala.Boolean] = js.undefined
  // Drop side-effect-free statements
  var side_effects: js.UndefOr[scala.Boolean] = js.undefined
  // Some unsafe optimizations (see below)
  var unsafe: js.UndefOr[scala.Boolean] = js.undefined
  // Drop unused variables/functions
  var unused: js.UndefOr[scala.Boolean] = js.undefined
  // Warn about potentially dangerous optimizations/code
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

