package typings.yaml

import typings.yaml.nodeMod.Node
import typings.yaml.nodeMod.NodeBase
import typings.yaml.schemaSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("yaml/dist/nodes/Collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/Collection", "Collection")
  @js.native
  abstract class Collection protected () extends NodeBase {
    def this(`type`: js.Symbol) = this()
    def this(`type`: js.Symbol, schema: Schema) = this()
    
    /** Adds a value to the collection. */
    def add(value: Any): Unit = js.native
    
    /**
      * Adds a value to the collection. For `!!map` and `!!omap` the value must
      * be a Pair instance or a `{ key, value }` object, which may not have a key
      * that already exists in the map.
      */
    def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
    
    /** An optional anchor on this node. Used by alias nodes. */
    var anchor: js.UndefOr[String] = js.native
    
    def clone(schema: Schema): Collection = js.native
    
    /**
      * Removes a value from the collection.
      * @returns `true` if the item was found and removed.
      */
    def delete(key: Any): Boolean = js.native
    
    /**
      * Removes a value from the collection.
      * @returns `true` if the item was found and removed.
      */
    def deleteIn(path: js.Iterable[Any]): Boolean = js.native
    
    /**
      * If true, stringify this and all child nodes using flow rather than
      * block styles.
      */
    var flow: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns item at `key`, or `undefined` if not found. By default unwraps
      * scalar values from their surrounding node; to disable set `keepScalar` to
      * `true` (collections are always returned intact).
      */
    def get(key: Any): Any = js.native
    def get(key: Any, keepScalar: Boolean): Any = js.native
    
    /**
      * Returns item at `key`, or `undefined` if not found. By default unwraps
      * scalar values from their surrounding node; to disable set `keepScalar` to
      * `true` (collections are always returned intact).
      */
    def getIn(path: js.Iterable[Any]): Any = js.native
    def getIn(path: js.Iterable[Any], keepScalar: Boolean): Any = js.native
    
    /**
      * Checks if the collection includes a value with the key `key`.
      */
    def has(key: Any): Boolean = js.native
    
    def hasAllNullValues(): Boolean = js.native
    def hasAllNullValues(allowScalar: Boolean): Boolean = js.native
    
    /**
      * Checks if the collection includes a value with the key `key`.
      */
    def hasIn(path: js.Iterable[Any]): Boolean = js.native
    
    var items: js.Array[Any] = js.native
    
    var schema: js.UndefOr[Schema] = js.native
    
    /**
      * Sets a value in this collection. For `!!set`, `value` needs to be a
      * boolean to add/remove the item from the set.
      */
    def set(key: Any, value: Any): Unit = js.native
    
    /**
      * Sets a value in this collection. For `!!set`, `value` needs to be a
      * boolean to add/remove the item from the set.
      */
    def setIn(path: js.Iterable[Any], value: Any): Unit = js.native
  }
  /* static members */
  object Collection {
    
    @JSImport("yaml/dist/nodes/Collection", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/nodes/Collection", "Collection.maxFlowStringSingleLineLength")
    @js.native
    def maxFlowStringSingleLineLength: Double = js.native
    inline def maxFlowStringSingleLineLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFlowStringSingleLineLength")(x.asInstanceOf[js.Any])
  }
  
  inline def collectionFromPath(schema: Schema, path: js.Array[Any], value: Any): Node[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionFromPath")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Node[Any]]
  
  inline def isEmptyPath(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyPath")().asInstanceOf[Boolean]
  inline def isEmptyPath(path: js.Iterable[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
