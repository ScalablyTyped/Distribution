package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Set
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsEventHandlerMod.EventHandler
import typings.yjs.distSrcUtilsSnapshotMod.Snapshot_
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import typings.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesAbstractTypeMod {
  
  @JSImport("yjs/dist/src/types/AbstractType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/AbstractType", "AbstractType")
  @js.native
  open class AbstractType[EventType] () extends StObject {
    
    /**
      * Creates YEvent and calls all type observers.
      * Must be implemented by each type.
      *
      * @param {Transaction} transaction
      * @param {Set<null|string>} parentSubs Keys changed on this type. `null` if list was modified.
      */
    def _callObserver(transaction: Transaction, parentSubs: Set[Null | String]): Unit = js.native
    
    /**
      * @return {AbstractType<EventType>}
      */
    def _copy(): AbstractType[EventType] = js.native
    
    /**
      * Deep event handlers
      * @type {EventHandler<Array<YEvent<any>>,Transaction>}
      */
    var _dEH: EventHandler[js.Array[YEvent[Any]], Transaction] = js.native
    
    /**
      * Event handlers
      * @type {EventHandler<EventType,Transaction>}
      */
    var _eH: EventHandler[EventType, Transaction] = js.native
    
    /**
      * The first non-deleted item
      */
    def _first: Item | Null = js.native
    
    /**
      * Integrate this type into the Yjs instance.
      *
      * * Save this struct in the os
      * * This type is sent to other client
      * * Observer functions are fired
      *
      * @param {Doc} y The Yjs instance
      * @param {Item|null} item
      */
    def _integrate(y: Doc): Unit = js.native
    def _integrate(y: Doc, item: Item): Unit = js.native
    
    /**
      * @type {Item|null}
      */
    var _item: Item | Null = js.native
    
    var _length: Double = js.native
    
    /**
      * @type {Map<string,Item>}
      */
    var _map: Map[String, Item] = js.native
    
    /**
      * @type {null | Array<ArraySearchMarker>}
      */
    var _searchMarker: Null | js.Array[ArraySearchMarker] = js.native
    
    /**
      * @type {Item|null}
      */
    var _start: Item | Null = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      */
    def _write(encoder: UpdateEncoderV1): Unit = js.native
    def _write(encoder: UpdateEncoderV2): Unit = js.native
    
    /**
      * @type {Doc|null}
      */
    var doc: Doc | Null = js.native
    
    /**
      * Observe all events that are created on this type.
      *
      * @param {function(EventType, Transaction):void} f Observer function
      */
    def observe(f: js.Function2[/* arg0 */ EventType, /* arg1 */ Transaction, Unit]): Unit = js.native
    
    /**
      * Observe all events that are created by this type and its children.
      *
      * @param {function(Array<YEvent<any>>,Transaction):void} f Observer function
      */
    def observeDeep(f: js.Function2[/* arg0 */ js.Array[YEvent[Any]], /* arg1 */ Transaction, Unit]): Unit = js.native
    
    /**
      * @return {AbstractType<any>|null}
      */
    def parent: AbstractType[Any] | Null = js.native
    
    /**
      * @abstract
      * @return {any}
      */
    def toJSON(): Any = js.native
    
    /**
      * Unregister an observer function.
      *
      * @param {function(EventType,Transaction):void} f Observer function
      */
    def unobserve(f: js.Function2[/* arg0 */ EventType, /* arg1 */ Transaction, Unit]): Unit = js.native
    
    /**
      * Unregister an observer function.
      *
      * @param {function(Array<YEvent<any>>,Transaction):void} f Observer function
      */
    def unobserveDeep(f: js.Function2[/* arg0 */ js.Array[YEvent[Any]], /* arg1 */ Transaction, Unit]): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/types/AbstractType", "ArraySearchMarker")
  @js.native
  open class ArraySearchMarker protected () extends StObject {
    /**
      * @param {Item} p
      * @param {number} index
      */
    def this(p: Item, index: Double) = this()
    
    var index: Double = js.native
    
    var p: Item = js.native
    
    var timestamp: Double = js.native
  }
  
  inline def callTypeObservers[EventType](`type`: AbstractType[EventType], transaction: Transaction, event: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callTypeObservers")(`type`.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createMapIterator(map: Map[String, Item]): IterableIterator[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapIterator")(map.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Array[Any]]]
  
  inline def findMarker(yarray: AbstractType[Any], index: Double): ArraySearchMarker | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findMarker")(yarray.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ArraySearchMarker | Null]
  
  inline def getTypeChildren(t: AbstractType[Any]): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeChildren")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]
  
  inline def typeListCreateIterator(`type`: AbstractType[Any]): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListCreateIterator")(`type`.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Any]]
  
  inline def typeListDelete(transaction: Transaction, parent: AbstractType[Any], index: Double, length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListForEach(
    `type`: AbstractType[Any],
    f: js.Function3[/* arg0 */ Any, /* arg1 */ Double, /* arg2 */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEach")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListForEachSnapshot(
    `type`: AbstractType[Any],
    f: js.Function3[/* arg0 */ Any, /* arg1 */ Double, /* arg2 */ AbstractType[Any], Unit],
    snapshot: Snapshot_
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListForEachSnapshot")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListGet(`type`: AbstractType[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListGet")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def typeListInsertGenerics(
    transaction: Transaction,
    parent: AbstractType[Any],
    index: Double,
    content: js.Array[
      StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListInsertGenericsAfter(
    transaction: Transaction,
    parent: AbstractType[Any],
    referenceItem: Null,
    content: js.Array[
      StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeListInsertGenericsAfter(
    transaction: Transaction,
    parent: AbstractType[Any],
    referenceItem: Item,
    content: js.Array[
      StringDictionary[Any] | js.Array[Any] | Boolean | Double | Null | String | js.typedarray.Uint8Array
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListInsertGenericsAfter")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], referenceItem.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListMap[C, R](
    `type`: AbstractType[Any],
    f: js.Function3[/* arg0 */ C, /* arg1 */ Double, /* arg2 */ AbstractType[Any], R]
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListMap")(`type`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  inline def typeListPushGenerics(
    transaction: Transaction,
    parent: AbstractType[Any],
    content: js.Array[
      StringDictionary[Any] | js.Array[Any] | Double | Null | String | js.typedarray.Uint8Array
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListPushGenerics")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeListSlice(`type`: AbstractType[Any], start: Double, end: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListSlice")(`type`.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def typeListToArray(`type`: AbstractType[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArray")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def typeListToArraySnapshot(`type`: AbstractType[Any], snapshot: Snapshot_): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeListToArraySnapshot")(`type`.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def typeMapDelete(transaction: Transaction, parent: AbstractType[Any], key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapDelete")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def typeMapGet(parent: AbstractType[Any], key: String): js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGet")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
  ]]
  
  inline def typeMapGetAll(parent: AbstractType[Any]): StringDictionary[
    js.UndefOr[
      StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetAll")(parent.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[
    js.UndefOr[
      StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
    ]
  ]]
  
  inline def typeMapGetSnapshot(parent: AbstractType[Any], key: String, snapshot: Snapshot_): js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapGetSnapshot")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    StringDictionary[Any] | Double | Null | js.Array[Any] | String | js.typedarray.Uint8Array | AbstractType[Any]
  ]]
  
  inline def typeMapHas(parent: AbstractType[Any], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapHas")(parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def typeMapSet(transaction: Transaction, parent: AbstractType[Any], key: String, value: AbstractType[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeMapSet")(transaction.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateMarkerChanges(searchMarker: js.Array[ArraySearchMarker], index: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMarkerChanges")(searchMarker.asInstanceOf[js.Any], index.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
