package typings.uglifyJs

import org.scalablytyped.runtime.StringDictionary
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import typings.std.RegExp
import typings.uglifyJs.uglifyJsBooleans.`false`
import typings.uglifyJs.uglifyJsStrings.`inline`
import typings.uglifyJs.uglifyJsStrings.all
import typings.uglifyJs.uglifyJsStrings.some
import typings.uglifyJs.uglifyJsStrings.strict
import typings.uglifyJs.uglifyJsStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait InlineFunctions extends StObject
  @JSImport("uglify-js", "InlineFunctions")
  @js.native
  object InlineFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InlineFunctions with Double] = js.native
    
    @js.native
    sealed trait Disabled extends InlineFunctions
    /* 0 */ val Disabled: typings.uglifyJs.mod.InlineFunctions.Disabled with Double = js.native
    
    @js.native
    sealed trait SimpleFunctions extends InlineFunctions
    /* 1 */ val SimpleFunctions: typings.uglifyJs.mod.InlineFunctions.SimpleFunctions with Double = js.native
    
    @js.native
    sealed trait WithArguments extends InlineFunctions
    /* 2 */ val WithArguments: typings.uglifyJs.mod.InlineFunctions.WithArguments with Double = js.native
    
    @js.native
    sealed trait WithArgumentsAndVariables extends InlineFunctions
    /* 3 */ val WithArgumentsAndVariables: typings.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
  }
  
  @js.native
  sealed trait OutputQuoteStyle extends StObject
  @JSImport("uglify-js", "OutputQuoteStyle")
  @js.native
  object OutputQuoteStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OutputQuoteStyle with Double] = js.native
    
    @js.native
    sealed trait AlwaysDouble extends OutputQuoteStyle
    /* 2 */ val AlwaysDouble: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    
    @js.native
    sealed trait AlwaysOriginal extends OutputQuoteStyle
    /* 3 */ val AlwaysOriginal: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    
    @js.native
    sealed trait AlwaysSingle extends OutputQuoteStyle
    /* 1 */ val AlwaysSingle: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    
    @js.native
    sealed trait PreferDouble extends OutputQuoteStyle
    /* 0 */ val PreferDouble: typings.uglifyJs.mod.OutputQuoteStyle.PreferDouble with Double = js.native
  }
  
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: String): MinifyOutput = js.native
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  @JSImport("uglify-js", "minify")
  @js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  
  @js.native
  trait CompressOptions extends StObject {
    
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
    implicit class CompressOptionsMutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: Boolean): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setAssignments(value: Boolean): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
      
      @scala.inline
      def setBooleans(value: Boolean): Self = StObject.set(x, "booleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleansUndefined: Self = StObject.set(x, "booleans", js.undefined)
      
      @scala.inline
      def setCollapse_vars(value: Boolean): Self = StObject.set(x, "collapse_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapse_varsUndefined: Self = StObject.set(x, "collapse_vars", js.undefined)
      
      @scala.inline
      def setComparisons(value: Boolean): Self = StObject.set(x, "comparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonsUndefined: Self = StObject.set(x, "comparisons", js.undefined)
      
      @scala.inline
      def setConditionals(value: Boolean): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalsUndefined: Self = StObject.set(x, "conditionals", js.undefined)
      
      @scala.inline
      def setDead_code(value: Boolean): Self = StObject.set(x, "dead_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDead_codeUndefined: Self = StObject.set(x, "dead_code", js.undefined)
      
      @scala.inline
      def setDirectives(value: Boolean): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setDrop_console(value: Boolean): Self = StObject.set(x, "drop_console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrop_consoleUndefined: Self = StObject.set(x, "drop_console", js.undefined)
      
      @scala.inline
      def setDrop_debugger(value: Boolean): Self = StObject.set(x, "drop_debugger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrop_debuggerUndefined: Self = StObject.set(x, "drop_debugger", js.undefined)
      
      @scala.inline
      def setEvaluate(value: Boolean): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      @scala.inline
      def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setGlobal_defs(value: js.Object): Self = StObject.set(x, "global_defs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal_defsUndefined: Self = StObject.set(x, "global_defs", js.undefined)
      
      @scala.inline
      def setHoist_funs(value: Boolean): Self = StObject.set(x, "hoist_funs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoist_funsUndefined: Self = StObject.set(x, "hoist_funs", js.undefined)
      
      @scala.inline
      def setHoist_props(value: Boolean): Self = StObject.set(x, "hoist_props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoist_propsUndefined: Self = StObject.set(x, "hoist_props", js.undefined)
      
      @scala.inline
      def setHoist_vars(value: Boolean): Self = StObject.set(x, "hoist_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoist_varsUndefined: Self = StObject.set(x, "hoist_vars", js.undefined)
      
      @scala.inline
      def setIf_return(value: Boolean): Self = StObject.set(x, "if_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIf_returnUndefined: Self = StObject.set(x, "if_return", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean | InlineFunctions): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setJoin_vars(value: Boolean): Self = StObject.set(x, "join_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoin_varsUndefined: Self = StObject.set(x, "join_vars", js.undefined)
      
      @scala.inline
      def setKeep_fargs(value: strict | Boolean): Self = StObject.set(x, "keep_fargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fargsUndefined: Self = StObject.set(x, "keep_fargs", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setKeep_infinity(value: Boolean): Self = StObject.set(x, "keep_infinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_infinityUndefined: Self = StObject.set(x, "keep_infinity", js.undefined)
      
      @scala.inline
      def setLoops(value: Boolean): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
      
      @scala.inline
      def setMerge_vars(value: Boolean): Self = StObject.set(x, "merge_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerge_varsUndefined: Self = StObject.set(x, "merge_vars", js.undefined)
      
      @scala.inline
      def setNegate_iife(value: Boolean): Self = StObject.set(x, "negate_iife", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegate_iifeUndefined: Self = StObject.set(x, "negate_iife", js.undefined)
      
      @scala.inline
      def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
      
      @scala.inline
      def setProperties(value: Boolean): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPure_funcs(value: js.Array[String]): Self = StObject.set(x, "pure_funcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPure_funcsNull: Self = StObject.set(x, "pure_funcs", null)
      
      @scala.inline
      def setPure_funcsUndefined: Self = StObject.set(x, "pure_funcs", js.undefined)
      
      @scala.inline
      def setPure_funcsVarargs(value: String*): Self = StObject.set(x, "pure_funcs", js.Array(value :_*))
      
      @scala.inline
      def setPure_getters(value: Boolean | strict): Self = StObject.set(x, "pure_getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPure_gettersUndefined: Self = StObject.set(x, "pure_getters", js.undefined)
      
      @scala.inline
      def setReduce_funcs(value: Boolean): Self = StObject.set(x, "reduce_funcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduce_funcsUndefined: Self = StObject.set(x, "reduce_funcs", js.undefined)
      
      @scala.inline
      def setReduce_vars(value: Boolean): Self = StObject.set(x, "reduce_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduce_varsUndefined: Self = StObject.set(x, "reduce_vars", js.undefined)
      
      @scala.inline
      def setSequences(value: Boolean): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequencesUndefined: Self = StObject.set(x, "sequences", js.undefined)
      
      @scala.inline
      def setSide_effects(value: Boolean): Self = StObject.set(x, "side_effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide_effectsUndefined: Self = StObject.set(x, "side_effects", js.undefined)
      
      @scala.inline
      def setStrings(value: Boolean): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      @scala.inline
      def setSwitches(value: Boolean): Self = StObject.set(x, "switches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchesUndefined: Self = StObject.set(x, "switches", js.undefined)
      
      @scala.inline
      def setTop_retain(value: Boolean): Self = StObject.set(x, "top_retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop_retainNull: Self = StObject.set(x, "top_retain", null)
      
      @scala.inline
      def setTop_retainUndefined: Self = StObject.set(x, "top_retain", js.undefined)
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
      
      @scala.inline
      def setTypeofs(value: Boolean): Self = StObject.set(x, "typeofs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofsUndefined: Self = StObject.set(x, "typeofs", js.undefined)
      
      @scala.inline
      def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      @scala.inline
      def setUnsafe_Function(value: Boolean): Self = StObject.set(x, "unsafe_Function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_FunctionUndefined: Self = StObject.set(x, "unsafe_Function", js.undefined)
      
      @scala.inline
      def setUnsafe_comps(value: Boolean): Self = StObject.set(x, "unsafe_comps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_compsUndefined: Self = StObject.set(x, "unsafe_comps", js.undefined)
      
      @scala.inline
      def setUnsafe_math(value: Boolean): Self = StObject.set(x, "unsafe_math", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_mathUndefined: Self = StObject.set(x, "unsafe_math", js.undefined)
      
      @scala.inline
      def setUnsafe_proto(value: Boolean): Self = StObject.set(x, "unsafe_proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_protoUndefined: Self = StObject.set(x, "unsafe_proto", js.undefined)
      
      @scala.inline
      def setUnsafe_regexp(value: Boolean): Self = StObject.set(x, "unsafe_regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_regexpUndefined: Self = StObject.set(x, "unsafe_regexp", js.undefined)
      
      @scala.inline
      def setUnsafe_undefined(value: Boolean): Self = StObject.set(x, "unsafe_undefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_undefinedUndefined: Self = StObject.set(x, "unsafe_undefined", js.undefined)
      
      @scala.inline
      def setUnused(value: Boolean): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
      
      @scala.inline
      def setVarify(value: Boolean): Self = StObject.set(x, "varify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarifyUndefined: Self = StObject.set(x, "varify", js.undefined)
    }
  }
  
  @js.native
  trait MangleOptions extends StObject {
    
    /** Pass true to mangle names visible in scopes where `eval` or with are used. */
    var eval: js.UndefOr[Boolean] = js.native
    
    /** Pass true to not mangle function names. Useful for code relying on `Function.prototype.name`. */
    var keep_fnames: js.UndefOr[Boolean] = js.native
    
    var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.native
    
    /** Pass an array of identifiers that should be excluded from mangling. Example: `["foo", "bar"]`. */
    var reserved: js.UndefOr[js.Array[String]] = js.native
    
    /** Pass true to mangle names declared in the top level scope. */
    var toplevel: js.UndefOr[Boolean] = js.native
  }
  object MangleOptions {
    
    @scala.inline
    def apply(): MangleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MangleOptions]
    }
    
    @scala.inline
    implicit class MangleOptionsMutableBuilder[Self <: MangleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setProperties(value: Boolean | ManglePropertiesOptions): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
      
      @scala.inline
      def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value :_*))
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
    }
  }
  
  @js.native
  trait ManglePropertiesOptions extends StObject {
    
    /** Use true to allow the mangling of builtin DOM properties. Not recommended to override this setting. */
    var builtins: js.UndefOr[Boolean] = js.native
    
    /** Mangle names with the original name still present. Pass an empty string "" to enable, or a non-empty string to set the debug suffix. */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** Only mangle unquoted property names */
    var keep_quoted: js.UndefOr[Boolean] = js.native
    
    /** Pass a RegExp literal to only mangle property names matching the regular expression. */
    var regex: js.UndefOr[RegExp] = js.native
    
    /** Do not mangle property names listed in the reserved array */
    var reserved: js.UndefOr[js.Array[String]] = js.native
  }
  object ManglePropertiesOptions {
    
    @scala.inline
    def apply(): ManglePropertiesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManglePropertiesOptions]
    }
    
    @scala.inline
    implicit class ManglePropertiesOptionsMutableBuilder[Self <: ManglePropertiesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuiltins(value: Boolean): Self = StObject.set(x, "builtins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinsUndefined: Self = StObject.set(x, "builtins", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setKeep_quoted(value: Boolean): Self = StObject.set(x, "keep_quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_quotedUndefined: Self = StObject.set(x, "keep_quoted", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
      
      @scala.inline
      def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MinifyOptions extends StObject {
    
    /**
      * Pass `false` to skip compressing entirely.
      * Pass an object to specify custom compress options.
      * @default {}
      */
    var compress: js.UndefOr[`false` | CompressOptions] = js.native
    
    /**
      * Set to true to support IE8
      * @default false
      */
    var ie8: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass true to prevent discarding or mangling of function names.
      * Useful for code relying on Function.prototype.name.
      * @default false
      */
    var keep_fnames: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass `false` to skip mangling names,
      * or pass an object to specify mangle options (see below).
      * @default true
      */
    var mangle: js.UndefOr[Boolean | MangleOptions] = js.native
    
    /**
      * Pass an empty object {} or a previously used nameCache object
      * if you wish to cache mangled variable and property names across multiple invocations of minify().
      * Note: this is a read/write property. `minify()` will read the name cache state of this object
      * and update it during minification so that it may be reused or externally persisted by the user
      */
    var nameCache: js.UndefOr[js.Object] = js.native
    
    /**
      * Pass an object if you wish to specify additional output options.
      * The defaults are optimized for best compression
      */
    var output: js.UndefOr[OutputOptions] = js.native
    
    /**
      * Pass an object if you wish to specify some additional parse options.
      */
    var parse: js.UndefOr[ParseOptions] = js.native
    
    /**
      * Pass an object if you wish to specify source map options.
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.native
    
    /**
      * Set to `true` if you wish to enable top level variable and function name mangling
      * and to drop unused variables and functions.
      * @default false
      */
    var toplevel: js.UndefOr[Boolean] = js.native
    
    /**
      * Pass `true` to return compressor warnings in result.warnings.
      * Use the value `verbose` for more detailed warnings.
      * @default false
      */
    var warnings: js.UndefOr[Boolean | verbose] = js.native
  }
  object MinifyOptions {
    
    @scala.inline
    def apply(): MinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinifyOptions]
    }
    
    @scala.inline
    implicit class MinifyOptionsMutableBuilder[Self <: MinifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: `false` | CompressOptions): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setMangle(value: Boolean | MangleOptions): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      @scala.inline
      def setNameCache(value: js.Object): Self = StObject.set(x, "nameCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameCacheUndefined: Self = StObject.set(x, "nameCache", js.undefined)
      
      @scala.inline
      def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setParse(value: ParseOptions): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean | SourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean | verbose): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait MinifyOutput extends StObject {
    
    var code: String = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var map: String = js.native
    
    var warnings: js.UndefOr[js.Array[String]] = js.native
  }
  object MinifyOutput {
    
    @scala.inline
    def apply(code: String, map: String): MinifyOutput = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinifyOutput]
    }
    
    @scala.inline
    implicit class MinifyOutputMutableBuilder[Self <: MinifyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OutputOptions extends StObject {
    
    var ascii_only: js.UndefOr[Boolean] = js.native
    
    var beautify: js.UndefOr[Boolean] = js.native
    
    var braces: js.UndefOr[Boolean] = js.native
    
    var comments: js.UndefOr[Boolean | all | some | RegExp] = js.native
    
    var indent_level: js.UndefOr[Double] = js.native
    
    var indent_start: js.UndefOr[Boolean] = js.native
    
    var inline_script: js.UndefOr[Boolean] = js.native
    
    var keep_quoted_props: js.UndefOr[Boolean] = js.native
    
    var max_line_len: js.UndefOr[Boolean | Double] = js.native
    
    var preamble: js.UndefOr[String] = js.native
    
    var preserve_line: js.UndefOr[Boolean] = js.native
    
    var quote_keys: js.UndefOr[Boolean] = js.native
    
    var quote_style: js.UndefOr[OutputQuoteStyle] = js.native
    
    var semicolons: js.UndefOr[Boolean] = js.native
    
    var shebang: js.UndefOr[Boolean] = js.native
    
    var webkit: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var wrap_iife: js.UndefOr[Boolean] = js.native
  }
  object OutputOptions {
    
    @scala.inline
    def apply(): OutputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputOptions]
    }
    
    @scala.inline
    implicit class OutputOptionsMutableBuilder[Self <: OutputOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscii_only(value: Boolean): Self = StObject.set(x, "ascii_only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscii_onlyUndefined: Self = StObject.set(x, "ascii_only", js.undefined)
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setBraces(value: Boolean): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBracesUndefined: Self = StObject.set(x, "braces", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean | all | some | RegExp): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
      
      @scala.inline
      def setIndent_start(value: Boolean): Self = StObject.set(x, "indent_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_startUndefined: Self = StObject.set(x, "indent_start", js.undefined)
      
      @scala.inline
      def setInline_script(value: Boolean): Self = StObject.set(x, "inline_script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_scriptUndefined: Self = StObject.set(x, "inline_script", js.undefined)
      
      @scala.inline
      def setKeep_quoted_props(value: Boolean): Self = StObject.set(x, "keep_quoted_props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_quoted_propsUndefined: Self = StObject.set(x, "keep_quoted_props", js.undefined)
      
      @scala.inline
      def setMax_line_len(value: Boolean | Double): Self = StObject.set(x, "max_line_len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_line_lenUndefined: Self = StObject.set(x, "max_line_len", js.undefined)
      
      @scala.inline
      def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreambleUndefined: Self = StObject.set(x, "preamble", js.undefined)
      
      @scala.inline
      def setPreserve_line(value: Boolean): Self = StObject.set(x, "preserve_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserve_lineUndefined: Self = StObject.set(x, "preserve_line", js.undefined)
      
      @scala.inline
      def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
      
      @scala.inline
      def setQuote_style(value: OutputQuoteStyle): Self = StObject.set(x, "quote_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_styleUndefined: Self = StObject.set(x, "quote_style", js.undefined)
      
      @scala.inline
      def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      @scala.inline
      def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
      
      @scala.inline
      def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUndefined: Self = StObject.set(x, "webkit", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap_iife(value: Boolean): Self = StObject.set(x, "wrap_iife", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_iifeUndefined: Self = StObject.set(x, "wrap_iife", js.undefined)
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * Support top level `return` statements
      * @default false
      */
    var bare_returns: js.UndefOr[Boolean] = js.native
    
    /** @default true */
    var html5_comments: js.UndefOr[Boolean] = js.native
    
    /**
      * Support `#!command` as the first line
      * @default true
      */
    var shebang: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBare_returns(value: Boolean): Self = StObject.set(x, "bare_returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBare_returnsUndefined: Self = StObject.set(x, "bare_returns", js.undefined)
      
      @scala.inline
      def setHtml5_comments(value: Boolean): Self = StObject.set(x, "html5_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml5_commentsUndefined: Self = StObject.set(x, "html5_comments", js.undefined)
      
      @scala.inline
      def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
    }
  }
  
  @js.native
  trait SourceMapOptions extends StObject {
    
    var content: js.UndefOr[RawSourceMap | `inline`] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var includeSources: js.UndefOr[Boolean] = js.native
    
    /**
      * Include symbol names in the source map
      * @default true
      */
    var names: js.UndefOr[Boolean] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String | `inline`] = js.native
  }
  object SourceMapOptions {
    
    @scala.inline
    def apply(): SourceMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    @scala.inline
    implicit class SourceMapOptionsMutableBuilder[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: RawSourceMap | `inline`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setIncludeSources(value: Boolean): Self = StObject.set(x, "includeSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSourcesUndefined: Self = StObject.set(x, "includeSources", js.undefined)
      
      @scala.inline
      def setNames(value: Boolean): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setUrl(value: String | `inline`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
