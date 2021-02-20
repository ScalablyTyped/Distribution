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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableProcessorMod {
  
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
      diagnostics: js.UndefOr[scala.Nothing],
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
  
  @JSImport("@stylable/core/cjs/stylable-processor", "createEmptyMeta")
  @js.native
  def createEmptyMeta(root: Root_, diagnostics: Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  
  @JSImport("@stylable/core/cjs/stylable-processor", "process")
  @js.native
  def process(root: Root_): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core/cjs/stylable-processor", "process")
  @js.native
  def process(
    root: Root_,
    diagnostics: js.UndefOr[scala.Nothing],
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core/cjs/stylable-processor", "process")
  @js.native
  def process(root: Root_, diagnostics: Diagnostics): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  @JSImport("@stylable/core/cjs/stylable-processor", "process")
  @js.native
  def process(
    root: Root_,
    diagnostics: Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typings.stylableCore.stylableMetaMod.StylableMeta = js.native
  
  @JSImport("@stylable/core/cjs/stylable-processor", "processNamespace")
  @js.native
  def processNamespace(namespace: String, source: String): String = js.native
  
  object processorWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.CANNOT_EXTEND_IN_COMPLEX")
    @js.native
    def CANNOT_EXTEND_IN_COMPLEX(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.CANNOT_RESOLVE_EXTEND")
    @js.native
    def CANNOT_RESOLVE_EXTEND(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.DEFAULT_IMPORT_IS_LOWER_CASE")
    @js.native
    def DEFAULT_IMPORT_IS_LOWER_CASE(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.EMPTY_IMPORT_FROM")
    @js.native
    def EMPTY_IMPORT_FROM(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.EMPTY_NAMESPACE_DEF")
    @js.native
    def EMPTY_NAMESPACE_DEF(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.FORBIDDEN_DEF_IN_COMPLEX_SELECTOR")
    @js.native
    def FORBIDDEN_DEF_IN_COMPLEX_SELECTOR(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.FROM_PROP_MISSING_IN_IMPORT")
    @js.native
    def FROM_PROP_MISSING_IN_IMPORT(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.GLOBAL_CSS_VAR_MISSING_COMMA")
    @js.native
    def GLOBAL_CSS_VAR_MISSING_COMMA(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.ILLEGAL_CSS_VAR_ARGS")
    @js.native
    def ILLEGAL_CSS_VAR_ARGS(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.ILLEGAL_CSS_VAR_USE")
    @js.native
    def ILLEGAL_CSS_VAR_USE(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.ILLEGAL_GLOBAL_CSS_VAR")
    @js.native
    def ILLEGAL_GLOBAL_CSS_VAR(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.ILLEGAL_PROP_IN_IMPORT")
    @js.native
    def ILLEGAL_PROP_IN_IMPORT(propName: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.INVALID_NAMESPACE_DEF")
    @js.native
    def INVALID_NAMESPACE_DEF(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.MISSING_SCOPING_PARAM")
    @js.native
    def MISSING_SCOPING_PARAM(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.MULTIPLE_FROM_IN_IMPORT")
    @js.native
    def MULTIPLE_FROM_IN_IMPORT(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.NO_IMPORT_IN_ST_SCOPE")
    @js.native
    def NO_IMPORT_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.NO_KEYFRAMES_IN_ST_SCOPE")
    @js.native
    def NO_KEYFRAMES_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.NO_VARS_DEF_IN_ST_SCOPE")
    @js.native
    def NO_VARS_DEF_IN_ST_SCOPE(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.OVERRIDE_MIXIN")
    @js.native
    def OVERRIDE_MIXIN(mixinType: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.OVERRIDE_TYPED_RULE")
    @js.native
    def OVERRIDE_TYPED_RULE(key: String, name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.PARTIAL_MIXIN_MISSING_ARGUMENTS")
    @js.native
    def PARTIAL_MIXIN_MISSING_ARGUMENTS(`type`: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.REDECLARE_SYMBOL")
    @js.native
    def REDECLARE_SYMBOL(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.REDECLARE_SYMBOL_KEYFRAMES")
    @js.native
    def REDECLARE_SYMBOL_KEYFRAMES(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.ROOT_AFTER_SPACING")
    @js.native
    def ROOT_AFTER_SPACING(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.STATE_DEFINITION_IN_COMPLEX")
    @js.native
    def STATE_DEFINITION_IN_COMPLEX(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.STATE_DEFINITION_IN_ELEMENT")
    @js.native
    def STATE_DEFINITION_IN_ELEMENT(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.UNKNOWN_MIXIN")
    @js.native
    def UNKNOWN_MIXIN(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.UNSCOPED_CLASS")
    @js.native
    def UNSCOPED_CLASS(name: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-processor", "processorWarnings.UNSCOPED_ELEMENT")
    @js.native
    def UNSCOPED_ELEMENT(name: String): String = js.native
  }
  
  @JSImport("@stylable/core/cjs/stylable-processor", "validateScopingSelector")
  @js.native
  def validateScopingSelector(atRule: AtRule_, hasSelector: SRule, diagnostics: Diagnostics): Unit = js.native
  
  @js.native
  trait DeclStylableProps extends StObject {
    
    var sourceValue: String = js.native
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
  trait SDecl extends Declaration {
    
    var stylable: DeclStylableProps = js.native
  }
  
  @js.native
  trait SRule extends Rule_ {
    
    var isSimpleSelector: Boolean = js.native
    
    var mixins: js.UndefOr[js.Array[RefedMixin]] = js.native
    
    var selectorAst: SelectorAstNode = js.native
    
    var selectorType: `class` | element | complex = js.native
    
    var stScopeSelector: js.UndefOr[String] = js.native
  }
}
