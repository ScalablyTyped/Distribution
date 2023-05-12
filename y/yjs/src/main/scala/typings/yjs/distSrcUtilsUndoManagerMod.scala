package typings.yjs

import typings.lib0.observableMod.Observable
import typings.std.Map
import typings.std.Set
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.yjsStrings.`stack-cleared`
import typings.yjs.yjsStrings.`stack-item-added`
import typings.yjs.yjsStrings.`stack-item-popped`
import typings.yjs.yjsStrings.`stack-item-updated`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUndoManagerMod {
  
  @JSImport("yjs/dist/src/utils/UndoManager", "StackItem")
  @js.native
  open class StackItem protected () extends StObject {
    /**
      * @param {DeleteSet} deletions
      * @param {DeleteSet} insertions
      */
    def this(deletions: DeleteSet, insertions: DeleteSet) = this()
    
    var deletions: DeleteSet = js.native
    
    var insertions: DeleteSet = js.native
    
    /**
      * Use this to save and restore metadata like selection range
      */
    var meta: Map[Any, Any] = js.native
  }
  
  @JSImport("yjs/dist/src/utils/UndoManager", "UndoManager")
  @js.native
  open class UndoManager protected () extends Observable[
          `stack-item-added` | `stack-item-popped` | `stack-cleared` | `stack-item-updated`
        ] {
    def this(typeScope: js.Array[AbstractType[Any]]) = this()
    /**
      * @param {AbstractType<any>|Array<AbstractType<any>>} typeScope Accepts either a single type, or an array of types
      * @param {UndoManagerOptions} options
      */
    def this(typeScope: AbstractType[Any]) = this()
    def this(typeScope: js.Array[AbstractType[Any]], param1: UndoManagerOptions) = this()
    def this(typeScope: AbstractType[Any], param1: UndoManagerOptions) = this()
    
    /**
      * @param {Array<AbstractType<any>> | AbstractType<any>} ytypes
      */
    def addToScope(ytypes: js.Array[AbstractType[Any]]): Unit = js.native
    def addToScope(ytypes: AbstractType[Any]): Unit = js.native
    
    /**
      * @param {any} origin
      */
    def addTrackedOrigin(origin: Any): Unit = js.native
    
    /**
      * @param {Transaction} transaction
      */
    def afterTransactionHandler(transaction: Transaction): Unit = js.native
    
    /**
      * Are redo steps available?
      *
      * @return {boolean} `true` if redo is possible
      */
    def canRedo(): Boolean = js.native
    
    /**
      * Are undo steps available?
      *
      * @return {boolean} `true` if undo is possible
      */
    def canUndo(): Boolean = js.native
    
    var captureTimeout: Double = js.native
    
    def captureTransaction(arg0: Transaction): Boolean = js.native
    
    def clear(): Unit = js.native
    def clear(clearUndoStack: Boolean): Unit = js.native
    def clear(clearUndoStack: Boolean, clearRedoStack: Boolean): Unit = js.native
    def clear(clearUndoStack: Unit, clearRedoStack: Boolean): Unit = js.native
    
    def deleteFilter(arg0: Item): Boolean = js.native
    
    var doc: Doc = js.native
    
    var ignoreRemoteMapChanges: Boolean = js.native
    
    var lastChange: Double = js.native
    
    /**
      * Redo last undo operation.
      *
      * @return {StackItem?} Returns StackItem if a change was applied
      */
    def redo(): StackItem | Null = js.native
    
    /**
      * @type {Array<StackItem>}
      */
    var redoStack: js.Array[StackItem] = js.native
    
    var redoing: Boolean = js.native
    
    /**
      * @param {any} origin
      */
    def removeTrackedOrigin(origin: Any): Unit = js.native
    
    /**
      * @type {Array<AbstractType<any>>}
      */
    var scope: js.Array[AbstractType[Any]] = js.native
    
    /**
      * UndoManager merges Undo-StackItem if they are created within time-gap
      * smaller than `options.captureTimeout`. Call `um.stopCapturing()` so that the next
      * StackItem won't be merged.
      *
      *
      * @example
      *     // without stopCapturing
      *     ytext.insert(0, 'a')
      *     ytext.insert(1, 'b')
      *     um.undo()
      *     ytext.toString() // => '' (note that 'ab' was removed)
      *     // with stopCapturing
      *     ytext.insert(0, 'a')
      *     um.stopCapturing()
      *     ytext.insert(0, 'b')
      *     um.undo()
      *     ytext.toString() // => 'a' (note that only 'b' was removed)
      *
      */
    def stopCapturing(): Unit = js.native
    
    var trackedOrigins: Set[Any] = js.native
    
    /**
      * Undo last changes on type.
      *
      * @return {StackItem?} Returns StackItem if a change was applied
      */
    def undo(): StackItem | Null = js.native
    
    /**
      * @type {Array<StackItem>}
      */
    var undoStack: js.Array[StackItem] = js.native
    
    /**
      * Whether the client is currently undoing (calling UndoManager.undo)
      *
      * @type {boolean}
      */
    var undoing: Boolean = js.native
  }
  
  trait UndoManagerOptions extends StObject {
    
    var captureTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not capture changes of a Transaction if result false.
      */
    var captureTransaction: js.UndefOr[js.Function1[/* arg0 */ Transaction, Boolean]] = js.undefined
    
    /**
      * Sometimes
      * it is necessary to filter what an Undo/Redo operation can delete. If this
      * filter returns false, the type/item won't be deleted even it is in the
      * undo/redo scope.
      */
    var deleteFilter: js.UndefOr[js.Function1[/* arg0 */ Item, Boolean]] = js.undefined
    
    /**
      * The document that this UndoManager operates on. Only needed if typeScope is empty.
      */
    var doc: js.UndefOr[Doc] = js.undefined
    
    /**
      * Experimental. By default, the UndoManager will never overwrite remote changes. Enable this property to enable overwriting remote changes on key-value changes (Y.Map, properties on Y.Xml, etc..).
      */
    var ignoreRemoteMapChanges: js.UndefOr[Boolean] = js.undefined
    
    var trackedOrigins: js.UndefOr[Set[Any]] = js.undefined
  }
  object UndoManagerOptions {
    
    inline def apply(): UndoManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndoManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UndoManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setCaptureTimeout(value: Double): Self = StObject.set(x, "captureTimeout", value.asInstanceOf[js.Any])
      
      inline def setCaptureTimeoutUndefined: Self = StObject.set(x, "captureTimeout", js.undefined)
      
      inline def setCaptureTransaction(value: /* arg0 */ Transaction => Boolean): Self = StObject.set(x, "captureTransaction", js.Any.fromFunction1(value))
      
      inline def setCaptureTransactionUndefined: Self = StObject.set(x, "captureTransaction", js.undefined)
      
      inline def setDeleteFilter(value: /* arg0 */ Item => Boolean): Self = StObject.set(x, "deleteFilter", js.Any.fromFunction1(value))
      
      inline def setDeleteFilterUndefined: Self = StObject.set(x, "deleteFilter", js.undefined)
      
      inline def setDoc(value: Doc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setIgnoreRemoteMapChanges(value: Boolean): Self = StObject.set(x, "ignoreRemoteMapChanges", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRemoteMapChangesUndefined: Self = StObject.set(x, "ignoreRemoteMapChanges", js.undefined)
      
      inline def setTrackedOrigins(value: Set[Any]): Self = StObject.set(x, "trackedOrigins", value.asInstanceOf[js.Any])
      
      inline def setTrackedOriginsUndefined: Self = StObject.set(x, "trackedOrigins", js.undefined)
    }
  }
}
