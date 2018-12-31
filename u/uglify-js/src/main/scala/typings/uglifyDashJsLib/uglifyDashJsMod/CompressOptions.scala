package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /** Replace `arguments[index]` with function parameter name whenever possible. */
  var arguments: js.UndefOr[scala.Boolean] = js.undefined
  /** Various optimizations for boolean context, for example `!!a ? b : c → a ? b : c` */
  var booleans: js.UndefOr[scala.Boolean] = js.undefined
  /** Collapse single-use non-constant variables, side effects permitting. */
  var collapse_vars: js.UndefOr[scala.Boolean] = js.undefined
  /** Apply certain optimizations to binary nodes, e.g. `!(a <= b) → a > b,` attempts to negate binary nodes, e.g. `a = !b && !c && !d && !e → a=!(b||c||d||e)` etc */
  var comparisons: js.UndefOr[scala.Boolean] = js.undefined
  /** Apply optimizations for `if-s` and conditional expressions. */
  var conditionals: js.UndefOr[scala.Boolean] = js.undefined
  /** Remove unreachable code */
  var dead_code: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass `true` to discard calls to console.* functions.
    * If you wish to drop a specific function call such as `console.info` and/or retain side effects from function
    * arguments after dropping the function call then use `pure_funcs` instead.
    */
  var drop_console: js.UndefOr[scala.Boolean] = js.undefined
  /** Remove `debugger;` statements */
  var drop_debugger: js.UndefOr[scala.Boolean] = js.undefined
  /** Attempt to evaluate constant expressions */
  var evaluate: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass `true` to preserve completion values from terminal statements without `return`, e.g. in bookmarklets. */
  var expression: js.UndefOr[scala.Boolean] = js.undefined
  var global_defs: js.UndefOr[js.Object] = js.undefined
  /** hoist function declarations */
  var hoist_funs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hoist properties from constant object and array literals into regular variables subject to a set of constraints.
    * For example: `var o={p:1, q:2}; f(o.p, o.q);` is converted to `f(1, 2);`. Note: `hoist_props` works best with mangle enabled,
    * the compress option passes set to 2 or higher, and the compress option toplevel enabled.
    */
  var hoist_props: js.UndefOr[scala.Boolean] = js.undefined
  /** Hoist var declarations (this is `false` by default because it seems to increase the size of the output in general) */
  var hoist_vars: js.UndefOr[scala.Boolean] = js.undefined
  /** Optimizations for if/return and if/continue */
  var if_return: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Inline calls to function with simple/return statement
    * - false -- same as `Disabled`
    * - `Disabled` -- disabled inlining
    * - `SimpleFunctions` -- inline simple functions
    * - `WithArguments` -- inline functions with arguments
    * - `WithArgumentsAndVariables` -- inline functions with arguments and variables
    * - true -- same as `WithArgumentsAndVariables`
    */
  var `inline`: js.UndefOr[scala.Boolean | InlineFunctions] = js.undefined
  /** join consecutive `var` statements */
  var join_vars: js.UndefOr[scala.Boolean] = js.undefined
  /** Prevents the compressor from discarding unused function arguments. You need this for code which relies on `Function.length` */
  var keep_fargs: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass true to prevent the compressor from discarding function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass true to prevent Infinity from being compressed into `1/0`, which may cause performance issues on `Chrome` */
  var keep_infinity: js.UndefOr[scala.Boolean] = js.undefined
  /** Optimizations for `do`, `while` and `for` loops when we can statically determine the condition. */
  var loops: js.UndefOr[scala.Boolean] = js.undefined
  /** negate `Immediately-Called Function Expressions` where the return value is discarded, to avoid the parens that the code generator would insert. */
  var negate_iife: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of times to run compress. In some cases more than one pass leads to further compressed code. Keep in mind more passes will take more time. */
  var passes: js.UndefOr[scala.Double] = js.undefined
  /** Rewrite property access using the dot notation, for example `foo["bar"]` to `foo.bar` */
  var properties: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of names and UglifyJS will assume that those functions do not produce side effects.
    * DANGER: will not check if the name is redefined in scope.
    * An example case here, for instance `var q = Math.floor(a/b)`.
    * If variable q is not used elsewhere, UglifyJS will drop it, but will still keep the `Math.floor(a/b)`,
    * not knowing what it does. You can pass `pure_funcs: [ 'Math.floor' ]` to let it know that this function
    * won't produce any side effect, in which case the whole statement would get discarded. The current
    * implementation adds some overhead (compression will be slower).
    */
  var pure_funcs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pure_getters: js.UndefOr[scala.Boolean | uglifyDashJsLib.uglifyDashJsLibStrings.strict] = js.undefined
  /**
    * Allows single-use functions to be inlined as function expressions when permissible allowing further optimization.
    * Enabled by default. Option depends on reduce_vars being enabled. Some code runs faster in the Chrome V8 engine if
    * this option is disabled. Does not negatively impact other major browsers.
    */
  var reduce_funcs: js.UndefOr[scala.Boolean] = js.undefined
  /** Improve optimization on variables assigned with and used as constant values. */
  var reduce_vars: js.UndefOr[scala.Boolean] = js.undefined
  var sequences: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass false to disable potentially dropping functions marked as "pure". */
  var side_effects: js.UndefOr[scala.Boolean] = js.undefined
  /** De-duplicate and remove unreachable `switch` branches.  */
  var switches: js.UndefOr[scala.Boolean] = js.undefined
  /** Prevent specific toplevel functions and variables from unused removal (can be array, comma-separated, RegExp or function. Implies toplevel) */
  var top_retain: js.UndefOr[scala.Boolean] = js.undefined
  /** Drop unreferenced functions ("funcs") and/or variables ("vars") in the top level scope (false by default, true to drop both unreferenced functions and variables) */
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  var typeofs: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe: js.UndefOr[scala.Boolean] = js.undefined
  /** Compress and mangle `Function(args, code)` when both args and code are string literals. */
  var unsafe_Function: js.UndefOr[scala.Boolean] = js.undefined
  /** Compress expressions like a `<= b` assuming none of the operands can be (coerced to) `NaN`. */
  var unsafe_comps: js.UndefOr[scala.Boolean] = js.undefined
  /** Optimize numerical expressions like `2 * x * 3` into `6 * x`, which may give imprecise floating point results.  */
  var unsafe_math: js.UndefOr[scala.Boolean] = js.undefined
  /** Optimize expressions like `Array.prototype.slice.call(a)` into `[].slice.call(a)` */
  var unsafe_proto: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable substitutions of variables with `RegExp` values the same way as if they are constants. */
  var unsafe_regexp: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_undefined: js.UndefOr[scala.Boolean] = js.undefined
  var unused: js.UndefOr[scala.Boolean] = js.undefined
  /** display warnings when dropping unreachable code or unused declarations etc. */
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

