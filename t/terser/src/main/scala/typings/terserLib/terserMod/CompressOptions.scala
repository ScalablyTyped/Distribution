package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  var arguments: js.UndefOr[scala.Boolean] = js.undefined
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  var booleans: js.UndefOr[scala.Boolean] = js.undefined
  var collapse_vars: js.UndefOr[scala.Boolean] = js.undefined
  var comparisons: js.UndefOr[scala.Boolean] = js.undefined
  var computed_props: js.UndefOr[scala.Boolean] = js.undefined
  var conditionals: js.UndefOr[scala.Boolean] = js.undefined
  var dead_code: js.UndefOr[scala.Boolean] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var directives: js.UndefOr[scala.Boolean] = js.undefined
  var drop_console: js.UndefOr[scala.Boolean] = js.undefined
  var drop_debugger: js.UndefOr[scala.Boolean] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var evaluate: js.UndefOr[scala.Boolean] = js.undefined
  var expression: js.UndefOr[scala.Boolean] = js.undefined
  var global_defs: js.UndefOr[js.Object] = js.undefined
  var hoist_funs: js.UndefOr[scala.Boolean] = js.undefined
  var hoist_props: js.UndefOr[scala.Boolean] = js.undefined
  var hoist_vars: js.UndefOr[scala.Boolean] = js.undefined
  var if_return: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean | InlineFunctions] = js.undefined
  var join_vars: js.UndefOr[scala.Boolean] = js.undefined
  var keep_classnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var keep_fargs: js.UndefOr[scala.Boolean] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var keep_infinity: js.UndefOr[scala.Boolean] = js.undefined
  var loops: js.UndefOr[scala.Boolean] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var negate_iife: js.UndefOr[scala.Boolean] = js.undefined
  var passes: js.UndefOr[scala.Double] = js.undefined
  var properties: js.UndefOr[scala.Boolean] = js.undefined
  var pure_funcs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pure_getters: js.UndefOr[scala.Boolean | terserLib.terserLibStrings.strict] = js.undefined
  var reduce_funcs: js.UndefOr[scala.Boolean] = js.undefined
  var reduce_vars: js.UndefOr[scala.Boolean] = js.undefined
  var sequences: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var side_effects: js.UndefOr[scala.Boolean] = js.undefined
  var switches: js.UndefOr[scala.Boolean] = js.undefined
  var top_retain: js.UndefOr[scala.Null | java.lang.String | js.Array[java.lang.String] | stdLib.RegExp] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  var typeofs: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_Function: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_arrows: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_comps: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_math: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_methods: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_proto: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_regexp: js.UndefOr[scala.Boolean] = js.undefined
  var unsafe_undefined: js.UndefOr[scala.Boolean] = js.undefined
  var unused: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    arguments: js.UndefOr[scala.Boolean] = js.undefined,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    booleans: js.UndefOr[scala.Boolean] = js.undefined,
    collapse_vars: js.UndefOr[scala.Boolean] = js.undefined,
    comparisons: js.UndefOr[scala.Boolean] = js.undefined,
    computed_props: js.UndefOr[scala.Boolean] = js.undefined,
    conditionals: js.UndefOr[scala.Boolean] = js.undefined,
    dead_code: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    directives: js.UndefOr[scala.Boolean] = js.undefined,
    drop_console: js.UndefOr[scala.Boolean] = js.undefined,
    drop_debugger: js.UndefOr[scala.Boolean] = js.undefined,
    ecma: ECMA = null,
    evaluate: js.UndefOr[scala.Boolean] = js.undefined,
    expression: js.UndefOr[scala.Boolean] = js.undefined,
    global_defs: js.Object = null,
    hoist_funs: js.UndefOr[scala.Boolean] = js.undefined,
    hoist_props: js.UndefOr[scala.Boolean] = js.undefined,
    hoist_vars: js.UndefOr[scala.Boolean] = js.undefined,
    if_return: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: scala.Boolean | InlineFunctions = null,
    join_vars: js.UndefOr[scala.Boolean] = js.undefined,
    keep_classnames: scala.Boolean | stdLib.RegExp = null,
    keep_fargs: js.UndefOr[scala.Boolean] = js.undefined,
    keep_fnames: scala.Boolean | stdLib.RegExp = null,
    keep_infinity: js.UndefOr[scala.Boolean] = js.undefined,
    loops: js.UndefOr[scala.Boolean] = js.undefined,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    negate_iife: js.UndefOr[scala.Boolean] = js.undefined,
    passes: scala.Int | scala.Double = null,
    properties: js.UndefOr[scala.Boolean] = js.undefined,
    pure_funcs: js.Array[java.lang.String] = null,
    pure_getters: scala.Boolean | terserLib.terserLibStrings.strict = null,
    reduce_funcs: js.UndefOr[scala.Boolean] = js.undefined,
    reduce_vars: js.UndefOr[scala.Boolean] = js.undefined,
    sequences: scala.Boolean | scala.Double = null,
    side_effects: js.UndefOr[scala.Boolean] = js.undefined,
    switches: js.UndefOr[scala.Boolean] = js.undefined,
    top_retain: java.lang.String | js.Array[java.lang.String] | stdLib.RegExp = null,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined,
    typeofs: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_Function: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_arrows: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_comps: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_math: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_methods: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_proto: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_regexp: js.UndefOr[scala.Boolean] = js.undefined,
    unsafe_undefined: js.UndefOr[scala.Boolean] = js.undefined,
    unused: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arguments)) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (!js.isUndefined(booleans)) __obj.updateDynamic("booleans")(booleans)
    if (!js.isUndefined(collapse_vars)) __obj.updateDynamic("collapse_vars")(collapse_vars)
    if (!js.isUndefined(comparisons)) __obj.updateDynamic("comparisons")(comparisons)
    if (!js.isUndefined(computed_props)) __obj.updateDynamic("computed_props")(computed_props)
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals)
    if (!js.isUndefined(dead_code)) __obj.updateDynamic("dead_code")(dead_code)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(drop_console)) __obj.updateDynamic("drop_console")(drop_console)
    if (!js.isUndefined(drop_debugger)) __obj.updateDynamic("drop_debugger")(drop_debugger)
    if (ecma != null) __obj.updateDynamic("ecma")(ecma)
    if (!js.isUndefined(evaluate)) __obj.updateDynamic("evaluate")(evaluate)
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (global_defs != null) __obj.updateDynamic("global_defs")(global_defs)
    if (!js.isUndefined(hoist_funs)) __obj.updateDynamic("hoist_funs")(hoist_funs)
    if (!js.isUndefined(hoist_props)) __obj.updateDynamic("hoist_props")(hoist_props)
    if (!js.isUndefined(hoist_vars)) __obj.updateDynamic("hoist_vars")(hoist_vars)
    if (!js.isUndefined(if_return)) __obj.updateDynamic("if_return")(if_return)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(join_vars)) __obj.updateDynamic("join_vars")(join_vars)
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fargs)) __obj.updateDynamic("keep_fargs")(keep_fargs)
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_infinity)) __obj.updateDynamic("keep_infinity")(keep_infinity)
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops)
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (!js.isUndefined(negate_iife)) __obj.updateDynamic("negate_iife")(negate_iife)
    if (passes != null) __obj.updateDynamic("passes")(passes.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties)
    if (pure_funcs != null) __obj.updateDynamic("pure_funcs")(pure_funcs)
    if (pure_getters != null) __obj.updateDynamic("pure_getters")(pure_getters.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_funcs)) __obj.updateDynamic("reduce_funcs")(reduce_funcs)
    if (!js.isUndefined(reduce_vars)) __obj.updateDynamic("reduce_vars")(reduce_vars)
    if (sequences != null) __obj.updateDynamic("sequences")(sequences.asInstanceOf[js.Any])
    if (!js.isUndefined(side_effects)) __obj.updateDynamic("side_effects")(side_effects)
    if (!js.isUndefined(switches)) __obj.updateDynamic("switches")(switches)
    if (top_retain != null) __obj.updateDynamic("top_retain")(top_retain.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (!js.isUndefined(typeofs)) __obj.updateDynamic("typeofs")(typeofs)
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe)
    if (!js.isUndefined(unsafe_Function)) __obj.updateDynamic("unsafe_Function")(unsafe_Function)
    if (!js.isUndefined(unsafe_arrows)) __obj.updateDynamic("unsafe_arrows")(unsafe_arrows)
    if (!js.isUndefined(unsafe_comps)) __obj.updateDynamic("unsafe_comps")(unsafe_comps)
    if (!js.isUndefined(unsafe_math)) __obj.updateDynamic("unsafe_math")(unsafe_math)
    if (!js.isUndefined(unsafe_methods)) __obj.updateDynamic("unsafe_methods")(unsafe_methods)
    if (!js.isUndefined(unsafe_proto)) __obj.updateDynamic("unsafe_proto")(unsafe_proto)
    if (!js.isUndefined(unsafe_regexp)) __obj.updateDynamic("unsafe_regexp")(unsafe_regexp)
    if (!js.isUndefined(unsafe_undefined)) __obj.updateDynamic("unsafe_undefined")(unsafe_undefined)
    if (!js.isUndefined(unused)) __obj.updateDynamic("unused")(unused)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[CompressOptions]
  }
}

