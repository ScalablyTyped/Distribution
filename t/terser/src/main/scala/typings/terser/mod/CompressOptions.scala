package typings.terser.mod

import typings.std.RegExp
import typings.terser.terserStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressOptions extends js.Object {
  var arguments: js.UndefOr[Boolean] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var booleans: js.UndefOr[Boolean] = js.native
  var booleans_as_integers: js.UndefOr[Boolean] = js.native
  var collapse_vars: js.UndefOr[Boolean] = js.native
  var comparisons: js.UndefOr[Boolean] = js.native
  var computed_props: js.UndefOr[Boolean] = js.native
  var conditionals: js.UndefOr[Boolean] = js.native
  var dead_code: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var directives: js.UndefOr[Boolean] = js.native
  var drop_console: js.UndefOr[Boolean] = js.native
  var drop_debugger: js.UndefOr[Boolean] = js.native
  var ecma: js.UndefOr[ECMA] = js.native
  var evaluate: js.UndefOr[Boolean] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var global_defs: js.UndefOr[js.Object] = js.native
  var hoist_funs: js.UndefOr[Boolean] = js.native
  var hoist_props: js.UndefOr[Boolean] = js.native
  var hoist_vars: js.UndefOr[Boolean] = js.native
  var ie8: js.UndefOr[Boolean] = js.native
  var if_return: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[Boolean | InlineFunctions] = js.native
  var join_vars: js.UndefOr[Boolean] = js.native
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.native
  var keep_fargs: js.UndefOr[Boolean] = js.native
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.native
  var keep_infinity: js.UndefOr[Boolean] = js.native
  var loops: js.UndefOr[Boolean] = js.native
  var module: js.UndefOr[Boolean] = js.native
  var negate_iife: js.UndefOr[Boolean] = js.native
  var passes: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[Boolean] = js.native
  var pure_funcs: js.UndefOr[js.Array[String]] = js.native
  var pure_getters: js.UndefOr[Boolean | strict] = js.native
  var reduce_funcs: js.UndefOr[Boolean] = js.native
  var reduce_vars: js.UndefOr[Boolean] = js.native
  var sequences: js.UndefOr[Boolean | Double] = js.native
  var side_effects: js.UndefOr[Boolean] = js.native
  var switches: js.UndefOr[Boolean] = js.native
  var top_retain: js.UndefOr[Null | String | js.Array[String] | RegExp] = js.native
  var toplevel: js.UndefOr[Boolean] = js.native
  var typeofs: js.UndefOr[Boolean] = js.native
  var unsafe: js.UndefOr[Boolean] = js.native
  var unsafe_Function: js.UndefOr[Boolean] = js.native
  var unsafe_arrows: js.UndefOr[Boolean] = js.native
  var unsafe_comps: js.UndefOr[Boolean] = js.native
  var unsafe_math: js.UndefOr[Boolean] = js.native
  var unsafe_methods: js.UndefOr[Boolean] = js.native
  var unsafe_proto: js.UndefOr[Boolean] = js.native
  var unsafe_regexp: js.UndefOr[Boolean] = js.native
  var unsafe_symbols: js.UndefOr[Boolean] = js.native
  var unsafe_undefined: js.UndefOr[Boolean] = js.native
  var unused: js.UndefOr[Boolean] = js.native
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
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setBooleans(value: Boolean): Self = this.set("booleans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleans: Self = this.set("booleans", js.undefined)
    @scala.inline
    def setBooleans_as_integers(value: Boolean): Self = this.set("booleans_as_integers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleans_as_integers: Self = this.set("booleans_as_integers", js.undefined)
    @scala.inline
    def setCollapse_vars(value: Boolean): Self = this.set("collapse_vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse_vars: Self = this.set("collapse_vars", js.undefined)
    @scala.inline
    def setComparisons(value: Boolean): Self = this.set("comparisons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisons: Self = this.set("comparisons", js.undefined)
    @scala.inline
    def setComputed_props(value: Boolean): Self = this.set("computed_props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputed_props: Self = this.set("computed_props", js.undefined)
    @scala.inline
    def setConditionals(value: Boolean): Self = this.set("conditionals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionals: Self = this.set("conditionals", js.undefined)
    @scala.inline
    def setDead_code(value: Boolean): Self = this.set("dead_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDead_code: Self = this.set("dead_code", js.undefined)
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
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
    def setEcma(value: ECMA): Self = this.set("ecma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcma: Self = this.set("ecma", js.undefined)
    @scala.inline
    def setEvaluate(value: Boolean): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    @scala.inline
    def setExpression(value: Boolean): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
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
    def setIe8(value: Boolean): Self = this.set("ie8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIe8: Self = this.set("ie8", js.undefined)
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
    def setKeep_classnames(value: Boolean | RegExp): Self = this.set("keep_classnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_classnames: Self = this.set("keep_classnames", js.undefined)
    @scala.inline
    def setKeep_fargs(value: Boolean): Self = this.set("keep_fargs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_fargs: Self = this.set("keep_fargs", js.undefined)
    @scala.inline
    def setKeep_fnames(value: Boolean | RegExp): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
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
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setNegate_iife(value: Boolean): Self = this.set("negate_iife", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegate_iife: Self = this.set("negate_iife", js.undefined)
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
    def setSequences(value: Boolean | Double): Self = this.set("sequences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequences: Self = this.set("sequences", js.undefined)
    @scala.inline
    def setSide_effects(value: Boolean): Self = this.set("side_effects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide_effects: Self = this.set("side_effects", js.undefined)
    @scala.inline
    def setSwitches(value: Boolean): Self = this.set("switches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitches: Self = this.set("switches", js.undefined)
    @scala.inline
    def setTop_retainVarargs(value: String*): Self = this.set("top_retain", js.Array(value :_*))
    @scala.inline
    def setTop_retain(value: String | js.Array[String] | RegExp): Self = this.set("top_retain", value.asInstanceOf[js.Any])
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
    def setUnsafe_arrows(value: Boolean): Self = this.set("unsafe_arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_arrows: Self = this.set("unsafe_arrows", js.undefined)
    @scala.inline
    def setUnsafe_comps(value: Boolean): Self = this.set("unsafe_comps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_comps: Self = this.set("unsafe_comps", js.undefined)
    @scala.inline
    def setUnsafe_math(value: Boolean): Self = this.set("unsafe_math", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_math: Self = this.set("unsafe_math", js.undefined)
    @scala.inline
    def setUnsafe_methods(value: Boolean): Self = this.set("unsafe_methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_methods: Self = this.set("unsafe_methods", js.undefined)
    @scala.inline
    def setUnsafe_proto(value: Boolean): Self = this.set("unsafe_proto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_proto: Self = this.set("unsafe_proto", js.undefined)
    @scala.inline
    def setUnsafe_regexp(value: Boolean): Self = this.set("unsafe_regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_regexp: Self = this.set("unsafe_regexp", js.undefined)
    @scala.inline
    def setUnsafe_symbols(value: Boolean): Self = this.set("unsafe_symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_symbols: Self = this.set("unsafe_symbols", js.undefined)
    @scala.inline
    def setUnsafe_undefined(value: Boolean): Self = this.set("unsafe_undefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafe_undefined: Self = this.set("unsafe_undefined", js.undefined)
    @scala.inline
    def setUnused(value: Boolean): Self = this.set("unused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnused: Self = this.set("unused", js.undefined)
  }
  
}

