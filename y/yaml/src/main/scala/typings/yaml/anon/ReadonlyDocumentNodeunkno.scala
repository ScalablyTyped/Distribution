package typings.yaml.anon

import typings.yaml.distErrorsMod.YAMLError
import typings.yaml.distErrorsMod.YAMLWarning
import typings.yaml.distNodesNodeMod.NodeType
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distOptionsMod.CreateNodeOptions
import typings.yaml.distOptionsMod.DocumentOptions
import typings.yaml.distOptionsMod.ParseOptions
import typings.yaml.distOptionsMod.SchemaOptions
import typings.yaml.distOptionsMod.ToStringOptions
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import typings.yaml.yamlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/doc/Document.Document<yaml.yaml/dist/nodes/Node.Node<unknown>, boolean>> */
@js.native
trait ReadonlyDocumentNodeunkno extends StObject {
  
  def add(value: Any): Unit = js.native
  
  def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
  
  val comment: js.UndefOr[String | Null] = js.native
  
  val commentBefore: js.UndefOr[String | Null] = js.native
  
  val contents: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? yaml.yaml/dist/nodes/Node.Node<unknown> | null : yaml.yaml/dist/nodes/Node.Node<unknown> */ js.Any = js.native
  
  @JSName("createAlias")
  def createAlias_true(
    node: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? yaml.yaml/dist/nodes/Scalar.Scalar<unknown> | yaml.yaml/dist/nodes/YAMLMap.YAMLMap<unknown, unknown> | yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<unknown> : yaml.yaml/dist/nodes/Node.Node<unknown> */ js.Any
  ): typings.yaml.distNodesAliasMod.Alias = js.native
  @JSName("createAlias")
  def createAlias_true(
    node: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? yaml.yaml/dist/nodes/Scalar.Scalar<unknown> | yaml.yaml/dist/nodes/YAMLMap.YAMLMap<unknown, unknown> | yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<unknown> : yaml.yaml/dist/nodes/Node.Node<unknown> */ js.Any,
    name: String
  ): typings.yaml.distNodesAliasMod.Alias = js.native
  
  def createNode[T](value: T): NodeType[T] = js.native
  def createNode[T](value: T, options: CreateNodeOptions): NodeType[T] = js.native
  
  def createPair[K /* <: typings.yaml.distNodesNodeMod.Node[Any] */, V /* <: typings.yaml.distNodesNodeMod.Node[Any] */](key: Any, value: Any): Pair[K, V] = js.native
  def createPair[K /* <: typings.yaml.distNodesNodeMod.Node[Any] */, V /* <: typings.yaml.distNodesNodeMod.Node[Any] */](key: Any, value: Any, options: CreateNodeOptions): Pair[K, V] = js.native
  
  def delete(key: Any): Boolean = js.native
  
  def deleteIn(): Boolean = js.native
  def deleteIn(path: js.Iterable[Any]): Boolean = js.native
  
  val directives: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? yaml.yaml/dist/doc/directives.Directives | undefined : yaml.yaml/dist/doc/directives.Directives */ js.Any = js.native
  
  val errors: js.Array[YAMLError] = js.native
  
  def get(key: Any): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  def get(key: Any, keepScalar: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  
  def getIn(): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  def getIn(path: js.Iterable[Any]): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  def getIn(path: js.Iterable[Any], keepScalar: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  def getIn(path: Null, keepScalar: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: boolean extends true ? unknown : any */ js.Any = js.native
  
  def has(key: Any): Boolean = js.native
  
  def hasIn(): Boolean = js.native
  def hasIn(path: js.Iterable[Any]): Boolean = js.native
  
  val options: RequiredOmitParseOptionsD = js.native
  
  val range: js.UndefOr[typings.yaml.distNodesNodeMod.Range] = js.native
  
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
