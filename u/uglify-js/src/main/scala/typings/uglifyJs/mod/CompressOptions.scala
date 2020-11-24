package typings.uglifyJs.mod

import typings.uglifyJs.uglifyJsStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressOptions extends js.Object {
  
  /**
    * Replace `arguments[index]` with function parameter name whenever possible.
    * @default true
    */
  var arguments: js.UndefOr[Boolean] = js.native
  
  /**
    * Apply optimizations to assignment expressions
    * @default ture
    */
  var assignments: js.UndefOr[Boolean] = js.native
  
  /**
    * Various optimizations for boolean context, for example `!!a ? b : c → a ? b : c`
    * @default true
    */
  var booleans: js.UndefOr[Boolean] = js.native
  
  /**
    * Collapse single-use non-constant variables, side effects permitting.
    * @default true
    */
  var collapse_vars: js.UndefOr[Boolean] = js.native
  
  /**
    * Apply certain optimizations to binary nodes, e.g. `!(a <= b) → a > b,` attempts to negate binary nodes, e.g. `a = !b && !c && !d && !e → a=!(b||c||d||e)` etc
    * @default true
    */
  var comparisons: js.UndefOr[Boolean] = js.native
  
  /**
    * Apply optimizations for `if-s` and conditional expressions.
    * @default true
    */
  var conditionals: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove unreachable code
    * @default true
    */
  var dead_code: js.UndefOr[Boolean] = js.native
  
  /**
    * remove redundant or non-standard directives
    * @default true
    */
  var directives: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass `true` to discard calls to console.* functions.
    * If you wish to drop a specific function call such as `console.info` and/or retain side effects from function
    * arguments after dropping the function call then use `pure_funcs` instead.
    * @default true
    */
  var drop_console: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove `debugger;` statements
    * @default true
    */
  var drop_debugger: js.UndefOr[Boolean] = js.native
  
  /**
    * Attempt to evaluate constant expressions
    * @default true
    */
  var evaluate: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass `true` to preserve completion values from terminal statements without `return`, e.g. in bookmarklets.
    * @default false
    */
  var expression: js.UndefOr[Boolean] = js.native
  
  /**
    * convert declarations from varto function whenever possible
    * @default true
    */
  var functions: js.UndefOr[Boolean] = js.native
  
  /**
    * @default {}
    */
  var global_defs: js.UndefOr[js.Object] = js.native
  
  /**
    * hoist function declarations
    * @default false
    */
  var hoist_funs: js.UndefOr[Boolean] = js.native
  
  /**
    * Hoist properties from constant object and array literals into regular variables subject to a set of constraints.
    * For example: `var o={p:1, q:2}; f(o.p, o.q);` is converted to `f(1, 2);`. Note: `hoist_props` works best with mangle enabled,
    * the compress option passes set to 2 or higher, and the compress option toplevel enabled.
    * @default true
    */
  var hoist_props: js.UndefOr[Boolean] = js.native
  
  /**
    * Hoist var declarations (this is `false` by default because it seems to increase the size of the output in general)
    * @default false
    */
  var hoist_vars: js.UndefOr[Boolean] = js.native
  
  /**
    * Optimizations for if/return and if/continue
    * @default true
    */
  var if_return: js.UndefOr[Boolean] = js.native
  
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
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.native
  
  /**
    * join consecutive `var` statements
    * @default true
    */
  var join_vars: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevents the compressor from discarding unused function arguments.
    * You need this for code which relies on `Function.length`
    * @default 'strict'
    */
  var keep_fargs: js.UndefOr[strict | Boolean] = js.native
  
  /**
    * Pass true to prevent the compressor from discarding function names.
    * Useful for code relying on `Function.prototype.name`.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass true to prevent Infinity from being compressed into `1/0`, which may cause performance issues on `Chrome`
    * @default false
    */
  var keep_infinity: js.UndefOr[Boolean] = js.native
  
  /**
    * Optimizations for `do`, `while` and `for` loops when we can statically determine the condition.
    * @default true
    */
  var loops: js.UndefOr[Boolean] = js.native
  
  /**
    * combine and reuse variables.
    * @default true
    */
  var merge_vars: js.UndefOr[Boolean] = js.native
  
  /**
    * negate `Immediately-Called Function Expressions` where the return value is discarded,
    * to avoid the parens that the code generator would insert.
    * @default true
    */
  var negate_iife: js.UndefOr[Boolean] = js.native
  
  /**
    * compact duplicate keys in object literals
    * @default true
    */
  var objects: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of times to run compress.
    * In some cases more than one pass leads to further compressed code.
    * Keep in mind more passes will take more time.
    * @default 1
    */
  var passes: js.UndefOr[Double] = js.native
  
  /**
    * Rewrite property access using the dot notation, for example `foo["bar"]` to `foo.bar`
    * @default true
    */
  var properties: js.UndefOr[Boolean] = js.native
  
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
  var pure_funcs: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * If you pass true for this, UglifyJS will assume that object property access
    * (e.g. foo.bar or foo["bar"]) doesn't have any side effects.
    * Specify "strict" to treat foo.bar as side-effect-free only when foo is certain to not throw,
    * i.e. not null or undefine
    * @default 'strict'
    */
  var pure_getters: js.UndefOr[Boolean | strict] = js.native
  
  /**
    * Allows single-use functions to be inlined as function expressions when permissible allowing further optimization.
    * Enabled by default. Option depends on reduce_vars being enabled. Some code runs faster in the Chrome V8 engine if
    * this option is disabled. Does not negatively impact other major browsers.
    * @default true
    */
  var reduce_funcs: js.UndefOr[Boolean] = js.native
  
  /**
    * Improve optimization on variables assigned with and used as constant values.
    * @default true
    */
  var reduce_vars: js.UndefOr[Boolean] = js.native
  
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
  var sequences: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass false to disable potentially dropping functions marked as "pure".
    * @default true
    */
  var side_effects: js.UndefOr[Boolean] = js.native
  
  /**
    * compact string concatenations
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.native
  
  /**
    * De-duplicate and remove unreachable `switch` branches.
    * @default true
    */
  var switches: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent specific toplevel functions and variables from unused removal
    * (can be array, comma-separated, RegExp or function. Implies toplevel)
    * @default null
    */
  var top_retain: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Drop unreferenced functions ("funcs") and/or variables ("vars") in the top level scope (false by default,
    * true to drop both unreferenced functions and variables)
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.native
  
  /**
    * Transforms typeof foo == "undefined" into foo === void 0.
    * Note: recommend to set this value to false for IE10 and earlier versions due to known issues
    * @default true
    */
  var typeofs: js.UndefOr[Boolean] = js.native
  
  /**
    * apply "unsafe" transformations (discussion below)
    * @default false
    */
  var unsafe: js.UndefOr[Boolean] = js.native
  
  /**
    * Compress and mangle `Function(args, code)` when both args and code are string literals.
    * @default false
    */
  var unsafe_Function: js.UndefOr[Boolean] = js.native
  
  /**
    * Compress expressions like a `<= b` assuming none of the operands can be (coerced to) `NaN`.
    * @default false
    */
  var unsafe_comps: js.UndefOr[Boolean] = js.native
  
  /**
    * Optimize numerical expressions like `2 * x * 3` into `6 * x`,
    * which may give imprecise floating point results.
    * @default false
    */
  var unsafe_math: js.UndefOr[Boolean] = js.native
  
  /**
    * Optimize expressions like `Array.prototype.slice.call(a)` into `[].slice.call(a)`
    * @default false
    */
  var unsafe_proto: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable substitutions of variables with `RegExp` values the same way as if they are constants.
    * @default false
    */
  var unsafe_regexp: js.UndefOr[Boolean] = js.native
  
  /**
    * substitute void 0 if there is a variable named undefined in scope
    * (variable name will be mangled, typically reduced to a single character)
    * @default false
    */
  var unsafe_undefined: js.UndefOr[Boolean] = js.native
  
  /**
    * drop unreferenced functions and variables
    * (simple direct variable assignments do not count as references unless set to "keep_assign")
    * @default true
    */
  var unused: js.UndefOr[Boolean] = js.native
  
  /**
    * convert block-scoped declaractions into `var`
    * whenever safe to do so
    * @default true
    */
  var varify: js.UndefOr[Boolean] = js.native
}
object CompressOptions {
  
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: Boolean): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setAssignments(value: Boolean): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setBooleans(value: Boolean): Self = this.set("booleans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleans: Self = this.set("booleans", js.undefined)
    
    @scala.inline
    def setCollapse_vars(value: Boolean): Self = this.set("collapse_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse_vars: Self = this.set("collapse_vars", js.undefined)
    
    @scala.inline
    def setComparisons(value: Boolean): Self = this.set("comparisons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisons: Self = this.set("comparisons", js.undefined)
    
    @scala.inline
    def setConditionals(value: Boolean): Self = this.set("conditionals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionals: Self = this.set("conditionals", js.undefined)
    
    @scala.inline
    def setDead_code(value: Boolean): Self = this.set("dead_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDead_code: Self = this.set("dead_code", js.undefined)
    
    @scala.inline
    def setDirectives(value: Boolean): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setDrop_console(value: Boolean): Self = this.set("drop_console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop_console: Self = this.set("drop_console", js.undefined)
    
    @scala.inline
    def setDrop_debugger(value: Boolean): Self = this.set("drop_debugger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop_debugger: Self = this.set("drop_debugger", js.undefined)
    
    @scala.inline
    def setEvaluate(value: Boolean): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    
    @scala.inline
    def setExpression(value: Boolean): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setFunctions(value: Boolean): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    
    @scala.inline
    def setGlobal_defs(value: js.Object): Self = this.set("global_defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal_defs: Self = this.set("global_defs", js.undefined)
    
    @scala.inline
    def setHoist_funs(value: Boolean): Self = this.set("hoist_funs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoist_funs: Self = this.set("hoist_funs", js.undefined)
    
    @scala.inline
    def setHoist_props(value: Boolean): Self = this.set("hoist_props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoist_props: Self = this.set("hoist_props", js.undefined)
    
    @scala.inline
    def setHoist_vars(value: Boolean): Self = this.set("hoist_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoist_vars: Self = this.set("hoist_vars", js.undefined)
    
    @scala.inline
    def setIf_return(value: Boolean): Self = this.set("if_return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_return: Self = this.set("if_return", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean | InlineFunctions): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setJoin_vars(value: Boolean): Self = this.set("join_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin_vars: Self = this.set("join_vars", js.undefined)
    
    @scala.inline
    def setKeep_fargs(value: strict | Boolean): Self = this.set("keep_fargs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_fargs: Self = this.set("keep_fargs", js.undefined)
    
    @scala.inline
    def setKeep_fnames(value: Boolean): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    
    @scala.inline
    def setKeep_infinity(value: Boolean): Self = this.set("keep_infinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_infinity: Self = this.set("keep_infinity", js.undefined)
    
    @scala.inline
    def setLoops(value: Boolean): Self = this.set("loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoops: Self = this.set("loops", js.undefined)
    
    @scala.inline
    def setMerge_vars(value: Boolean): Self = this.set("merge_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge_vars: Self = this.set("merge_vars", js.undefined)
    
    @scala.inline
    def setNegate_iife(value: Boolean): Self = this.set("negate_iife", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegate_iife: Self = this.set("negate_iife", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setPasses(value: Double): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasses: Self = this.set("passes", js.undefined)
    
    @scala.inline
    def setProperties(value: Boolean): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setPure_funcsVarargs(value: String*): Self = this.set("pure_funcs", js.Array(value :_*))
    
    @scala.inline
    def setPure_funcs(value: js.Array[String]): Self = this.set("pure_funcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePure_funcs: Self = this.set("pure_funcs", js.undefined)
    
    @scala.inline
    def setPure_funcsNull: Self = this.set("pure_funcs", null)
    
    @scala.inline
    def setPure_getters(value: Boolean | strict): Self = this.set("pure_getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePure_getters: Self = this.set("pure_getters", js.undefined)
    
    @scala.inline
    def setReduce_funcs(value: Boolean): Self = this.set("reduce_funcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduce_funcs: Self = this.set("reduce_funcs", js.undefined)
    
    @scala.inline
    def setReduce_vars(value: Boolean): Self = this.set("reduce_vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduce_vars: Self = this.set("reduce_vars", js.undefined)
    
    @scala.inline
    def setSequences(value: Boolean): Self = this.set("sequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequences: Self = this.set("sequences", js.undefined)
    
    @scala.inline
    def setSide_effects(value: Boolean): Self = this.set("side_effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide_effects: Self = this.set("side_effects", js.undefined)
    
    @scala.inline
    def setStrings(value: Boolean): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setSwitches(value: Boolean): Self = this.set("switches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitches: Self = this.set("switches", js.undefined)
    
    @scala.inline
    def setTop_retain(value: Boolean): Self = this.set("top_retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop_retain: Self = this.set("top_retain", js.undefined)
    
    @scala.inline
    def setTop_retainNull: Self = this.set("top_retain", null)
    
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
    
    @scala.inline
    def setTypeofs(value: Boolean): Self = this.set("typeofs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeofs: Self = this.set("typeofs", js.undefined)
    
    @scala.inline
    def setUnsafe(value: Boolean): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
    
    @scala.inline
    def setUnsafe_Function(value: Boolean): Self = this.set("unsafe_Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_Function: Self = this.set("unsafe_Function", js.undefined)
    
    @scala.inline
    def setUnsafe_comps(value: Boolean): Self = this.set("unsafe_comps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_comps: Self = this.set("unsafe_comps", js.undefined)
    
    @scala.inline
    def setUnsafe_math(value: Boolean): Self = this.set("unsafe_math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_math: Self = this.set("unsafe_math", js.undefined)
    
    @scala.inline
    def setUnsafe_proto(value: Boolean): Self = this.set("unsafe_proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_proto: Self = this.set("unsafe_proto", js.undefined)
    
    @scala.inline
    def setUnsafe_regexp(value: Boolean): Self = this.set("unsafe_regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_regexp: Self = this.set("unsafe_regexp", js.undefined)
    
    @scala.inline
    def setUnsafe_undefined(value: Boolean): Self = this.set("unsafe_undefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe_undefined: Self = this.set("unsafe_undefined", js.undefined)
    
    @scala.inline
    def setUnused(value: Boolean): Self = this.set("unused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnused: Self = this.set("unused", js.undefined)
    
    @scala.inline
    def setVarify(value: Boolean): Self = this.set("varify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVarify: Self = this.set("varify", js.undefined)
  }
}
