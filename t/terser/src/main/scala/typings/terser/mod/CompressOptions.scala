package typings.terser.mod

import typings.std.RegExp
import typings.terser.terserStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  var arguments: js.UndefOr[Boolean] = js.undefined
  var arrows: js.UndefOr[Boolean] = js.undefined
  var booleans: js.UndefOr[Boolean] = js.undefined
  var booleans_as_integers: js.UndefOr[Boolean] = js.undefined
  var collapse_vars: js.UndefOr[Boolean] = js.undefined
  var comparisons: js.UndefOr[Boolean] = js.undefined
  var computed_props: js.UndefOr[Boolean] = js.undefined
  var conditionals: js.UndefOr[Boolean] = js.undefined
  var dead_code: js.UndefOr[Boolean] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var directives: js.UndefOr[Boolean] = js.undefined
  var drop_console: js.UndefOr[Boolean] = js.undefined
  var drop_debugger: js.UndefOr[Boolean] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var evaluate: js.UndefOr[Boolean] = js.undefined
  var expression: js.UndefOr[Boolean] = js.undefined
  var global_defs: js.UndefOr[js.Object] = js.undefined
  var hoist_funs: js.UndefOr[Boolean] = js.undefined
  var hoist_props: js.UndefOr[Boolean] = js.undefined
  var hoist_vars: js.UndefOr[Boolean] = js.undefined
  var ie8: js.UndefOr[Boolean] = js.undefined
  var if_return: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.undefined
  var join_vars: js.UndefOr[Boolean] = js.undefined
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var keep_fargs: js.UndefOr[Boolean] = js.undefined
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.undefined
  var keep_infinity: js.UndefOr[Boolean] = js.undefined
  var loops: js.UndefOr[Boolean] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
  var negate_iife: js.UndefOr[Boolean] = js.undefined
  var passes: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[Boolean] = js.undefined
  var pure_funcs: js.UndefOr[js.Array[String]] = js.undefined
  var pure_getters: js.UndefOr[Boolean | strict] = js.undefined
  var reduce_funcs: js.UndefOr[Boolean] = js.undefined
  var reduce_vars: js.UndefOr[Boolean] = js.undefined
  var sequences: js.UndefOr[Boolean | Double] = js.undefined
  var side_effects: js.UndefOr[Boolean] = js.undefined
  var switches: js.UndefOr[Boolean] = js.undefined
  var top_retain: js.UndefOr[Null | String | js.Array[String] | RegExp] = js.undefined
  var toplevel: js.UndefOr[Boolean] = js.undefined
  var typeofs: js.UndefOr[Boolean] = js.undefined
  var unsafe: js.UndefOr[Boolean] = js.undefined
  var unsafe_Function: js.UndefOr[Boolean] = js.undefined
  var unsafe_arrows: js.UndefOr[Boolean] = js.undefined
  var unsafe_comps: js.UndefOr[Boolean] = js.undefined
  var unsafe_math: js.UndefOr[Boolean] = js.undefined
  var unsafe_methods: js.UndefOr[Boolean] = js.undefined
  var unsafe_proto: js.UndefOr[Boolean] = js.undefined
  var unsafe_regexp: js.UndefOr[Boolean] = js.undefined
  var unsafe_undefined: js.UndefOr[Boolean] = js.undefined
  var unused: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    arguments: js.UndefOr[Boolean] = js.undefined,
    arrows: js.UndefOr[Boolean] = js.undefined,
    booleans: js.UndefOr[Boolean] = js.undefined,
    booleans_as_integers: js.UndefOr[Boolean] = js.undefined,
    collapse_vars: js.UndefOr[Boolean] = js.undefined,
    comparisons: js.UndefOr[Boolean] = js.undefined,
    computed_props: js.UndefOr[Boolean] = js.undefined,
    conditionals: js.UndefOr[Boolean] = js.undefined,
    dead_code: js.UndefOr[Boolean] = js.undefined,
    defaults: js.UndefOr[Boolean] = js.undefined,
    directives: js.UndefOr[Boolean] = js.undefined,
    drop_console: js.UndefOr[Boolean] = js.undefined,
    drop_debugger: js.UndefOr[Boolean] = js.undefined,
    ecma: ECMA = null,
    evaluate: js.UndefOr[Boolean] = js.undefined,
    expression: js.UndefOr[Boolean] = js.undefined,
    global_defs: js.Object = null,
    hoist_funs: js.UndefOr[Boolean] = js.undefined,
    hoist_props: js.UndefOr[Boolean] = js.undefined,
    hoist_vars: js.UndefOr[Boolean] = js.undefined,
    ie8: js.UndefOr[Boolean] = js.undefined,
    if_return: js.UndefOr[Boolean] = js.undefined,
    `inline`: Boolean | InlineFunctions = null,
    join_vars: js.UndefOr[Boolean] = js.undefined,
    keep_classnames: Boolean | RegExp = null,
    keep_fargs: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: Boolean | RegExp = null,
    keep_infinity: js.UndefOr[Boolean] = js.undefined,
    loops: js.UndefOr[Boolean] = js.undefined,
    module: js.UndefOr[Boolean] = js.undefined,
    negate_iife: js.UndefOr[Boolean] = js.undefined,
    passes: Int | Double = null,
    properties: js.UndefOr[Boolean] = js.undefined,
    pure_funcs: js.Array[String] = null,
    pure_getters: Boolean | strict = null,
    reduce_funcs: js.UndefOr[Boolean] = js.undefined,
    reduce_vars: js.UndefOr[Boolean] = js.undefined,
    sequences: Boolean | Double = null,
    side_effects: js.UndefOr[Boolean] = js.undefined,
    switches: js.UndefOr[Boolean] = js.undefined,
    top_retain: String | js.Array[String] | RegExp = null,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    typeofs: js.UndefOr[Boolean] = js.undefined,
    unsafe: js.UndefOr[Boolean] = js.undefined,
    unsafe_Function: js.UndefOr[Boolean] = js.undefined,
    unsafe_arrows: js.UndefOr[Boolean] = js.undefined,
    unsafe_comps: js.UndefOr[Boolean] = js.undefined,
    unsafe_math: js.UndefOr[Boolean] = js.undefined,
    unsafe_methods: js.UndefOr[Boolean] = js.undefined,
    unsafe_proto: js.UndefOr[Boolean] = js.undefined,
    unsafe_regexp: js.UndefOr[Boolean] = js.undefined,
    unsafe_undefined: js.UndefOr[Boolean] = js.undefined,
    unused: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arguments)) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (!js.isUndefined(booleans)) __obj.updateDynamic("booleans")(booleans.asInstanceOf[js.Any])
    if (!js.isUndefined(booleans_as_integers)) __obj.updateDynamic("booleans_as_integers")(booleans_as_integers.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse_vars)) __obj.updateDynamic("collapse_vars")(collapse_vars.asInstanceOf[js.Any])
    if (!js.isUndefined(comparisons)) __obj.updateDynamic("comparisons")(comparisons.asInstanceOf[js.Any])
    if (!js.isUndefined(computed_props)) __obj.updateDynamic("computed_props")(computed_props.asInstanceOf[js.Any])
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals.asInstanceOf[js.Any])
    if (!js.isUndefined(dead_code)) __obj.updateDynamic("dead_code")(dead_code.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(directives)) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(drop_console)) __obj.updateDynamic("drop_console")(drop_console.asInstanceOf[js.Any])
    if (!js.isUndefined(drop_debugger)) __obj.updateDynamic("drop_debugger")(drop_debugger.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluate)) __obj.updateDynamic("evaluate")(evaluate.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (global_defs != null) __obj.updateDynamic("global_defs")(global_defs.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_funs)) __obj.updateDynamic("hoist_funs")(hoist_funs.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_props)) __obj.updateDynamic("hoist_props")(hoist_props.asInstanceOf[js.Any])
    if (!js.isUndefined(hoist_vars)) __obj.updateDynamic("hoist_vars")(hoist_vars.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.asInstanceOf[js.Any])
    if (!js.isUndefined(if_return)) __obj.updateDynamic("if_return")(if_return.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(join_vars)) __obj.updateDynamic("join_vars")(join_vars.asInstanceOf[js.Any])
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fargs)) __obj.updateDynamic("keep_fargs")(keep_fargs.asInstanceOf[js.Any])
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_infinity)) __obj.updateDynamic("keep_infinity")(keep_infinity.asInstanceOf[js.Any])
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(negate_iife)) __obj.updateDynamic("negate_iife")(negate_iife.asInstanceOf[js.Any])
    if (passes != null) __obj.updateDynamic("passes")(passes.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (pure_funcs != null) __obj.updateDynamic("pure_funcs")(pure_funcs.asInstanceOf[js.Any])
    if (pure_getters != null) __obj.updateDynamic("pure_getters")(pure_getters.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_funcs)) __obj.updateDynamic("reduce_funcs")(reduce_funcs.asInstanceOf[js.Any])
    if (!js.isUndefined(reduce_vars)) __obj.updateDynamic("reduce_vars")(reduce_vars.asInstanceOf[js.Any])
    if (sequences != null) __obj.updateDynamic("sequences")(sequences.asInstanceOf[js.Any])
    if (!js.isUndefined(side_effects)) __obj.updateDynamic("side_effects")(side_effects.asInstanceOf[js.Any])
    if (!js.isUndefined(switches)) __obj.updateDynamic("switches")(switches.asInstanceOf[js.Any])
    if (top_retain != null) __obj.updateDynamic("top_retain")(top_retain.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    if (!js.isUndefined(typeofs)) __obj.updateDynamic("typeofs")(typeofs.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_Function)) __obj.updateDynamic("unsafe_Function")(unsafe_Function.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_arrows)) __obj.updateDynamic("unsafe_arrows")(unsafe_arrows.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_comps)) __obj.updateDynamic("unsafe_comps")(unsafe_comps.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_math)) __obj.updateDynamic("unsafe_math")(unsafe_math.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_methods)) __obj.updateDynamic("unsafe_methods")(unsafe_methods.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_proto)) __obj.updateDynamic("unsafe_proto")(unsafe_proto.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_regexp)) __obj.updateDynamic("unsafe_regexp")(unsafe_regexp.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafe_undefined)) __obj.updateDynamic("unsafe_undefined")(unsafe_undefined.asInstanceOf[js.Any])
    if (!js.isUndefined(unused)) __obj.updateDynamic("unused")(unused.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

