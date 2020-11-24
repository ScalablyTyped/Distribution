package typings.stylableCore.stylableTransformerMod

import typings.postcss.mod.Declaration
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.std.Record
import typings.stylableCore.anon.Elements
import typings.stylableCore.anon.Symbol
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.CSSResolve
import typings.stylableCore.stylableResolverMod.StylableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-transformer", "StylableTransformer")
@js.native
class StylableTransformer protected () extends js.Object {
  def this(options: TransformerOptions) = this()
  
  def addAdditionalSelectors(addedSelectors: js.Array[AdditionalSelector], selectorAst: SelectorAstNode): Unit = js.native
  
  var addDevRules: js.Any = js.native
  
  def addGlobalsToMeta(selectorAst: js.Array[SelectorAstNode]): Unit = js.native
  def addGlobalsToMeta(selectorAst: js.Array[SelectorAstNode], meta: StylableMeta): Unit = js.native
  
  def applyRootScoping(meta: StylableMeta, selectorAst: SelectorAstNode): Unit = js.native
  
  def createCSSVarsMapping(_ast: Root_, meta: StylableMeta): Record[String, String] = js.native
  
  var delimiter: String = js.native
  
  var diagnostics: Diagnostics = js.native
  
  def exportCSSVars(cssVarsMapping: Record[String, String], varsExport: Record[String, String]): Unit = js.native
  
  def exportClass(meta: StylableMeta, name: String, classSymbol: ClassSymbol): String = js.native
  def exportClass(meta: StylableMeta, name: String, classSymbol: ClassSymbol, metaExports: Record[String, String]): String = js.native
  
  def exportClasses(meta: StylableMeta): Record[String, String] = js.native
  
  def exportKeyframes(keyframeMapping: Record[String, String], keyframesExport: Record[String, String]): Unit = js.native
  
  def exportLocalVars(meta: StylableMeta, stVarsExport: Record[String, String]): Unit = js.native
  def exportLocalVars(meta: StylableMeta, stVarsExport: Record[String, String], variableOverride: Record[String, String]): Unit = js.native
  
  def exportRootClass(meta: StylableMeta, classesExport: Record[String, String]): Unit = js.native
  
  var fileProcessor: FileProcessor[StylableMeta] = js.native
  
  def getPartExports(resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): js.Array[String] = js.native
  
  def getScopedCSSVar(decl: Declaration, meta: StylableMeta, cssVarsMapping: Record[String, String]): String = js.native
  
  var handleChunkNode: js.Any = js.native
  
  def handleClass(meta: StylableMeta, node: SelectorAstNode, name: String): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: js.UndefOr[scala.Nothing],
    rule: js.UndefOr[scala.Nothing],
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: js.UndefOr[scala.Nothing],
    rule: Rule_
  ): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: js.UndefOr[scala.Nothing],
    rule: Rule_,
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  def handleClass(meta: StylableMeta, node: SelectorAstNode, name: String, classesExport: Record[String, String]): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: Record[String, String],
    rule: js.UndefOr[scala.Nothing],
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: Record[String, String],
    rule: Rule_
  ): CSSResolve[StylableSymbol] = js.native
  def handleClass(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    classesExport: Record[String, String],
    rule: Rule_,
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  
  var handleCustomSelector: js.Any = js.native
  
  def handleElement(meta: StylableMeta, node: SelectorAstNode, name: String): CSSResolve[StylableSymbol] | Symbol = js.native
  def handleElement(meta: StylableMeta, node: SelectorAstNode, name: String, originMeta: StylableMeta): CSSResolve[StylableSymbol] | Symbol = js.native
  
  def handlePseudoElement(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    selectorNode: SelectorAstNode,
    addedSelectors: js.Array[AdditionalSelector]
  ): CSSResolve[StylableSymbol] = js.native
  def handlePseudoElement(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    selectorNode: SelectorAstNode,
    addedSelectors: js.Array[AdditionalSelector],
    rule: js.UndefOr[scala.Nothing],
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  def handlePseudoElement(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    selectorNode: SelectorAstNode,
    addedSelectors: js.Array[AdditionalSelector],
    rule: Rule_
  ): CSSResolve[StylableSymbol] = js.native
  def handlePseudoElement(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    selectorNode: SelectorAstNode,
    addedSelectors: js.Array[AdditionalSelector],
    rule: Rule_,
    originMeta: StylableMeta
  ): CSSResolve[StylableSymbol] = js.native
  
  var isDuplicateStScopeDiagnostic: js.Any = js.native
  
  var keepValues: Boolean = js.native
  
  var metaParts: js.Any = js.native
  
  var mode: EnvMode = js.native
  
  var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.native
  
  var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.native
  
  var resetTransformProperties: js.Any = js.native
  
  var resolveMetaParts: js.Any = js.native
  
  def resolveSelectorElements(meta: StylableMeta, selector: String): js.Array[js.Array[ResolvedElement]] = js.native
  
  var resolver: StylableResolver = js.native
  
  def scope(name: String, namespace: String): String = js.native
  def scope(name: String, namespace: String, delimiter: String): String = js.native
  
  var scopeClassNode: js.Any = js.native
  
  def scopeKeyframes(ast: Root_, meta: StylableMeta): Record[String, String] = js.native
  
  def scopeRule(meta: StylableMeta, rule: Rule_): String = js.native
  def scopeRule(meta: StylableMeta, rule: Rule_, _classesExport: Record[String, String]): String = js.native
  
  def scopeSelector(originMeta: StylableMeta, selector: String): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: js.UndefOr[scala.Nothing],
    calcPaths: js.UndefOr[scala.Nothing],
    rule: Rule_
  ): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: js.UndefOr[scala.Nothing],
    calcPaths: Boolean
  ): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: js.UndefOr[scala.Nothing],
    calcPaths: Boolean,
    rule: Rule_
  ): ScopedSelectorResults = js.native
  def scopeSelector(originMeta: StylableMeta, selector: String, classesExport: Record[String, String]): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: Record[String, String],
    calcPaths: js.UndefOr[scala.Nothing],
    rule: Rule_
  ): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: Record[String, String],
    calcPaths: Boolean
  ): ScopedSelectorResults = js.native
  def scopeSelector(
    originMeta: StylableMeta,
    selector: String,
    classesExport: Record[String, String],
    calcPaths: Boolean,
    rule: Rule_
  ): ScopedSelectorResults = js.native
  
  def scopeSelector2(originMeta: StylableMeta, selector: String): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: js.UndefOr[scala.Nothing],
    _calcPaths: js.UndefOr[scala.Nothing],
    rule: Rule_
  ): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: js.UndefOr[scala.Nothing],
    _calcPaths: Boolean
  ): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: js.UndefOr[scala.Nothing],
    _calcPaths: Boolean,
    rule: Rule_
  ): Elements = js.native
  def scopeSelector2(originMeta: StylableMeta, selector: String, _classesExport: Record[String, String]): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: Record[String, String],
    _calcPaths: js.UndefOr[scala.Nothing],
    rule: Rule_
  ): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: Record[String, String],
    _calcPaths: Boolean
  ): Elements = js.native
  def scopeSelector2(
    originMeta: StylableMeta,
    selector: String,
    _classesExport: Record[String, String],
    _calcPaths: Boolean,
    rule: Rule_
  ): Elements = js.native
  
  def scopeSelectorAst(context: ScopeContext): SelectorAstNode = js.native
  
  def transform(meta: StylableMeta): StylableResults = js.native
  
  def transformAst(ast: Root_, meta: StylableMeta): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: Record[String, String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: Record[String, String],
    path: js.UndefOr[scala.Nothing],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: js.UndefOr[scala.Nothing],
    variableOverride: Record[String, String],
    path: js.Array[String],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(ast: Root_, meta: StylableMeta, metaExports: StylableExports): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: Record[String, String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: Record[String, String],
    path: js.UndefOr[scala.Nothing],
    mixinTransform: Boolean
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  def transformAst(
    ast: Root_,
    meta: StylableMeta,
    metaExports: StylableExports,
    variableOverride: Record[String, String],
    path: js.Array[String],
    mixinTransform: Boolean
  ): Unit = js.native
  
  def transformGlobals(ast: Root_, meta: StylableMeta): Unit = js.native
}
