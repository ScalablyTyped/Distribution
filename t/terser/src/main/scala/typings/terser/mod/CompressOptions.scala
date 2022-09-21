package typings.terser.mod

import typings.terser.terserStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressOptions extends StObject {
  
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
  
  var keep_classnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var keep_fargs: js.UndefOr[Boolean] = js.undefined
  
  var keep_fnames: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
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
  
  var top_retain: js.UndefOr[Null | String | js.Array[String] | js.RegExp] = js.undefined
  
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
  
  var unsafe_symbols: js.UndefOr[Boolean] = js.undefined
  
  var unsafe_undefined: js.UndefOr[Boolean] = js.undefined
  
  var unused: js.UndefOr[Boolean] = js.undefined
}
object CompressOptions {
  
  inline def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  
  extension [Self <: CompressOptions](x: Self) {
    
    inline def setArguments(value: Boolean): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    inline def setBooleans(value: Boolean): Self = StObject.set(x, "booleans", value.asInstanceOf[js.Any])
    
    inline def setBooleansUndefined: Self = StObject.set(x, "booleans", js.undefined)
    
    inline def setBooleans_as_integers(value: Boolean): Self = StObject.set(x, "booleans_as_integers", value.asInstanceOf[js.Any])
    
    inline def setBooleans_as_integersUndefined: Self = StObject.set(x, "booleans_as_integers", js.undefined)
    
    inline def setCollapse_vars(value: Boolean): Self = StObject.set(x, "collapse_vars", value.asInstanceOf[js.Any])
    
    inline def setCollapse_varsUndefined: Self = StObject.set(x, "collapse_vars", js.undefined)
    
    inline def setComparisons(value: Boolean): Self = StObject.set(x, "comparisons", value.asInstanceOf[js.Any])
    
    inline def setComparisonsUndefined: Self = StObject.set(x, "comparisons", js.undefined)
    
    inline def setComputed_props(value: Boolean): Self = StObject.set(x, "computed_props", value.asInstanceOf[js.Any])
    
    inline def setComputed_propsUndefined: Self = StObject.set(x, "computed_props", js.undefined)
    
    inline def setConditionals(value: Boolean): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
    
    inline def setConditionalsUndefined: Self = StObject.set(x, "conditionals", js.undefined)
    
    inline def setDead_code(value: Boolean): Self = StObject.set(x, "dead_code", value.asInstanceOf[js.Any])
    
    inline def setDead_codeUndefined: Self = StObject.set(x, "dead_code", js.undefined)
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDirectives(value: Boolean): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDrop_console(value: Boolean): Self = StObject.set(x, "drop_console", value.asInstanceOf[js.Any])
    
    inline def setDrop_consoleUndefined: Self = StObject.set(x, "drop_console", js.undefined)
    
    inline def setDrop_debugger(value: Boolean): Self = StObject.set(x, "drop_debugger", value.asInstanceOf[js.Any])
    
    inline def setDrop_debuggerUndefined: Self = StObject.set(x, "drop_debugger", js.undefined)
    
    inline def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
    
    inline def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
    
    inline def setEvaluate(value: Boolean): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setGlobal_defs(value: js.Object): Self = StObject.set(x, "global_defs", value.asInstanceOf[js.Any])
    
    inline def setGlobal_defsUndefined: Self = StObject.set(x, "global_defs", js.undefined)
    
    inline def setHoist_funs(value: Boolean): Self = StObject.set(x, "hoist_funs", value.asInstanceOf[js.Any])
    
    inline def setHoist_funsUndefined: Self = StObject.set(x, "hoist_funs", js.undefined)
    
    inline def setHoist_props(value: Boolean): Self = StObject.set(x, "hoist_props", value.asInstanceOf[js.Any])
    
    inline def setHoist_propsUndefined: Self = StObject.set(x, "hoist_props", js.undefined)
    
    inline def setHoist_vars(value: Boolean): Self = StObject.set(x, "hoist_vars", value.asInstanceOf[js.Any])
    
    inline def setHoist_varsUndefined: Self = StObject.set(x, "hoist_vars", js.undefined)
    
    inline def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
    
    inline def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
    
    inline def setIf_return(value: Boolean): Self = StObject.set(x, "if_return", value.asInstanceOf[js.Any])
    
    inline def setIf_returnUndefined: Self = StObject.set(x, "if_return", js.undefined)
    
    inline def setInline(value: Boolean | InlineFunctions): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setJoin_vars(value: Boolean): Self = StObject.set(x, "join_vars", value.asInstanceOf[js.Any])
    
    inline def setJoin_varsUndefined: Self = StObject.set(x, "join_vars", js.undefined)
    
    inline def setKeep_classnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
    
    inline def setKeep_fargs(value: Boolean): Self = StObject.set(x, "keep_fargs", value.asInstanceOf[js.Any])
    
    inline def setKeep_fargsUndefined: Self = StObject.set(x, "keep_fargs", js.undefined)
    
    inline def setKeep_fnames(value: Boolean | js.RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
    
    inline def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
    
    inline def setKeep_infinity(value: Boolean): Self = StObject.set(x, "keep_infinity", value.asInstanceOf[js.Any])
    
    inline def setKeep_infinityUndefined: Self = StObject.set(x, "keep_infinity", js.undefined)
    
    inline def setLoops(value: Boolean): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
    
    inline def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setNegate_iife(value: Boolean): Self = StObject.set(x, "negate_iife", value.asInstanceOf[js.Any])
    
    inline def setNegate_iifeUndefined: Self = StObject.set(x, "negate_iife", js.undefined)
    
    inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
    
    inline def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
    
    inline def setProperties(value: Boolean): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPure_funcs(value: js.Array[String]): Self = StObject.set(x, "pure_funcs", value.asInstanceOf[js.Any])
    
    inline def setPure_funcsUndefined: Self = StObject.set(x, "pure_funcs", js.undefined)
    
    inline def setPure_funcsVarargs(value: String*): Self = StObject.set(x, "pure_funcs", js.Array(value*))
    
    inline def setPure_getters(value: Boolean | strict): Self = StObject.set(x, "pure_getters", value.asInstanceOf[js.Any])
    
    inline def setPure_gettersUndefined: Self = StObject.set(x, "pure_getters", js.undefined)
    
    inline def setReduce_funcs(value: Boolean): Self = StObject.set(x, "reduce_funcs", value.asInstanceOf[js.Any])
    
    inline def setReduce_funcsUndefined: Self = StObject.set(x, "reduce_funcs", js.undefined)
    
    inline def setReduce_vars(value: Boolean): Self = StObject.set(x, "reduce_vars", value.asInstanceOf[js.Any])
    
    inline def setReduce_varsUndefined: Self = StObject.set(x, "reduce_vars", js.undefined)
    
    inline def setSequences(value: Boolean | Double): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    inline def setSequencesUndefined: Self = StObject.set(x, "sequences", js.undefined)
    
    inline def setSide_effects(value: Boolean): Self = StObject.set(x, "side_effects", value.asInstanceOf[js.Any])
    
    inline def setSide_effectsUndefined: Self = StObject.set(x, "side_effects", js.undefined)
    
    inline def setSwitches(value: Boolean): Self = StObject.set(x, "switches", value.asInstanceOf[js.Any])
    
    inline def setSwitchesUndefined: Self = StObject.set(x, "switches", js.undefined)
    
    inline def setTop_retain(value: String | js.Array[String] | js.RegExp): Self = StObject.set(x, "top_retain", value.asInstanceOf[js.Any])
    
    inline def setTop_retainNull: Self = StObject.set(x, "top_retain", null)
    
    inline def setTop_retainUndefined: Self = StObject.set(x, "top_retain", js.undefined)
    
    inline def setTop_retainVarargs(value: String*): Self = StObject.set(x, "top_retain", js.Array(value*))
    
    inline def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
    
    inline def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
    
    inline def setTypeofs(value: Boolean): Self = StObject.set(x, "typeofs", value.asInstanceOf[js.Any])
    
    inline def setTypeofsUndefined: Self = StObject.set(x, "typeofs", js.undefined)
    
    inline def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
    
    inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    
    inline def setUnsafe_Function(value: Boolean): Self = StObject.set(x, "unsafe_Function", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_FunctionUndefined: Self = StObject.set(x, "unsafe_Function", js.undefined)
    
    inline def setUnsafe_arrows(value: Boolean): Self = StObject.set(x, "unsafe_arrows", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_arrowsUndefined: Self = StObject.set(x, "unsafe_arrows", js.undefined)
    
    inline def setUnsafe_comps(value: Boolean): Self = StObject.set(x, "unsafe_comps", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_compsUndefined: Self = StObject.set(x, "unsafe_comps", js.undefined)
    
    inline def setUnsafe_math(value: Boolean): Self = StObject.set(x, "unsafe_math", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_mathUndefined: Self = StObject.set(x, "unsafe_math", js.undefined)
    
    inline def setUnsafe_methods(value: Boolean): Self = StObject.set(x, "unsafe_methods", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_methodsUndefined: Self = StObject.set(x, "unsafe_methods", js.undefined)
    
    inline def setUnsafe_proto(value: Boolean): Self = StObject.set(x, "unsafe_proto", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_protoUndefined: Self = StObject.set(x, "unsafe_proto", js.undefined)
    
    inline def setUnsafe_regexp(value: Boolean): Self = StObject.set(x, "unsafe_regexp", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_regexpUndefined: Self = StObject.set(x, "unsafe_regexp", js.undefined)
    
    inline def setUnsafe_symbols(value: Boolean): Self = StObject.set(x, "unsafe_symbols", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_symbolsUndefined: Self = StObject.set(x, "unsafe_symbols", js.undefined)
    
    inline def setUnsafe_undefined(value: Boolean): Self = StObject.set(x, "unsafe_undefined", value.asInstanceOf[js.Any])
    
    inline def setUnsafe_undefinedUndefined: Self = StObject.set(x, "unsafe_undefined", js.undefined)
    
    inline def setUnused(value: Boolean): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
    
    inline def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
  }
}
