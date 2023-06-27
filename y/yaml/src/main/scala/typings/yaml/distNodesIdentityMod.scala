package typings.yaml

import typings.yaml.distNodesNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesIdentityMod {
  
  @JSImport("yaml/dist/nodes/identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/identity", "ALIAS")
  @js.native
  val ALIAS: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "DOC")
  @js.native
  val DOC: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "MAP")
  @js.native
  val MAP: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "NODE_TYPE")
  @js.native
  val NODE_TYPE: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "PAIR")
  @js.native
  val PAIR: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "SCALAR")
  @js.native
  val SCALAR: js.Symbol = js.native
  
  @JSImport("yaml/dist/nodes/identity", "SEQ")
  @js.native
  val SEQ: js.Symbol = js.native
  
  inline def hasAnchor[K, V](node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnchor")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAlias(node: Any): /* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlias")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean]
  
  inline def isCollection[K, V](node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDocument[T /* <: Node[Any] */](node: Any): /* is yaml.yaml/dist/doc/Document.Document<T, true> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/doc/Document.Document<T, true> */ Boolean]
  
  inline def isMap[K, V](node: Any): /* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean]
  
  inline def isNode[T](node: Any): /* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean]
  
  inline def isPair[K, V](node: Any): /* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPair")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean]
  
  inline def isScalar[T](node: Any): /* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean]
  
  inline def isSeq[T](node: Any): /* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean]
}
