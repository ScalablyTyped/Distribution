package typings.tsutils

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilConvertAstMod {
  
  @JSImport("tsutils/util/convert-ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertAst(sourceFile: SourceFile): ConvertedAst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAst")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[ConvertedAst]
  
  trait ConvertedAst extends StObject {
    
    /** depth-first array of all nodes excluding SourceFile */
    var flat: js.Array[Node]
    
    /** nodes wrapped in a data structure with useful links */
    var wrapped: WrappedAst
  }
  object ConvertedAst {
    
    inline def apply(flat: js.Array[Node], wrapped: WrappedAst): ConvertedAst = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertedAst]
    }
    
    extension [Self <: ConvertedAst](x: Self) {
      
      inline def setFlat(value: js.Array[Node]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatVarargs(value: Node*): Self = StObject.set(x, "flat", js.Array(value*))
      
      inline def setWrapped(value: WrappedAst): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeWrap extends StObject {
    
    /** All immediate children of `node` that would be visited by `ts.forEachChild(node, cb)`. */
    var children: js.Array[NodeWrap]
    
    /** The SyntaxKind of `node`. */
    var kind: SyntaxKind
    
    /** Link to the next NodeWrap, depth-first. */
    var next: js.UndefOr[NodeWrap] = js.undefined
    
    /** The real AST node. */
    var node: Node
    
    /** Link to the parent NodeWrap */
    var parent: js.UndefOr[NodeWrap] = js.undefined
    
    /** Link to the next NodeWrap skipping all children of the current node. */
    var skip: js.UndefOr[NodeWrap] = js.undefined
  }
  object NodeWrap {
    
    inline def apply(children: js.Array[NodeWrap], kind: SyntaxKind, node: Node): NodeWrap = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWrap]
    }
    
    extension [Self <: NodeWrap](x: Self) {
      
      inline def setChildren(value: js.Array[NodeWrap]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: NodeWrap*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setKind(value: SyntaxKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setNext(value: NodeWrap): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: NodeWrap): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSkip(value: NodeWrap): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  trait WrappedAst
    extends StObject
       with NodeWrap {
    
    @JSName("next")
    var next_WrappedAst: NodeWrap
    
    @JSName("node")
    var node_WrappedAst: SourceFile
    
    @JSName("parent")
    var parent_WrappedAst: Unit
    
    @JSName("skip")
    var skip_WrappedAst: Unit
  }
  object WrappedAst {
    
    inline def apply(
      children: js.Array[NodeWrap],
      kind: SyntaxKind,
      next: NodeWrap,
      node: SourceFile,
      parent: Unit,
      skip: Unit
    ): WrappedAst = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedAst]
    }
    
    extension [Self <: WrappedAst](x: Self) {
      
      inline def setNext(value: NodeWrap): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNode(value: SourceFile): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Unit): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Unit): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
