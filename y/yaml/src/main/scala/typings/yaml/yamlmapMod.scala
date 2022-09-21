package typings.yaml

import typings.yaml.anon.Instantiable
import typings.yaml.anon.Key
import typings.yaml.collectionMod.Collection
import typings.yaml.cstMod.BlockMap
import typings.yaml.cstMod.FlowCollection
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.nodeMod.Range
import typings.yaml.pairMod.Pair
import typings.yaml.scalarMod.Scalar
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.toJSMod.ToJSContext
import typings.yaml.yamlBooleans.`false`
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlmapMod {
  
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
    
    def toJSON[T](_underscore: Any): Any = js.native
    def toJSON[T](_underscore: Any, ctx: Unit, Type: Instantiable[T]): Any = js.native
    def toJSON[T](_underscore: Any, ctx: ToJSContext): Any = js.native
    def toJSON[T](_underscore: Any, ctx: ToJSContext, Type: Instantiable[T]): Any = js.native
    def toJSON[T](_underscore: Unit, ctx: Unit, Type: Instantiable[T]): Any = js.native
    def toJSON[T](_underscore: Unit, ctx: ToJSContext): Any = js.native
    def toJSON[T](_underscore: Unit, ctx: ToJSContext, Type: Instantiable[T]): Any = js.native
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
}
