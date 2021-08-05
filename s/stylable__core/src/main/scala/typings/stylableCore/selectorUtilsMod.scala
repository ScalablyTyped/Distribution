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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorUtilsMod {
  
  @JSImport("@stylable/core/cjs/selector-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createChecker(types: js.Array[String | js.Array[String]]): js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChecker")(types.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function1[/* node */ SelectorAstNode, Boolean]]]
  
  inline def createSimpleSelectorChecker(): js.Function1[/* node */ SelectorAstNode, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleSelectorChecker")().asInstanceOf[js.Function1[/* node */ SelectorAstNode, Boolean]]
  
  inline def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String
  ): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarningRule")(extendedNode.asInstanceOf[js.Any], scopedExtendedNode.asInstanceOf[js.Any], extendedFile.asInstanceOf[js.Any], extendingNode.asInstanceOf[js.Any], scopedExtendingNode.asInstanceOf[js.Any], extendingFile.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  inline def createWarningRule(
    extendedNode: String,
    scopedExtendedNode: String,
    extendedFile: String,
    extendingNode: String,
    scopedExtendingNode: String,
    extendingFile: String,
    useScoped: Boolean
  ): Rule_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarningRule")(extendedNode.asInstanceOf[js.Any], scopedExtendedNode.asInstanceOf[js.Any], extendedFile.asInstanceOf[js.Any], extendingNode.asInstanceOf[js.Any], scopedExtendingNode.asInstanceOf[js.Any], extendingFile.asInstanceOf[js.Any], useScoped.asInstanceOf[js.Any])).asInstanceOf[Rule_]
  
  inline def filterChunkNodesByType(chunk: SelectorChunk, typeOptions: js.Array[String]): js.Array[PartialSelectorAstNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterChunkNodesByType")(chunk.asInstanceOf[js.Any], typeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PartialSelectorAstNode]]
  
  inline def fixChunkOrdering(selectorNode: SelectorAstNode, prefixType: SelectorAstNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixChunkOrdering")(selectorNode.asInstanceOf[js.Any], prefixType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getOriginDefinition(resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): CSSResolve[ClassSymbol | ElementSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginDefinition")(resolved.asInstanceOf[js.Any]).asInstanceOf[CSSResolve[ClassSymbol | ElementSymbol]]
  
  inline def isChildOfAtRule(rule: Container, atRuleName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isChildOfAtRule")(rule.asInstanceOf[js.Any], atRuleName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCompRoot(name: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompRoot")(name.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def isGlobal(node: SelectorAstNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGlobal")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImport(ast: SelectorAstNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNodeMatch(nodeA: PartialSelectorAstNode, nodeB: PartialSelectorAstNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeMatch")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRootValid(ast: SelectorAstNode, rootName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRootValid")(ast.asInstanceOf[js.Any], rootName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSimpleSelector(selectorAst: SelectorAstNode): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleSelector")(selectorAst.asInstanceOf[js.Any]).asInstanceOf[Boolean | Unit]
  
  inline def matchAtKeyframes(selector: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchAtKeyframes")(selector.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def matchAtMedia(selector: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchAtMedia")(selector.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def matchSelectorTarget(sourceSelector: String, targetSelector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSelectorTarget")(sourceSelector.asInstanceOf[js.Any], targetSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mergeChunks(chunks: js.Array[js.Array[SelectorChunk2]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeChunks")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def parseSelector(selector: String): SelectorAstNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[SelectorAstNode]
  
  inline def separateChunks(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateChunks")(selectorNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[SelectorChunk]]]
  
  inline def separateChunks2(selectorNode: SelectorAstNode): js.Array[js.Array[SelectorChunk2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateChunks2")(selectorNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[SelectorChunk2]]]
  
  inline def stringifySelector(ast: SelectorAstNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelector")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Double, nodes: js.Array[SelectorAstNode]): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def traverseNode(node: SelectorAstNode, visitor: Visitor, index: Unit, nodes: js.Array[SelectorAstNode]): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], index.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  trait PseudoSelectorAstNode
    extends StObject
       with SelectorAstNode {
    
    @JSName("content")
    var content_PseudoSelectorAstNode: String
    
    @JSName("type")
    var type_PseudoSelectorAstNode: `pseudo-class`
  }
  object PseudoSelectorAstNode {
    
    inline def apply(content: String, name: String, nodes: js.Array[SelectorAstNode]): PseudoSelectorAstNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("pseudo-class")
      __obj.asInstanceOf[PseudoSelectorAstNode]
    }
    
    extension [Self <: PseudoSelectorAstNode](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: `pseudo-class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorAstNode extends StObject {
    
    var before: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var nodes: js.Array[SelectorAstNode]
    
    var operator: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectorAstNode {
    
    inline def apply(name: String, nodes: js.Array[SelectorAstNode], `type`: String): SelectorAstNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorAstNode]
    }
    
    extension [Self <: SelectorAstNode](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: SelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectorChunk extends StObject {
    
    var nodes: js.Array[PartialSelectorAstNode]
    
    var operator: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectorChunk {
    
    inline def apply(nodes: js.Array[PartialSelectorAstNode], `type`: String): SelectorChunk = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorChunk]
    }
    
    extension [Self <: SelectorChunk](x: Self) {
      
      inline def setNodes(value: js.Array[PartialSelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: PartialSelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectorChunk2 extends StObject {
    
    var before: js.UndefOr[String] = js.undefined
    
    var nodes: js.Array[SelectorAstNode]
    
    var operator: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectorChunk2 {
    
    inline def apply(nodes: js.Array[SelectorAstNode], `type`: String): SelectorChunk2 = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorChunk2]
    }
    
    extension [Self <: SelectorChunk2](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setNodes(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: SelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Visitor = js.Function3[
    /* node */ SelectorAstNode, 
    /* index */ Double, 
    /* nodes */ js.Array[SelectorAstNode], 
    Boolean | Unit
  ]
}
