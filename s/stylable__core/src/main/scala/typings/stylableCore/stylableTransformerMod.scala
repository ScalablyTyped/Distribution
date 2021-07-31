package typings.stylableCore

import typings.postcss.mod.Declaration
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.std.Record
import typings.stylableCore.anon.Args
import typings.stylableCore.anon.Elements
import typings.stylableCore.anon.Symbol
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.selectorUtilsMod.SelectorChunk2
import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.`pseudo-element`
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.CSSResolve
import typings.stylableCore.stylableResolverMod.StylableResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableTransformerMod {
  
  @JSImport("@stylable/core/cjs/stylable-transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core/cjs/stylable-transformer", "StylableTransformer")
  @js.native
  class StylableTransformer protected () extends StObject {
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
      classesExport: Unit,
      rule: Unit,
      originMeta: StylableMeta
    ): CSSResolve[StylableSymbol] = js.native
    def handleClass(meta: StylableMeta, node: SelectorAstNode, name: String, classesExport: Unit, rule: Rule_): CSSResolve[StylableSymbol] = js.native
    def handleClass(
      meta: StylableMeta,
      node: SelectorAstNode,
      name: String,
      classesExport: Unit,
      rule: Rule_,
      originMeta: StylableMeta
    ): CSSResolve[StylableSymbol] = js.native
    def handleClass(meta: StylableMeta, node: SelectorAstNode, name: String, classesExport: Record[String, String]): CSSResolve[StylableSymbol] = js.native
    def handleClass(
      meta: StylableMeta,
      node: SelectorAstNode,
      name: String,
      classesExport: Record[String, String],
      rule: Unit,
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
      rule: Unit,
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
    def scopeSelector(originMeta: StylableMeta, selector: String, classesExport: Unit, calcPaths: Boolean): ScopedSelectorResults = js.native
    def scopeSelector(originMeta: StylableMeta, selector: String, classesExport: Unit, calcPaths: Boolean, rule: Rule_): ScopedSelectorResults = js.native
    def scopeSelector(originMeta: StylableMeta, selector: String, classesExport: Unit, calcPaths: Unit, rule: Rule_): ScopedSelectorResults = js.native
    def scopeSelector(originMeta: StylableMeta, selector: String, classesExport: Record[String, String]): ScopedSelectorResults = js.native
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
    def scopeSelector(
      originMeta: StylableMeta,
      selector: String,
      classesExport: Record[String, String],
      calcPaths: Unit,
      rule: Rule_
    ): ScopedSelectorResults = js.native
    
    def scopeSelector2(originMeta: StylableMeta, selector: String): Elements = js.native
    def scopeSelector2(originMeta: StylableMeta, selector: String, _classesExport: Unit, _calcPaths: Boolean): Elements = js.native
    def scopeSelector2(originMeta: StylableMeta, selector: String, _classesExport: Unit, _calcPaths: Boolean, rule: Rule_): Elements = js.native
    def scopeSelector2(originMeta: StylableMeta, selector: String, _classesExport: Unit, _calcPaths: Unit, rule: Rule_): Elements = js.native
    def scopeSelector2(originMeta: StylableMeta, selector: String, _classesExport: Record[String, String]): Elements = js.native
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
    def scopeSelector2(
      originMeta: StylableMeta,
      selector: String,
      _classesExport: Record[String, String],
      _calcPaths: Unit,
      rule: Rule_
    ): Elements = js.native
    
    def scopeSelectorAst(context: ScopeContext): SelectorAstNode = js.native
    
    def transform(meta: StylableMeta): StylableResults = js.native
    
    def transformAst(ast: Root_, meta: StylableMeta): Unit = js.native
    def transformAst(ast: Root_, meta: StylableMeta, metaExports: Unit, variableOverride: Unit, path: js.Array[String]): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: Unit,
      variableOverride: Unit,
      path: js.Array[String],
      mixinTransform: Boolean
    ): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: Unit,
      variableOverride: Unit,
      path: Unit,
      mixinTransform: Boolean
    ): Unit = js.native
    def transformAst(ast: Root_, meta: StylableMeta, metaExports: Unit, variableOverride: Record[String, String]): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: Unit,
      variableOverride: Record[String, String],
      path: js.Array[String]
    ): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: Unit,
      variableOverride: Record[String, String],
      path: js.Array[String],
      mixinTransform: Boolean
    ): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: Unit,
      variableOverride: Record[String, String],
      path: Unit,
      mixinTransform: Boolean
    ): Unit = js.native
    def transformAst(ast: Root_, meta: StylableMeta, metaExports: StylableExports): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: StylableExports,
      variableOverride: Unit,
      path: js.Array[String]
    ): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: StylableExports,
      variableOverride: Unit,
      path: js.Array[String],
      mixinTransform: Boolean
    ): Unit = js.native
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: StylableExports,
      variableOverride: Unit,
      path: Unit,
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
    def transformAst(
      ast: Root_,
      meta: StylableMeta,
      metaExports: StylableExports,
      variableOverride: Record[String, String],
      path: Unit,
      mixinTransform: Boolean
    ): Unit = js.native
    
    def transformGlobals(ast: Root_, meta: StylableMeta): Unit = js.native
  }
  
  @scala.inline
  def removeSTDirective(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSTDirective")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object transformerWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-transformer", "transformerWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def CANNOT_EXTEND_JS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_JS")().asInstanceOf[String]
    
    @scala.inline
    def CANNOT_EXTEND_UNKNOWN_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_EXTEND_UNKNOWN_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def IMPORT_ISNT_EXTENDABLE(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IMPORT_ISNT_EXTENDABLE")().asInstanceOf[String]
    
    @scala.inline
    def KEYFRAME_NAME_RESERVED(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("KEYFRAME_NAME_RESERVED")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def UNKNOWN_IMPORT_ALIAS(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORT_ALIAS")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def UNKNOWN_PSEUDO_ELEMENT(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_PSEUDO_ELEMENT")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait AdditionalSelector extends StObject {
    
    var customElementChunk: String
    
    var node: SelectorAstNode
    
    var selectorNode: SelectorAstNode
  }
  object AdditionalSelector {
    
    @scala.inline
    def apply(customElementChunk: String, node: SelectorAstNode, selectorNode: SelectorAstNode): AdditionalSelector = {
      val __obj = js.Dynamic.literal(customElementChunk = customElementChunk.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selectorNode = selectorNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdditionalSelector]
    }
    
    @scala.inline
    implicit class AdditionalSelectorMutableBuilder[Self <: AdditionalSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomElementChunk(value: String): Self = StObject.set(x, "customElementChunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: SelectorAstNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorNode(value: SelectorAstNode): Self = StObject.set(x, "selectorNode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylableCore.stylableCoreStrings.production
    - typings.stylableCore.stylableCoreStrings.development
  */
  trait EnvMode extends StObject
  object EnvMode {
    
    @scala.inline
    def development: typings.stylableCore.stylableCoreStrings.development = "development".asInstanceOf[typings.stylableCore.stylableCoreStrings.development]
    
    @scala.inline
    def production: typings.stylableCore.stylableCoreStrings.production = "production".asInstanceOf[typings.stylableCore.stylableCoreStrings.production]
  }
  
  trait KeyFrameWithNode extends StObject {
    
    var node: Node
    
    var value: String
  }
  object KeyFrameWithNode {
    
    @scala.inline
    def apply(node: Node, value: String): KeyFrameWithNode = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyFrameWithNode]
    }
    
    @scala.inline
    implicit class KeyFrameWithNodeMutableBuilder[Self <: KeyFrameWithNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaParts extends StObject {
    
    var `class`: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]
    
    var element: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]
  }
  object MetaParts {
    
    @scala.inline
    def apply(
      `class`: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]],
      element: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]
    ): MetaParts = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaParts]
    }
    
    @scala.inline
    implicit class MetaPartsMutableBuilder[Self <: MetaParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedElement extends StObject {
    
    var name: String
    
    var resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]
    
    var `type`: String
  }
  object ResolvedElement {
    
    @scala.inline
    def apply(name: String, resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]], `type`: String): ResolvedElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedElement]
    }
    
    @scala.inline
    implicit class ResolvedElementMutableBuilder[Self <: ResolvedElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedVarargs(value: (CSSResolve[ClassSymbol | ElementSymbol])*): Self = StObject.set(x, "resolved", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScopeAnchor extends StObject {
    
    var name: String
    
    var resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]
    
    var `type`: `class` | element | `pseudo-element`
  }
  object ScopeAnchor {
    
    @scala.inline
    def apply(
      name: String,
      resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
      `type`: `class` | element | `pseudo-element`
    ): ScopeAnchor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeAnchor]
    }
    
    @scala.inline
    implicit class ScopeAnchorMutableBuilder[Self <: ScopeAnchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedVarargs(value: (CSSResolve[ClassSymbol | ElementSymbol])*): Self = StObject.set(x, "resolved", js.Array(value :_*))
      
      @scala.inline
      def setType(value: `class` | element | `pseudo-element`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScopeContext extends StObject {
    
    var additionalSelectors: js.Array[js.Function0[Unit]]
    
    var chunk: js.UndefOr[SelectorChunk2] = js.undefined
    
    var chunks: js.UndefOr[js.Array[SelectorChunk2]] = js.undefined
    
    def createNestedContext(selectorAst: SelectorAstNode): ScopeContext
    
    var currentAnchor: js.UndefOr[ScopeAnchor] = js.undefined
    
    var elements: js.Array[js.Any]
    
    def initRootAnchor(anchor: ScopeAnchor): Unit
    
    var metaParts: js.UndefOr[MetaParts] = js.undefined
    
    var node: js.UndefOr[SelectorAstNode] = js.undefined
    
    var originMeta: StylableMeta
    
    var rule: Rule_
    
    var selectorAst: SelectorAstNode
    
    var selectorIndex: Double
    
    def setCurrentAnchor(anchor: ScopeAnchor): Unit
    
    var transformGlobals: Boolean
  }
  object ScopeContext {
    
    @scala.inline
    def apply(
      additionalSelectors: js.Array[js.Function0[Unit]],
      createNestedContext: SelectorAstNode => ScopeContext,
      elements: js.Array[js.Any],
      initRootAnchor: ScopeAnchor => Unit,
      originMeta: StylableMeta,
      rule: Rule_,
      selectorAst: SelectorAstNode,
      selectorIndex: Double,
      setCurrentAnchor: ScopeAnchor => Unit,
      transformGlobals: Boolean
    ): ScopeContext = {
      val __obj = js.Dynamic.literal(additionalSelectors = additionalSelectors.asInstanceOf[js.Any], createNestedContext = js.Any.fromFunction1(createNestedContext), elements = elements.asInstanceOf[js.Any], initRootAnchor = js.Any.fromFunction1(initRootAnchor), originMeta = originMeta.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], selectorAst = selectorAst.asInstanceOf[js.Any], selectorIndex = selectorIndex.asInstanceOf[js.Any], setCurrentAnchor = js.Any.fromFunction1(setCurrentAnchor), transformGlobals = transformGlobals.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeContext]
    }
    
    @scala.inline
    implicit class ScopeContextMutableBuilder[Self <: ScopeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalSelectors(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "additionalSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSelectorsVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "additionalSelectors", js.Array(value :_*))
      
      @scala.inline
      def setChunk(value: SelectorChunk2): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setChunks(value: js.Array[SelectorChunk2]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      @scala.inline
      def setChunksVarargs(value: SelectorChunk2*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setCreateNestedContext(value: SelectorAstNode => ScopeContext): Self = StObject.set(x, "createNestedContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrentAnchor(value: ScopeAnchor): Self = StObject.set(x, "currentAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentAnchorUndefined: Self = StObject.set(x, "currentAnchor", js.undefined)
      
      @scala.inline
      def setElements(value: js.Array[js.Any]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: js.Any*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setInitRootAnchor(value: ScopeAnchor => Unit): Self = StObject.set(x, "initRootAnchor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMetaParts(value: MetaParts): Self = StObject.set(x, "metaParts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaPartsUndefined: Self = StObject.set(x, "metaParts", js.undefined)
      
      @scala.inline
      def setNode(value: SelectorAstNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setOriginMeta(value: StylableMeta): Self = StObject.set(x, "originMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: Rule_): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorAst(value: SelectorAstNode): Self = StObject.set(x, "selectorAst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorIndex(value: Double): Self = StObject.set(x, "selectorIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCurrentAnchor(value: ScopeAnchor => Unit): Self = StObject.set(x, "setCurrentAnchor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformGlobals(value: Boolean): Self = StObject.set(x, "transformGlobals", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScopedSelectorResults extends StObject {
    
    var current: StylableMeta
    
    var elements: js.Array[js.Array[ResolvedElement]]
    
    var selector: String
    
    var selectorAst: SelectorAstNode
    
    var symbol: StylableSymbol | Null
  }
  object ScopedSelectorResults {
    
    @scala.inline
    def apply(
      current: StylableMeta,
      elements: js.Array[js.Array[ResolvedElement]],
      selector: String,
      selectorAst: SelectorAstNode
    ): ScopedSelectorResults = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], selectorAst = selectorAst.asInstanceOf[js.Any], symbol = null)
      __obj.asInstanceOf[ScopedSelectorResults]
    }
    
    @scala.inline
    implicit class ScopedSelectorResultsMutableBuilder[Self <: ScopedSelectorResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: StylableMeta): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElements(value: js.Array[js.Array[ResolvedElement]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: js.Array[ResolvedElement]*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorAst(value: SelectorAstNode): Self = StObject.set(x, "selectorAst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: StylableSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolNull: Self = StObject.set(x, "symbol", null)
    }
  }
  
  trait StylableExports extends StObject {
    
    var classes: Record[String, String]
    
    var keyframes: Record[String, String]
    
    var stVars: Record[String, String]
    
    var vars: Record[String, String]
  }
  object StylableExports {
    
    @scala.inline
    def apply(
      classes: Record[String, String],
      keyframes: Record[String, String],
      stVars: Record[String, String],
      vars: Record[String, String]
    ): StylableExports = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableExports]
    }
    
    @scala.inline
    implicit class StylableExportsMutableBuilder[Self <: StylableExports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Record[String, String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframes(value: Record[String, String]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStVars(value: Record[String, String]): Self = StObject.set(x, "stVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVars(value: Record[String, String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
  
  trait StylableResults extends StObject {
    
    var exports: StylableExports
    
    var meta: StylableMeta
  }
  object StylableResults {
    
    @scala.inline
    def apply(exports: StylableExports, meta: StylableMeta): StylableResults = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableResults]
    }
    
    @scala.inline
    implicit class StylableResultsMutableBuilder[Self <: StylableResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: StylableExports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: StylableMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformHooks extends StObject {
    
    var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.undefined
    
    var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.undefined
  }
  object TransformHooks {
    
    @scala.inline
    def apply(): TransformHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformHooks]
    }
    
    @scala.inline
    implicit class TransformHooksMutableBuilder[Self <: TransformHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostProcessor(
        value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults & js.Object
      ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
      
      @scala.inline
      def setReplaceValueHook(
        value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
      ): Self = StObject.set(x, "replaceValueHook", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReplaceValueHookUndefined: Self = StObject.set(x, "replaceValueHook", js.undefined)
    }
  }
  
  trait TransformerOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var diagnostics: Diagnostics
    
    var fileProcessor: FileProcessor[StylableMeta]
    
    var keepValues: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[EnvMode] = js.undefined
    
    var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.undefined
    
    var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.undefined
    
    def requireModule(modulePath: String): js.Any
  }
  object TransformerOptions {
    
    @scala.inline
    def apply(
      diagnostics: Diagnostics,
      fileProcessor: FileProcessor[StylableMeta],
      requireModule: String => js.Any
    ): TransformerOptions = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], fileProcessor = fileProcessor.asInstanceOf[js.Any], requireModule = js.Any.fromFunction1(requireModule))
      __obj.asInstanceOf[TransformerOptions]
    }
    
    @scala.inline
    implicit class TransformerOptionsMutableBuilder[Self <: TransformerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileProcessor(value: FileProcessor[StylableMeta]): Self = StObject.set(x, "fileProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
      
      @scala.inline
      def setMode(value: EnvMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPostProcessor(
        value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults & js.Object
      ): Self = StObject.set(x, "postProcessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
      
      @scala.inline
      def setReplaceValueHook(
        value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
      ): Self = StObject.set(x, "replaceValueHook", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReplaceValueHookUndefined: Self = StObject.set(x, "replaceValueHook", js.undefined)
      
      @scala.inline
      def setRequireModule(value: String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    }
  }
  
  type postProcessor[T] = js.Function2[
    /* stylableResults */ StylableResults, 
    /* transformer */ StylableTransformer, 
    StylableResults & T
  ]
  
  type replaceValueHook = js.Function4[
    /* value */ String, 
    /* name */ String | Args, 
    /* isLocal */ Boolean, 
    /* passedThrough */ js.Array[String], 
    String
  ]
}
