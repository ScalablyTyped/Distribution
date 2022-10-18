package typings.yjs

import typings.std.Map
import typings.std.Set
import typings.yjs.distSrcStructsAbstractStructMod.AbstractStruct
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import typings.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsTransactionMod {
  
  @JSImport("yjs/dist/src/utils/Transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/Transaction", "Transaction")
  @js.native
  open class Transaction protected () extends StObject {
    /**
      * @param {Doc} doc
      * @param {any} origin
      * @param {boolean} local
      */
    def this(doc: Doc, origin: Any, local: Boolean) = this()
    
    /**
      * @type {Array<AbstractStruct>}
      */
    var _mergeStructs: js.Array[AbstractStruct] = js.native
    
    /**
      * Holds the state after the transaction.
      * @type {Map<Number,Number>}
      */
    var afterState: Map[Double, Double] = js.native
    
    /**
      * Holds the state before the transaction started.
      * @type {Map<Number,Number>}
      */
    var beforeState: Map[Double, Double] = js.native
    
    /**
      * All types that were directly modified (property added or child
      * inserted/deleted). New types are not included in this Set.
      * Maps from type to parentSubs (`item.parentSub = null` for YArray)
      * @type {Map<AbstractType<YEvent<any>>,Set<String|null>>}
      */
    var changed: Map[AbstractType[YEvent[Any]], Set[String | Null]] = js.native
    
    /**
      * Stores the events for the types that observe also child elements.
      * It is mainly used by `observeDeep`.
      * @type {Map<AbstractType<YEvent<any>>,Array<YEvent<any>>>}
      */
    var changedParentTypes: Map[AbstractType[YEvent[Any]], js.Array[YEvent[Any]]] = js.native
    
    /**
      * Describes the set of deleted items by ids
      * @type {DeleteSet}
      */
    var deleteSet: DeleteSet = js.native
    
    /**
      * The Yjs instance.
      * @type {Doc}
      */
    var doc: Doc = js.native
    
    /**
      * Whether this change originates from this doc.
      * @type {boolean}
      */
    var local: Boolean = js.native
    
    /**
      * Stores meta information on the transaction
      * @type {Map<any,any>}
      */
    var meta: Map[Any, Any] = js.native
    
    /**
      * @type {any}
      */
    var origin: Any = js.native
    
    /**
      * @type {Set<Doc>}
      */
    var subdocsAdded: Set[Doc] = js.native
    
    /**
      * @type {Set<Doc>}
      */
    var subdocsLoaded: Set[Doc] = js.native
    
    /**
      * @type {Set<Doc>}
      */
    var subdocsRemoved: Set[Doc] = js.native
  }
  
  inline def addChangedTypeToTransaction(transaction: Transaction, `type`: AbstractType[YEvent[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addChangedTypeToTransaction(transaction: Transaction, `type`: AbstractType[YEvent[Any]], parentSub: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangedTypeToTransaction")(transaction.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], parentSub.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nextID(transaction: Transaction): ID = ^.asInstanceOf[js.Dynamic].applyDynamic("nextID")(transaction.asInstanceOf[js.Any]).asInstanceOf[ID]
  
  inline def transact(doc: Doc, f: js.Function1[/* arg0 */ Transaction, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(doc: Doc, f: js.Function1[/* arg0 */ Transaction, Unit], origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(doc: Doc, f: js.Function1[/* arg0 */ Transaction, Unit], origin: Any, local: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transact(doc: Doc, f: js.Function1[/* arg0 */ Transaction, Unit], origin: Unit, local: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transact")(doc.asInstanceOf[js.Any], f.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tryGc(ds: DeleteSet, store: StructStore, gcFilter: js.Function1[/* arg0 */ Item, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGc")(ds.asInstanceOf[js.Any], store.asInstanceOf[js.Any], gcFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUpdateMessageFromTransaction(encoder: UpdateEncoderV1, transaction: Transaction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeUpdateMessageFromTransaction(encoder: UpdateEncoderV2, transaction: Transaction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateMessageFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
