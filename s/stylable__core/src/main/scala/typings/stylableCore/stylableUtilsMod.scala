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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-utils", JSImport.Namespace)
@js.native
object stylableUtilsMod extends js.Object {
  
  val CUSTOM_SELECTOR_RE: RegExp = js.native
  
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: AtRule_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: T, isRoot: Boolean): T = js.native
  def createSubsetAst[T /* <: Root_ | AtRule_ */](root: Root_, selectorPrefix: String, mixinTarget: js.UndefOr[scala.Nothing], isRoot: Boolean): T = js.native
  
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String]): String = js.native
  def expandCustomSelectors(rule: Rule_, customSelectors: Record[String, String], diagnostics: Diagnostics): String = js.native
  
  def findDeclaration(importNode: Imported, test: js.Any): Declaration = js.native
  
  def findRule(root: Root_, selector: String): Null | Declaration = js.native
  def findRule(root: Root_, selector: String, test: js.Any): Null | Declaration = js.native
  
  def generateScopedCSSVar(namespace: String, varName: String): String = js.native
  
  def getAlias(symbol: StylableSymbol): js.UndefOr[ImportSymbol] = js.native
  
  def getDeclStylable(decl: SDecl): DeclStylableProps = js.native
  
  def getSourcePath(root: Root_, diagnostics: Diagnostics): String = js.native
  
  def isCSSVarProp(value: String): Boolean = js.native
  
  def isValidClassName(className: String): Boolean = js.native
  
  def isValidDeclaration(decl: Declaration): Boolean = js.native
  
  def mergeRules(mixinAst: Root_, rule: Rule_): Rule_ = js.native
  
  def removeUnusedRules(
    ast: Root_,
    meta: StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = js.native
  
  def scopeCSSVar(resolver: StylableResolver, meta: StylableMeta, symbolName: String): String = js.native
  
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String): Selector = js.native
  def scopeSelector(scopeSelectorRule: String, targetSelectorRule: String, rootScopeLevel: Boolean): Selector = js.native
  
  def transformMatchesOnRule(rule: Rule_, lineBreak: Boolean): String = js.native
}
