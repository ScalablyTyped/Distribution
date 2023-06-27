package typings.yaml

import typings.yaml.distDocDocumentMod.Document
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distOptionsMod.ToJSOptions
import typings.yaml.distParseCstMod.Token
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesNodeMod {
  
  /* note: abstract class */ @JSImport("yaml/dist/nodes/Node", "NodeBase")
  @js.native
  open class NodeBase protected () extends StObject {
    def this(`type`: js.Symbol) = this()
    
    /** A comment on or immediately after this */
    var comment: js.UndefOr[String | Null] = js.native
    
    /** A comment before this */
    var commentBefore: js.UndefOr[String | Null] = js.native
    
    /**
      * The `[start, value-end, node-end]` character offsets for the part of the
      * source parsed into this node (undefined if not parsed). The `value-end`
      * and `node-end` positions are themselves not included in their respective
      * ranges.
      */
    var range: js.UndefOr[Range | Null] = js.native
    
    /** A blank line before this node and its commentBefore */
    var spaceBefore: js.UndefOr[Boolean] = js.native
    
    /** The CST token that was composed into this node.  */
    var srcToken: js.UndefOr[Token] = js.native
    
    /** A fully qualified tag, if required */
    var tag: js.UndefOr[String] = js.native
    
    /** A plain JavaScript representation of this node. */
    def toJS(doc: Document[Node[Any], Boolean]): Any = js.native
    def toJS(doc: Document[Node[Any], Boolean], param1: ToJSOptions): Any = js.native
    
    /** A plain JS representation of this node */
    def toJSON(): Any = js.native
    
    def toString(ctx: Unit, onComment: js.Function0[Unit]): String = js.native
    def toString(ctx: Unit, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: Unit, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext): String = js.native
    def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.distNodesAliasMod.Alias
    - typings.yaml.distNodesScalarMod.Scalar[T]
    - typings.yaml.distNodesYamlmapMod.YAMLMap[scala.Any, T]
    - typings.yaml.distNodesYamlseqMod.YAMLSeq[T]
  */
  type Node[T] = _Node[T] | (YAMLMap[Any, T])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends string | number | bigint | boolean | null | undefined ? yaml.yaml/dist/nodes/Scalar.Scalar<T> : T extends std.Date ? yaml.yaml/dist/nodes/Scalar.Scalar<string | std.Date> : T extends std.Array<any> ? yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<yaml.yaml/dist/nodes/Node.NodeType<T[number]>> : T extends {[key: string] : any} ? yaml.yaml/dist/nodes/YAMLMap.YAMLMap<yaml.yaml/dist/nodes/Node.NodeType<keyof T>, yaml.yaml/dist/nodes/Node.NodeType<T[keyof T]>> : T extends {[key: number] : any} ? yaml.yaml/dist/nodes/YAMLMap.YAMLMap<yaml.yaml/dist/nodes/Node.NodeType<keyof T>, yaml.yaml/dist/nodes/Node.NodeType<T[keyof T]>> : yaml.yaml/dist/nodes/Node.Node<unknown>
    }}}
    */
  type NodeType[T] = Scalar[T]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ParsedNode = yaml.yaml/dist/nodes/Alias.Alias.Parsed | yaml.yaml/dist/nodes/Scalar.Scalar.Parsed | yaml.yaml/dist/nodes/YAMLMap.YAMLMap.Parsed<yaml.yaml/dist/nodes/Node.ParsedNode, yaml.yaml/dist/nodes/Node.ParsedNode | null> | yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq.Parsed<yaml.yaml/dist/nodes/Node.ParsedNode>
  }}}
  to avoid circular code involving: 
  - yaml.yaml/dist/nodes/Node.ParsedNode
  */
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.distNodesAliasMod.Alias.Parsed
    - typings.yaml.distNodesScalarMod.Scalar.Parsed
    - typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed[scala.Any, scala.Any | scala.Null]
    - typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[scala.Any]
  */
  type ParsedNode = _ParsedNode | (Parsed[Any, Any | Null]) | typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[Any]
  
  type Range = js.Tuple3[Double, Double, Double]
  
  trait _Node[T] extends StObject
  
  trait _ParsedNode extends StObject
}
