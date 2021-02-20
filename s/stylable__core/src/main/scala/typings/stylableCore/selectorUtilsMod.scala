package typings.stylableCore

import typings.postcss.mod.Container
import typings.postcss.mod.Rule_
import typings.std.RegExpMatchArray
import typings.stylableCore.anon.PartialSelectorAstNode
import typings.stylableCore.stylableCoreStrings.`pseudo-class`
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableResolverMod.CSSResolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorUtilsMod {
  
  @JSImport("@stylable/core/cjs/selector-utils", "createChecker")
  @js.native
  def createChecker(types: js.Array[String | js.Array[String]]): js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "createSimpleSelectorChecker")
  @js.native
  def createSimpleSelectorChecker(): js.Function1[/* node */ SelectorAstNode, Boolean] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "createWarningRule")
  @js.native
  def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String
  ): Rule_ = js.native
  @JSImport("@stylable/core/cjs/selector-utils", "createWarningRule")
  @js.native
  def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String,
    useScoped: Boolean
  ): Rule_ = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "filterChunkNodesByType")
  @js.native
  def filterChunkNodesByType(chunk: SelectorChunk, typeOptions: js.Array[String]): js.Array[PartialSelectorAstNode] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "fixChunkOrdering")
  @js.native
  def fixChunkOrdering(selectorNode: SelectorAstNode, prefixType: SelectorAstNode): Unit = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "getOriginDefinition")
  @js.native
  def getOriginDefinition(resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): CSSResolve[ClassSymbol | ElementSymbol] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isChildOfAtRule")
  @js.native
  def isChildOfAtRule(rule: Container, atRuleName: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isCompRoot")
  @js.native
  def isCompRoot(name: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isGlobal")
  @js.native
  def isGlobal(node: SelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isImport")
  @js.native
  def isImport(ast: SelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isNodeMatch")
  @js.native
  def isNodeMatch(nodeA: PartialSelectorAstNode, nodeB: PartialSelectorAstNode): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isRootValid")
  @js.native
  def isRootValid(ast: SelectorAstNode, rootName: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "isSimpleSelector")
  @js.native
  def isSimpleSelector(selectorAst: SelectorAstNode): Boolean | Unit = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "matchAtKeyframes")
  @js.native
  def matchAtKeyframes(selector: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "matchAtMedia")
  @js.native
  def matchAtMedia(selector: String): RegExpMatchArray | Null = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "matchSelectorTarget")
  @js.native
  def matchSelectorTarget(sourceSelector: String, targetSelector: String): Boolean = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "mergeChunks")
  @js.native
  def mergeChunks(chunks: js.Array[js.Array[SelectorChunk2]]): js.Any = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "parseSelector")
  @js.native
  def parseSelector(selector: String): SelectorAstNode = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "separateChunks")
  @js.native
  def separateChunks(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk]] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "separateChunks2")
  @js.native
  def separateChunks2(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk2]] = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "stringifySelector")
  @js.native
  def stringifySelector(ast: SelectorAstNode): String = js.native
  
  @JSImport("@stylable/core/cjs/selector-utils", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor): Boolean | Unit = js.native
  @JSImport("@stylable/core/cjs/selector-utils", "traverseNode")
  @js.native
  def traverseNode(
    node: SelectorAstNode,
    visitor: Visitor,
    index: js.UndefOr[scala.Nothing],
    nodes: js.Array[SelectorAstNode]
  ): Boolean | Unit = js.native
  @JSImport("@stylable/core/cjs/selector-utils", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double): Boolean | Unit = js.native
  @JSImport("@stylable/core/cjs/selector-utils", "traverseNode")
  @js.native
  def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double, nodes: js.Array[SelectorAstNode]): Boolean | Unit = js.native
  
  @js.native
  trait PseudoSelectorAstNode extends SelectorAstNode {
    
    @JSName("content")
    var content_PseudoSelectorAstNode: String = js.native
    
    @JSName("type")
    var type_PseudoSelectorAstNode: `pseudo-class` = js.native
  }
  object PseudoSelectorAstNode {
    
    @scala.inline
    def apply(content: String, name: String, nodes: js.Array[SelectorAstNode], `type`: `pseudo-class`): PseudoSelectorAstNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PseudoSelectorAstNode]
    }
    
    @scala.inline
    implicit class PseudoSelectorAstNodeMutableBuilder[Self <: PseudoSelectorAstNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `pseudo-class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectorAstNode extends StObject {
    
    var before: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var nodes: js.Array[SelectorAstNode] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SelectorAstNode {
    
    @scala.inline
    def apply(name: String, nodes: js.Array[SelectorAstNode], `type`: String): SelectorAstNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorAstNode]
    }
    
    @scala.inline
    implicit class SelectorAstNodeMutableBuilder[Self <: SelectorAstNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: SelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SelectorChunk extends StObject {
    
    var nodes: js.Array[PartialSelectorAstNode] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SelectorChunk {
    
    @scala.inline
    def apply(nodes: js.Array[PartialSelectorAstNode], `type`: String): SelectorChunk = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorChunk]
    }
    
    @scala.inline
    implicit class SelectorChunkMutableBuilder[Self <: SelectorChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[PartialSelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: PartialSelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SelectorChunk2 extends StObject {
    
    var before: js.UndefOr[String] = js.native
    
    var nodes: js.Array[SelectorAstNode] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object SelectorChunk2 {
    
    @scala.inline
    def apply(nodes: js.Array[SelectorAstNode], `type`: String): SelectorChunk2 = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorChunk2]
    }
    
    @scala.inline
    implicit class SelectorChunk2MutableBuilder[Self <: SelectorChunk2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setNodes(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: SelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Visitor = js.Function3[
    /* node */ SelectorAstNode, 
    /* index */ Double, 
    /* nodes */ js.Array[SelectorAstNode], 
    Boolean | Unit
  ]
}
