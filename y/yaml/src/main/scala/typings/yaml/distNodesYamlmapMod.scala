package typings.yaml

import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.yaml.anon.Instantiable
import typings.yaml.anon.Key
import typings.yaml.distNodesCollectionMod.Collection
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesNodeMod.Range
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distParseCstMod.BlockMap
import typings.yaml.distParseCstMod.FlowCollection
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.yamlBooleans.`false`
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesYamlmapMod {
  
  @JSImport("yaml/dist/nodes/YAMLMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/YAMLMap", "YAMLMap")
  @js.native
  open class YAMLMap[K, V] () extends Collection {
    def this(schema: Schema) = this()
    
    def add(pair: Key[K, V]): Unit = js.native
    def add(pair: Key[K, V], overwrite: Boolean): Unit = js.native
    /**
      * Adds a value to the collection.
      *
      * @param overwrite - If not set `true`, using a key that is already in the
      *   collection will throw. Otherwise, overwrites the previous value.
      */
    def add(pair: Pair[K, V]): Unit = js.native
    def add(pair: Pair[K, V], overwrite: Boolean): Unit = js.native
    
    @JSName("get")
    def get_false(key: Any, keepScalar: `false`): js.UndefOr[V] = js.native
    @JSName("get")
    def get_true(key: Any, keepScalar: `true`): js.UndefOr[Scalar[V]] = js.native
    
    @JSName("items")
    var items_YAMLMap: js.Array[Pair[K, V]] = js.native
    
    def toJSON[T /* <: MapLike */](_underscore: Any): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Any, ctx: Unit, Type: Instantiable[T]): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Any, ctx: ToJSContext): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Any, ctx: ToJSContext, Type: Instantiable[T]): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Unit, ctx: Unit, Type: Instantiable[T]): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Unit, ctx: ToJSContext): Any = js.native
    def toJSON[T /* <: MapLike */](_underscore: Unit, ctx: ToJSContext, Type: Instantiable[T]): Any = js.native
  }
  object YAMLMap {
    
    @js.native
    trait Parsed[K /* <: ParsedNode */, V /* <: ParsedNode | Null */] extends YAMLMap[K, V] {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[BlockMap | FlowCollection] = js.native
    }
  }
  
  inline def findPair[K, V](items: js.Iterable[Pair[K, V]], key: Any): js.UndefOr[Pair[K, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPair")(items.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Pair[K, V]]]
  
  type MapLike = (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any])
}
