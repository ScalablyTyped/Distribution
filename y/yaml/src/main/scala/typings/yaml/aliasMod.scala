package typings.yaml

import typings.yaml.anon.FlowScalartypealias
import typings.yaml.documentMod.Document
import typings.yaml.nodeMod.Node
import typings.yaml.nodeMod.NodeBase
import typings.yaml.nodeMod.Range
import typings.yaml.nodeMod._Node
import typings.yaml.nodeMod._ParsedNode
import typings.yaml.scalarMod.Scalar
import typings.yaml.toJSMod.ToJSContext
import typings.yaml.yamlmapMod.YAMLMap
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasMod {
  
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
    
    def toJSON(_arg: Any): Any = js.native
    def toJSON(_arg: Any, ctx: ToJSContext): Any = js.native
    def toJSON(_arg: Unit, ctx: ToJSContext): Any = js.native
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
