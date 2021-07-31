package typings.stylableCore

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Declaration
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableCoreStrings.`-st-extends`
import typings.stylableCore.stylableCoreStrings.`-st-global`
import typings.stylableCore.stylableCoreStrings.`-st-root`
import typings.stylableCore.stylableCoreStrings.`-st-states`
import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.complex
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.KeyframesSymbol
import typings.stylableCore.stylableMetaMod.RefedMixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableProcessorMod {
  
  @JSImport("@stylable/core/cjs/stylable-processor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core/cjs/stylable-processor", "RESERVED_ROOT_NAME")
  @js.native
  val RESERVED_ROOT_NAME: /* "root" */ String = js.native
  
  @JSImport("@stylable/core/cjs/stylable-processor", "StylableMeta")
  @js.native
  class StylableMeta protected ()
    extends typings.stylableCore.stylableMetaMod.StylableMeta {
    def this(ast: Root_, diagnostics: Diagnostics) = this()
  }
  
  @JSImport("@stylable/core/cjs/stylable-processor", "StylableProcessor")
  @js.native
  class StylableProcessor () extends StObject {
    def this(diagnostics: Diagnostics) = this()
    def this(
      diagnostics: Unit,
      resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
    ) = this()
    def this(
      diagnostics: Diagnostics,
      resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
    ) = this()
    
    /* protected */ def addCSSVar(varName: String, decl: Declaration): Unit = js.native
    
    /* protected */ def addCSSVarFromProp(decl: Declaration): Unit = js.native
    
    /* protected */ def addClassSymbolOnce(name: String, rule: Rule_): Unit = js.native
    
    /* protected */ def addElementSymbolOnce(name: String, rule: Rule_): Unit = js.native
    
    /* protected */ def addImportSymbols(importDef: Imported): Unit = js.native
    
    /* protected */ def addVarSymbols(rule: Rule_): Unit = js.native
    
    /* protected */ def checkRedeclareKeyframes(symbolName: String, node: Node): KeyframesSymbol = js.native
    
    /* protected */ def checkRedeclareSymbol(symbolName: String, node: Node): Unit = js.native
    
    var diagnostics: Diagnostics = js.native
    
    @JSName("extendTypedRule")
    /* protected */ def extendTypedRule_stextends(node: Node, selector: String, key: `-st-extends`, value: js.Any): Unit = js.native
    @JSName("extendTypedRule")
    /* protected */ def extendTypedRule_stglobal(node: Node, selector: String, key: `-st-global`, value: js.Any): Unit = js.native
    @JSName("extendTypedRule")
    /* protected */ def extendTypedRule_stroot(node: Node, selector: String, key: `-st-root`, value: js.Any): Unit = js.native
    @JSName("extendTypedRule")
    /* protected */ def extendTypedRule_ststates(node: Node, selector: String, key: `-st-states`, value: js.Any): Unit = js.native
    
    /* protected */ def handleAtRules(root: Root_): Unit = js.native
    
    /* protected */ def handleCSSVarUse(decl: Declaration): Unit = js.native
    
    def handleCustomSelectors(rule: Rule_): Unit = js.native
    
    /* protected */ def handleDirectives(rule: SRule, decl: Declaration): Unit = js.native
    
    /* protected */ def handleImport(rule: Rule_): Imported = js.native
    
    var handleNamespaceReference: js.Any = js.native
    
    /* protected */ def handleRule(rule: SRule): Unit = js.native
    /* protected */ def handleRule(rule: SRule, inStScope: Boolean): Unit = js.native
    
    def insertCustomSelectorsStubs(): js.Array[Rule_ | Null] = js.native
    
    var meta: typings.stylableCore.stylableMetaMod.StylableMeta = js.native
    
    def process(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
    
    var resolveNamespace: js.Any = js.native
    
    /* protected */ def setClassGlobalMapping(decl: Declaration, rule: Rule_): Unit = js.native
  }
  
  @scala.inline
  def createEmptyMeta(root: Root_, diagnostics: Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyMeta")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  
  @scala.inline
  def process(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any]).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  @scala.inline
  def process(
    root: Root_,
    diagnostics: Unit,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], resolveNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  @scala.inline
  def process(root: Root_, diagnostics: Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  @scala.inline
  def process(
    root: Root_,
    diagnostics: Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], resolveNamespace.asInstanceOf[js.Any])).asInstanceOf[typings.stylableCore.stylableMetaMod.StylableMeta]
  
  @scala.inline
  def processNamespace(namespace: String, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processNamespace")(namespace.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object processorWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def CANNOT_EXTEND_IN_COMPLEX(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_IN_COMPLEX")().asInstanceOf[String]
    
    @scala.inline
    def CANNOT_RESOLVE_EXTEND(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_RESOLVE_EXTEND")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def DEFAULT_IMPORT_IS_LOWER_CASE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_IMPORT_IS_LOWER_CASE")().asInstanceOf[String]
    
    @scala.inline
    def EMPTY_IMPORT_FROM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_IMPORT_FROM")().asInstanceOf[String]
    
    @scala.inline
    def EMPTY_NAMESPACE_DEF(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EMPTY_NAMESPACE_DEF")().asInstanceOf[String]
    
    @scala.inline
    def FORBIDDEN_DEF_IN_COMPLEX_SELECTOR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FORBIDDEN_DEF_IN_COMPLEX_SELECTOR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def FROM_PROP_MISSING_IN_IMPORT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FROM_PROP_MISSING_IN_IMPORT")().asInstanceOf[String]
    
    @scala.inline
    def GLOBAL_CSS_VAR_MISSING_COMMA(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GLOBAL_CSS_VAR_MISSING_COMMA")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ILLEGAL_CSS_VAR_ARGS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_CSS_VAR_ARGS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ILLEGAL_CSS_VAR_USE(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_CSS_VAR_USE")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ILLEGAL_GLOBAL_CSS_VAR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_GLOBAL_CSS_VAR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ILLEGAL_PROP_IN_IMPORT(propName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ILLEGAL_PROP_IN_IMPORT")(propName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def INVALID_NAMESPACE_DEF(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_NAMESPACE_DEF")().asInstanceOf[String]
    
    @scala.inline
    def MISSING_SCOPING_PARAM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MISSING_SCOPING_PARAM")().asInstanceOf[String]
    
    @scala.inline
    def MULTIPLE_FROM_IN_IMPORT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MULTIPLE_FROM_IN_IMPORT")().asInstanceOf[String]
    
    @scala.inline
    def NO_IMPORT_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_IMPORT_IN_ST_SCOPE")().asInstanceOf[String]
    
    @scala.inline
    def NO_KEYFRAMES_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_KEYFRAMES_IN_ST_SCOPE")().asInstanceOf[String]
    
    @scala.inline
    def NO_VARS_DEF_IN_ST_SCOPE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_VARS_DEF_IN_ST_SCOPE")().asInstanceOf[String]
    
    @scala.inline
    def OVERRIDE_MIXIN(mixinType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("OVERRIDE_MIXIN")(mixinType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def OVERRIDE_TYPED_RULE(key: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("OVERRIDE_TYPED_RULE")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def PARTIAL_MIXIN_MISSING_ARGUMENTS(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("PARTIAL_MIXIN_MISSING_ARGUMENTS")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def REDECLARE_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("REDECLARE_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def REDECLARE_SYMBOL_KEYFRAMES(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("REDECLARE_SYMBOL_KEYFRAMES")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ROOT_AFTER_SPACING(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ROOT_AFTER_SPACING")().asInstanceOf[String]
    
    @scala.inline
    def STATE_DEFINITION_IN_COMPLEX(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_DEFINITION_IN_COMPLEX")().asInstanceOf[String]
    
    @scala.inline
    def STATE_DEFINITION_IN_ELEMENT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_DEFINITION_IN_ELEMENT")().asInstanceOf[String]
    
    @scala.inline
    def UNKNOWN_MIXIN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_MIXIN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def UNSCOPED_CLASS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSCOPED_CLASS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def UNSCOPED_ELEMENT(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSCOPED_ELEMENT")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def validateScopingSelector(atRule: AtRule_, hasScopingSelector: SRule, diagnostics: Diagnostics): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateScopingSelector")(atRule.asInstanceOf[js.Any], hasScopingSelector.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DeclStylableProps extends StObject {
    
    var sourceValue: String
  }
  object DeclStylableProps {
    
    @scala.inline
    def apply(sourceValue: String): DeclStylableProps = {
      val __obj = js.Dynamic.literal(sourceValue = sourceValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclStylableProps]
    }
    
    @scala.inline
    implicit class DeclStylablePropsMutableBuilder[Self <: DeclStylableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceValue(value: String): Self = StObject.set(x, "sourceValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SDecl
    extends StObject
       with Declaration {
    
    var stylable: DeclStylableProps = js.native
  }
  
  @js.native
  trait SRule
    extends StObject
       with Rule_ {
    
    var isSimpleSelector: Boolean = js.native
    
    var mixins: js.UndefOr[js.Array[RefedMixin]] = js.native
    
    var selectorAst: SelectorAstNode = js.native
    
    var selectorType: `class` | element | complex = js.native
    
    var stScopeSelector: js.UndefOr[String] = js.native
  }
}
