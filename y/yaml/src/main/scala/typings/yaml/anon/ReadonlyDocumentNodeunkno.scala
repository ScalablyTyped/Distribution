package typings.yaml.anon

import typings.yaml.directivesMod.Directives
import typings.yaml.errorsMod.YAMLError
import typings.yaml.errorsMod.YAMLWarning
import typings.yaml.nodeMod.NodeType
import typings.yaml.optionsMod.CreateNodeOptions
import typings.yaml.optionsMod.DocumentOptions
import typings.yaml.optionsMod.ParseOptions
import typings.yaml.optionsMod.SchemaOptions
import typings.yaml.optionsMod.ToStringOptions
import typings.yaml.pairMod.Pair
import typings.yaml.scalarMod.Scalar
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import typings.yaml.yamlStrings.next
import typings.yaml.yamlmapMod.YAMLMap
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/doc/Document.Document<yaml.yaml/dist/nodes/Node.Node<unknown>>> */
@js.native
trait ReadonlyDocumentNodeunkno extends StObject {
  
  def add(value: Any): Unit = js.native
  
  def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
  
  val comment: js.UndefOr[String | Null] = js.native
  
  val commentBefore: js.UndefOr[String | Null] = js.native
  
  val contents: js.UndefOr[typings.yaml.nodeMod.Node[Any] | Null] = js.native
  
  def createAlias(node: Scalar[Any]): typings.yaml.aliasMod.Alias = js.native
  def createAlias(node: Scalar[Any], name: String): typings.yaml.aliasMod.Alias = js.native
  def createAlias(node: YAMLMap[Any, Any]): typings.yaml.aliasMod.Alias = js.native
  def createAlias(node: YAMLMap[Any, Any], name: String): typings.yaml.aliasMod.Alias = js.native
  def createAlias(node: YAMLSeq[Any]): typings.yaml.aliasMod.Alias = js.native
  def createAlias(node: YAMLSeq[Any], name: String): typings.yaml.aliasMod.Alias = js.native
  
  def createNode[T](value: T): NodeType[T] = js.native
  def createNode[T](value: T, options: CreateNodeOptions): NodeType[T] = js.native
  
  def createPair[K /* <: typings.yaml.nodeMod.Node[Any] */, V /* <: typings.yaml.nodeMod.Node[Any] */](key: Any, value: Any): Pair[K, V] = js.native
  def createPair[K /* <: typings.yaml.nodeMod.Node[Any] */, V /* <: typings.yaml.nodeMod.Node[Any] */](key: Any, value: Any, options: CreateNodeOptions): Pair[K, V] = js.native
  
  def delete(key: Any): Boolean = js.native
  
  def deleteIn(): Boolean = js.native
  def deleteIn(path: js.Iterable[Any]): Boolean = js.native
  
  val directives: js.UndefOr[Directives] = js.native
  
  val errors: js.Array[YAMLError] = js.native
  
  def get(key: Any): Any = js.native
  def get(key: Any, keepScalar: Boolean): Any = js.native
  
  def getIn(): Any = js.native
  def getIn(path: js.Iterable[Any]): Any = js.native
  def getIn(path: js.Iterable[Any], keepScalar: Boolean): Any = js.native
  def getIn(path: Null, keepScalar: Boolean): Any = js.native
  
  def has(key: Any): Boolean = js.native
  
  def hasIn(): Boolean = js.native
  def hasIn(path: js.Iterable[Any]): Boolean = js.native
  
  val options: RequiredOmitParseOptionsD = js.native
  
  val range: js.UndefOr[typings.yaml.nodeMod.Range] = js.native
  
  val schema: Schema = js.native
  
  def set(key: Any, value: Any): Unit = js.native
  
  def setIn(path: js.Iterable[Any], value: Any): Unit = js.native
  def setIn(path: Null, value: Any): Unit = js.native
  
  def setSchema(): Unit = js.native
  def setSchema(version: `1Dot1` | `1Dot2` | next): Unit = js.native
  def setSchema(version: `1Dot1` | `1Dot2` | next, options: SchemaOptions): Unit = js.native
  def setSchema(version: Null, options: SchemaOptions): Unit = js.native
  
  def toJS(): Any = js.native
  def toJS(opt: ToJSOptionsignoredstringu): Any = js.native
  
  def toJSON(): Any = js.native
  def toJSON(jsonArg: String): Any = js.native
  def toJSON(jsonArg: String, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  def toJSON(jsonArg: Null, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  def toJSON(jsonArg: Unit, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  
  def toString(options: ToStringOptions): String = js.native
  
  val warnings: js.Array[YAMLWarning] = js.native
}
