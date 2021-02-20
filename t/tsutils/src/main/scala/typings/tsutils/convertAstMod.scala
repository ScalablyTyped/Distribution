package typings.tsutils

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertAstMod {
  
  @JSImport("tsutils/util/convert-ast", "convertAst")
  @js.native
  def convertAst(sourceFile: SourceFile): ConvertedAst = js.native
  
  @js.native
  trait ConvertedAst extends StObject {
    
    var flat: js.Array[Node] = js.native
    
    var wrapped: WrappedAst = js.native
  }
  object ConvertedAst {
    
    @scala.inline
    def apply(flat: js.Array[Node], wrapped: WrappedAst): ConvertedAst = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertedAst]
    }
    
    @scala.inline
    implicit class ConvertedAstMutableBuilder[Self <: ConvertedAst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlat(value: js.Array[Node]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatVarargs(value: Node*): Self = StObject.set(x, "flat", js.Array(value :_*))
      
      @scala.inline
      def setWrapped(value: WrappedAst): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeWrap extends StObject {
    
    var children: js.Array[NodeWrap] = js.native
    
    var kind: SyntaxKind = js.native
    
    var next: js.UndefOr[NodeWrap] = js.native
    
    var node: Node = js.native
    
    var parent: js.UndefOr[NodeWrap] = js.native
    
    var skip: js.UndefOr[NodeWrap] = js.native
  }
  object NodeWrap {
    
    @scala.inline
    def apply(children: js.Array[NodeWrap], kind: SyntaxKind, node: Node): NodeWrap = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWrap]
    }
    
    @scala.inline
    implicit class NodeWrapMutableBuilder[Self <: NodeWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[NodeWrap]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: NodeWrap*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: SyntaxKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: NodeWrap): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: NodeWrap): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setSkip(value: NodeWrap): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  @js.native
  trait WrappedAst extends NodeWrap {
    
    @JSName("next")
    var next_WrappedAst: NodeWrap = js.native
    
    @JSName("node")
    var node_WrappedAst: SourceFile = js.native
    
    @JSName("parent")
    var parent_WrappedAst: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("skip")
    var skip_WrappedAst: js.UndefOr[scala.Nothing] = js.native
  }
  object WrappedAst {
    
    @scala.inline
    def apply(children: js.Array[NodeWrap], kind: SyntaxKind, next: NodeWrap, node: SourceFile): WrappedAst = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedAst]
    }
    
    @scala.inline
    implicit class WrappedAstMutableBuilder[Self <: WrappedAst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: NodeWrap): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: SourceFile): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
