package typings.uglifyJs.mod

import typings.uglifyJs.uglifyJsStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /**
    * Replace `arguments[index]` with function parameter name whenever possible.
    * @default true
    */
  var arguments: js.UndefOr[Boolean] = js.undefined
  /**
    * Apply optimizations to assignment expressions
    * @default ture
    */
  var assignments: js.UndefOr[Boolean] = js.undefined
  /**
    * Various optimizations for boolean context, for example `!!a ? b : c → a ? b : c`
    * @default true
    */
  var booleans: js.UndefOr[Boolean] = js.undefined
  /**
    * Collapse single-use non-constant variables, side effects permitting.
    * @default true
    */
  var collapse_vars: js.UndefOr[Boolean] = js.undefined
  /**
    * Apply certain optimizations to binary nodes, e.g. `!(a <= b) → a > b,` attempts to negate binary nodes, e.g. `a = !b && !c && !d && !e → a=!(b||c||d||e)` etc
    * @default true
    */
  var comparisons: js.UndefOr[Boolean] = js.undefined
  /**
    * Apply optimizations for `if-s` and conditional expressions.
    * @default true
    */
  var conditionals: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove unreachable code
    * @default true
    */
  var dead_code: js.UndefOr[Boolean] = js.undefined
  /**
    * remove redundant or non-standard directives
    * @default true
    */
  var directives: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `true` to discard calls to console.* functions.
    * If you wish to drop a specific function call such as `console.info` and/or retain side effects from function
    * arguments after dropping the function call then use `pure_funcs` instead.
    * @default true
    */
  var drop_console: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove `debugger;` statements
    * @default true
    */
  var drop_debugger: js.UndefOr[Boolean] = js.undefined
  /**
    * Attempt to evaluate constant expressions
    * @default true
    */
  var evaluate: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `true` to preserve completion values from terminal statements without `return`, e.g. in bookmarklets.
    * @default false
    */
  var expression: js.UndefOr[Boolean] = js.undefined
  /**
    * convert declarations from varto function whenever possible
    * @default true
    */
  var functions: js.UndefOr[Boolean] = js.undefined
  /**
    * @default {}
    */
  var global_defs: js.UndefOr[js.Object] = js.undefined
  /**
    * hoist function declarations
    * @default false
    */
  var hoist_funs: js.UndefOr[Boolean] = js.undefined
  /**
    * Hoist properties from constant object and array literals into regular variables subject to a set of constraints.
    * For example: `var o={p:1, q:2}; f(o.p, o.q);` is converted to `f(1, 2);`. Note: `hoist_props` works best with mangle enabled,
    * the compress option passes set to 2 or higher, and the compress option toplevel enabled.
    * @default true
    */
  var hoist_props: js.UndefOr[Boolean] = js.undefined
  /**
    * Hoist var declarations (this is `false` by default because it seems to increase the size of the output in general)
    * @default false
    */
  var hoist_vars: js.UndefOr[Boolean] = js.undefined
  /**
    * Optimizations for if/return and if/continue
    * @default true
    */
  var if_return: js.UndefOr[Boolean] = js.undefined
  /**
    * Inline calls to function with simple/return statement
    * - false -- same as `Disabled`
    * - `Disabled` -- disabled inlining
    * - `SimpleFunctions` -- inline simple functions
    * - `WithArguments` -- inline functions with arguments
    * - `WithArgumentsAndVariables` -- inline functions with arguments and variables
    * - true -- same as `WithArgumentsAndVariables`
    * @default true
    */
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.undefined
  /**
    * join consecutive `var` statements
    * @default true
    */
  var join_vars: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevents the compressor from discarding unused function arguments.
    * You need this for code which relies on `Function.length`
    * @default 'strict'
    */
  var keep_fargs: js.UndefOr[strict | Boolean] = js.undefined
  /**
    * Pass true to prevent the compressor from discarding function names.
    * Useful for code relying on `Function.prototype.name`.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass true to prevent Infinity from being compressed into `1/0`, which may cause performance issues on `Chrome`
    * @default false
    */
  var keep_infinity: js.UndefOr[Boolean] = js.undefined
  /**
    * Optimizations for `do`, `while` and `for` loops when we can statically determine the condition.
    * @default true
    */
  var loops: js.UndefOr[Boolean] = js.undefined
  /**
    * negate `Immediately-Called Function Expressions` where the return value is discarded,
    * to avoid the parens that the code generator would insert.
    * @default true
    */
  var negate_iife: js.UndefOr[Boolean] = js.undefined
  /**
    * compact duplicate keys in object literals
    * @default true
    */
  var objects: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of times to run compress.
    * In some cases more than one pass leads to further compressed code.
    * Keep in mind more passes will take more time.
    * @default 1
    */
  var passes: js.UndefOr[Double] = js.undefined
  /**
    * Rewrite property access using the dot notation, for example `foo["bar"]` to `foo.bar`
    * @default true
    */
  var properties: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of names and UglifyJS will assume that those functions do not produce side effects.
    * DANGER: will not check if the name is redefined in scope.
    * An example case here, for instance `var q = Math.floor(a/b)`.
    * If variable q is not used elsewhere, UglifyJS will drop it, but will still keep the `Math.floor(a/b)`,
    * not knowing what it does. You can pass `pure_funcs: [ 'Math.floor' ]` to let it know that this function
    * won't produce any side effect, in which case the whole statement would get discarded. The current
    * implementation adds some overhead (compression will be slower).
    * @default null
    */
  var pure_funcs: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * If you pass true for this, UglifyJS will assume that object property access
    * (e.g. foo.bar or foo["bar"]) doesn't have any side effects.
    * Specify "strict" to treat foo.bar as side-effect-free only when foo is certain to not throw,
    * i.e. not null or undefine
    * @default 'strict'
    */
  var pure_getters: js.UndefOr[Boolean | strict] = js.undefined
  /**
    * Allows single-use functions to be inlined as function expressions when permissible allowing further optimization.
    * Enabled by default. Option depends on reduce_vars being enabled. Some code runs faster in the Chrome V8 engine if
    * this option is disabled. Does not negatively impact other major browsers.
    * @default true
    */
  var reduce_funcs: js.UndefOr[Boolean] = js.undefined
  /**
    * Improve optimization on variables assigned with and used as constant values.
    * @default true
    */
  var reduce_vars: js.UndefOr[Boolean] = js.undefined
  /**
    * join consecutive simple statements using the comma operator.
    * May be set to a positive integer to specify the maximum number of
    * consecutive comma sequences that will be generated.
    * If this option is set to true then the default sequences limit is 200.
    * Set option to false or 0 to disable. The smallest sequences length is 2.
    * A sequences value of 1 is grandfathered to be equivalent to true and as such means 200.
    * On rare occasions the default sequences limit leads to very slow compress times in which case
    * a value of 20 or less is recommended
    * @default true
    */
  var sequences: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass false to disable potentially dropping functions marked as "pure".
    * @default true
    */
  var side_effects: js.UndefOr[Boolean] = js.undefined
  /**
    * compact string concatenations
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.undefined
  /**
    * De-duplicate and remove unreachable `switch` branches.
    * @default true
    */
  var switches: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent specific toplevel functions and variables from unused removal
    * (can be array, comma-separated, RegExp or function. Implies toplevel)
    * @default null
    */
  var top_retain: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Drop unreferenced functions ("funcs") and/or variables ("vars") in the top level scope (false by default,
    * true to drop both unreferenced functions and variables)
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.undefined
  /**
    * Transforms typeof foo == "undefined" into foo === void 0.
    * Note: recommend to set this value to false for IE10 and earlier versions due to known issues
    * @default true
    */
  var typeofs: js.UndefOr[Boolean] = js.undefined
  /**
    * apply "unsafe" transformations (discussion below)
    * @default false
    */
  var unsafe: js.UndefOr[Boolean] = js.undefined
  /**
    * Compress and mangle `Function(args, code)` when both args and code are string literals.
    * @default false
    */
  var unsafe_Function: js.UndefOr[Boolean] = js.undefined
  /**
    * Compress expressions like a `<= b` assuming none of the operands can be (coerced to) `NaN`.
    * @default false
    */
  var unsafe_comps: js.UndefOr[Boolean] = js.undefined
  /**
    * Optimize numerical expressions like `2 * x * 3` into `6 * x`,
    * which may give imprecise floating point results.
    * @default false
    */
  var unsafe_math: js.UndefOr[Boolean] = js.undefined
  /**
    * Optimize expressions like `Array.prototype.slice.call(a)` into `[].slice.call(a)`
    * @default false
    */
  var unsafe_proto: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable substitutions of variables with `RegExp` values the same way as if they are constants.
    * @default false
    */
  var unsafe_regexp: js.UndefOr[Boolean] = js.undefined
  /**
    * substitute void 0 if there is a variable named undefined in scope
    * (variable name will be mangled, typically reduced to a single character)
    * @default false
    */
  var unsafe_undefined: js.UndefOr[Boolean] = js.undefined
  /**
    * drop unreferenced functions and variables
    * (simple direct variable assignments do not count as references unless set to "keep_assign")
    * @default true
    */
  var unused: js.UndefOr[Boolean] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    arguments: js.UndefOr[Boolean] = js.undefined,
    assignments: js.UndefOr[Boolean] = js.undefined,
    booleans: js.UndefOr[Boolean] = js.undefined,
    collapse_vars: js.UndefOr[Boolean] = js.undefined,
    comparisons: js.UndefOr[Boolean] = js.undefined,
    conditionals: js.UndefOr[Boolean] = js.undefined,
    dead_code: js.UndefOr[Boolean] = js.undefined,
    directives: js.UndefOr[Boolean] = js.undefined,
    drop_console: js.UndefOr[Boolean] = js.undefined,
    drop_debugger: js.UndefOr[Boolean] = js.undefined,
    evaluate: js.UndefOr[Boolean] = js.undefined,
    expression: js.UndefOr[Boolean] = js.undefined,
    functions: js.UndefOr[Boolean] = js.undefined,
    global_defs: js.Object = null,
    hoist_funs: js.UndefOr[Boolean] = js.undefined,
    hoist_props: js.UndefOr[Boolean] = js.undefined,
    hoist_vars: js.UndefOr[Boolean] = js.undefined,
    if_return: js.UndefOr[Boolean] = js.undefined,
    `inline`: Boolean | InlineFunctions = null,
    join_vars: js.UndefOr[Boolean] = js.undefined,
    keep_fargs: strict | Boolean = null,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    keep_infinity: js.UndefOr[Boolean] = js.undefined,
    loops: js.UndefOr[Boolean] = js.undefined,
    negate_iife: js.UndefOr[Boolean] = js.undefined,
    objects: js.UndefOr[Boolean] = js.undefined,
    passes: js.UndefOr[Double] = js.undefined,
    properties: js.UndefOr[Boolean] = js.undefined,
    pure_funcs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    pure_getters: Boolean | strict = null,
    reduce_funcs: js.UndefOr[Boolean] = js.undefined,
    reduce_vars: js.UndefOr[Boolean] = js.undefined,
    sequences: js.UndefOr[Boolean] = js.undefined,
    side_effects: js.UndefOr[Boolean] = js.undefined,
    strings: js.UndefOr[Boolean] = js.undefined,
    switches: js.UndefOr[Boolean] = js.undefined,
    top_retain: js.UndefOr[Null | Boolean] = js.undefined,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    typeofs: js.UndefOr[Boolean] = js.undefined,
    unsafe: js.UndefOr[Boolean] = js.undefined,
    unsafe_Function: js.UndefOr[Boolean] = js.undefined,
    unsafe_comps: js.UndefOr[Boolean] = js.undefined,
    unsafe_math: js.UndefOr[Boolean] = js.undefined,
    unsafe_proto: js.UndefOr[Boolean] = js.undefined,
    unsafe_regexp: js.UndefOr[Boolean] = js.undefined,
    unsafe_undefined: js.UndefOr[Boolean] = js.undefined,
    unused: js.UndefOr[Boolean] = js.undefined
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arguments)) __obj.updateDynamic("arguments")(arguments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(assignments)) __obj.updateDynamic("assignments")(assignments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(booleans)) __obj.updateDynamic("booleans")(booleans.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse_vars)) __obj.updateDynamic("collapse_vars")(collapse_vars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comparisons)) __obj.updateDynamic("comparisons")(comparisons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dead_code)) __obj.updateDynamic("dead_code")(dead_code.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drop_console)) __obj.updateDynamic("drop_console")(drop_console.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drop_debugger)) __obj.updateDynamic("drop_debugger")(drop_debugger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluate)) __obj.updateDynamic("evaluate")(evaluate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.get.asInstanceOf[js.Any])
    if (global_defs != null) __obj.updateDynamic("global_defs")(global_defs.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_funs)) __obj.updateDynamic("hoist_funs")(hoist_funs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_props)) __obj.updateDynamic("hoist_props")(hoist_props.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_vars)) __obj.updateDynamic("hoist_vars")(hoist_vars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(if_return)) __obj.updateDynamic("if_return")(if_return.get.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(join_vars)) __obj.updateDynamic("join_vars")(join_vars.get.asInstanceOf[js.Any])
    if (keep_fargs != null) __obj.updateDynamic("keep_fargs")(keep_fargs.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_infinity)) __obj.updateDynamic("keep_infinity")(keep_infinity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negate_iife)) __obj.updateDynamic("negate_iife")(negate_iife.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passes)) __obj.updateDynamic("passes")(passes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pure_funcs)) __obj.updateDynamic("pure_funcs")(pure_funcs.asInstanceOf[js.Any])
    if (pure_getters != null) __obj.updateDynamic("pure_getters")(pure_getters.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_funcs)) __obj.updateDynamic("reduce_funcs")(reduce_funcs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_vars)) __obj.updateDynamic("reduce_vars")(reduce_vars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sequences)) __obj.updateDynamic("sequences")(sequences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(side_effects)) __obj.updateDynamic("side_effects")(side_effects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strings)) __obj.updateDynamic("strings")(strings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(switches)) __obj.updateDynamic("switches")(switches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top_retain)) __obj.updateDynamic("top_retain")(top_retain.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(typeofs)) __obj.updateDynamic("typeofs")(typeofs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_Function)) __obj.updateDynamic("unsafe_Function")(unsafe_Function.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_comps)) __obj.updateDynamic("unsafe_comps")(unsafe_comps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_math)) __obj.updateDynamic("unsafe_math")(unsafe_math.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_proto)) __obj.updateDynamic("unsafe_proto")(unsafe_proto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_regexp)) __obj.updateDynamic("unsafe_regexp")(unsafe_regexp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_undefined)) __obj.updateDynamic("unsafe_undefined")(unsafe_undefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unused)) __obj.updateDynamic("unused")(unused.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

