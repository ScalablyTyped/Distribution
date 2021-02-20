package typings.yaml.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.Map
import typings.yaml.parseCstMod.CST.Seq
import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.FLOW_SEQ
import typings.yaml.utilMod.Type.MAP
import typings.yaml.utilMod.Type.PLAIN
import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import typings.yaml.utilMod.Type.QUOTE_SINGLE
import typings.yaml.utilMod.Type.SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AST {
  
  @js.native
  trait BlockFolded extends Scalar {
    
    @JSName("cstNode")
    var cstNode_BlockFolded: js.UndefOr[typings.yaml.parseCstMod.CST.BlockFolded] = js.native
    
    @JSName("type")
    var type_BlockFolded: BLOCK_FOLDED = js.native
  }
  
  @js.native
  trait BlockLiteral extends Scalar {
    
    @JSName("cstNode")
    var cstNode_BlockLiteral: js.UndefOr[typings.yaml.parseCstMod.CST.BlockLiteral] = js.native
    
    @JSName("type")
    var type_BlockLiteral: BLOCK_LITERAL = js.native
  }
  
  @js.native
  trait BlockMap extends YAMLMap {
    
    @JSName("cstNode")
    var cstNode_BlockMap: js.UndefOr[Map] = js.native
    
    @JSName("type")
    var type_BlockMap: MAP = js.native
  }
  
  @js.native
  trait BlockSeq extends YAMLSeq {
    
    @JSName("cstNode")
    var cstNode_BlockSeq: js.UndefOr[Seq] = js.native
    
    @JSName("items")
    var items_BlockSeq: js.Array[Node | Null] = js.native
    
    @JSName("type")
    var type_BlockSeq: SEQ = js.native
  }
  
  @js.native
  trait FlowMap extends YAMLMap {
    
    @JSName("cstNode")
    var cstNode_FlowMap: js.UndefOr[typings.yaml.parseCstMod.CST.FlowMap] = js.native
    
    @JSName("type")
    var type_FlowMap: FLOW_MAP = js.native
  }
  
  @js.native
  trait FlowSeq extends YAMLSeq {
    
    @JSName("cstNode")
    var cstNode_FlowSeq: js.UndefOr[typings.yaml.parseCstMod.CST.FlowSeq] = js.native
    
    @JSName("items")
    var items_FlowSeq: js.Array[Node] = js.native
    
    @JSName("type")
    var type_FlowSeq: FLOW_SEQ = js.native
  }
  
  @js.native
  trait NodeToJsonContext
    extends /* key */ StringDictionary[js.Any] {
    
    var anchors: js.UndefOr[js.Array[_]] = js.native
    
    var doc: Document = js.native
    
    var keep: js.UndefOr[Boolean] = js.native
    
    var mapAsMap: js.UndefOr[Boolean] = js.native
    
    var maxAliasCount: js.UndefOr[Double] = js.native
    
    var onCreate: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  }
  object NodeToJsonContext {
    
    @scala.inline
    def apply(doc: Document): NodeToJsonContext = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeToJsonContext]
    }
    
    @scala.inline
    implicit class NodeToJsonContextMutableBuilder[Self <: NodeToJsonContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchors(value: js.Array[_]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
      
      @scala.inline
      def setAnchorsVarargs(value: js.Any*): Self = StObject.set(x, "anchors", js.Array(value :_*))
      
      @scala.inline
      def setDoc(value: Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setMapAsMap(value: Boolean): Self = StObject.set(x, "mapAsMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapAsMapUndefined: Self = StObject.set(x, "mapAsMap", js.undefined)
      
      @scala.inline
      def setMaxAliasCount(value: Double): Self = StObject.set(x, "maxAliasCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAliasCountUndefined: Self = StObject.set(x, "maxAliasCount", js.undefined)
      
      @scala.inline
      def setOnCreate(value: /* node */ Node => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    }
  }
  
  @js.native
  trait PlainValue extends Scalar {
    
    @JSName("cstNode")
    var cstNode_PlainValue: js.UndefOr[typings.yaml.parseCstMod.CST.PlainValue] = js.native
    
    @JSName("type")
    var type_PlainValue: PLAIN = js.native
  }
  
  @js.native
  trait QuoteDouble extends Scalar {
    
    @JSName("cstNode")
    var cstNode_QuoteDouble: js.UndefOr[typings.yaml.parseCstMod.CST.QuoteDouble] = js.native
    
    @JSName("type")
    var type_QuoteDouble: QUOTE_DOUBLE = js.native
  }
  
  @js.native
  trait QuoteSingle extends Scalar {
    
    @JSName("cstNode")
    var cstNode_QuoteSingle: js.UndefOr[typings.yaml.parseCstMod.CST.QuoteSingle] = js.native
    
    @JSName("type")
    var type_QuoteSingle: QUOTE_SINGLE = js.native
  }
}
