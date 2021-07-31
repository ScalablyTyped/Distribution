package typings.stylableCore

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Declaration
import typings.std.Record
import typings.std.RegExp
import typings.stylableCore.anon.Ast
import typings.stylableCore.anon.KeyframesMap
import typings.stylableCore.anon.Value
import typings.stylableCore.anon.Word
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableCoreStrings.Colonimport
import typings.stylableCore.stylableCoreStrings.Colonvars
import typings.stylableCore.stylableCoreStrings.`-st-default`
import typings.stylableCore.stylableCoreStrings.`-st-extends`
import typings.stylableCore.stylableCoreStrings.`-st-from`
import typings.stylableCore.stylableCoreStrings.`-st-global`
import typings.stylableCore.stylableCoreStrings.`-st-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-named`
import typings.stylableCore.stylableCoreStrings.`-st-partial-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-root`
import typings.stylableCore.stylableCoreStrings.`-st-states`
import typings.stylableCore.stylableCoreStrings.`st-scope`
import typings.stylableCore.stylableCoreStrings.args
import typings.stylableCore.stylableCoreStrings.named
import typings.stylableCore.stylableCoreStrings.namespace
import typings.stylableCore.typesMod.ParsedValue
import typings.stylableCore.typesMod.StateParsedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableValueParsersMod {
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SBTypesParsers {
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "SBTypesParsers")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stExtends(value: String): Ast = ^.asInstanceOf[js.Dynamic].applyDynamic("-st-extends")(value.asInstanceOf[js.Any]).asInstanceOf[Ast]
    
    @scala.inline
    def stGlobal(decl: Declaration, _diagnostics: Diagnostics): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-global")(decl.asInstanceOf[js.Any], _diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def stMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    @scala.inline
    def stMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: Diagnostics
    ): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    
    @scala.inline
    def stNamed(value: String, node: Declaration, diagnostics: Diagnostics): KeyframesMap = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-named")(value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[KeyframesMap]
    
    @scala.inline
    def stPartialMixin(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-partial-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    @scala.inline
    def stPartialMixin(
      mixinNode: Declaration,
      strategy: js.Function1[/* type */ String, named | args],
      diagnostics: Diagnostics
    ): js.Array[MixinValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-partial-mixin")(mixinNode.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[js.Array[MixinValue]]
    
    @scala.inline
    def stRoot(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("-st-root")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def stStates(value: String, decl: Declaration, diagnostics: Diagnostics): MappedStates = (^.asInstanceOf[js.Dynamic].applyDynamic("-st-states")(value.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[MappedStates]
  }
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", "STYLABLE_NAMED_MATCHER")
  @js.native
  val STYLABLE_NAMED_MATCHER: RegExp = js.native
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", "STYLABLE_VALUE_MATCHER")
  @js.native
  val STYLABLE_VALUE_MATCHER: RegExp = js.native
  
  @scala.inline
  def getFormatterArgs(node: ParsedValue): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: Unit, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Boolean, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: Unit, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: ReportWarning): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFormatterArgs(node: ParsedValue, allowComments: Unit, _reportWarning: ReportWarning, perserveQuotes: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatterArgs")(node.asInstanceOf[js.Any], allowComments.asInstanceOf[js.Any], _reportWarning.asInstanceOf[js.Any], perserveQuotes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getNamedArgs(node: ParsedValue): js.Array[js.Array[ParsedValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamedArgs")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[ParsedValue]]]
  
  @scala.inline
  def getStringValue(nodes: js.Array[ParsedValue]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValue")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getStringValue(nodes: ParsedValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValue")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def groupValues(nodes: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupValues")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def groupValues(nodes: js.Array[js.Any], divType: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupValues")(nodes.asInstanceOf[js.Any], divType.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def listOptions(node: js.Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOptions")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", "mixinDeclRegExp")
  @js.native
  val mixinDeclRegExp: RegExp = js.native
  
  object rootValueMapping {
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "rootValueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "rootValueMapping.import")
    @js.native
    val `import`: Colonimport = js.native
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "rootValueMapping.namespace")
    @js.native
    def namespace: typings.stylableCore.stylableCoreStrings.namespace = js.native
    @scala.inline
    def namespace_=(x: namespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "rootValueMapping.stScope")
    @js.native
    def stScope: `st-scope` = js.native
    @scala.inline
    def stScope_=(x: `st-scope`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stScope")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "rootValueMapping.vars")
    @js.native
    def vars: Colonvars = js.native
    @scala.inline
    def vars_=(x: Colonvars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vars")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", "stValues")
  @js.native
  val stValues: js.Array[String] = js.native
  
  @JSImport("@stylable/core/cjs/stylable-value-parsers", "stValuesMap")
  @js.native
  val stValuesMap: Record[String, Boolean] = js.native
  
  object strategies {
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "strategies")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def args(node: js.Any): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("args")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Value]]
    @scala.inline
    def args(node: js.Any, reportWarning: ReportWarning): js.Array[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("args")(node.asInstanceOf[js.Any], reportWarning.asInstanceOf[js.Any])).asInstanceOf[js.Array[Value]]
    
    @scala.inline
    def named(node: js.Any): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(node.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    @scala.inline
    def named(node: js.Any, reportWarning: ReportWarning): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("named")(node.asInstanceOf[js.Any], reportWarning.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  }
  
  @scala.inline
  def validateAllowedNodesUntil(node: ParsedValue, i: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: String, allowed: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validateAllowedNodesUntil(node: ParsedValue, i: Double, untilType: Unit, allowed: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAllowedNodesUntil")(node.asInstanceOf[js.Any], i.asInstanceOf[js.Any], untilType.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object valueMapping {
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.default")
    @js.native
    def default: `-st-default` = js.native
    @scala.inline
    def default_=(x: `-st-default`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.extends")
    @js.native
    val `extends`: `-st-extends` = js.native
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.from")
    @js.native
    def from: `-st-from` = js.native
    @scala.inline
    def from_=(x: `-st-from`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.global")
    @js.native
    def global: `-st-global` = js.native
    @scala.inline
    def global_=(x: `-st-global`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.mixin")
    @js.native
    def mixin: `-st-mixin` = js.native
    @scala.inline
    def mixin_=(x: `-st-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.named")
    @js.native
    def named: `-st-named` = js.native
    @scala.inline
    def named_=(x: `-st-named`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("named")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.partialMixin")
    @js.native
    def partialMixin: `-st-partial-mixin` = js.native
    @scala.inline
    def partialMixin_=(x: `-st-partial-mixin`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialMixin")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.root")
    @js.native
    def root: `-st-root` = js.native
    @scala.inline
    def root_=(x: `-st-root`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueMapping.states")
    @js.native
    def states: `-st-states` = js.native
    @scala.inline
    def states_=(x: `-st-states`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
  }
  
  object valueParserWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-value-parsers", "valueParserWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def CSS_MIXIN_FORCE_NAMED_PARAMS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CSS_MIXIN_FORCE_NAMED_PARAMS")().asInstanceOf[String]
    
    @scala.inline
    def INVALID_NAMED_IMPORT_AS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NAMED_IMPORT_AS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def INVALID_NESTED_KEYFRAMES(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NESTED_KEYFRAMES")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def VALUE_CANNOT_BE_STRING(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("VALUE_CANNOT_BE_STRING")().asInstanceOf[String]
  }
  
  trait ArgValue extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object ArgValue {
    
    @scala.inline
    def apply(`type`: String, value: String): ArgValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgValue]
    }
    
    @scala.inline
    implicit class ArgValueMutableBuilder[Self <: ArgValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendsValue extends StObject {
    
    var args: js.Array[js.Array[ArgValue]] | Null
    
    var symbolName: String
  }
  object ExtendsValue {
    
    @scala.inline
    def apply(symbolName: String): ExtendsValue = {
      val __obj = js.Dynamic.literal(symbolName = symbolName.asInstanceOf[js.Any], args = null)
      __obj.asInstanceOf[ExtendsValue]
    }
    
    @scala.inline
    implicit class ExtendsValueMutableBuilder[Self <: ExtendsValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Array[ArgValue]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsNull: Self = StObject.set(x, "args", null)
      
      @scala.inline
      def setArgsVarargs(value: js.Array[ArgValue]*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
    }
  }
  
  type MappedStates = StringDictionary[StateParsedValue | String | Null]
  
  trait MixinValue extends StObject {
    
    var options: js.Array[Value] | (Record[String, String])
    
    var partial: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object MixinValue {
    
    @scala.inline
    def apply(options: js.Array[Value] | (Record[String, String]), `type`: String): MixinValue = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MixinValue]
    }
    
    @scala.inline
    implicit class MixinValueMutableBuilder[Self <: MixinValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[Value] | (Record[String, String])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: Value*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReportWarning = js.Function2[/* message */ String, /* options */ js.UndefOr[Word], Unit]
  
  trait TypedClass extends StObject {
    
    var `-st-extends`: js.UndefOr[String] = js.undefined
    
    var `-st-root`: js.UndefOr[Boolean] = js.undefined
    
    var `-st-states`: js.UndefOr[js.Array[String] | MappedStates] = js.undefined
  }
  object TypedClass {
    
    @scala.inline
    def apply(): TypedClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypedClass]
    }
    
    @scala.inline
    implicit class TypedClassMutableBuilder[Self <: TypedClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-st-extends`(value: String): Self = StObject.set(x, "-st-extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-extendsUndefined`: Self = StObject.set(x, "-st-extends", js.undefined)
      
      @scala.inline
      def `set-st-root`(value: Boolean): Self = StObject.set(x, "-st-root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-rootUndefined`: Self = StObject.set(x, "-st-root", js.undefined)
      
      @scala.inline
      def `set-st-states`(value: js.Array[String] | MappedStates): Self = StObject.set(x, "-st-states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-st-statesUndefined`: Self = StObject.set(x, "-st-states", js.undefined)
      
      @scala.inline
      def `set-st-statesVarargs`(value: String*): Self = StObject.set(x, "-st-states", js.Array(value :_*))
    }
  }
  
  /* keyof @stylable/core.anon.Default */ /* Rewritten from type alias, can be one of: 
    - typings.stylableCore.stylableCoreStrings.from
    - typings.stylableCore.stylableCoreStrings.named
    - typings.stylableCore.stylableCoreStrings.default
    - typings.stylableCore.stylableCoreStrings.root
    - typings.stylableCore.stylableCoreStrings.states
    - typings.stylableCore.stylableCoreStrings.`extends`
    - typings.stylableCore.stylableCoreStrings.mixin
    - typings.stylableCore.stylableCoreStrings.partialMixin
    - typings.stylableCore.stylableCoreStrings.global
  */
  trait stKeys extends StObject
}
