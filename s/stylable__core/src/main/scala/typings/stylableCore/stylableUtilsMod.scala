package typings.stylableCore

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Declaration
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.std.Record
import typings.std.RegExp
import typings.stylableCore.anon.Selector
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableMetaMod.ImportSymbol
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.DeclStylableProps
import typings.stylableCore.stylableProcessorMod.SDecl
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.StylableResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableUtilsMod {
  
  @JSImport("@stylable/core/cjs/stylable-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core/cjs/stylable-utils", "CUSTOM_SELECTOR_RE")
  @js.native
  val CUSTOM_SELECTOR_RE: RegExp = js.native
  
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: Unit, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: Unit, isRoot: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubsetAst")(root.asInstanceOf[js.Any], selectorPrefix.asInstanceOf[js.Any], mixinTarget.asInstanceOf[js.Any], isRoot.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandCustomSelectors")(rule.asInstanceOf[js.Any], customSelectors.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String], diagnostics: Diagnostics): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expandCustomSelectors")(rule.asInstanceOf[js.Any], customSelectors.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def findDeclaration(importNode: Imported, test: js.Any): Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findDeclaration")(importNode.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Declaration]
  
  @scala.inline
  def findRule(root: Root_, selector: String): Null | Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Null | Declaration]
  @scala.inline
  def findRule(root: Root_, selector: String, test: js.Any): Null | Declaration = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Null | Declaration]
  
  @scala.inline
  def generateScopedCSSVar(namespace: String, varName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateScopedCSSVar")(namespace.asInstanceOf[js.Any], varName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getAlias(symbol: StylableSymbol): js.UndefOr[ImportSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(symbol.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ImportSymbol]]
  
  @scala.inline
  def getDeclStylable(decl: SDecl): DeclStylableProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclStylable")(decl.asInstanceOf[js.Any]).asInstanceOf[DeclStylableProps]
  
  @scala.inline
  def getSourcePath(root: Root_, diagnostics: Diagnostics): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourcePath")(root.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isCSSVarProp(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCSSVarProp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidClassName(className: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidClassName")(className.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidDeclaration(decl: Declaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mergeRules(mixinAst: Root_, rule: Rule_): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRules")(mixinAst.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  
  @scala.inline
  def removeUnusedRules(
    ast: Root_,
    meta: StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUnusedRules")(ast.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], _import.asInstanceOf[js.Any], usedFiles.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scopeCSSVar(resolver: StylableResolver, meta: StylableMeta, symbolName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeCSSVar")(resolver.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeSelector")(scopeSelectorRule.asInstanceOf[js.Any], targetSelectorRule.asInstanceOf[js.Any])).asInstanceOf[Selector]
  @scala.inline
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String, rootScopeLevel: Boolean): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeSelector")(scopeSelectorRule.asInstanceOf[js.Any], targetSelectorRule.asInstanceOf[js.Any], rootScopeLevel.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  @scala.inline
  def transformMatchesOnRule(rule: Rule_, lineBreak: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMatchesOnRule")(rule.asInstanceOf[js.Any], lineBreak.asInstanceOf[js.Any])).asInstanceOf[String]
}
