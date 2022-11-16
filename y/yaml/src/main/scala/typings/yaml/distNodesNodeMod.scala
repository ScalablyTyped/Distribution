package typings.yaml

import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distParseCstMod.Token
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesNodeMod {
  
  @JSImport("yaml/dist/nodes/Node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/Node", "ALIAS")
  @js.native
  val ALIAS: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/Node", "DOC")
  @js.native
  val DOC: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/Node", "MAP")
  @js.native
  val MAP: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/Node", "NODE_TYPE")
  @js.native
  val NODE_TYPE: js.Symbol = js.native
  
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
  
  @JSImport("yaml/dist/nodes/Node", "PAIR")
  @js.native
  val PAIR: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/Node", "SCALAR")
  @js.native
  val SCALAR: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/Node", "SEQ")
  @js.native
  val SEQ: js.Symbol = js.native
  
  inline def hasAnchor[K, V](node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnchor")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAlias(node: Any): /* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlias")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean]
  
  inline def isCollection[K, V](node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDocument[T /* <: Node[Any] */](node: Any): /* is yaml.yaml/dist/doc/Document.Document<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/doc/Document.Document<T> */ Boolean]
  
  inline def isMap[K, V](node: Any): /* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean]
  
  inline def isNode[T](node: Any): /* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean]
  
  inline def isPair[K, V](node: Any): /* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPair")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean]
  
  inline def isScalar[T](node: Any): /* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean]
  
  inline def isSeq[T](node: Any): /* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean]
  
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
    T extends string | number | bigint | boolean | null ? yaml.yaml/dist/nodes/Scalar.Scalar<T> : T extends std.Array<any> ? yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<yaml.yaml/dist/nodes/Node.NodeType<T[number]>> : T extends {[key: string] : any} ? yaml.yaml/dist/nodes/YAMLMap.YAMLMap<yaml.yaml/dist/nodes/Node.NodeType<keyof T>, yaml.yaml/dist/nodes/Node.NodeType<T[keyof T]>> : T extends {[key: number] : any} ? yaml.yaml/dist/nodes/YAMLMap.YAMLMap<yaml.yaml/dist/nodes/Node.NodeType<keyof T>, yaml.yaml/dist/nodes/Node.NodeType<T[keyof T]>> : yaml.yaml/dist/nodes/Node.Node<unknown>
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
