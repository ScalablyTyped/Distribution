package typings.terser

import org.scalablytyped.runtime.StringDictionary
import typings.sourceMap.mod.RawSourceMap
import typings.std.RegExp
import typings.terser.anon.Col
import typings.terser.terserBooleans.`false`
import typings.terser.terserStrings.`inline`
import typings.terser.terserStrings.all
import typings.terser.terserStrings.some
import typings.terser.terserStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("terser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait InlineFunctions extends StObject
  @JSImport("terser", "InlineFunctions")
  @js.native
  object InlineFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InlineFunctions & Double] = js.native
    
    @js.native
    sealed trait Disabled
      extends StObject
         with InlineFunctions
    /* 0 */ val Disabled: typings.terser.mod.InlineFunctions.Disabled & Double = js.native
    
    @js.native
    sealed trait SimpleFunctions
      extends StObject
         with InlineFunctions
    /* 1 */ val SimpleFunctions: typings.terser.mod.InlineFunctions.SimpleFunctions & Double = js.native
    
    @js.native
    sealed trait WithArguments
      extends StObject
         with InlineFunctions
    /* 2 */ val WithArguments: typings.terser.mod.InlineFunctions.WithArguments & Double = js.native
    
    @js.native
    sealed trait WithArgumentsAndVariables
      extends StObject
         with InlineFunctions
    /* 3 */ val WithArgumentsAndVariables: typings.terser.mod.InlineFunctions.WithArgumentsAndVariables & Double = js.native
  }
  
  @js.native
  sealed trait OutputQuoteStyle extends StObject
  @JSImport("terser", "OutputQuoteStyle")
  @js.native
  object OutputQuoteStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OutputQuoteStyle & Double] = js.native
    
    @js.native
    sealed trait AlwaysDouble
      extends StObject
         with OutputQuoteStyle
    /* 2 */ val AlwaysDouble: typings.terser.mod.OutputQuoteStyle.AlwaysDouble & Double = js.native
    
    @js.native
    sealed trait AlwaysOriginal
      extends StObject
         with OutputQuoteStyle
    /* 3 */ val AlwaysOriginal: typings.terser.mod.OutputQuoteStyle.AlwaysOriginal & Double = js.native
    
    @js.native
    sealed trait AlwaysSingle
      extends StObject
         with OutputQuoteStyle
    /* 1 */ val AlwaysSingle: typings.terser.mod.OutputQuoteStyle.AlwaysSingle & Double = js.native
    
    @js.native
    sealed trait PreferDouble
      extends StObject
         with OutputQuoteStyle
    /* 0 */ val PreferDouble: typings.terser.mod.OutputQuoteStyle.PreferDouble & Double = js.native
  }
  
  @scala.inline
  def minify(files: String): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
  @scala.inline
  def minify(files: String, options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
  @scala.inline
  def minify(files: js.Array[String]): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
  @scala.inline
  def minify(files: js.Array[String], options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
  @scala.inline
  def minify(files: StringDictionary[String]): js.Promise[MinifyOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinifyOutput]]
  @scala.inline
  def minify(files: StringDictionary[String], options: MinifyOptions): js.Promise[MinifyOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MinifyOutput]]
  
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
    
    var unsafe_symbols: js.UndefOr[Boolean] = js.undefined
    
    var unsafe_undefined: js.UndefOr[Boolean] = js.undefined
    
    var unused: js.UndefOr[Boolean] = js.undefined
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
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setBooleans(value: Boolean): Self = StObject.set(x, "booleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleansUndefined: Self = StObject.set(x, "booleans", js.undefined)
      
      @scala.inline
      def setBooleans_as_integers(value: Boolean): Self = StObject.set(x, "booleans_as_integers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleans_as_integersUndefined: Self = StObject.set(x, "booleans_as_integers", js.undefined)
      
      @scala.inline
      def setCollapse_vars(value: Boolean): Self = StObject.set(x, "collapse_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapse_varsUndefined: Self = StObject.set(x, "collapse_vars", js.undefined)
      
      @scala.inline
      def setComparisons(value: Boolean): Self = StObject.set(x, "comparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonsUndefined: Self = StObject.set(x, "comparisons", js.undefined)
      
      @scala.inline
      def setComputed_props(value: Boolean): Self = StObject.set(x, "computed_props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputed_propsUndefined: Self = StObject.set(x, "computed_props", js.undefined)
      
      @scala.inline
      def setConditionals(value: Boolean): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalsUndefined: Self = StObject.set(x, "conditionals", js.undefined)
      
      @scala.inline
      def setDead_code(value: Boolean): Self = StObject.set(x, "dead_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDead_codeUndefined: Self = StObject.set(x, "dead_code", js.undefined)
      
      @scala.inline
      def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
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
      def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      @scala.inline
      def setEvaluate(value: Boolean): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      @scala.inline
      def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
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
      def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
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
      def setKeep_classnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
      
      @scala.inline
      def setKeep_fargs(value: Boolean): Self = StObject.set(x, "keep_fargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fargsUndefined: Self = StObject.set(x, "keep_fargs", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
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
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNegate_iife(value: Boolean): Self = StObject.set(x, "negate_iife", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegate_iifeUndefined: Self = StObject.set(x, "negate_iife", js.undefined)
      
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
      def setSequences(value: Boolean | Double): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequencesUndefined: Self = StObject.set(x, "sequences", js.undefined)
      
      @scala.inline
      def setSide_effects(value: Boolean): Self = StObject.set(x, "side_effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide_effectsUndefined: Self = StObject.set(x, "side_effects", js.undefined)
      
      @scala.inline
      def setSwitches(value: Boolean): Self = StObject.set(x, "switches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchesUndefined: Self = StObject.set(x, "switches", js.undefined)
      
      @scala.inline
      def setTop_retain(value: String | js.Array[String] | RegExp): Self = StObject.set(x, "top_retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop_retainNull: Self = StObject.set(x, "top_retain", null)
      
      @scala.inline
      def setTop_retainUndefined: Self = StObject.set(x, "top_retain", js.undefined)
      
      @scala.inline
      def setTop_retainVarargs(value: String*): Self = StObject.set(x, "top_retain", js.Array(value :_*))
      
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
      def setUnsafe_arrows(value: Boolean): Self = StObject.set(x, "unsafe_arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_arrowsUndefined: Self = StObject.set(x, "unsafe_arrows", js.undefined)
      
      @scala.inline
      def setUnsafe_comps(value: Boolean): Self = StObject.set(x, "unsafe_comps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_compsUndefined: Self = StObject.set(x, "unsafe_comps", js.undefined)
      
      @scala.inline
      def setUnsafe_math(value: Boolean): Self = StObject.set(x, "unsafe_math", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_mathUndefined: Self = StObject.set(x, "unsafe_math", js.undefined)
      
      @scala.inline
      def setUnsafe_methods(value: Boolean): Self = StObject.set(x, "unsafe_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_methodsUndefined: Self = StObject.set(x, "unsafe_methods", js.undefined)
      
      @scala.inline
      def setUnsafe_proto(value: Boolean): Self = StObject.set(x, "unsafe_proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_protoUndefined: Self = StObject.set(x, "unsafe_proto", js.undefined)
      
      @scala.inline
      def setUnsafe_regexp(value: Boolean): Self = StObject.set(x, "unsafe_regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_regexpUndefined: Self = StObject.set(x, "unsafe_regexp", js.undefined)
      
      @scala.inline
      def setUnsafe_symbols(value: Boolean): Self = StObject.set(x, "unsafe_symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_symbolsUndefined: Self = StObject.set(x, "unsafe_symbols", js.undefined)
      
      @scala.inline
      def setUnsafe_undefined(value: Boolean): Self = StObject.set(x, "unsafe_undefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafe_undefinedUndefined: Self = StObject.set(x, "unsafe_undefined", js.undefined)
      
      @scala.inline
      def setUnused(value: Boolean): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.terser.terserNumbers.`5`
    - typings.terser.terserNumbers.`2015`
    - typings.terser.terserNumbers.`2016`
    - typings.terser.terserNumbers.`2017`
    - typings.terser.terserNumbers.`2018`
    - typings.terser.terserNumbers.`2019`
    - typings.terser.terserNumbers.`2020`
  */
  trait ECMA extends StObject
  object ECMA {
    
    @scala.inline
    def `2015`: typings.terser.terserNumbers.`2015` = 2015.asInstanceOf[typings.terser.terserNumbers.`2015`]
    
    @scala.inline
    def `2016`: typings.terser.terserNumbers.`2016` = 2016.asInstanceOf[typings.terser.terserNumbers.`2016`]
    
    @scala.inline
    def `2017`: typings.terser.terserNumbers.`2017` = 2017.asInstanceOf[typings.terser.terserNumbers.`2017`]
    
    @scala.inline
    def `2018`: typings.terser.terserNumbers.`2018` = 2018.asInstanceOf[typings.terser.terserNumbers.`2018`]
    
    @scala.inline
    def `2019`: typings.terser.terserNumbers.`2019` = 2019.asInstanceOf[typings.terser.terserNumbers.`2019`]
    
    @scala.inline
    def `2020`: typings.terser.terserNumbers.`2020` = 2020.asInstanceOf[typings.terser.terserNumbers.`2020`]
    
    @scala.inline
    def `5`: typings.terser.terserNumbers.`5` = 5.asInstanceOf[typings.terser.terserNumbers.`5`]
  }
  
  trait FormatOptions extends StObject {
    
    var ascii_only: js.UndefOr[Boolean] = js.undefined
    
    var beautify: js.UndefOr[Boolean] = js.undefined
    
    var braces: js.UndefOr[Boolean] = js.undefined
    
    var comments: js.UndefOr[
        Boolean | all | some | RegExp | (js.Function2[/* node */ js.Any, /* comment */ Col, Boolean])
      ] = js.undefined
    
    var ecma: js.UndefOr[ECMA] = js.undefined
    
    var ie8: js.UndefOr[Boolean] = js.undefined
    
    var indent_level: js.UndefOr[Double] = js.undefined
    
    var indent_start: js.UndefOr[Double] = js.undefined
    
    var inline_script: js.UndefOr[Boolean] = js.undefined
    
    var keep_quoted_props: js.UndefOr[Boolean] = js.undefined
    
    var max_line_len: js.UndefOr[Double | `false`] = js.undefined
    
    var preamble: js.UndefOr[String] = js.undefined
    
    var preserve_annotations: js.UndefOr[Boolean] = js.undefined
    
    var quote_keys: js.UndefOr[Boolean] = js.undefined
    
    var quote_style: js.UndefOr[OutputQuoteStyle] = js.undefined
    
    var safari10: js.UndefOr[Boolean] = js.undefined
    
    var semicolons: js.UndefOr[Boolean] = js.undefined
    
    var shebang: js.UndefOr[Boolean] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var source_map: js.UndefOr[SourceMapOptions] = js.undefined
    
    var webkit: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var wrap_func_args: js.UndefOr[Boolean] = js.undefined
    
    var wrap_iife: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    @scala.inline
    def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
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
      def setComments(
        value: Boolean | all | some | RegExp | (js.Function2[/* node */ js.Any, /* comment */ Col, Boolean])
      ): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsFunction2(value: (/* node */ js.Any, /* comment */ Col) => Boolean): Self = StObject.set(x, "comments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      @scala.inline
      def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
      @scala.inline
      def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
      
      @scala.inline
      def setIndent_start(value: Double): Self = StObject.set(x, "indent_start", value.asInstanceOf[js.Any])
      
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
      def setMax_line_len(value: Double | `false`): Self = StObject.set(x, "max_line_len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_line_lenUndefined: Self = StObject.set(x, "max_line_len", js.undefined)
      
      @scala.inline
      def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreambleUndefined: Self = StObject.set(x, "preamble", js.undefined)
      
      @scala.inline
      def setPreserve_annotations(value: Boolean): Self = StObject.set(x, "preserve_annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserve_annotationsUndefined: Self = StObject.set(x, "preserve_annotations", js.undefined)
      
      @scala.inline
      def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
      
      @scala.inline
      def setQuote_style(value: OutputQuoteStyle): Self = StObject.set(x, "quote_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_styleUndefined: Self = StObject.set(x, "quote_style", js.undefined)
      
      @scala.inline
      def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
      
      @scala.inline
      def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      @scala.inline
      def setShebang(value: Boolean): Self = StObject.set(x, "shebang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShebangUndefined: Self = StObject.set(x, "shebang", js.undefined)
      
      @scala.inline
      def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      @scala.inline
      def setSource_map(value: SourceMapOptions): Self = StObject.set(x, "source_map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_mapUndefined: Self = StObject.set(x, "source_map", js.undefined)
      
      @scala.inline
      def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUndefined: Self = StObject.set(x, "webkit", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap_func_args(value: Boolean): Self = StObject.set(x, "wrap_func_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_func_argsUndefined: Self = StObject.set(x, "wrap_func_args", js.undefined)
      
      @scala.inline
      def setWrap_iife(value: Boolean): Self = StObject.set(x, "wrap_iife", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap_iifeUndefined: Self = StObject.set(x, "wrap_iife", js.undefined)
    }
  }
  
  trait MangleOptions extends StObject {
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var keep_classnames: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var keep_fnames: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var module: js.UndefOr[Boolean] = js.undefined
    
    var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.undefined
    
    var reserved: js.UndefOr[js.Array[String]] = js.undefined
    
    var safari10: js.UndefOr[Boolean] = js.undefined
    
    var toplevel: js.UndefOr[Boolean] = js.undefined
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
      def setKeep_classnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
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
      def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
    }
  }
  
  trait ManglePropertiesOptions extends StObject {
    
    var builtins: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var keep_quoted: js.UndefOr[Boolean | strict] = js.undefined
    
    var regex: js.UndefOr[RegExp | String] = js.undefined
    
    var reserved: js.UndefOr[js.Array[String]] = js.undefined
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
      def setKeep_quoted(value: Boolean | strict): Self = StObject.set(x, "keep_quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_quotedUndefined: Self = StObject.set(x, "keep_quoted", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp | String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
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
  
  trait MinifyOptions extends StObject {
    
    var compress: js.UndefOr[Boolean | CompressOptions] = js.undefined
    
    var ecma: js.UndefOr[ECMA] = js.undefined
    
    var format: js.UndefOr[FormatOptions] = js.undefined
    
    var ie8: js.UndefOr[Boolean] = js.undefined
    
    var keep_classnames: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var keep_fnames: js.UndefOr[Boolean | RegExp] = js.undefined
    
    var mangle: js.UndefOr[Boolean | MangleOptions] = js.undefined
    
    var module: js.UndefOr[Boolean] = js.undefined
    
    var nameCache: js.UndefOr[js.Object] = js.undefined
    
    /** @deprecated */
    var output: js.UndefOr[FormatOptions] = js.undefined
    
    var parse: js.UndefOr[ParseOptions] = js.undefined
    
    var safari10: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
    
    var toplevel: js.UndefOr[Boolean] = js.undefined
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
      def setCompress(value: Boolean | CompressOptions): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIe8(value: Boolean): Self = StObject.set(x, "ie8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe8Undefined: Self = StObject.set(x, "ie8", js.undefined)
      
      @scala.inline
      def setKeep_classnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_classnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_classnamesUndefined: Self = StObject.set(x, "keep_classnames", js.undefined)
      
      @scala.inline
      def setKeep_fnames(value: Boolean | RegExp): Self = StObject.set(x, "keep_fnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_fnamesUndefined: Self = StObject.set(x, "keep_fnames", js.undefined)
      
      @scala.inline
      def setMangle(value: Boolean | MangleOptions): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNameCache(value: js.Object): Self = StObject.set(x, "nameCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameCacheUndefined: Self = StObject.set(x, "nameCache", js.undefined)
      
      @scala.inline
      def setOutput(value: FormatOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setParse(value: ParseOptions): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean | SourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setToplevel(value: Boolean): Self = StObject.set(x, "toplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToplevelUndefined: Self = StObject.set(x, "toplevel", js.undefined)
    }
  }
  
  trait MinifyOutput extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[RawSourceMap | String] = js.undefined
  }
  object MinifyOutput {
    
    @scala.inline
    def apply(): MinifyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinifyOutput]
    }
    
    @scala.inline
    implicit class MinifyOutputMutableBuilder[Self <: MinifyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMap(value: RawSourceMap | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var bare_returns: js.UndefOr[Boolean] = js.undefined
    
    var ecma: js.UndefOr[ECMA] = js.undefined
    
    var html5_comments: js.UndefOr[Boolean] = js.undefined
    
    var shebang: js.UndefOr[Boolean] = js.undefined
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
      def setEcma(value: ECMA): Self = StObject.set(x, "ecma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcmaUndefined: Self = StObject.set(x, "ecma", js.undefined)
      
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
  
  trait SourceMapOptions extends StObject {
    
    /** Source map object, 'inline' or source map file content */
    var content: js.UndefOr[RawSourceMap | String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var includeSources: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String | `inline`] = js.undefined
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
      def setContent(value: RawSourceMap | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
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
