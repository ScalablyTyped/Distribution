package typings.uglifyDashJs.uglifyDashJsMod

import typings.uglifyDashJs.uglifyDashJsStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /** Replace `arguments[index]` with function parameter name whenever possible. */
  var arguments: js.UndefOr[Boolean] = js.undefined
  /** Various optimizations for boolean context, for example `!!a ? b : c → a ? b : c` */
  var booleans: js.UndefOr[Boolean] = js.undefined
  /** Collapse single-use non-constant variables, side effects permitting. */
  var collapse_vars: js.UndefOr[Boolean] = js.undefined
  /** Apply certain optimizations to binary nodes, e.g. `!(a <= b) → a > b,` attempts to negate binary nodes, e.g. `a = !b && !c && !d && !e → a=!(b||c||d||e)` etc */
  var comparisons: js.UndefOr[Boolean] = js.undefined
  /** Apply optimizations for `if-s` and conditional expressions. */
  var conditionals: js.UndefOr[Boolean] = js.undefined
  /** Remove unreachable code */
  var dead_code: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `true` to discard calls to console.* functions.
    * If you wish to drop a specific function call such as `console.info` and/or retain side effects from function
    * arguments after dropping the function call then use `pure_funcs` instead.
    */
  var drop_console: js.UndefOr[Boolean] = js.undefined
  /** Remove `debugger;` statements */
  var drop_debugger: js.UndefOr[Boolean] = js.undefined
  /** Attempt to evaluate constant expressions */
  var evaluate: js.UndefOr[Boolean] = js.undefined
  /** Pass `true` to preserve completion values from terminal statements without `return`, e.g. in bookmarklets. */
  var expression: js.UndefOr[Boolean] = js.undefined
  var global_defs: js.UndefOr[js.Object] = js.undefined
  /** hoist function declarations */
  var hoist_funs: js.UndefOr[Boolean] = js.undefined
  /**
    * Hoist properties from constant object and array literals into regular variables subject to a set of constraints.
    * For example: `var o={p:1, q:2}; f(o.p, o.q);` is converted to `f(1, 2);`. Note: `hoist_props` works best with mangle enabled,
    * the compress option passes set to 2 or higher, and the compress option toplevel enabled.
    */
  var hoist_props: js.UndefOr[Boolean] = js.undefined
  /** Hoist var declarations (this is `false` by default because it seems to increase the size of the output in general) */
  var hoist_vars: js.UndefOr[Boolean] = js.undefined
  /** Optimizations for if/return and if/continue */
  var if_return: js.UndefOr[Boolean] = js.undefined
  /**
    * Inline calls to function with simple/return statement
    * - false -- same as `Disabled`
    * - `Disabled` -- disabled inlining
    * - `SimpleFunctions` -- inline simple functions
    * - `WithArguments` -- inline functions with arguments
    * - `WithArgumentsAndVariables` -- inline functions with arguments and variables
    * - true -- same as `WithArgumentsAndVariables`
    */
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.undefined
  /** join consecutive `var` statements */
  var join_vars: js.UndefOr[Boolean] = js.undefined
  /** Prevents the compressor from discarding unused function arguments. You need this for code which relies on `Function.length` */
  var keep_fargs: js.UndefOr[Boolean] = js.undefined
  /** Pass true to prevent the compressor from discarding function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  /** Pass true to prevent Infinity from being compressed into `1/0`, which may cause performance issues on `Chrome` */
  var keep_infinity: js.UndefOr[Boolean] = js.undefined
  /** Optimizations for `do`, `while` and `for` loops when we can statically determine the condition. */
  var loops: js.UndefOr[Boolean] = js.undefined
  /** negate `Immediately-Called Function Expressions` where the return value is discarded, to avoid the parens that the code generator would insert. */
  var negate_iife: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of times to run compress. In some cases more than one pass leads to further compressed code. Keep in mind more passes will take more time. */
  var passes: js.UndefOr[Double] = js.undefined
  /** Rewrite property access using the dot notation, for example `foo["bar"]` to `foo.bar` */
  var properties: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of names and UglifyJS will assume that those functions do not produce side effects.
    * DANGER: will not check if the name is redefined in scope.
    * An example case here, for instance `var q = Math.floor(a/b)`.
    * If variable q is not used elsewhere, UglifyJS will drop it, but will still keep the `Math.floor(a/b)`,
    * not knowing what it does. You can pass `pure_funcs: [ 'Math.floor' ]` to let it know that this function
    * won't produce any side effect, in which case the whole statement would get discarded. The current
    * implementation adds some overhead (compression will be slower).
    */
  var pure_funcs: js.UndefOr[js.Array[String]] = js.undefined
  var pure_getters: js.UndefOr[Boolean | strict] = js.undefined
  /**
    * Allows single-use functions to be inlined as function expressions when permissible allowing further optimization.
    * Enabled by default. Option depends on reduce_vars being enabled. Some code runs faster in the Chrome V8 engine if
    * this option is disabled. Does not negatively impact other major browsers.
    */
  var reduce_funcs: js.UndefOr[Boolean] = js.undefined
  /** Improve optimization on variables assigned with and used as constant values. */
  var reduce_vars: js.UndefOr[Boolean] = js.undefined
  var sequences: js.UndefOr[Boolean] = js.undefined
  /** Pass false to disable potentially dropping functions marked as "pure". */
  var side_effects: js.UndefOr[Boolean] = js.undefined
  /** De-duplicate and remove unreachable `switch` branches.  */
  var switches: js.UndefOr[Boolean] = js.undefined
  /** Prevent specific toplevel functions and variables from unused removal (can be array, comma-separated, RegExp or function. Implies toplevel) */
  var top_retain: js.UndefOr[Boolean] = js.undefined
  /** Drop unreferenced functions ("funcs") and/or variables ("vars") in the top level scope (false by default, true to drop both unreferenced functions and variables) */
  var toplevel: js.UndefOr[Boolean] = js.undefined
  var typeofs: js.UndefOr[Boolean] = js.undefined
  var unsafe: js.UndefOr[Boolean] = js.undefined
  /** Compress and mangle `Function(args, code)` when both args and code are string literals. */
  var unsafe_Function: js.UndefOr[Boolean] = js.undefined
  /** Compress expressions like a `<= b` assuming none of the operands can be (coerced to) `NaN`. */
  var unsafe_comps: js.UndefOr[Boolean] = js.undefined
  /** Optimize numerical expressions like `2 * x * 3` into `6 * x`, which may give imprecise floating point results.  */
  var unsafe_math: js.UndefOr[Boolean] = js.undefined
  /** Optimize expressions like `Array.prototype.slice.call(a)` into `[].slice.call(a)` */
  var unsafe_proto: js.UndefOr[Boolean] = js.undefined
  /** Enable substitutions of variables with `RegExp` values the same way as if they are constants. */
  var unsafe_regexp: js.UndefOr[Boolean] = js.undefined
  var unsafe_undefined: js.UndefOr[Boolean] = js.undefined
  var unused: js.UndefOr[Boolean] = js.undefined
  /** display warnings when dropping unreachable code or unused declarations etc. */
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    arguments: js.UndefOr[Boolean] = js.undefined,
    booleans: js.UndefOr[Boolean] = js.undefined,
    collapse_vars: js.UndefOr[Boolean] = js.undefined,
    comparisons: js.UndefOr[Boolean] = js.undefined,
    conditionals: js.UndefOr[Boolean] = js.undefined,
    dead_code: js.UndefOr[Boolean] = js.undefined,
    drop_console: js.UndefOr[Boolean] = js.undefined,
    drop_debugger: js.UndefOr[Boolean] = js.undefined,
    evaluate: js.UndefOr[Boolean] = js.undefined,
    expression: js.UndefOr[Boolean] = js.undefined,
    global_defs: js.Object = null,
    hoist_funs: js.UndefOr[Boolean] = js.undefined,
    hoist_props: js.UndefOr[Boolean] = js.undefined,
    hoist_vars: js.UndefOr[Boolean] = js.undefined,
    if_return: js.UndefOr[Boolean] = js.undefined,
    `inline`: Boolean | InlineFunctions = null,
    join_vars: js.UndefOr[Boolean] = js.undefined,
    keep_fargs: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    keep_infinity: js.UndefOr[Boolean] = js.undefined,
    loops: js.UndefOr[Boolean] = js.undefined,
    negate_iife: js.UndefOr[Boolean] = js.undefined,
    passes: Int | Double = null,
    properties: js.UndefOr[Boolean] = js.undefined,
    pure_funcs: js.Array[String] = null,
    pure_getters: Boolean | strict = null,
    reduce_funcs: js.UndefOr[Boolean] = js.undefined,
    reduce_vars: js.UndefOr[Boolean] = js.undefined,
    sequences: js.UndefOr[Boolean] = js.undefined,
    side_effects: js.UndefOr[Boolean] = js.undefined,
    switches: js.UndefOr[Boolean] = js.undefined,
    top_retain: js.UndefOr[Boolean] = js.undefined,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    typeofs: js.UndefOr[Boolean] = js.undefined,
    unsafe: js.UndefOr[Boolean] = js.undefined,
    unsafe_Function: js.UndefOr[Boolean] = js.undefined,
    unsafe_comps: js.UndefOr[Boolean] = js.undefined,
    unsafe_math: js.UndefOr[Boolean] = js.undefined,
    unsafe_proto: js.UndefOr[Boolean] = js.undefined,
    unsafe_regexp: js.UndefOr[Boolean] = js.undefined,
    unsafe_undefined: js.UndefOr[Boolean] = js.undefined,
    unused: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arguments)) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(booleans)) __obj.updateDynamic("booleans")(booleans)
    if (!js.isUndefined(collapse_vars)) __obj.updateDynamic("collapse_vars")(collapse_vars)
    if (!js.isUndefined(comparisons)) __obj.updateDynamic("comparisons")(comparisons)
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals)
    if (!js.isUndefined(dead_code)) __obj.updateDynamic("dead_code")(dead_code)
    if (!js.isUndefined(drop_console)) __obj.updateDynamic("drop_console")(drop_console)
    if (!js.isUndefined(drop_debugger)) __obj.updateDynamic("drop_debugger")(drop_debugger)
    if (!js.isUndefined(evaluate)) __obj.updateDynamic("evaluate")(evaluate)
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (global_defs != null) __obj.updateDynamic("global_defs")(global_defs)
    if (!js.isUndefined(hoist_funs)) __obj.updateDynamic("hoist_funs")(hoist_funs)
    if (!js.isUndefined(hoist_props)) __obj.updateDynamic("hoist_props")(hoist_props)
    if (!js.isUndefined(hoist_vars)) __obj.updateDynamic("hoist_vars")(hoist_vars)
    if (!js.isUndefined(if_return)) __obj.updateDynamic("if_return")(if_return)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(join_vars)) __obj.updateDynamic("join_vars")(join_vars)
    if (!js.isUndefined(keep_fargs)) __obj.updateDynamic("keep_fargs")(keep_fargs)
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames)
    if (!js.isUndefined(keep_infinity)) __obj.updateDynamic("keep_infinity")(keep_infinity)
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops)
    if (!js.isUndefined(negate_iife)) __obj.updateDynamic("negate_iife")(negate_iife)
    if (passes != null) __obj.updateDynamic("passes")(passes.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties)
    if (pure_funcs != null) __obj.updateDynamic("pure_funcs")(pure_funcs)
    if (pure_getters != null) __obj.updateDynamic("pure_getters")(pure_getters.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_funcs)) __obj.updateDynamic("reduce_funcs")(reduce_funcs)
    if (!js.isUndefined(reduce_vars)) __obj.updateDynamic("reduce_vars")(reduce_vars)
    if (!js.isUndefined(sequences)) __obj.updateDynamic("sequences")(sequences)
    if (!js.isUndefined(side_effects)) __obj.updateDynamic("side_effects")(side_effects)
    if (!js.isUndefined(switches)) __obj.updateDynamic("switches")(switches)
    if (!js.isUndefined(top_retain)) __obj.updateDynamic("top_retain")(top_retain)
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (!js.isUndefined(typeofs)) __obj.updateDynamic("typeofs")(typeofs)
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe)
    if (!js.isUndefined(unsafe_Function)) __obj.updateDynamic("unsafe_Function")(unsafe_Function)
    if (!js.isUndefined(unsafe_comps)) __obj.updateDynamic("unsafe_comps")(unsafe_comps)
    if (!js.isUndefined(unsafe_math)) __obj.updateDynamic("unsafe_math")(unsafe_math)
    if (!js.isUndefined(unsafe_proto)) __obj.updateDynamic("unsafe_proto")(unsafe_proto)
    if (!js.isUndefined(unsafe_regexp)) __obj.updateDynamic("unsafe_regexp")(unsafe_regexp)
    if (!js.isUndefined(unsafe_undefined)) __obj.updateDynamic("unsafe_undefined")(unsafe_undefined)
    if (!js.isUndefined(unused)) __obj.updateDynamic("unused")(unused)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[CompressOptions]
  }
}

