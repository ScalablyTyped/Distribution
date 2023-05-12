package typings.yjs

import typings.std.Set
import typings.yjs.anon.Diff
import typings.yjs.distSrcStructsAbstractStructMod.AbstractStruct
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUndoManagerMod.UndoManager
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsItemMod {
  
  @JSImport("yjs/dist/src/structs/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/Item", "AbstractContent")
  @js.native
  open class AbstractContent () extends StObject {
    
    /**
      * @return {AbstractContent}
      */
    def copy(): AbstractContent = js.native
    
    /**
      * @param {Transaction} _transaction
      */
    def delete(_transaction: Transaction): Unit = js.native
    
    /**
      * @param {StructStore} _store
      */
    def gc(_store: StructStore): Unit = js.native
    
    /**
      * @return {Array<any>}
      */
    def getContent(): js.Array[Any] = js.native
    
    /**
      * @return {number}
      */
    def getLength(): Double = js.native
    
    /**
      * @return {number}
      */
    def getRef(): Double = js.native
    
    /**
      * @param {Transaction} _transaction
      * @param {Item} _item
      */
    def integrate(_transaction: Transaction, _item: Item): Unit = js.native
    
    /**
      * Should return false if this Item is some kind of meta information
      * (e.g. format information).
      *
      * * Whether this Item should be addressable via `yarray.get(i)`
      * * Whether this Item should be counted when computing yarray.length
      *
      * @return {boolean}
      */
    def isCountable(): Boolean = js.native
    
    /**
      * @param {AbstractContent} _right
      * @return {boolean}
      */
    def mergeWith(_right: AbstractContent): Boolean = js.native
    
    /**
      * @param {number} _offset
      * @return {AbstractContent}
      */
    def splice(_offset: Double): AbstractContent = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} _encoder
      * @param {number} _offset
      */
    def write(_encoder: UpdateEncoderV1, _offset: Double): Unit = js.native
    def write(_encoder: UpdateEncoderV2, _offset: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/structs/Item", "Item")
  @js.native
  open class Item protected () extends AbstractStruct {
    /**
      * @param {ID} id
      * @param {Item | null} left
      * @param {ID | null} origin
      * @param {Item | null} right
      * @param {ID | null} rightOrigin
      * @param {AbstractType<any>|ID|null} parent Is a type if integrated, is null if it is possible to copy parent from left or right, is ID before integration to search for it.
      * @param {string | null} parentSub
      * @param {AbstractContent} content
      */
    def this(
      id: ID,
      left: Item | Null,
      origin: ID | Null,
      right: Item | Null,
      rightOrigin: ID | Null,
      parent: AbstractType[Any] | ID | Null,
      parentSub: String | Null,
      content: AbstractContent
    ) = this()
    
    /**
      * @type {AbstractContent}
      */
    var content: AbstractContent = js.native
    
    def countable: Boolean = js.native
    
    /**
      * Mark this Item as deleted.
      *
      * @param {Transaction} transaction
      */
    def delete(transaction: Transaction): Unit = js.native
    
    def deleted_=(arg: Boolean): Unit = js.native
    
    /**
      * @param {StructStore} store
      * @param {boolean} parentGCd
      */
    def gc(store: StructStore, parentGCd: Boolean): Unit = js.native
    
    /**
      * Return the creator clientID of the missing op or define missing items and return null.
      *
      * @param {Transaction} transaction
      * @param {StructStore} store
      * @return {null | number}
      */
    def getMissing(transaction: Transaction, store: StructStore): Null | Double = js.native
    
    /**
      * bit1: keep
      * bit2: countable
      * bit3: deleted
      * bit4: mark - mark node as fast-search-marker
      * @type {number} byte
      */
    var info: Double = js.native
    
    /**
      * If true, do not garbage collect this Item.
      */
    def keep: Boolean = js.native
    def keep_=(arg: Boolean): Unit = js.native
    
    /**
      * Computes the last content address of this Item.
      */
    def lastId: ID = js.native
    
    /**
      * The item that is currently to the left of this item.
      * @type {Item | null}
      */
    var left: Item | Null = js.native
    
    def markDeleted(): Unit = js.native
    
    def marker: Boolean = js.native
    /**
      * This is used to mark the item as an indexed fast-search marker
      *
      * @type {boolean}
      */
    def marker_=(arg: Boolean): Unit = js.native
    
    /**
      * Try to merge two items
      *
      * @param {Item} right
      * @return {boolean}
      */
    def mergeWith(right: Item): Boolean = js.native
    
    /**
      * Returns the next non-deleted item
      */
    def next: Item | Null = js.native
    
    /**
      * The item that was originally to the left of this item.
      * @type {ID | null}
      */
    var origin: ID | Null = js.native
    
    /**
      * @type {AbstractType<any>|ID|null}
      */
    var parent: AbstractType[Any] | ID | Null = js.native
    
    /**
      * If the parent refers to this item with some kind of key (e.g. YMap, the
      * key is specified here. The key is then used to refer to the list in which
      * to insert this item. If `parentSub = null` type._start is the list in
      * which to insert to. Otherwise it is `parent._map`.
      * @type {String | null}
      */
    var parentSub: String | Null = js.native
    
    /**
      * Returns the previous non-deleted item
      */
    def prev: Item | Null = js.native
    
    /**
      * If this type's effect is redone this type refers to the type that undid
      * this operation.
      * @type {ID | null}
      */
    var redone: ID | Null = js.native
    
    /**
      * The item that is currently to the right of this item.
      * @type {Item | null}
      */
    var right: Item | Null = js.native
    
    /**
      * The item that was originally to the right of this item.
      * @type {ID | null}
      */
    var rightOrigin: ID | Null = js.native
    
    /**
      * Transform the properties of this type to binary and write it to an
      * BinaryEncoder.
      *
      * This is called when this Item is sent to a remote peer.
      *
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder The encoder to write data to.
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/structs/Item", "contentRefs")
  @js.native
  val contentRefs: js.Array[js.Function1[/* arg0 */ UpdateDecoderV1 | UpdateDecoderV2, AbstractContent]] = js.native
  
  inline def followRedone(store: StructStore, id: ID): Diff = (^.asInstanceOf[js.Dynamic].applyDynamic("followRedone")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Diff]
  
  inline def keepItem(item: Null, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def keepItem(item: Item, keep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keepItem")(item.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readItemContent(decoder: UpdateDecoderV1, info: Double): AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AbstractContent]
  inline def readItemContent(decoder: UpdateDecoderV2, info: Double): AbstractContent = (^.asInstanceOf[js.Dynamic].applyDynamic("readItemContent")(decoder.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AbstractContent]
  
  inline def redoItem(
    transaction: Transaction,
    item: Item,
    redoitems: Set[Item],
    itemsToDelete: DeleteSet,
    ignoreRemoteMapChanges: Boolean,
    um: UndoManager
  ): Item | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("redoItem")(transaction.asInstanceOf[js.Any], item.asInstanceOf[js.Any], redoitems.asInstanceOf[js.Any], itemsToDelete.asInstanceOf[js.Any], ignoreRemoteMapChanges.asInstanceOf[js.Any], um.asInstanceOf[js.Any])).asInstanceOf[Item | Null]
  
  inline def splitItem(transaction: Transaction, leftItem: Item, diff: Double): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("splitItem")(transaction.asInstanceOf[js.Any], leftItem.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[Item]
}
