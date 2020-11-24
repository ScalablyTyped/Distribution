package typings.stylableCore.stylableProcessorMod

import typings.postcss.mod.Declaration
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableCoreStrings.`-st-extends`
import typings.stylableCore.stylableCoreStrings.`-st-global`
import typings.stylableCore.stylableCoreStrings.`-st-root`
import typings.stylableCore.stylableCoreStrings.`-st-states`
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.KeyframesSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-processor", "StylableProcessor")
@js.native
class StylableProcessor () extends js.Object {
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
