package typings.yaml

import typings.yaml.anon.FlowScalartypealias
import typings.yaml.distDocDocumentMod.Document
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distNodesNodeMod.NodeBase
import typings.yaml.distNodesNodeMod.Range
import typings.yaml.distNodesNodeMod._Node
import typings.yaml.distNodesNodeMod._ParsedNode
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distNodesYamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesAliasMod {
  
  @JSImport("yaml/dist/nodes/Alias", "Alias")
  @js.native
  open class Alias protected ()
    extends NodeBase
       with _Node[Any] {
    def this(source: String) = this()
    
    var anchor: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Resolve the value of this alias within `doc`, finding the last
      * instance of the `source` anchor before this node.
      */
    def resolve(doc: Document[Node[Any]]): js.UndefOr[Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]] = js.native
    
    var source: String = js.native
    
    def toJSON(_arg: Any): js.Object | Null = js.native
    def toJSON(_arg: Any, ctx: ToJSContext): js.Object | Null = js.native
    def toJSON(_arg: Unit, ctx: ToJSContext): js.Object | Null = js.native
  }
  object Alias {
    
    @js.native
    trait Parsed
      extends Alias
         with _ParsedNode {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[FlowScalartypealias] = js.native
    }
  }
}
