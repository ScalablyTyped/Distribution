package typings.stylableCore.stylableTransformerMod

import typings.postcss.mod.Rule_
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.selectorUtilsMod.SelectorChunk2
import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeContext extends js.Object {
  
  var additionalSelectors: js.Array[js.Function0[Unit]] = js.native
  
  var chunk: js.UndefOr[SelectorChunk2] = js.native
  
  var chunks: js.UndefOr[js.Array[SelectorChunk2]] = js.native
  
  def createNestedContext(selectorAst: SelectorAstNode): ScopeContext = js.native
  
  var currentAnchor: js.UndefOr[ScopeAnchor] = js.native
  
  var elements: js.Array[_] = js.native
  
  def initRootAnchor(anchor: ScopeAnchor): Unit = js.native
  
  var metaParts: js.UndefOr[MetaParts] = js.native
  
  var node: js.UndefOr[SelectorAstNode] = js.native
  
  var originMeta: StylableMeta = js.native
  
  var rule: Rule_ = js.native
  
  var selectorAst: SelectorAstNode = js.native
  
  var selectorIndex: Double = js.native
  
  def setCurrentAnchor(anchor: ScopeAnchor): Unit = js.native
  
  var transformGlobals: Boolean = js.native
}
object ScopeContext {
  
  @scala.inline
  def apply(
    additionalSelectors: js.Array[js.Function0[Unit]],
    createNestedContext: SelectorAstNode => ScopeContext,
    elements: js.Array[_],
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
  implicit class ScopeContextOps[Self <: ScopeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalSelectorsVarargs(value: js.Function0[Unit]*): Self = this.set("additionalSelectors", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSelectors(value: js.Array[js.Function0[Unit]]): Self = this.set("additionalSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNestedContext(value: SelectorAstNode => ScopeContext): Self = this.set("createNestedContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementsVarargs(value: js.Any*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitRootAnchor(value: ScopeAnchor => Unit): Self = this.set("initRootAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginMeta(value: StylableMeta): Self = this.set("originMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Rule_): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorAst(value: SelectorAstNode): Self = this.set("selectorAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorIndex(value: Double): Self = this.set("selectorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCurrentAnchor(value: ScopeAnchor => Unit): Self = this.set("setCurrentAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformGlobals(value: Boolean): Self = this.set("transformGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk(value: SelectorChunk2): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setChunksVarargs(value: SelectorChunk2*): Self = this.set("chunks", js.Array(value :_*))
    
    @scala.inline
    def setChunks(value: js.Array[SelectorChunk2]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
    
    @scala.inline
    def setCurrentAnchor(value: ScopeAnchor): Self = this.set("currentAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentAnchor: Self = this.set("currentAnchor", js.undefined)
    
    @scala.inline
    def setMetaParts(value: MetaParts): Self = this.set("metaParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaParts: Self = this.set("metaParts", js.undefined)
    
    @scala.inline
    def setNode(value: SelectorAstNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
}
